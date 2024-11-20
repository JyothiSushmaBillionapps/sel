package com.bis.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.bis.driver.DriverManager;

public class HamburgerTest extends BaseTest{
	WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20));
	WebElement searchButton;
	
	@Test (groups = {"sanity","regression"})
	public void hamburger()
	{
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement hamburger = DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']"));
		hamburger.click();
	}
	
	@Test(groups = {"sanity"})
	public void whatToDoLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
		
		DriverManager.getDriver().findElement(By.xpath("//h4[text()='What We Do']")).click();
	}

	@Test(groups = {"sanity"})
	public void howWeDoItLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
	
		DriverManager.getDriver().findElement(By.xpath("//h4[text()='How We Do It']")).click();
	}
	
	@Test(groups = {"sanity"})
	public void impactLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
	
		DriverManager.getDriver().findElement(By.xpath("//h4[text()='Impact']")).click();
	}
	
	@Test(groups = {"sanity"})
	public void ResourcesLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
	
		DriverManager.getDriver().findElement(By.xpath("//h4[text()='Resources']")).click();
	}
	@Test(groups = {"sanity"})
	public void AccelerateLearningLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
		
		DriverManager.getDriver().findElement(By.xpath("//a[text()='Accelerated Learning']")).click();
	}

	@Test(groups = {"sanity"})
	public void earlyLiteracyLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
		
		DriverManager.getDriver().findElement(By.xpath("//a[text()='Early Literacy']")).click();
	}
	
	@Test(groups = {"sanity"})
	public void internationalLearningLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
	
		DriverManager.getDriver().findElement(By.xpath("//a[text()='International Learning']")).click();
	}
	
	@Test(groups = {"sanity"})
	public void careerAndTechincalLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
		
		DriverManager.getDriver().findElement(By.xpath("//a[text()='Career and Technical Education']")).click();
	}
	
	@Test(groups = {"sanity"})
	public void englishLearnerLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
		
		DriverManager.getDriver().findElement(By.xpath("//a[text()='English Learners']")).click();
	}
	
	@Test(groups = {"sanity"})
	public void acheive3000Link() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
	
		DriverManager.getDriver().findElement(By.xpath("//a[text()='Achieve3000 Literacy']")).click();
	}
	
	@Test(groups = {"sanity"})
	public void activelyLearnLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
		
		DriverManager.getDriver().findElement(By.xpath("//a[text()='Actively Learn']")).click();
	}
	
	@Test(groups = {"sanity"})
	public void mathSolutionLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
		
		DriverManager.getDriver().findElement(By.xpath("//a[text()='Math Solution']")).click();
	}
	
	@Test(groups = {"sanity"})
	public void smartyHandsLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[text()='Smarty Ants']"))));
		searchButton.click();
	}
	
	@Test(groups = {"sanity"})
	public void summerSchoolLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
		
		DriverManager.getDriver().findElement(By.xpath("//a[text()='Summer School']")).click();
	}
	
	@Test(groups = {"sanity"})
	public void customerSupportLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();

		DriverManager.getDriver().findElement(By.xpath("//a[text()='Customer Support']")).click();
	}
	
	@Test(groups = {"sanity"})
	public void ProfessionalServicesLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
	
		DriverManager.getDriver().findElement(By.xpath("//a[text()='Professional Services']")).click();
	}
	
	@Test(groups = {"sanity"})
	public void testimonialsLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[text()='Testimonials']"))));
		searchButton .click();
	}
	
	@Test(groups = {"sanity"})
	public void caseStudiesLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
		
		DriverManager.getDriver().findElement(By.xpath("//a[text()='Case Studies']")).click();
	}
	
	@Test(groups = {"sanity"})
	public void researchLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//a[text()='Research']")).click();
	}
	
	@Test(groups = {"sanity"})
	public void WebinarAndEventLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20));
		WebElement searchButton= wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[text()='Webinars and Events']"))));
				searchButton.click();
	}
	
	@Test(groups = {"sanity"})
	public void blogLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20));
		WebElement searchButton= wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[text()='Blog']"))));
		searchButton.click();
	}
	
	@Test(groups = {"sanity"})
	public void fundingLink() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20));
		WebElement searchButton= wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[text()='Funding']"))));
		searchButton.click();
	}
	
	@Test(groups = {"sanity"})
	public void backToSchool2024Link() {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverManager.getDriver().findElement(By.xpath("//button[@name='hambargar']")).click();
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(20));
		WebElement searchButton= wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[text()='Back to School 2024']"))));
				searchButton.click();
	}
}
