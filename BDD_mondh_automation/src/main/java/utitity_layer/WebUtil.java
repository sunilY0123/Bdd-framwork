package utitity_layer;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebUtil {

	private WebDriver driver;


	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");

	}
	public WebDriver getdriver() {

		return driver;
	}


	public void sendData(WebElement we,String str) {
		try {
			we.clear();
		}catch(Exception e) {
			e.printStackTrace();
		}
		we.sendKeys(str);

	}
	public void clickBt(WebElement we) {
		we.click();
	}


	public void mouseOver(WebElement we) {
		Actions act=new Actions(driver);
		try {
			act.moveToElement(we).build().perform();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void validateText(String actual,String expt) {
		if(actual.equals(expt)) {
			System.out.println("Text is successfully match");
		}else {
			System.out.println("Text is not match");

		}
	}
	public void handlewindow() {

		Set<String > handles=driver.getWindowHandles();

		for (String handle : handles) {
			driver.switchTo().window(handle);
			break;
		}
		driver.close();

	}


}
