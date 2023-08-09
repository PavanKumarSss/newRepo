package testng.testngproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class priority {

	WebDriver d;
	
	@Test
	public void check() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverManager.chromedriver().setup();
		Thread.sleep(2000);
		d=new ChromeDriver();
		Thread.sleep(2000);
		d.get("https://mvnrepository.com/");
		d.manage().window().maximize();
	}
//	
//	@Test(priority = 0)
//	public void ctitle() {
//		System.out.println("running assert equal");
//		String expected = "Maven Repository: Search/Browse/Explore";
//		String actual = d.getTitle();
//		Assert.assertEquals(actual, expected);
//	}
//	
//	@Test(priority = 1)
//	public void cnottitle() {
//		System.out.println("running assert not equal");
//		String expected1 = "Maven Repository: Search/Browse/Explore";
//		String actual1 = d.getTitle();
//		Assert.assertNotEquals(actual1, expected1);
//	}
//	
//	@Test(priority = 2)
//	public void cnottitlew1() {
//		System.out.println("running assert not equal");
//		String expected1 = "Maven Repository: Search/Browse/Explore";
//		String actual1 = d.getTitle();
//		Assert.assertNotEquals(actual1, expected1);
//	}
//	
//	@Test(priority = 3)
//	public void cnottitlew2() {
//		System.out.println("running assert not equal");
//		String expected1 = "Maven Repository: Search/Browse/Explore";
//		String actual1 = d.getTitle();
//		Assert.assertNotEquals(actual1, expected1);
//	}
//	
//	@AfterMethod
//	public void scc(ITestResult res) throws IOException {
//		if(ITestResult.FAILURE==res.getStatus()) {
//			TakesScreenshot screenshot = ((TakesScreenshot)d);
//			File src = screenshot.getScreenshotAs(OutputType.FILE);
//			String ff = System.getProperty("user.dir");
//			FileUtils.copyFile(src, new File(ff+"\\target\\wwweee.png"));
//		}
//	}
}
