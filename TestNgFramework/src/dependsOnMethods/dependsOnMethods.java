package dependsOnMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class dependsOnMethods {

	public static WebDriver driver;
	SoftAssert soft;
	
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
		this.soft=new SoftAssert();
		soft.assertEquals(title, "Orange","verifying title");
		System.out.println("next line after home page soft assert running");
		String url=driver.getCurrentUrl();
		soft.assertEquals(url, "https://opensource-demo.orangehrmlive.com/","verifying url");
		System.out.println("next line after home page soft assert running");
		
		soft.assertAll();
	}
	@Test(dependsOnMethods="loginpage")
	public void homepage()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String dash=driver.findElement(By.xpath("//div[@id='content']//div//*[contains(text(),'Dashboard')]")).getText();
		this.soft=new SoftAssert();
		soft.assertEquals(dash ,"Dashboard","verifying homepage");
		System.out.println("next line after home page soft assert running");
		soft.assertAll();

	}
	@AfterSuite
	public void bQuit()
	{
		driver.quit();
	}
	

}
