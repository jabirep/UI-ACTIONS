package UI_ACTIONS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_withoutSelectMethod {

	public static void main(String[] args) {
		
		//GENERIC OR GENERAL METHOD FOR SELECTING FROM THE DROPDOWN USING FOR-EACH LOOP
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");//DEMO DROPDOWN SITE

		driver.manage().window().maximize();
		
		WebElement country=driver.findElement(By.xpath("//select"));
		Select dropdown=new Select(country);
		
		List<WebElement> alloptions=dropdown.getOptions();
		
		for(WebElement option : alloptions)
		{
			if(option.getText().contains("Antarctica"))
			{
				option.click();
				break;
			}
		}
		
		
	}

}
