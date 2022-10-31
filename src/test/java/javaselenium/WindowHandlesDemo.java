package javaselenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WindowHandlesDemo extends BaseClass{
	
	@Test
	public void windowHandlesTest() {
		
		driver.get("https://demoqa.com/browser-windows");
		
		String parentWindowHandle = driver.getWindowHandle();
		
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String handle : windowHandles) {
			
			/*
			 * if(!(handle.equals(parentWindowHandle))) { driver.switchTo().window(handle);
			 * driver.get("https://www.google.com"); System.out.println("Title is : " +
			 * driver.getTitle()); }
			 */
			
			if(handle.equals(parentWindowHandle)) {
				
			}
					
			  else {
			  
			  driver.switchTo().window(handle); driver.get("https://www.google.com");
			  System.out.println("Title is : " + driver.getTitle());
			  
			  }		
		}
		
		//String title = driver.getTitle();
		//System.out.println("Current Title is " + title);
		
	}
	
	
   @Test	
   public void newWebPopUpHandlesTest() {
		
		driver.get("https://demoqa.com/browser-windows");
		
		String parentWindowHandle = driver.getWindowHandle();
		
		WebElement newWindow = driver.findElement(By.id("windowButton"));
		
		//newWindow.click();
		//newWindow.click();
		//newWindow.click();
		
		
		  for(int i=0; i<3; i++) { 
		    newWindow.click(); 
		  }
		 
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String handle : windowHandles) {

			/*
			 * if(!(handle.equals(parentWindowHandle))) { driver.switchTo().window(handle);
			 * driver.get("https://www.google.com"); System.out.println("Title is : " +
			 * driver.getTitle()); }
			 */

			if (handle.equals(parentWindowHandle)) {

			}

			else {

				driver.switchTo().window(handle);
				driver.get("https://www.google.com");
				System.out.println("Title is : " + driver.getTitle());

			}
		}
		
		driver.switchTo().window(parentWindowHandle);
		String title = driver.getTitle();
		System.out.println("Current Title is " + title);
		
	}
   
// Remove duplicate characters from a word
   //balloon
  //  for==> long
   //HashSet = 
		  // balon  
}
