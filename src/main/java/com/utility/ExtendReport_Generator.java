package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReport_Generator {
	public static ExtentReports extent;
	public static ExtentReports getreport() {
		
		String path="C:\\Users\\prakashjadav\\eclipse-workspace\\PB_E2E2\\Reports";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("MAX CG test report");
		reporter.config().setTheme(Theme.DARK);
		
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project name", "Max CG");
		extent.setSystemInfo("O S", "Windows");
		extent.setSystemInfo("Tool", "Selemium Webdrievr");
		extent.setSystemInfo("QA", "Prakash");
		return extent;		
		
	}

}
