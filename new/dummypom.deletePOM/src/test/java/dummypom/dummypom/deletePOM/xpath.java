//package dummypom.dummypom.deletePOM;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class xpath {
//
//	WebDriver d;
//
//	@Test
//	public void check() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		d = new ChromeDriver();
//		d.get("https://www.google.com");
//		System.out.println("running google assert = ");
//		Thread.sleep(2000);
//		String expected = "Google";
//		String actual = d.getTitle();
//		Assert.assertEquals(actual, expected);
//		System.out.println("google assert completed = ");
//	}
//
//	@Test
//	public void ctitle() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		d = new ChromeDriver();
//		d.get("https://www.similarweb.com/top-websites/e-commerce-and-shopping/");
//		System.out.println("running assert = ");
//		Thread.sleep(2000);
//		String expected = "Top eCommerce & Shopping Websites Ranking in June 2023 | Similarweb";
//		String actual = d.getTitle();
//		Assert.assertEquals(actual, expected);
//		System.out.println("completed assert = ");
//	}
//	
//	@Test
//	public void xx() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		d = new ChromeDriver();
//		d.get("https://www.similarweb.com/top-websites/e-commerce-and-shopping/");
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/div/div/div[2]/div[2]/div/a")).click();
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//div[@class='sc-dkKxlM icoGfu']//li[5]")).click();
//		Thread.sleep(2000);
//	}
//	
//	@AfterMethod
//	public void tear() {
//		d.quit();
//	}
//
//}
