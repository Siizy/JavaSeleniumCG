package javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Demoqa extends BaseClass {

	
	@Test
	public void test01() {
		
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Monali Mekha");
		WebElement emailAddress = driver.findElement(By.id("userEmail"));
		emailAddress.sendKeys("test@gmail.com");
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
	}

	@Test
	public void test02() {

		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Monali Mekha");
		WebElement emailAddress = driver.findElement(By.id("userEmail"));
		emailAddress.sendKeys("test@gmail.com");
		WebElement currentAddressText = driver.findElement(By.id("currentAddress"));
		currentAddressText.sendKeys("23 A Tesla Street, OH");
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();

	}

}
