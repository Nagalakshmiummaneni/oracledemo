package StepDefinition;

import org.openqa.selenium.WebDriver;

import Pages.Homeiconpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homeiconsteps {
	WebDriver driver;
	 Homeiconpage pHomeiconpage;
	@Given("user should be on home page")
	public void user_should_be_on_home_page() throws InterruptedException {
	  homepageDefinition  homepageDefinition=new  homepageDefinition();
	  homepageDefinition.open_any_browser();
	  homepageDefinition.open_oracle_sign_in_page();
	  homepageDefinition.enter_username_and_password();
	  homepageDefinition.click_on_sign_in_button();
	  homepageDefinition.click_on_home_icon();
	  homepageDefinition.able_to_see_home_screen();
	}

	@And("^click an (.*)  $")
	public void select_an_element(String element) throws InterruptedException {
		 Homeiconpage pHomeiconpage=new Homeiconpage(driver);
		    pHomeiconpage.selectforanelement(element);
	
	}
	

	@And("^select an (.*)  $")
	public void select_an_app(String app) throws InterruptedException {
	    pHomeiconpage.appselection(app);
	}
}
