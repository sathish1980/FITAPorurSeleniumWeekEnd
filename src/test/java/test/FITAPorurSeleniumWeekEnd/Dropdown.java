package test.FITAPorurSeleniumWeekEnd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	
	WebDriver browser;
	//@Test
	public void dropdown() throws InterruptedException
	{
		browser = new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/select.xhtml");
		Select uiAutomation = new Select(browser.findElement(By.className("ui-selectonemenu")));
		/*
		 * selectbyIndex
		 * selectbyvalue
		 * selectByVisibleText
		 */
		System.out.println(uiAutomation.isMultiple());
		uiAutomation.selectByIndex(2);
		Thread.sleep(2000);
		uiAutomation.selectByVisibleText("Cypress");
	}
	
	@Test
	public void DropdownImplementationwithmultiple() throws InterruptedException
	{
	//	WebDriver  browser1;

		browser = new ChromeDriver();
		browser.manage().window().maximize();
		//browser1.get("https://www.leafground.com/select.xhtml");
		browser.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		Select s = new Select(browser.findElement(By.xpath("//*[@class='col-lg-3' and @id='second']")));
		/*
		 * selectByIndex
		 * selectByvalue
		 * selectByvisibleText
		 * isMultiple
		 * deselectByIndex
		 * deselectByvalue
		 * deselectByvisibleText
		 * deselectAll
		 */
		System.out.println(s.isMultiple());
		if(s.isMultiple())
		{
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByVisibleText("Burger");
		Thread.sleep(2000);
		s.selectByValue("donut");
		Thread.sleep(2000);
		s.deselectByIndex(1);
		Thread.sleep(2000);
		s.deselectByValue("burger");
		Thread.sleep(2000);
		s.deselectAll();
		}
	}

	
}
