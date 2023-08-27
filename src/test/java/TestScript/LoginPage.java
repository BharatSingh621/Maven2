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
	
	Logger logger = LogManager.getLogger(LoginPage.class);  
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() 
	{

		String Driver_path="C:\\Users\\Bharat Singh\\OneDrive\\Desktop\\Repo\\MavenProejct2\\src\\test\\resources\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Driver_path);
		logger.info("Setting Driver Path...");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		logger.info("Opening Browser...");
		driver.get("https://www.saucedemo.com/");  
		logger.info("Browser Launched");
	}
	
	
	@Test
	public void Login_testCase_1()
	{		
		logger.info("Started Login_testCase_1....");
		logger.info("Trying to enter Username");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		logger.info("Entered Username");
		logger.info("Trying to enter Password");
		driver.findElement(By.id("password8")).sendKeys("secret_sauce");
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
		logger.error("Test Case Passed/Failed");
				
	}
	
	@AfterMethod
	public void TearDown() 
	{
		logger.info("Trying to Quit Driver...");
		driver.quit();
		logger.info("Driver Quit Successfully");
	}

}
