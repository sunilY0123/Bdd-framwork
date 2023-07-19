package step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagewise_layer.LoginPage;

public class Login_step {
public 	WebDriver driver;
public	LoginPage lp;

	@Given("launch browser")
	public void launch_browser() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	    lp=new LoginPage(driver);
	}

	@Given("open url {string}")
	public void open_url(String url) {
	   driver.get( url);
	}

	@When("enter username {string} and password {string}")
	public void enter_username_and_password(String uname, String passwd) {
	lp.validInputData(uname,passwd);
	}

	@When("click on login")
	public void click_on_login() {
	    lp.loginClick();

	}

	@Then("title should be {string}")
	public void title_should_be(String expectedTitle) {
	String actualTitle=driver.getTitle();
	if(actualTitle.equalsIgnoreCase(expectedTitle)) {
		System.out.println("title is successfully passed");
	}
	}


}
