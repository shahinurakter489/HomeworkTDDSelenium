package DriverPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {
	
		public WebDriver getChromeDriver() {
			WebDriver driver = new ChromeDriver();
			
			System.setProperty("WebDriver.Chrome.Driver", "ChromeDrvier.exe");
			return driver;
			
		}
}
