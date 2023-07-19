package page_element_layer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginOR {

	@FindBy(xpath="//input[@name='user_name']")
	protected WebElement username;
	
	@FindBy(xpath="//input[@name='user_password']")
	protected WebElement pwd;
	
	@FindBy(xpath="//input[@name='Login']")
	protected WebElement loginBt;
	
	
	
	
	
	
	
	
	
}
