package javaselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTable extends BaseClass{
	
	    @Test
		public void getWebTableData() throws InterruptedException {
			
	    	driver.get("https://www.w3schools.com/html/html_tables.asp");
			WebElement ele = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[3]"));
			String value = ele.getText();
			System.out.println("The value is : "+ value);
			Assert.assertEquals(value, "Austria");		
		}
	    
	    @Test
		public void getWebTableSecondColumnData() throws InterruptedException {
			
	    	driver.get("https://www.w3schools.com/html/html_tables.asp");
	    	List<WebElement> ele = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
	    	
	    	for(WebElement e : ele) {
	    		String value = e.getText();
				System.out.println("The value is : "+ value);
	    	}
	    	
			
			//Assert.assertEquals(value, "Austria");		
		}
}
