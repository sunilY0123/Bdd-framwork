package pagewise_layer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page_element_layer.LoginOR;
import utitity_layer.WebUtil;

public class LoginPage extends LoginOR {

	WebDriver driver;
	public LoginPage(WebDriver dr){
		driver=dr;
		PageFactory.initElements(driver,this);
	}
	
	public void validInputData(String uname,String passwd) {
		username.sendKeys(uname);
		pwd.sendKeys(passwd);
	}
	public void loginClick() {
		loginBt.click();
	}
}
