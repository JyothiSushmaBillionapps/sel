package com.bis.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.bis.driver.DriverManager;

public class SearchTest extends BaseTest {

	@Test(groups = {"sanity","regression"})
	public void search() throws InterruptedException
	{
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 DriverManager.getDriver().findElement(By.xpath("//i[@class='fa fa-search']")).click();
		 DriverManager.getDriver().findElement(By.xpath("//input[@id='query']")).sendKeys("proven literacy Acceleration",Keys.ENTER);
	}
	
	
}
