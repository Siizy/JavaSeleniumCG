package javaselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions extends BaseClass{
	
	@Test
	public void dragAndDropAction() {
			
		driver.get("https://javascript.info/article/mouse-drag-and-drop/ball4/");
		
		Actions action = new Actions(driver);		
		WebElement source = driver.findElement(By.id("ball")); 
		WebElement target = driver.findElement(By.id("gate"));
		
		action.dragAndDrop(source, target).perform();
	} 
	
	@Test
    public void selectMultipleValues() {
		
		driver.get("file://C:/Users//chandangupta.TSYS//Desktop//Multiselect.html");
				
		List<WebElement> listOfElements = driver.findElements(By.xpath("//select/option"));		
		Actions action = new Actions(driver);
		
		action.click(listOfElements.get(1))
		      .keyDown(Keys.CONTROL)
		      .click(listOfElements.get(2))
		      .click(listOfElements.get(3))		      
		      .perform();		
	}


}


