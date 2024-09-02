package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class login {

	WebDriver driver;
	
	By useridBy=By.xpath("//input[@name='userid']");
	By passwordBy=By.xpath("//input[@name='password']");
	By signinBy=By.xpath("//button[@type='submit']");
	By forgetpasswordBy=By.xpath("//a[text()='Forgot Password']");
	By languageBy=By.xpath("//select[@name='Languages']");
	
	
	public login(WebDriver driver) {
		
		this.driver = driver;
	}
	public void setUseridBy(String user) {
		driver.findElement(useridBy).sendKeys(user);
	}
	public void setPasswordBy(String password) {
		driver.findElement(passwordBy).sendKeys(password);
	}
	public void setSigninBy() {
		driver.findElement(signinBy).click();
	}
	public void setForgetpasswordBy() {
		driver.findElement(forgetpasswordBy).click();
	}
	public void setLanguageBy(String languString) {
		WebElement language = driver.findElement(languageBy);
		Select langSelect=new Select(language);
		langSelect.selectByVisibleText(languString);
	}


}
