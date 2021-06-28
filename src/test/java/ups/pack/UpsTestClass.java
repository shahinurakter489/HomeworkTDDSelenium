package ups.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpsTestClass {
	WebDriver driver = null;

	public void UpsLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void userId(String user) {
		WebElement userID = driver.findElement(By.id("email"));
		userID.sendKeys(user);

	}

	public void password(String pass) {
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pass);

	}

	public void deleteallCookies() {
		String cookie = driver.getCurrentUrl();
		System.out.println(cookie);
	}
	
	
	public void clickLoginButton() {
		WebElement loginButton = driver.findElement(By.xpath("//*[@id='submitBtn']"));
		loginButton.click();
	}

	public String upsLoginErrorMessageTest() {
		WebElement errorMessages = driver.findElement(By.id("errorMessages"));
		String message = errorMessages.getText();
		return message;
	}


	public void clickSignUpLink() {
		
		WebElement signUp = driver.findElement(By.xpath("//*[@id=\"DOARegisterLink\"]"));
		signUp.click();
		
	}
	public void clickName(String Name) {
		WebElement clickName = driver.findElement(By.name("//*[@name='fullName']"));
			clickName.sendKeys();	
	}
	public void enterEmail(String Email) {
		WebElement enterEmail = driver.findElement(By.id("//*[@id='ups-email_input']"));
		 enterEmail.sendKeys(Email);
	}
	public void userId1(String user) {
		WebElement userId1 = driver.findElement(By.name("//*[@name=\"user_id_input\"]"));
		userId1.sendKeys(user);
		
	}
	public void passWord(String pass) {
		WebElement passWord = driver.findElement(By.id("//*[@id=\"ups-user_password_input\"]"));
	passWord.sendKeys(pass);
	
	}
	
	public void show(String show) {
		WebElement  show1 = driver.findElement(By.xpath("//*[@aria-label=\"Show password as plain text\"]"));
	show1.click();
	
	}
	public void clickPhoneButton() {
		WebElement clickPhoneButton =  driver.findElement(By.xpath("//*[@name=\"phoneCountryCode\"]"));
		clickPhoneButton.click();
	}
	
	
	public void checkBox() {
		WebElement checkBox = driver.findElement(By.xpath("//*[@formcontrolname=\"phoneInput\"]"));
		checkBox.click();
	}
	


		
		
}
