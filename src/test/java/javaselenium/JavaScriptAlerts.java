package javaselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptAlerts extends BaseClass{
	
	//@Test
	public void javaAlertTest() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert jsAlert = driver.switchTo().alert();
		
		String alertText = jsAlert.getText();		
		Assert.assertEquals(alertText, "I am a JS Alert");
		
		Thread.sleep(3000);
		
		jsAlert.accept(); // clicks on OK button on the alert
		
		WebElement resultElement = driver.findElement(By.id("result"));		
		String result = resultElement.getText();
		Assert.assertEquals(result, "You successfully clicked an alert");		
	}
	
	//@Test
	public void javaAlertTest2() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert jsAlert = driver.switchTo().alert();		
		String alertText = jsAlert.getText();		
		Assert.assertEquals(alertText, "I am a JS Confirm");		
		jsAlert.dismiss(); // clicks on Cancel button on the alert
		
		WebElement resultElement = driver.findElement(By.id("result"));		
		String result = resultElement.getText();
		Assert.assertEquals(result, "You clicked: Cancel");		
	}
	
	@Test
	public void javaAlertEnterTextTest() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert jsAlert = driver.switchTo().alert();		
		String alertText = jsAlert.getText();		
		Assert.assertEquals(alertText, "I am a JS prompt");		
		
		jsAlert.sendKeys("Lakshmi");
		jsAlert.accept(); // clicks on Cancel button on the alert
		
		WebElement resultElement = driver.findElement(By.id("result"));		
		String result = resultElement.getText();
		Assert.assertEquals(result, "You entered: Lakshmi");		
	}

}
