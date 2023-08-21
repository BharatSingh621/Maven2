package TestScript;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPage {
	
	private static final Logger logger = LogManager.getLogger(LoginPage.class);  
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() 
	{

		String Driver_path="C:\\Users\\Bharat Singh\\OneDrive\\Desktop\\Repo\\MavenProejct2\\src\\test\\resources\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Driver_path);
		driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("https://www.saucedemo.com/");  
	}
	
	
	@Test
	public void Login_testCase_1()
	{		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		logger.info("Entered Username");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		logger.info("Entered Password");
		driver.findElement(By.id("login-button")).click();	
		logger.info("Click on Login Button");
	}
	
	@Test
	public void Login_testcase_2() 
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		logger.info("Entered Username");
		driver.findElement(By.id("password")).sendKeys("secret_sauce1");
		logger.info("Entered Password");
		driver.findElement(By.id("login-button")).click();	
		logger.info("Click on Login Button");
				
	}
	
	@AfterMethod
	public void TearDown() 
	{
		logger.info("Trying to Quit Driver...");
		driver.quit();
		logger.info("Driver Quit Successfully");
	}

}
