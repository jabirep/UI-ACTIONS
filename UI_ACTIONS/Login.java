package UI_ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");

		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		
		 Actions builder = new Actions(driver);
		 WebElement element=driver.findElement(By.xpath("//*[@id=\"menu-item-18\"]/a"));
		 builder.moveToElement(element).build().perform();
		 
		
		Thread.sleep(5000);
		driver.quit();
	}

}
