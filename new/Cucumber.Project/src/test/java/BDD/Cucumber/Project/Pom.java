package BDD.Cucumber.Project;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	WebDriver driver;

	@FindBy(name = "username")
	WebElement user;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement s;

	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	WebElement us;

	public Pom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void addUser(String u) {
		user.sendKeys(u);
	}

	public void addPass(String p) {
		pass.sendKeys(p);
	}

	public void clickSubmit() {
		s.click();
	}

	public void verifyuser() throws InterruptedException {
		Thread.sleep(2000);
		String actualt = us.getText();
		System.out.println("driver us :" + us);
		System.out.println("tag name :" + us.getTagName());
		System.out.println("actualt = " + actualt);
		System.out.println("tag size " + us.getSize());
		String expectedt = "Paul Collings";
		Assert.assertEquals(expectedt, actualt);
		System.out.println("Assertion passed");
//		try {
//			Assert.assertEquals(expectedt, actualt);
//			System.out.println("Assertion passed");
//		} catch (AssertionError e) {
//			System.out.println("Assertion failed: " + e.getMessage());
//		}
	}

}
