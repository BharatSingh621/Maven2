package TestScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckoutPage {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() 
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.saucedemo.com/");
	}

	
	@Test
	public void CheckOut_testCase1()
	{		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();	
	}
	
	@Test
	public void CheckOut_testCase2()
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
