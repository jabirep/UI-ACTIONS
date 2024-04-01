package UI_ACTIONS;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Permission_popups {
	
	public static void main(String[] args) throws InterruptedException {
		//'ALLOW' AND 'BLOCK' PERMISSION POPUPS
		
		
		/*FirefoxOptions object=new FirefoxOptions();
		object.addArguments("--disable-notifications");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver(object);
		driver.get("https://www.google.com/search?channel=fs&client=ubuntu&q=vrl+travels");*/
		//https://the-internet.herokuapp.com/geolocation
		 //*[@id='content']/div/button
		 
		ChromeOptions object=new ChromeOptions();
		object.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(object);
		driver.get("https://the-internet.herokuapp.com/geolocation");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick='getLocation()']")).click();

		Thread.sleep(5000);
		driver.quit();
		

		  
		}

}
