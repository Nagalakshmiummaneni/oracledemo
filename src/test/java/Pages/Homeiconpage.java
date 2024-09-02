package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homeiconpage {
	WebDriver driver;

	public Homeiconpage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void selectforanelement(String selectname) throws InterruptedException {
		List<WebElement> search = driver.findElements(By.xpath("//div[@role=\"tab\"]//a"));
		int l = search.size();
		System.out.println(l);
		int count = 0;
		for (WebElement s : search) {

			System.out.println(s.getText());
			if (s.getText().equalsIgnoreCase(selectname)) {

				driver.findElement(By.xpath("//div[@role='tab']//a[text()='" + selectname + "']")).click();
			} else if (count == 6) {
				count = 0;
				if (l != 3) {
					driver.findElement(By.xpath("//div[@id='clusters-right-nav']//*[name()='svg']")).click();
					Thread.sleep(1000);
				}
			}
			count++;
			l--;

		}

	}
	
	public void quickactionselection(String option) throws InterruptedException {
	List<WebElement> quickoptions = driver.findElements(By.xpath("//div[@type='quickaction']//a"));
	for(WebElement e:quickoptions) {
		if(option.equalsIgnoreCase(e.getText())){
			Thread.sleep(1000);
			e.click();
		}
	}
	}
	public void appselection(String appname) throws InterruptedException {
	List<WebElement> applist = driver.findElements(By.xpath("//div[@class=\"flat-grid-cell\"]//a"));
	for(WebElement e:applist) {
		if(appname.equalsIgnoreCase(e.getText())){
			Thread.sleep(1000);
			e.click();
		}
	}
	}
}
