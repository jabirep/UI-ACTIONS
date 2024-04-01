package UI_ACTIONS;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SCreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/admin/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		//full screenshot
		
		//Takescreenshot interface needed to be instantiated and typecasted
		//typecasting is done , because of webdriver driver=new chromedriver
		//instead of webdriver, if we type chromedriver, then no need of type casting
		
	/*	TakesScreenshot object=(TakesScreenshot) driver;
		//code for how to get the screenshot, which type
		File src=object.getScreenshotAs(OutputType.FILE);https://admin-demo.nopcommerce.com/admin/
		
		//folder to which screenshot to be saved is assigned here
		//  ".//" is used for
		File target=new File(".//screenshots//homepage.png");//(.//_foldername in the project to save the screenshot)
		
		FileUtils.copyFile(src, target);*/
		
		
		//portion/section screenshot
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(6000);

		WebElement section=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		File src=section.getScreenshotAs(OutputType.FILE);
		
		File target=new File(".//screenshots//searchfield.png");
		FileUtils.copyFile(src, target);
		
		Thread.sleep(6000);
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
