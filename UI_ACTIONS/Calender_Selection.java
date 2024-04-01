package UI_ACTIONS;

import java.time.Duration;
import java.util.Calendar;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Calender_Selection {
			
			@Test

		    public void testDAtePicker() throws Exception{

		        //DAte and Time to be set in textbox

		        String dateTime ="12/07/2014 2:00 PM";

		        WebDriver driver = new FirefoxDriver();

		        driver.manage().window().maximize();
		        
		        driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		        
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		        
		        //button to open calendar

		        WebElement selectDate = driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar k-button-icon']"));
		        
		    selectDate.click();
		    
		    Actions action=new Actions(driver);

		    //button to move next in calendar

		    //WebElement nextLink = driver.findElement(By.xpath("//span[@class='k-icon k-i-caret-alt-right k-button-icon']"));
		   // nextLink.click();
		    

		    //button to click in center of calendar header
		    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='e14c3e7e-e6aa-4672-8201-bdd7d55e97e6']"))).click();
		   // action.moveToElement(midLink);
		    
		  
		  //	WebElement guru99seleniumlink;
			//guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));


		    //button to move previous month in calendar

		    //WebElement previousLink = driver.findElement(By.xpath("//span[@class='k-icon k-i-caret-alt-left k-button-icon']")); 
		    //previousLink.click();

		        //Split the date time to get only the date part

		       /* String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");

		        //get the year difference between current year and year to set in calander

		        int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2])- Calendar.getInstance().get(Calendar.YEAR);

		        midLink.click();

		        if(yearDiff!=0){

		            //if you have to move next year

		            if(yearDiff>0){

		                for(int i=0;i< yearDiff;i++){

		                    System.out.println("Year Diff->"+i);

		                    nextLink.click();

		                }

		            }

		            //if you have to move previous year

		            else if(yearDiff<0){

		                for(int i=0;i< (yearDiff*(-1));i++){

		                    System.out.println("Year Diff->"+i);

		                    previousLink.click();

		                }

		            }

		        }
		        
		        Thread.sleep(1000);

		        //Get all months from calendar to select correct one

		        List<WebElement> list_AllMonthToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
		        
		        list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1])-1).click();
		        
		        Thread.sleep(1000);

		        //get all dates from calendar to select correct one

		        List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class,'k-other-month'))]"));
		        
		        list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0])-1).click();
		        
		        ///FOR TIME

		        WebElement selectTime = driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_timeview']"));

		        //click time picker button

		        selectTime.click();

		        //get list of times

		        List<WebElement> allTime = driver.findElements(By.xpath("//div[@data-role='popup'][contains(@style,'display: block')]//ul//li[@role='option']"));
		      
		        dateTime = dateTime.split(" ")[1]+" "+dateTime.split(" ")[2];

		     //select correct time

		        for (WebElement webElement : allTime) {

		            if(webElement.getText().equalsIgnoreCase(dateTime))

		            {

		                webElement.click();

		            }

		        }
		        
		        driver.quit();//*/

		}
	}


