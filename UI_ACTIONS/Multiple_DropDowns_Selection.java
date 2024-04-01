package UI_ACTIONS;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_DropDowns_Selection {
	
	static WebDriver driver;
	public static void selectDropdown(WebElement ele,String value) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Select dropdown=new Select(ele);
		List<WebElement> alloptions=dropdown.getOptions();//Electronics
		
		for(WebElement option : alloptions)
		{
			if(option.getText().equalsIgnoreCase(value))
			{
				option.click();
				break;
			}
		}
	}
	
	public static void main(String [] args) throws InterruptedException   {
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://admin-demo.nopcommerce.com/admin/");//nopCommerce
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//p[normalize-space()='Catalog']")).click();
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//p[normalize-space()='Products']")))).click();
		
		
       WebElement dropdown1=driver.findElement(By.id("SearchCategoryId"));//category(books
        selectDropdown(dropdown1,"Books");
		
        WebElement dropdown2=driver.findElement(By.id("SearchManufacturerId"));//Manufacturer(HP
        selectDropdown(dropdown2,"HP");

        WebElement dropdown3=driver.findElement(By.id("SearchVendorId"));//vendor(Vendor 2
        selectDropdown(dropdown3,"Vendor 2");

        Thread.sleep(5000);
        driver.quit();


		
	}}
	
	
	
	


