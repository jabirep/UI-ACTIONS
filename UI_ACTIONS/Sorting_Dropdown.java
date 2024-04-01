package UI_ACTIONS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Sorting_Dropdown {

	public static void main(String[] args) {
		
		//To check if all the options insidev dropdown are sorted or not
				WebDriverManager.firefoxdriver().setup();
		        WebDriver driver = new FirefoxDriver();
		        //driver.get("https://www.twoplugs.com/newsearchserviceneed");
		        driver.get("https://itera-qa.azurewebsites.net/home/automation");

		        driver.manage().window().maximize();
		        
		       // Select options = new Select(driver.findElement(By.name("category_id")));
		        Select options = new Select(driver.findElement(By.xpath("//select[@class='custom-select']")));

		        
		        // Get all options from category dropdown
		        List<WebElement> lists = options.getOptions();
		        
		        //Creating an empty List to store all dropdown values
		        List OriginalList = new ArrayList();
		        
		        //Using for-each loop fetch all options one by one and get their values
		        for(WebElement ele : lists) {
		            
		            OriginalList.add(ele.getText());
		        }
		        
		        System.out.println("Options in dropdown: " +OriginalList);
		        
		        //Creating temp List - same copy of Original for comparing purpose
		        List templist = new ArrayList(OriginalList);
		        
		        System.out.println("Temp List: " + templist);
		        
		        //Sorting the Original List 
		        Collections.sort(OriginalList);
		        System.out.println("Sorted List:" + OriginalList );
		        
		        
		        // In IF Condition we will compare both List
		        if(OriginalList.equals(templist)) {
		            
		            System.out.println("List is Sorted");
		            
		        }else {
		            
		            System.out.println("List is unsorted");
		        }
		        
		        driver.quit();
		        
		    }
	}


