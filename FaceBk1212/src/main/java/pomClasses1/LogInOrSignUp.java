package pomClasses1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInOrSignUp {
	
	//variable
	
	@FindBy (xpath = "//input[@name='email']")
	private WebElement emailAddOrPhnNum ;

	@FindBy (xpath = " //input[@id='pass'] ")
	private WebElement passWord ;
	
	@FindBy(xpath = " //button[@name='login'] ")
	private WebElement logIn ;
	
	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement createNewAcc ;
	
	//Constructor
	
	public LogInOrSignUp(WebDriver Driver) {
	PageFactory.initElements(Driver, this);
	}
	
	//Methods
	
	public void sendemailAddOrPhnNum() {
		emailAddOrPhnNum.sendKeys("kirti1910@gamil.com");
	}
	
	public void sendpassWord() {
		passWord.sendKeys("Shinu");
	}
	
	public void clickLogIn() {
		logIn.click();
	}
	
	public void clickonopenSignUpPg() {
		createNewAcc.click();
	}

	public void createNewAcc() {
		// TODO Auto-generated method stub
		createNewAcc.click();
	}

}
