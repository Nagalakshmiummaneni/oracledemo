package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginoraclesteps {
	WebDriver driver;
	login  login;
	String url="https://egfh-dev2.login.em2.oraclecloud.com/";
	@Given("user should open any browser")
	public void user_should_open_any_browser() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	@And("user should be on login page of orangehrm")
	public void user_should_be_on_login_page_of_orangehrm() {
		
	   driver.get(url);
	   login=new login(driver);
	}

	@When("enter user and password")
	public void enter_user_and_password() {
	   login.setUseridBy("fin_impl");
	   login.setPasswordBy("S4hana99$");
	  
	}

	@And("click login button")
	public void click_login_button() {
		 login.setSigninBy();
	}

	@Then("user must be on home page")
	public void user_must_be_on_home_page() {
	String urlString=driver.getCurrentUrl();
	if(!urlString.equalsIgnoreCase(url)) {
		 System.out.println("user is on home page ");
	}
	 
	}

	@And("check title of home page is correct")
	public void check_title_of_home_page_is_correct() {

         System.out.println(driver.getTitle());
	}


}
