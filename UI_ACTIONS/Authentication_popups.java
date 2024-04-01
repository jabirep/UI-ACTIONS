package UI_ACTIONS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication_popups {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//GENERAL SYNTAX FOR PASSING USERNAME AND PASSWORD INTO AUTHENTICATION POP-UP WUNDOW
		//http://username:password@url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
