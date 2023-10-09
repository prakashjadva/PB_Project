package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener extends Base_Class  implements ITestListener{
	
	ExtentReports extent =ExtendReport_Generator.getreport();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	
	
	public void onTestStart(ITestResult result) {
		Library.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		extenttest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		
		extenttest.get().log(Status.PASS, "Test case pass");
		
	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL, "Test case Fail");
		extenttest.get().addScreenCaptureFromBase64String(getScreenShot());

	}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "Test case Skip");
		
	}

	public void onFinish(ITestContext context) {
		
		extent.flush();
		
	}
	public static String getScreenShot() {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		return ts.getScreenshotAs(OutputType.BASE64);
	//	File destn=new File(path+"\\"+p+".png");
				
				
				
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
