package Extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class extentreports {
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	
	@Before
	public void tt() {
		ExtentTest t=extent.createTest("first test");
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


}
