package test.FITAPorurSeleniumWeekEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Highlight {

	WebDriver browser;
	
	@Test
	public void HighLight()
	{
		browser = new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/dashboard.xhtml");
		WebElement element = browser.findElement(By.id("menuform:j_idt40"));
		
		JavascriptExecutor js = (JavascriptExecutor) browser;
        //use executeScript() method and pass the arguments 
        //Here i pass values based on css style. Yellow background color with solid red color border. 
	js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", element);
	}
}
