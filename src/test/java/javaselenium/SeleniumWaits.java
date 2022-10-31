package javaselenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumWaits extends BaseClass{
	
	// @Test
	public void threadSleep() throws InterruptedException {
		
		WebElement remove = driver.findElement(By.xpath("//button[(text()='Remove')]"));
		remove.click();
		Thread.sleep(5000);
		WebElement add = driver.findElement(By.xpath("//button[(text()='Add')]"));
		//Thread.sleep(5000);
		Assert.assertEquals(add.isDisplayed(), true);
		
	}
	
	// Implicit wait - remains till the driver is active
	// It helps you to wait for an element to be available in the DOM 
		
	// @Test
	public void implicitWaitExample()  {
				
		WebElement remove = driver.findElement(By.xpath("//button[(text()='Remove')]"));
		remove.click();
		WebElement add = driver.findElement(By.xpath("//button[(text()='Add')]"));
		Assert.assertEquals(add.isDisplayed(), true);
		
	}
	
	//Explicit Wait - clickable, visible, 
	
	//@Test
	public void explicitWaitExample()  {
				
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			
		WebElement remove = driver.findElement(By.xpath("//button[(text()='Remove')]"));
		remove.click();	
		
		//WebElement add = driver.findElement(By.xpath("//button[(text()='Add')]"));
		
		WebElement add = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[(text()='Add')]")));	
		// add.click();
		Assert.assertEquals(add.isDisplayed(), true);
		
	}
	
	/*
	 * Fluent wait = polling should come to your head 
	 * 1 sec knock  -
	 * 3 sec pause
	 * 2nd Knock 
	 * 3 pause
	 * 3rd knock
	 * 3 sec pause
	 * Opens the door
	 * The wait is ended
	 * 
	 * polling time (3 sec wait)
	 * Handle the exception - ignoreException
	 */ 
	
	//@Test
	public void fluentWaitExample()  {
				
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
				
			
		WebElement remove = driver.findElement(By.xpath("//button[(text()='Remove')]"));
		remove.click();	
		
		WebElement add = wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.xpath("//button[(text()='Add')]"));
			}
		});
						
		Assert.assertEquals(add.isDisplayed(), true);
		
	}
	
	// @Test
	public void fluentWaitExample2()  {
				
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(Duration.ofSeconds(2))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
				
			
		WebElement remove = driver.findElement(By.xpath("//button[(text()='Remove')]"));
		remove.click();	
		
		WebElement add = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[(text()='Add')]")));
						
		Assert.assertEquals(add.isDisplayed(), true);
		
	}
	
	
	//tech - stack
	// ios - No 
	//Web Application - Java, Selenium, Extent Report, apache poi, TestNg, Cucumber, Rest Assured
	//We have used Page Object Model Design pattern for our framework design
	// Its a Hybrid Model 
	//1. Data Driven Model
	//2. keyword driven, Modular 
	
	// BDD is a concept to develop code
	// Cucumber is tool that support BDD approach, framework
	
	// Continuous Integration - Jenkins as a tool 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
}
