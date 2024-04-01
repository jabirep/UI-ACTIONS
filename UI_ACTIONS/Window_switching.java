package UI_ACTIONS;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_switching {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//orange hrm site
		
		//get the generated window id for single window
		//String window_id1=driver.getWindowHandle();//this id will be diferent each time you open the window
		
		
		//in the case of having multiple windows
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		

		Set<String> window_id2=driver.getWindowHandles();//this id will be diferent each time you open the window
		//*Tip---->duplicate values are not allowed in set
//FIRST METHOD (using iterator method)

		/*Iterator<String> it=window_id2.iterator();//to iterate through the window ids
		
		String parentID=it.next();//to return parent window id
		String childID=it.next();//to return child window id
		
		System.out.println("parent window id is  :"+parentID);
		System.out.println("child window id is  :"+childID);*/
		
//SECOND METHOD (using array list)
		//*Tip---->duplicate values are allowed in list

		List<String> window_IDs =new ArrayList<String>(window_id2);//converting set into list
		/*String Parent=window_IDs.get(0);//since values in list starts with o index
		String child=window_IDs.get(1);
		
		System.out.println("parent window id is  :"+Parent);
		System.out.println("child window id is  :"+child);
		
		//So, BY GETTING THESE IDS OF PARENT AND CHILD WINDOWS, WE CAN PERFORM ACTIONS ON WINDOWS (eg:switching)

		Thread.sleep(5000);

		driver.switchTo().window(Parent);

		Thread.sleep(5000);

		driver.switchTo().window(child);*/
		
//THIRD METHOD USING FOR EACH LOOP
		Thread.sleep(5000);

		for(String windowIDs:window_IDs)
		{
			Thread.sleep(5000);

			driver.switchTo().window(windowIDs);//it will automatically switch to both the parent and child windows
			
		}
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
