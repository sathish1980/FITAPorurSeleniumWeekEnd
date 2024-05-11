package test.FITAPorurSeleniumWeekEnd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Listconcepts {
	/*
	 *  click the down arrow in the list
	 *  Wait for the list to load
	 *  Get all the value from the list
	 *  Click the expceted value
	 *
	 */

	String expectedCountry ="Brazil";
	
	WebDriver browser;
	@Test
public void SelectCountry()
{
	browser = new FirefoxDriver();
	browser.manage().window().maximize();
	browser.get("https://www.leafground.com/select.xhtml");
	// click the down arrow in the list
	browser.findElement(By.xpath("//div[@id='j_idt87:country']//*[starts-with(@class,'ui-selectonemenu-trigger')]")).click();
	WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.elementToBeClickable(browser.findElement(By.xpath("//*[@id='j_idt87:country_items']//li[last()]"))));
	
	List<WebElement> allCountry =browser.findElements(By.xpath("//*[@id='j_idt87:country_items']//li"));
	for(WebElement eachcountry : allCountry)
	{
		String actualCountry = eachcountry.getText();
		if(actualCountry.equalsIgnoreCase(expectedCountry))
		{
			eachcountry.click();
			break;
		}
	}
}

}
