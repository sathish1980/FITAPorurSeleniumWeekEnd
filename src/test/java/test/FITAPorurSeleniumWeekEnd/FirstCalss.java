package test.FITAPorurSeleniumWeekEnd;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstCalss {

	
	@Test
	public void Launch() throws InterruptedException
	{
		/*
		 * lauch the browser and enter the url
		 * Enter user name
		 * enter password
		 * click login
		 * login should be sucessfull
		 */
		//System.setProperties("webdriver.chrome.driver","");
		WebDriver browser = new FirefoxDriver();
		browser.manage().window().maximize();
		/*browser.manage().window().minimize();
		//browser.close();
		browser.quit();*/
		browser.get("https://www.facebook.com/");
		/*browser.navigate().to("https://www.gmail.com/");
		browser.navigate().back();
		browser.navigate().forward();
		browser.navigate().refresh();*/
		WebElement username = browser.findElement(By.id("email"));
		username.sendKeys("sathish");
		Thread.sleep(1000);
		username.clear();
		browser.findElement(By.name("email")).sendKeys("kumar");
		//browser.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("fita");
		//browser.findElement(By.linkText("Forgotten password?")).click();
		browser.findElement(By.partialLinkText("rgot")).click();
	}
	

}
