package page_element_layer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageOR {

	
	
	@FindBy(xpath="//a[text()='Marketing']")
	protected WebElement moveEle ;
	
	@FindBy(xpath="//div[@id='Marketing_sub']//a[text()='Accounts']")
	protected WebElement accountModl ;
	
	@FindBy(xpath="//img[contains(@alt,'Create Account')]")
	protected WebElement pluseBt ;
	
	
	
	
	
	
	
	
	
	
	
	
}
