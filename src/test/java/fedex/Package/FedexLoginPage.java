package fedex.Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FedexLoginPage {

	WebDriver driver = null;

	public FedexLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void userID(String user) {
		WebElement userID = driver.findElement(By.id("email"));
		userID.sendKeys(user);

	}

	public void password(String pass) {
		WebElement password = driver.findElement(By.className("password"));
		password.sendKeys("pass");

	}

	public String upsLoginErrorMessageTest() {
		WebElement errorMessages = driver.findElement(By.id("errorMessages"));
		String message = errorMessages.getText();
		return message;
	}

	public void EnterEmail() {
		WebElement enterEmail = driver.findElement(By.id("//*[@id='mat-input-0']"));
		enterEmail.click();
	}

	public void password1() {
		WebElement password1 = driver.findElement(By.id("//*[@id=\"mat-input-1\"]"));
		password1.click();

	}

}
