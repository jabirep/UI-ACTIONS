package UI_ACTIONS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTEXT_getAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		 //implicit wait
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://192.168.5.35:8092/");//GALAXY APP
		
		//getText
		String innertext=driver.findElement(By.xpath("//span[contains(text(),'User')]")).getText();
		System.out.println("inner text of GALAXY username is :"+innertext);
		
		//getAttribute
		String attribute=driver.findElement(By.id("un")).getAttribute("placeholder");
		System.out.println("atribute name of Orange HRM username field is :"+attribute);
		
		
		driver.findElement(By.name("username")).clear();
		Thread.sleep(5000);

		driver.findElement(By.name("username")).sendKeys("jabirep");


		
		Thread.sleep(5000);

		driver.quit();
		
		
	}

}
