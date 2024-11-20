package com.bis.extent;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	 public  void onStart(ITestContext context) {
	 sparkreporter= new ExtentSparkReporter("G:\\Automation-workspace\\Auto_Framework_ACHIEVE3000\\reports\\Achieve3000reports.html");
	 sparkreporter.config().setDocumentTitle("Achieve3000 Automation Report");
	 sparkreporter.config().setReportName("sanity test report");
	 sparkreporter.config().setTheme(Theme.STANDARD);
	 
	 extent=new ExtentReports();
	 extent.attachReporter(sparkreporter);
	 
	 test=extent.createTest("ACHIEVE3000 Test").assignAuthor("Jyothi");
	 test.pass("Open ACHIEVE3000 successfully loaded");
	 test.info("ACHIEVE3000 URL is loaded");
	 test.info("All Links URL is working");
	 test.info("Fill form  are  entered");
	 test.info("ACHIEVE3000 Automation is successfully completed");
	 test.pass(MarkupHelper.createLabel("ACHIEVE3000 Automation is successfully completed",ExtentColor.GREEN));
	 
	 extent.setSystemInfo("Computer", "localhost");
	 extent.setSystemInfo("OS","Windows 10");
	 extent.setSystemInfo("Tester", "Jyothisushma");
	 extent.setSystemInfo("Browser", "Chrome");
	 
	 }
	 
	 public  void onTestSuccess(ITestResult result) {
		 test=extent.createTest(result.getName());
		 test.log(Status.PASS,"Test Case is Passed : "+result.getName());
			
	  }
	 
	 public  void onTestFailure(ITestResult result) {
		 test=extent.createTest(result.getName());
		 test.log(Status.FAIL,"Test Case is Failed : "+result.getName());
		 test.log(Status.FAIL,"Test Case is Failed, cause of : "+result.getThrowable());
		  }

	 public  void onTestSkipped(ITestResult result) {
		 test=extent.createTest(result.getName());
		 test.log(Status.SKIP,"Test Case is Skipped : "+result.getName());
		  }
	 public void onFinish(ITestContext context) {
		  extent.flush();
		
			try {
					Desktop.getDesktop().browse(new File("G:\\Automation-workspace\\Auto_Framework_ACHIEVE3000\\reports\\Achieve3000reports.html").toURI());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	  }
	
}
