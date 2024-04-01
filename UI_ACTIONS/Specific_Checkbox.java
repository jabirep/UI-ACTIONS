package UI_ACTIONS;

import java.time.Duration;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Specific_Checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://admin-demo.nopcommerce.com/admin/");//nopCommerce site
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//p[normalize-space()='Catalog']")).click();
		
		//explicit wait until clicked on "products" button.
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//p[normalize-space()='Products']")))).click();
		Thread.sleep(5000);

		//checkbox selection
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='SearchIncludeSubCategories']"));//to locate the check box
		checkbox.click();//to click on the check box
		System.out.println(checkbox.isSelected());//to check if the checkbox is selected or not
		Thread.sleep(5000);
		driver.quit();
	}

}
