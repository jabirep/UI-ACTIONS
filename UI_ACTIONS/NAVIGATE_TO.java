package UI_ACTIONS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NAVIGATE_TO {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(3000);

		driver.navigate().to("http://192.168.5.35:8092/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		
		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().forward();

		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
