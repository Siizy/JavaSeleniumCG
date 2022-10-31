package javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownSelect extends BaseClass{
	
	@Test
	public void name() {
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		// WebElement dropdwon = driver.findElement(By.name("country"));
		
		Select countryDD = new Select(driver.findElement(By.name("country")));
		countryDD.selectByVisibleText("ANGOLA");
		countryDD.selectByVisibleText("ANDORRA");
		System.out.println("I have selected a dropdown value");
		
		countryDD.selectByValue("ANDORRA");	
		countryDD.selectByIndex(5);
		
	}

}
