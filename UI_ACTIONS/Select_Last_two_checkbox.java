package UI_ACTIONS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Last_two_checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		//To select first n number of checkboxes together
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//automation testing demo site
		driver.get("https://itera-qa.azurewebsites.net/home/automation");//nopCommerce site
		
		//driver.findElement(By.xpath("")).click();
		
		//store all checkbox options into a list of webelements
		List<WebElement> alloptions=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		int totalCheckboxes=alloptions.size();
		
		//last 3 checkbox selection
		for(int i=6;i>=totalCheckboxes-3;i--)
		{
			alloptions.get(i).click();
			
		}
		
		//first 5 checkbox selection
		/*for(int i=0;i<totalCheckboxes-2;i++)
		{
			alloptions.get(i).click();
			
		}*/
		
		
		Thread.sleep(5000);
		driver.quit();
	}
	}


