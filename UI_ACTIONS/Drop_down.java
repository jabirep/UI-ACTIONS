package UI_ACTIONS;

import java.util.List;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_down {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://admin-demo.nopcommerce.com/admin/");//nopCommerce
		//driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");//DEMO DROPDOWN SITE
		
		driver.manage().window().maximize();
		
		//Login to Orange HRM
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	
		//JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0,350)", "");
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
	//	driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//p[normalize-space()='Products']")).click();

        //WebElement dropdown=driver.findElement(By.xpath("//div[contains(text(),'Indian')]"));
		//Select country=new Select(dropdown);
		
		
		
		
		
		
		
		
		
		
		
		/*List<WebElement> alloptions=country.getOptions();
		
		for(WebElement option : alloptions)
		{
			System.out.println(option);
			
			
		}*/
	
	/*if(option.getText().contains("Antarctica"))
	{
		option.click();
		break;*/
		//*[@id="app"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[1]
		//Select country=new Select(dropdown);
		//country.selectByVisibleText("American");//aLGERIA WILL BE SELECTED 
		
		
		
		Thread.sleep(10000);
		//driver.quit();
	}

}
