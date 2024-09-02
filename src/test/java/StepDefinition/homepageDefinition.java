package StepDefinition;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Homeiconpage;
import Pages.Homepage;
import Pages.login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homepageDefinition {

	WebDriver driver;
	login login;
	Homepage homepage;
	

	@Given("open any browser")
	public void open_any_browser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@And("open oracle sign in page")
	public void open_oracle_sign_in_page() {

		driver.get( "https://egfh-dev2.login.em2.oraclecloud.com/");
		login = new login(driver);
	}

	@When("enter username and password")
	public void enter_username_and_password() {
		login.setUseridBy("fin_impl");
		login.setPasswordBy("S4hana99$");
	}

	@And("click on sign in button")
	public void click_on_sign_in_button() {
		login.setSigninBy();
	}

	@And("able to see home page")
	public void able_to_see_home_page() {
		String expString = "Welcome, Finance Impl";
		WebElement namElement = driver.findElement(By.tagName("h1"));
		if (expString.equalsIgnoreCase(namElement.getText())) {
			System.out.println("user is on home page");
		}

	}

	@Then("click on navigate page")
	public void click_on_navigate_page() {
      homepage=new Homepage(driver);
      homepage.cliktoNavigatElement();
	}

	@And("able to see navigation menu")
	public void able_to_see_navigation_menu() {
       WebElement element=    driver.findElement(By.xpath("//a[@id=\"pt1:_UISnvr:0:nvcl1\"]"));
	 System.out.println(element.isEnabled());
	}
	@Then("close navigation menu")
	public void close_navigation_menu() {
	    driver.findElement(By.xpath("//*[name()=\"svg\"][@id='pt1:_UISnvr:0:nvcil1::icon']")).click();
	}

	
	@Then("click on home icon")
	public void click_on_home_icon() {
		 homepage=new Homepage(driver);
	    homepage.clicktoHomeElement();
	}

	@And("able to see home screen")
	public void able_to_see_home_screen() throws InterruptedException {
	    WebElement element=driver.findElement(By.xpath("//*[@id='pt1:atkfr1:0:grid:0:ot3']/h1"));
	    System.out.println(element.isEnabled());
	    System.out.println(element.getText());
	   
	}

}
