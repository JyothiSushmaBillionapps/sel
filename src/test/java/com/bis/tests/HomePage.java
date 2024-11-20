package com.bis.tests;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.assertj.core.api.Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static com.bis.tests.A.show;

import com.bis.Excel.ExcelReaderData;
import com.bis.driver.DriverManager;

public class HomePage extends BaseTest {

	protected WebElement element;
	Select select;
	
	@Test(groups = {"sanity","regression"})
	public void title()
	{
		
		String title =DriverManager.getDriver().getTitle();
		System.out.println("The website title is:  "+title);
		Assert.assertTrue(title.contains("Achieve3000 | Differentiated Instruction. Accelerated Learning. | Grades PreK-12"));
		Assertions.assertThat(title.contains("Instruction."));
		
	}
	
	@Test(groups = {"sanity","regression"})
	public void logo()
	{
		
		try {
      DriverManager.getDriver().findElement(By.xpath("//div[@class='col-md-3 col-6 logo-sec']")).click();
		}
		catch(StaleElementReferenceException e ) {
			DriverManager.getDriver().navigate().refresh();
			DriverManager.getDriver().findElement(By.xpath("//div[@class='col-md-3 col-6 logo-sec']")).click();
		}
    
        String pagetitle =DriverManager.getDriver().getTitle();
		System.out.println("The website title is:  "+pagetitle);
		   boolean iselementpresent=false;
       if(pagetitle.equalsIgnoreCase("Achieve3000 | Differentiated Instruction. Accelerated Learning. | Grades PreK-12"))
    		   
       {
    	   iselementpresent=true;
    	   System.out.println("Test case:click on logo achieve3000,it will redirects to www.achieve.3000 page-->Testcase PASSED");
       }
       Assert.assertTrue(iselementpresent, "Achieve3000 | Differentiated Instruction. Accelerated Learning. | Grades PreK-12");
     
    //  	
	 
	}
	@Test(groups = {"sanity","regression"})
	public void totalLinks()
	{
	 List<WebElement> links=DriverManager.getDriver().findElements(By.tagName("a"));
	 System.out.println("the total links present in the homepage are = "+links.size());
	 
	 Iterator<WebElement> iterator = links.iterator();
     while (iterator.hasNext()) {
   	  String url = iterator.next().getText();
   	  System.out.println(url);
   	  
     }
	}
	
	@Test(groups = {"sanity"})
	public void SeeHowLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        DriverManager.getDriver().navigate().refresh();
		DriverManager.getDriver().findElement(By.xpath("//a[text()='SEE HOW']")).click();
	}
	

	@Test(groups = {"sanity"})
	public void Achieve3000LiteracyLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='ACHIEVE3000 LITERACY']")));searchButton.click();
	
	}
	
	
	@Test(groups = {"sanity"})
	public void Achieve3000MathLink() {
	
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='ACHIEVE3000 MATH']")));searchButton.click();
	}
	
	@Test(groups = {"sanity"})
	public void ActivelyLearnLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='ACTIVELY LEARN']")));searchButton.click();
	}
	
	@Test(groups = {"sanity"})
	public void SmartyHandsLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='ACTIVELY LEARN']")));searchButton.click();
	
	}
	
	@Test(groups = {"sanity"})
	public void customerServiceLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='customer service']")));searchButton.click();
	}
	
	@Test(groups = {"sanity"})
	public void MoreTestimonialsLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = DriverManager.getDriver().findElement(By.xpath("//a[text()='More Testimonials']"));
		ele.click();
	}

	@Test(groups = {"sanity"})
	public void callLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='help-block']//li[1]//a[1]")));searchButton.click();	
	}
	
	@Test(groups = {"sanity"})
	public void helpcenterLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='help-block']//li[2]//a[1]")));
		searchButton.click();		
	}
	
	@Test(groups = {"sanity"})
	public void careerLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Career']")));
	    searchButton.click();
		
	}
	

	@Test(groups = {"sanity"})
	public void contactUsLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Contact Us']")));searchButton.click();
		
	}
	
	@Test(groups = {"sanity"})
	public void PrivacyLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Privacy']")));searchButton.click();
		
	}
	@Test(groups = {"sanity"})
	public void TermsOfUseLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Terms of Use']")));searchButton.click();
		
	}
	
	@Test(groups = {"sanity"})
	public void StatusLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Status']")));searchButton.click();
		
	}
	
	@Test(groups = {"sanity"})
	public void TermsOfServiceLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Terms of Service']")));searchButton.click();
		
	}
	
	@Test(groups = {"sanity"})
	public void SystemRequirementsLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='System Requirements']")));searchButton.click();
		
	}
	
	@Test(groups = {"sanity"})
	public void FacebookLink() {
		
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa-brands fa-facebook-f']")));searchButton.click();
	}
	
	@Test(groups = {"sanity"})
	public void CopyrightsLink() {
	
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='copyright']")));searchButton.click();
		
	}
	
	@Test(groups = {"sanity"})
	public void LinkedInLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa-brands fa-linkedin-in']")));searchButton.click();		
	}
	
	@Test(groups = {"sanity"})
	public void twitterLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa-brands fa-twitter']")));searchButton.click();
		
	}
}
