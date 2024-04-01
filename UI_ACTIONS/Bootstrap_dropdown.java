package UI_ACTIONS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrap_dropdown {
	
		WebElement userrole;
		public static void main(String [] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Login to Orange HRM
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=14.0_5");		
		//driver.manage().window().maximize();

		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']")));

		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		
		List<WebElement> alloptions=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));


		System.out.println(alloptions.size());
		//List<WebElement> alloptions=userrole.getOptions();

		
		///for(WebElement option : alloptions)
		//String value[]= option.getText();
		//}
		
		
		
		
		//List<WebElement> alloptions=dropdown.getOptions();
		
		for(WebElement option : alloptions)
		{
			if(option.getText().equalsIgnoreCase("html"))
			{
				option.click();
				break;
			}
		}
		
	
		Thread.sleep(5000);
		driver.quit();
	}

}
