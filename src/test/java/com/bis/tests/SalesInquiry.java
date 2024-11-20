package com.bis.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.bis.Excel.ExcelReaderData;
import com.bis.driver.DriverManager;

public class SalesInquiry extends BaseTest {
	Select select;
	@Test(groups = {"sanity","regression"})
	public void sales() throws InterruptedException
	{
		WebElement sales = DriverManager.getDriver().findElement(By.xpath("//a[text()='Sales Inquiries']"));
		sales.click();
		
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement firstname =DriverManager.getDriver().findElement(By.xpath("//input[@id='FirstName']"));
		 WebElement lastname=DriverManager.getDriver().findElement(By.xpath("//input[@placeholder='Last Name']"));
		 WebElement workmail=DriverManager.getDriver().findElement(By.xpath("//input[@id='Email']"));
		// WebElement schoolname=DriverManager.getDriver().findElement(By.xpath("//input[@placeholder='School Name']"));
		// WebElement district=DriverManager.getDriver().findElement(By.xpath("//input[@placeholder='District']"));
		
		
		 
		ExcelReaderData.setExcelFile("G:\\Automation-workspace\\Auto_Framework_ACHIEVE3000\\src\\test\\resources\\TestData\\Testdata.xlsx","Data1");
	//	for (int i = 1; i <= ExcelReaderData.getRowCountInSheet(); i++) 
      	 DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      	firstname.sendKeys(ExcelReaderData.getCellData(1,1),Keys.ENTER);
        lastname.sendKeys(ExcelReaderData.getCellData(1,2),Keys.ENTER);
        workmail.sendKeys(ExcelReaderData.getCellData(1,3),Keys.ENTER);
        select=new Select(DriverManager.getDriver().findElement(By.xpath("//select[@id='Job_Function__c']")));
        select.selectByVisibleText("Librarian");
        select=new Select(DriverManager.getDriver().findElement(By.xpath("//select[@id='gradeLevel']")));
        select.selectByVisibleText("K-12");
        select=new Select(DriverManager.getDriver().findElement(By.xpath("//select[@id='Interest__c']")));
        select.selectByVisibleText("Business");
      /*  try {
        schoolname.sendKeys(ExcelReaderData.getCellData(1,4),Keys.ENTER);
        }
        catch (Exception e) {
            ScreenshotOnFailure.takeScreenshot(DriverManager.getDriver(), "testfail", "screenshot_1");
            Assert.fail("Test failed: " + e.getMessage());
        }*/
        //schoolname.sendKeys(ExcelReaderData.getCellData(1,4),Keys.ENTER);
       // district.sendKeys(ExcelReaderData.getCellData(1,5),Keys.ENTER);
        
        WebElement school=DriverManager.getDriver().findElement(By.xpath("//input[@id='school_search_new']"));
        school.sendKeys("Kingston College High School, Kingston CSCO ",Keys.ENTER);
        WebElement district=DriverManager.getDriver().findElement(By.xpath("//input[@id='Parent_Account_Name__c']"));
        district.sendKeys("EX: Dallas ISD or Chicago City Schools",Keys.ENTER);
        select=new Select(DriverManager.getDriver().findElement(By.xpath("//select[@id='Country']")));
        select.selectByVisibleText("United States of America");
        WebElement city=DriverManager.getDriver().findElement(By.xpath("//input[@id='City']"));
        city.sendKeys(ExcelReaderData.getCellData(1,5),Keys.ENTER);
        
        select=new Select(DriverManager.getDriver().findElement(By.id("BillingState")));
        select.selectByVisibleText("AL");
       
        WebElement phonenum=DriverManager.getDriver().findElement(By.xpath("//input[@placeholder='Phone']"));
        phonenum.sendKeys(ExcelReaderData.getCellData(1,6),Keys.ENTER);
        select=new Select(DriverManager.getDriver().findElement(By.id("sEGPurchaseScope")));
        select.selectByVisibleText("District");
        
       
        DriverManager.getDriver().findElement(By.xpath("//button[normalize-space()='Submit']"));
		 
	}

}
