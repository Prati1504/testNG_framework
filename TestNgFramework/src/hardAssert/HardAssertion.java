package hardAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HardAssertion {

	public static WebDriver driver;
	
	@BeforeSuite
	public void brLaunch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=0)
	public void loginpage()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "Orange","verifying title");
		System.out.println("next line after login page hard assert running");
		
	}
	@Test(priority=1)
	public void homepage()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String dash=driver.findElement(By.xpath("//div[@id='content']//div//*[contains(text(),'Dashboard')]")).getText();
		Assert.assertEquals(dash ,"Dashboard","verifying homepage");
		System.out.println("next line after home page hard assert running");

	}
	@AfterSuite
	public void bQuit()
	{
		driver.quit();
	}
	
}
