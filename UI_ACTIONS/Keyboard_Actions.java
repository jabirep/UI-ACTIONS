package UI_ACTIONS;

import static org.junit.Assert.assertEquals;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Actions {

	public static void main(String[] args) throws InterruptedException {
			
		/*+
		Here are the syntax to call keyboard functions using Selenium WebDriver.
		void sendKeys(java.lang.CharSequence keysToSend)
		void pressKey(java.lang.CharSequence keyToPress)
		void releaseKey(java.lang.CharSequence keyToRelease)
		
		

    sendKeys − Sends keys to the keyboard representation in the browser. Special keys that are not text, represented as Keys are 
    recognized both as part of sequences of characters, or individually.
    
    pressKey − Press a key on the keyboard that is NOT text. The keys such as function keys "F1", "F2", "Tab", "Control", etc. 
    If keyToPress is a sequence of characters, different driver implementations may choose to throw an exception or to read only 
    the first character in the sequence.

    releaseKey − Release a key on the keyboard after executing the keypress event. It usually holds good for non text characters.
	
		 */
		
		//scenario for keyboard action
		
		/*
    First, navigate to "https://demoqa.com/text-box."
    Secondly, enter the Full name: "Mr.Peter Haynes".
    Thirdly, enter the Email: "PeterHaynes@toolsqa.com."
    After that, Enter the Current Address: "43 School Lane London EC71 9GO".
    Fifthly, click on the Current Address text box and Copy the Current Address.
    After that, paste the copied address in the Permanent Address text box.
    Finally, validate that the text in the Current Address and Permanent Address is the same.
		 */
		
	

				WebDriverManager.firefoxdriver().setup();
				
		        // Initialize ChromeDriver
				// Here we assume that the ChromeDriver path has been set in the System Global variables
		        WebDriver driver=new FirefoxDriver();
		        
		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		       
		        //Navigate to the demo site
		        driver.get("https://demoqa.com/text-box");
		       
		        // Enter the Full Name
		        WebElement fullName = driver.findElement(By.id("userName"));
		        fullName.sendKeys("Mr.Peter Haynes");
		        
		        //Enter the Email
		        WebElement email=driver.findElement(By.id("userEmail"));
		        email.sendKeys("PeterHaynes@toolsqa.com");
		        
		        // Enter the Current Address
		        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		        currentAddress.sendKeys("43 School Lane London EC71 9GO");
		        
		        
		        //copy address
		        currentAddress.sendKeys(Keys.CONTROL,"A");
		       // currentAddress.key_do
		        //currentAddress.sendKeys("A");
		       
		        		        
		       // Thread.sleep(3000);

		       currentAddress.sendKeys(Keys.CONTROL,"C");
		        //currentAddress.sendKeys("C");
		       // Thread.sleep(3000);

		        
		       //Press the TAB Key to Switch Focus to Permanent Address
		       // currentAddress.sendKeys(Keys.TAB);
		       // Thread.sleep(3000);

		        //Paste the Address in the Permanent Address field
		        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
		        permanentAddress.sendKeys(Keys.CONTROL,"V");
		       // permanentAddress.sendKeys("V");
		        Thread.sleep(3000);
		        
		        
		      String current=currentAddress.getAttribute("value");
		      String permanant=permanentAddress.getAttribute("value");

		      	System.out.println(current);
		      	System.out.println(permanant);
		      	
		        //Compare Text of current Address and Permanent Address
		       //Assert.assertEquals(permanentAddress,currentAddress);//can be used in the case of having test ng or j unit
		      // Thread.sleep(3000);

		        driver.close();
		
		
		
	}

}
