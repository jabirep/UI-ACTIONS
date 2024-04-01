package UI_ACTIONS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_Double_Click {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Launch the Application Under Test (AUT)
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

		// Right click the button to launch right click menu options
		Actions action = new Actions(driver);

		/*WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
		action.contextClick(link).perform();
		
		Thread.sleep(3000);
		// Click on Edit link on the displayed menu options
		WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		element.click();
		Thread.sleep(3000);

		// Accept the alert displayed
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		// Closing the driver instance
		
		driver.quit();*/
		

		//Launch the Application Under Test (AUT)
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

		//Double click the button to launch an alertbox
		WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(link).perform();
		
		Thread.sleep(3000);

		//Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text\n" +alert.getText());
		alert.accept();
		
		Thread.sleep(3000);

		//Closing the driver instance
		driver.quit();

		
		

	}

}
