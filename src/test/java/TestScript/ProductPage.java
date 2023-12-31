package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductPage {
	
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
	public void Product_testCase1()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	
	@Test
	public void Product_testcase2()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@AfterMethod
	public void TearDown() 
	{
		driver.quit();
	}

}
