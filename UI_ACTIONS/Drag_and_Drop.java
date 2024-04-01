package UI_ACTIONS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
		
		//DEBIT SIDE
		//element to be dragged
		WebElement account1_drag=driver.findElement(By.id("credit2"));
		
		WebElement amount1_drag=driver.findElement(By.id("fourth"));

		
		//element INTO WHICH dropped 
		WebElement account1_Drop=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		
		
		WebElement AMOUNT1_Drop=driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));


		
		//CREDIT SIDE
		//element to be dragged
		WebElement account2_drag=driver.findElement(By.id("credit1"));
				
		//element INTO WHICH dropped 
		WebElement AMOUNT2_drag=driver.findElement(By.id("fourth"));
		
		WebElement account2_Drop=driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));

		WebElement amount2_Drop=driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		
		//start with actions class
		Actions action=new Actions(driver);
		
		
		//debit side drag and drop
		
		action.dragAndDrop(account1_drag, account1_Drop).build().perform();
		action.dragAndDrop(amount1_drag, AMOUNT1_Drop).build().perform();
		action.dragAndDrop(account2_drag, account2_Drop).build().perform();
		action.dragAndDrop(AMOUNT2_drag, amount2_Drop).build().perform();

		//driver.findElement(By.)
		
		if(driver.findElement(By.xpath("//a[normalize-space()='Perfect!']")).isDisplayed())							
     	{		
         	System.out.println("Perfect Displayed !!!");					
     	}
		else
     	{
        	System.out.println("Perfect not Displayed !!!");					
     	}	
		
		
		Thread.sleep(8000);
		driver.quit();
		
		

		
		
	}

}
