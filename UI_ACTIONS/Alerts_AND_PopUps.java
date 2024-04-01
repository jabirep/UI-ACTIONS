package UI_ACTIONS;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_AND_PopUps {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");//
		/*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();//case having only 'ok' button
		Thread.sleep(3000);
		//to accept the alert
		//driver.switchTo().alert().accept();*/
		
		
		//case having both 'ok' and 'cancel' button
		/*driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(3000);

		//to dismiss the alert
		driver.switchTo().alert().dismiss();*/
		
		//case of having 'text box', 'ok button' and 'cancel button'
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);

		//to dismiss the alert
		Alert alertwindow=driver.switchTo().alert();
		alertwindow.sendKeys("jabir");
		alertwindow.accept();
		

		
		
		
		
	}

}
