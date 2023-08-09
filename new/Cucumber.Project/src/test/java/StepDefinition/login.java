package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BDD.Cucumber.Project.Pom;
import Extentreports.extentreports;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login extends sc {

	WebDriver driver;
	Pom h;
	sc s;
	//extentreports r=new extentreports();
	ExtentTest t;

	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("Extentreports/Spark.html");
	
	@Before
	public void tt() {
		t=extent.createTest("first test");
		t.log(Status.PASS,"test is paaaaa");
		t.pass("succeee");
	}
	
	@Before
	public void dd() {
		extent.attachReporter(spark);
	}
	
	@After
	public void ed() {
		extent.flush();
	}
	
	@Given("^open url$")
	public void open_url() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		t=extent.createTest("open_url");
		System.out.println("browser is open");
		t.log(Status.PASS,"Opening url");
		t.pass("Opened url");
		//t.log(Status.INFO, "opening chrome browser");
		driver.manage().window().maximize();
		t.log(Status.INFO, "maximaizing chrome browser");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@And("^I enter username as ([^\"]*) and password as ([^\"]*) into fields$")
	public void I_enter_username_and_password_into_fields(String username, String password)
			throws InterruptedException {

		System.out.println("enter credentials");
		Thread.sleep(1000);
		h = new Pom(driver);
		h.addUser("Admin");
		Thread.sleep(1000);
		h.addPass("admin123");
		System.out.println("credentials entered");
	}

	@Then("^click submit$")
	public void click_submit() throws InterruptedException {

		System.out.println("submitting");
		h = new Pom(driver);
		h.clickSubmit();
		System.out.println("submitted");

	}

	@And("^click on user and verify$")
	public void click_on_user_and_verify() throws InterruptedException, IOException {
		System.out.println("eeeeeeeeeee");
		h = new Pom(driver);

		s = new sc();
		h.verifyuser();
		s.captureScreenShot(driver, "failed2");
		Thread.sleep(2000);

		System.out.println(driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[7]/div/div[1]/div/p")).getText());
		String expectedText = "Paul Collings";
		System.out.println(expectedText);

	}

	@After
	public void capscreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				t=extent.createTest("capturingscreenshot");

				TakesScreenshot screenshot = (TakesScreenshot) driver;
				byte[] screenshotData = screenshot.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshotData, "image/png", "FailedScreenshot");
				t.log(Status.FAIL,"capturingscreenshot for failed case");
				t.fail("capturingscreenshot for failed case for scenario");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			TakesScreenshot screenshot1 = (TakesScreenshot) driver;
			byte[] screenshotData1 = screenshot1.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotData1, "image/png", "PassedScreenshot");
			t.log(Status.PASS, "capturingscreenshot for success case");
			t.pass("capturingscreenshot for success case for scenario");
		}
	}

	@After
	public void down() {
		
		driver.close();
		driver.quit();
	}
}
