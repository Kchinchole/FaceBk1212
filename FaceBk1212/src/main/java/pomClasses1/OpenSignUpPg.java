package pomClasses1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenSignUpPg {
	
	//variables
	
	@FindBy (xpath = "//input[@name='firstname']")
	private WebElement fristNm;
	
	@FindBy (xpath = " //input[@name='lastname']  ")
	private WebElement srnm ; 

	@FindBy(xpath = " (//input[@type='text'])[4]  ")
	private WebElement mobNumOrEmailId ;
	
	@FindBy (xpath = "  (//input[@type='password'])[2] ")
	private WebElement password ;
	
	@FindBy (xpath = "  //select[@id='day'] ")
	private WebElement birthDate ;
	
	@FindBy (xpath = " //select[@id='month'] ")
	private WebElement month ;
	
	@FindBy (xpath = " //select[@id='year']  ")
	private WebElement year ;
	
	@FindBy (xpath = " //label[text() = 'Female']  ")
	private WebElement Female ;
	
	@FindBy (xpath = " //label[text() = 'Male']  ")
	private WebElement male ;
	
	@FindBy (xpath = " //label[text() = 'Custom']  ")
	private WebElement custom ;
	
	@FindBy (xpath = " (//a[text() = 'Terms'])[2]  ")
	private WebElement terms ;
	
	@FindBy (xpath = " //a[@id='privacy-link']  ")
	private WebElement privacyPolicy ;
	
	@FindBy (xpath = " //a[@id='cookie-use-link'] ")
	private WebElement cookiesPolicy ;
	
	private WebDriver driver ;
	private Actions action ;
	
	//Constructor
	
	public OpenSignUpPg (WebDriver driver) {
	PageFactory.initElements(driver, this);
	//this.driver = driver ;
	//action = new Actions(driver);
	}
	
	//Methods
	
	public void enterfristNm() {
		fristNm.sendKeys("kirti");
	}
	
	public void enterLastNm() {
		srnm.sendKeys("Chinchole");
	}
	
	public void mobNumOrEmailId() {
		mobNumOrEmailId.sendKeys("256988888888");
	}
	
	public void password() {
		password.sendKeys("Shinu88");
	}
	
	public void birthDate() {
		Select s = new Select(birthDate);
		 s.selectByVisibleText("8");
	}
	
	public void month() {
		Select s = new Select(month);
		s.selectByVisibleText("Aug");
	}
	
	public void year() {
		Select s = new Select(year);
		s.selectByVisibleText("2021");
	}
	
	public void terms() {
		//Actions action = new Actions(driver);
		action.moveToElement(terms).click().build().perform();
	}
	
	public void privacyPolicy() {
		Actions action = new Actions(driver);
		action.moveToElement(privacyPolicy).click().build().perform();
	}
}