package com.bis.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.bis.driver.Driver;





public class BaseTest {
	
/*	public ExtentHTMLReporter htmlreporter;
	public ExtentReports reports;
	public ExtentTest extentTest;
*/
protected BaseTest(){
	
}


@BeforeMethod
protected void setup() throws Exception
{
   Driver.initdriver();	
}

@AfterMethod
protected void teardown() {
	Driver.teardown();
}
}
