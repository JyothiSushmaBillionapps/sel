package com.bis.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

import com.bis.driver.DriverManager;

public class SupportTest extends BaseTest {

	@Test(groups = {"sanity","regression"})

	public void support() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//a[text()='Support']")).sendKeys(Keys.ENTER);
		JavascriptExecutor js=(JavascriptExecutor)DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,500)");
		
		DriverManager.getDriver().findElement(By.xpath("//a[text()='Help Center']")).sendKeys(Keys.ENTER);
		
	}
}
