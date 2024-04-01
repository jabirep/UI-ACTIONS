package UI_ACTIONS;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Link_Validation {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String amazoneUrl="https://www.amazon.in/?tag=admpdesktopin-21&ref=pd_sl_21c9bfca83c249e3de2c794c84deb8541aa86fc35f20bb4e30d52e9f&mfadid=adm";
		//go to amazon
		driver.get(amazoneUrl);//Amazon site
		
		//click action using linktext locator
		//driver.findElement(By.linkText("Mobiles")).click();
		
		//click action using partiallinktext locator
		//driver.findElement(By.partialLinkText("biles")).click();
		
		//collecting all links into a list by tagname
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total number of links in amazone is :"+links.size());
		
		//printing all links using for-each loop
		/*for(WebElement allLinks:links)
		{
			System.out.println(allLinks);

		}*/
		
		// iterate through the links to find broken links and its status code
		int brokenlinks=0;
		for(WebElement allLinks:links)
		{
			String url=allLinks.getAttribute("href");

			if(url==null|| url.isEmpty())
			{
				System.out.println("url is empty");
				continue;
			}
			
			if(!url.startsWith(amazoneUrl))
			{
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}
			
			URL link=new URL(url);
			
			try
			{
				HttpURLConnection http=(HttpURLConnection)
						
				link.openConnection();
				http.connect();
				
				if(http.getResponseCode()>=400)
				{
					System.out.println(url+": is broken link: STATUS CODE IS: "+http.getResponseCode());
					brokenlinks++;
				}
				else
				{
					System.out.println(url+": is valid link: STATUS CODE IS: "+http.getResponseCode());

				}
				
			}
			
			catch(Exception e)
			{
				
			}
		}

		System.out.println("TOTAL NUMBER OF BROKEN LINKS IS EQUAL TO "+brokenlinks);
		

		Thread.sleep(5000);

		driver.quit();
		
	}

}
