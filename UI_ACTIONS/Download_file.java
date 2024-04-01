package UI_ACTIONS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Download_file {

	
	public static void main(String[] args) throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");

		driver.manage().window().maximize();
		
		//in the case of automatic download button, just click in the download button will start downloading automatically
		//will be downloaded into default location
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		
		
		
		
		

	
				
	}

}
