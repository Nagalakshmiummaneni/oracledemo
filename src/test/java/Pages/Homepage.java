package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	
	WebDriver driver;
	@FindBy(xpath = "//a[@id='pt1:_UISmmLink']//*[name()='svg']")
	WebElement navigatElement;
	@FindBy(xpath="//*[name()='svg'][@id='pt1:_UIShome::icon']")
	WebElement homeElement;
	@FindBy(xpath = "//*[name()='svg'][@id='pt1:_UISfavIconu::icon'])")
	WebElement favourateElement;
	@FindBy(xpath = "//*[name()='svg'][@id='pt1:_UISwlLink::icon']")
	WebElement watchlistElement;
	@FindBy(xpath = "//*[name()='svg'][@id='pt1:_UISatr:0:cil1::icon']")
	WebElement notificationElement;
	@FindBy(xpath = "//img[@id=\"pt1:_UIScmil2u\"]")
	WebElement f1logElement;
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	public void cliktoNavigatElement() {
		navigatElement.click();
	}
	
	public void clicktoHomeElement() {
		homeElement.click();;
	}
	public void clicktoFavourateElement() {
	favourateElement.click();;
	}
	public void clicktoWatchlistElement() {
		 watchlistElement.click();;
	}
	public void clicktoNotificationElement() {
		 notificationElement.click();;
	}
	public void clicktoF1logElement(WebElement f1logElement) {
		this.f1logElement = f1logElement;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}


