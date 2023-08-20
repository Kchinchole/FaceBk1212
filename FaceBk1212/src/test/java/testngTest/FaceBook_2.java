package testngTest;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomClasses1.LogInOrSignUp;
import pomClasses1.OpenSignUpPg;

public class FaceBook_2 {
	WebDriver driver ;
	OpenSignUpPg openSignUpPg ;

	@Parameters ("Browser")
	@BeforeTest
	
	public void lunchTheBrowse(String browserName) {
		System.out.println("BeforeTest");
		
		if(browserName.equals("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\CF1\\chromedriver_win32 (3)\\chromedriver.exe ");
				ChromeOptions ops = new ChromeOptions();
				ops.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(ops);
			}
		
		if(browserName.equals("Firefox")) 
			{
				System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.33.0-win64\\geckodriver.exe");
				driver= new FirefoxDriver(); 
			}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	}
	//@BeforeClass
	public void createPomObject() {
	
		openSignUpPg = new OpenSignUpPg(driver);
		
	}
	
	@BeforeMethod
	public void goToSignUpForm() {
		System.out.println("BeforeMethod");
		
		driver.get("https://www.facebook.com/");
		LogInOrSignUp logInOrSignUp = new LogInOrSignUp(driver);
		logInOrSignUp.createNewAcc();
		 }
	
	@Test 
	public void terms() throws InterruptedException {
	
		//OpenSignUpPg openSignUpPg = new OpenSignUpPg(driver);
		openSignUpPg.terms();
		Thread.sleep(3000);
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		String url = driver.getCurrentUrl() ;
		if(url.equals("Privacy Policy" )) 
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
			
	}
	
	@Test (priority = 4)
	
	public void privacyPolicy() throws InterruptedException {
		//OpenSignUpPg openSignUpPg = new OpenSignUpPg(driver) ;
		openSignUpPg.privacyPolicy();
		Thread.sleep(3000);
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		String url = driver.getCurrentUrl();
		
			if(url.equals(" Terms" )) 
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("fail");
			}
		
		}
		
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		System.out.println("AfterMethod");
		driver.close();
		Thread.sleep(3000);
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
	}
	
	@AfterClass
	public void clearPomObj() {
		System.out.println("AfterClass");
		openSignUpPg = null;
	}
	
	@AfterTest
	public void closedBrowser() {
		System.out.println("closedBrowser");
		driver.quit();
		driver = null;
		
		System.gc();
	}

}
