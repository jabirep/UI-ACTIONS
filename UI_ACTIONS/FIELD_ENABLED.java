package UI_ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FIELD_ENABLED {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://192.168.5.35:8092/");

		driver.manage().window().maximize();
		
		//username field
		System.out.println("usrname field displayed  :"+driver.findElement(By.name("username")).isDisplayed());
		System.out.println("username field enabled  :"+driver.findElement(By.name("username")).isEnabled());
		System.out.println("usrname field selected  :"+driver.findElement(By.name("username")).isSelected());

		//password field
		System.out.println("password field displayed  :"+driver.findElement(By.name("password")).isDisplayed());
		System.out.println("password field enabled  :"+driver.findElement(By.name("password")).isEnabled());
		System.out.println("password field selected  :"+driver.findElement(By.name("password")).isSelected());
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
