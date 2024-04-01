package UI_ACTIONS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_checkbox {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//automation testing demo site
		driver.get("https://itera-qa.azurewebsites.net/home/automation");//nopCommerce site
		
		//driver.findElement(By.xpath("")).click();
		
		//store all checkbox options into a list of webelements
		List<WebElement> alloptions=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		//iterate through web elements and click on each of them using for-each loop
		for(WebElement checkbox:alloptions)
		{
			checkbox.click();
			
		}
		
		//iterate through web elements and click on each of them using for loop
		/*for(int i=0;i<alloptions.size();i++)
		{
			alloptions.get(i).click();
		}*/
		//status---->successfully done
		Thread.sleep(5000);
		driver.quit();
	}

}
