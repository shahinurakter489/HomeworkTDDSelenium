package googleTestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestRunner {

	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		 driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		driver.get("http://www.Google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void googlelogoTest() {
	
boolean b	= driver .findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	}
	
	@Test
	public void gmaillinkTest() {
		boolean b =  driver.findElement(By.linkText("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div/div[1]/a")).isDisplayed();
	}
	
	@Test
	public void imageTest() {
		boolean b = driver.findElement(By.className("//*[@class=\"gb_f\"]")).isDisplayed();
	}
	@Test
	public void googleappTest() {
		boolean b= driver.findElement(By.className("//*[@class=\"gb_Ve\"]")).isDisplayed();
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
