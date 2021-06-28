package fedex.Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DriverPackage.BrowserDriver;

public class FedexTestRunner extends BrowserDriver {
	WebDriver driver = null;
	FedexLoginPage fedexLoginPage = null;

	@BeforeMethod(alwaysRun = true)
	void beforeMethod() {

		driver = getChromeDriver();
		fedexLoginPage = new FedexLoginPage(driver);
	}

	@Test
	void loginErrorMessageTest() {
		driver.get("https://www.fedex.com/lasso/login?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		fedexLoginPage.userID("email");
		fedexLoginPage.password("myPassword");
		

		
		String errorMessage = fedexLoginPage.upsLoginErrorMessageTest();
		if (errorMessage.contains("unsuccessful")) {
			System.out.println("PASSED!");
		} else {
			System.out.println("FAILED");
			Assert.fail();
		}
		
}
	@AfterMethod(alwaysRun = true)
	void afterMethod() {
		driver.close();
	}

	
}

