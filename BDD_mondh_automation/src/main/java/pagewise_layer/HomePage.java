package pagewise_layer;

import org.openqa.selenium.support.PageFactory;

import page_element_layer.HomePageOR;
import utitity_layer.WebUtil;

public class HomePage extends HomePageOR {

WebUtil we;
	
	public HomePage(WebUtil we){
		this.we=we;
		PageFactory.initElements(we.getdriver(),this);
	}
	
	public void moveElement() {
		we.mouseOver(moveEle);
		we.clickBt(accountModl);
		we.clickBt(pluseBt);
		
	}
	
}
