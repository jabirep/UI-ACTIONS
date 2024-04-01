package UI_ACTIONS;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Download_into_specific_loction {

	public static void main(String[] args) {
		
		//during the need of a specific download location, we need to write some code for the particular browser
		/*String location=System.getProperty("user.dir")+"\\Downloads\\";
		
		//using chrome browser
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory", location);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs",preferences);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);

		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();*/
		
		//using firefox browser
		//THe script is same, but only make changes in browser settings
		//there is a challenge in firefox browser, ie..a new modal window opens on clicking the download button.
		//so, first we have to disable those types of windows, so we will apply some codes
		//unlike chrome browser, we need not apply hashmap and preference
		
		

		
		
	}

}
