package javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class RadioAndCheckBox extends BaseClass{
	
	@Test
	public void radioButton() {
		
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement option1 = driver.findElement(By.id("vfb-7-1"));
		option1.click();		
		Assert.assertEquals(option1.isSelected(), true);
			
		WebElement option3 = driver.findElement(By.id("vfb-7-3"));
		option3.click();		
		Assert.assertEquals(option3.isSelected(), true);
		Assert.assertEquals(option1.isSelected(), false);
			
	}
	
	@Test
	public void checkBoxButton() {
		
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));
		checkBox1.click();		
		Assert.assertEquals(checkBox1.isSelected(), true);
		checkBox1.click();	
		Assert.assertEquals(checkBox1.isSelected(), false);
			
		
	  WebElement checkBox3 = driver.findElement(By.id("vfb-6-2")); 
	  checkBox3.click();	  
	  Assert.assertEquals(checkBox3.isSelected(), true);
	  Assert.assertEquals(checkBox1.isSelected(), false);
	 
			
	}

}
