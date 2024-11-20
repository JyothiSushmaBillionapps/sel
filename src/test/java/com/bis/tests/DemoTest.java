package com.bis.tests;

import static com.bis.tests.A.show;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bis.driver.DriverManager;

public class DemoTest extends BaseTest {
	@Test(groups = {"sanity","regression"})
	public void demo()
	{
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 DriverManager.getDriver().findElement(By.xpath("//a[text()='Demo']")).click();
		 
		 
	   List<WebElement> elements= DriverManager.getDriver().findElements(By.xpath("//div[@class='widget item-absolute ']//..//div[@id='element-164']//..//div[@id='element-711']"));
	  
	 Boolean elementspresent=elements.contains("Achieve3000 Literacy"+"Actively Learn"+"ALEKS");
	  // Assert.assertTrue(elementspresent,"Achieve3000 Literacy"+"Actively Learn"+"ALEKS");
	   
	   if(elementspresent)
	   {
		   System.out.println("Achieve3000 Literacy"+"Actively Learn"+"ALEKS"+"  the elements are present");
	   }
	   /*Assertions.assertThat(elements)
	            
	            .extracting(WebElement :: getText)
	            .contains("Achieve3000 Literacy"+"Actively Learn"+"ALEKS");
	            
	          //  .contains("Achieve3000 Literacy"+"Actively Learn"+"");   */
	  
	  show();
	   
	   
	}
	
	
	
	
}
