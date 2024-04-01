package UI_ACTIONS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_hover_action {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/s?k=amazon+0nline+shopping&adgrpid=73151463035&ext_vrnc=hi&gclid=Cj0KCQiApKagBhC1ARIsAFc7Mc6BMLK3283n69x_BzbRriP4abZIOtV0TC0qg92bnbXEzLAZFgEVqOYaAqQuEALw_wcB&hvadid=590591345228&hvdev=c&hvlocphy=1007779&hvnetw=g&hvqmt=e&hvrand=3334020404944417080&hvtargid=kwd-375831066874&hydadcr=16382_2164284&tag=googinhydr1-21&ref=pd_sl_8g4fopyo_e");
		driver.manage().window().maximize();
		
		  Thread.sleep(8000);

		// Locating the Main Menu (Parent element)
		WebElement mainMenu = driver.findElement(By.linkText("prime"));

		//Instantiating Actions class
		Actions actions = new Actions(driver);

		//Hovering on main menu
		actions.moveToElement(mainMenu);

		// Locating the element from Sub Menu
		/*WebElement subMenu = driver.findElement(By.id("multiasins-img-link"));
		Thread.sleep(5000);

		//To mouseover on sub menu
		actions.moveToElement(subMenu);
		Thread.sleep(5000);

		//build()- used to compile all the actions into a single step 
		actions.click().build().perform();
		
		*/
		  Thread.sleep(5000);
	        driver.quit();
	}

}
