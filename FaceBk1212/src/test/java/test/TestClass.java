package test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pomClasses1.ForgetPass;
import pomClasses1.LogInOrSignUp;
import pomClasses1.OpenSignUpPg;

public class TestClass {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium1\\CF1\\chromedriver_win32 (3)\\chromedriver.exe ");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		  
		  LogInOrSignUp logInOrSignUp = new LogInOrSignUp(driver);
		  
		  logInOrSignUp.sendemailAddOrPhnNum();
		  logInOrSignUp.sendpassWord();
		  logInOrSignUp.clickLogIn();
		  
		  
		  ForgetPass forgetPass = new ForgetPass (driver);
		  
		  forgetPass.getMessage();
		  forgetPass.enteremailAddOrPhnNum();
		  forgetPass.clickOnCancel();
		  forgetPass.clickOnSearch();
		  
		  OpenSignUpPg openSignUpPg = new OpenSignUpPg(driver);
		  
		  openSignUpPg.enterfristNm();
		  openSignUpPg.enterLastNm();
		  openSignUpPg.mobNumOrEmailId();
		  openSignUpPg.password();
		  openSignUpPg.birthDate();
		  openSignUpPg.month();
		  openSignUpPg.year();

	driver.close();
	}
}
