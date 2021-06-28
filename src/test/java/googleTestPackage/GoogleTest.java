package googleTestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
	@BeforeSuite
	public void setup() {
		System.out.println("setup system properties for chrome");
	}
		@BeforeClass
		public void launchchBrowswer() {
		System.out.println("Launch the browse");
		
		}
		
		@BeforeMethod
		public void enterURL() {
			System.out.println("enter the URL");
		}
		
		@BeforeTest
		public void loginpage() {
			System.out.println("login page");
		}
		@Test
		public void googletitleTest() {
			System.out.println("google title test");
			
		}
		@Test
		public void searchTest() {
			System.out.println("search test");
		}
		
		/*@ BeforeMethod 
		 * Test_3
		 * @AfterMethod
		 * @BeforeMethod
		 * Test2
		 * */
		@Test
		public  void googlegooutTest() {
			System.out.println("Google Logoout test");
		}
		
		
		@BeforeMethod
		public void logout() {
			System.out.println("Logout from app");
		}
		
		
		@AfterTest
		public void deleteallCookies() {
			System.out.println("Delete all Cookies");
		}
		@AfterClass
		public void closeBrowser() {
			System.out.println("Close the Browser");
		}
		
		
		
		
		
		
		
}
