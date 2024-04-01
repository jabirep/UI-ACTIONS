package UI_ACTIONS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UPLOAD_FILE {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.firefoxdriver().setup();
	        String baseUrl = "https://demo.guru99.com/test/upload/";
	        WebDriver driver = new FirefoxDriver();

	        driver.get(baseUrl);
	        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

	        // enter the file path onto the file-selection input field
	        uploadElement.sendKeys("/home/jabir/Documents/Untitled 1.ods");

	        // check the "I accept the terms of service" check box
	        driver.findElement(By.id("terms")).click();

	        // click the "UploadFile" button
	        driver.findElement(By.name("send")).click();
	        
	        Thread.sleep(5000);
	        
	        driver.quit();
	        }
	}


