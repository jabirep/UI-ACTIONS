package UI_ACTIONS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox_By_coice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//automation testing demo site
		driver.get("https://itera-qa.azurewebsites.net/home/automation");//nopCommerce site
		
		//store all checkbox options into a list of webelements
		List<WebElement> alloptions=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		//iterate through web elements and click on the needed checkboxes from a list of checkbox using for-each loop
		//Here, sunday and saturday
		for(WebElement checkbox:alloptions)
		{
			String value=checkbox.getAttribute("id");
			
			if(value.equalsIgnoreCase("sunday") || value.equalsIgnoreCase("saturday"))
			{
				checkbox.click();
			
			}
			
		}	
			Thread.sleep(5000);
			driver.quit();
		
	}

}
