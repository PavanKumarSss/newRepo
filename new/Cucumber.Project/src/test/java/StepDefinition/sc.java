package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class sc {
	WebDriver driver;

	public void captureScreenShot(WebDriver driver,String testName) throws IOException
	{
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "//screenshot//" + testName + ".png");
		FileUtils.copyFile(src, dest);
	}
	
//	public void captureScreenshotOnFailure(Scenario scenario) {
//		if (scenario.isFailed()) {
//			try {
//				TakesScreenshot screenshot = (TakesScreenshot) driver;
//				byte[] screenshotData = screenshot.getScreenshotAs(OutputType.BYTES);
//				scenario.attach(screenshotData, "image/png", "FailedScreenshot");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}else {
//			TakesScreenshot screenshot1 = (TakesScreenshot) driver;
//			byte[] screenshotData1 = screenshot1.getScreenshotAs(OutputType.BYTES);
//			scenario.attach(screenshotData1, "image/png", "PassedScreenshot");
//		}
//	}
}
