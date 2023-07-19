package pagewise_layer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import page_element_layer.Marketing_AccountOR;
import utitity_layer.WebUtil;

public class Marketing_Account extends Marketing_AccountOR{
   WebUtil we;
	
	public Marketing_Account(WebUtil we){
		this.we=we;
		PageFactory.initElements(we.getdriver(),this);
		
	}
	
	public void createAccount() {
	we.sendData(accountname, "sunil");
	we.clickBt(radioBt);
	we.sendData(discription, "xyz");
	
	}
	
	public void save() {
	
	we.clickBt(accountname);
	}
	
	
	
	
	
}
