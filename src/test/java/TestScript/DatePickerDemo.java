package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePickerDemo {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void Setup() 
	{

		String Driver_path="C:\\Users\\Bharat Singh\\OneDrive\\Desktop\\Repo\\MavenProejct2\\src\\test\\resources\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Driver_path);		
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/"); 
	}
	
	
	@Test
	public void DatePickerTest() 
	{
		WebElement demo_frame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(demo_frame);
		driver.findElement(By.id("datepicker")).click();
		
		String expectedMonthYear = "May2021";		
		String actualMonthYear="";
		String month="";
		String year="";
		
		
		while(true)
		{						
			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			actualMonthYear= month+""+year;			
			
			if(expectedMonthYear.equalsIgnoreCase(actualMonthYear)) 
			{
				break;
			}			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}		
		driver.findElement(By.xpath("//a[contains(text(),'19')]")).click();		
	}
	
	


	@AfterMethod
	public void TearDown() throws InterruptedException 
	{		
		Thread.sleep(2000);
		driver.quit();
	}

}
