 package testngTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses1.LogInOrSignUp;
import pomClasses1.OpenSignUpPg;

public class Test123 {
	
WebDriver driver ;
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\CF1\\chromedriver_win32 (3)\\chromedriver.exe ");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void goToSignUpForm() {
		System.out.println("BeforeMethod");
		
		driver.get("https://www.facebook.com/");
		LogInOrSignUp logInOrSignUp = new LogInOrSignUp(driver);
		logInOrSignUp.createNewAcc();
		 }
	
	@Test 
	public void test() {
		System.out.println("Test");
		
		OpenSignUpPg openSignUpPg = new OpenSignUpPg(driver);
		openSignUpPg.enterfristNm();
		}
	
	@Test 
	
	public void test1() {
		System.out.println("Test1");
		}
		
	@Test 
		
		public void test2() {
			System.out.println("Test2");
			}
		
	@Test 
	
	public void test3() {
		System.out.println("Test3");
		}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
}



