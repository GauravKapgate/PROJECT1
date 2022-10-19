package login_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Login_Page {
	
	 public FB_Login_Page(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(id="email")private WebElement Email;
	 
	 @FindBy(id="pass") private WebElement Password;
	 
	 @FindBy(tagName="button")private WebElement Login;
	 

	public void Enter_EmailID(String email) {
		Email.sendKeys(email);
	}
	public void Enter_Password(String password) {
		Password.sendKeys(password);
	}
	public void Click_Login() {
		Login.click();
	}
}