package pomClasses1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPass {
	
	//variable
	
	@FindBy (xpath = " //div[contains(text(), 'Please enter your')] ")
	private WebElement message ;

	@FindBy (xpath = "  (//input[@name='email'])[2]")
	private WebElement emailAddOrPhnNum ;
	
	@FindBy (xpath = "  (//a[@role='button'])[1] ")
	private WebElement cancel ;
	
	@FindBy (xpath = " (//a[@role='button'])[2] ")
	private WebElement search ;
	
	//Constructor
	
	public ForgetPass (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	
	public void getMessage() {
		String text = message.getText();
		System.out.println(text);
	}
	
	public void enteremailAddOrPhnNum() {
		emailAddOrPhnNum.sendKeys("254789745544");
	}
	
	public void clickOnCancel() {
		cancel.click();
	}
	
	public void clickOnSearch() {
		search.click();
	}
}
