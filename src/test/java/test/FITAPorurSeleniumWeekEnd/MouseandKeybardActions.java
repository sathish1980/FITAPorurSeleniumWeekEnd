package test.FITAPorurSeleniumWeekEnd;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseandKeybardActions {
	WebDriver browser;

	/*
	 * MoveToelement
	 * click
	 * sendKeys
	 * doubleclick
	 * contextclick
	 */
//	@Test
	public void MouseActions()
	{
		browser = new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("https://www.ebay.com/");
		Actions mouseactions = new Actions(browser);
		mouseactions.moveToElement(browser.findElement(By.xpath("//a[text()='Electronics']//parent::li"))).perform();
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(browser.findElement(By.xpath("//a[text()='Computers and tablets']//parent::li"))));
		mouseactions.moveToElement(browser.findElement(By.xpath("//a[text()='Computers and tablets']//parent::li"))).click().perform();
		browser.close();
	
	}
	
	//@Test
	public void MouseActions2()
	{
		browser = new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("https://www.facebook.com/");
		Actions mouseactions = new Actions(browser);
		mouseactions.moveToElement(browser.findElement(By.id("email"))).sendKeys("sathish").doubleClick().contextClick().perform();
				
	}
	
	//@Test
	public void MouseActionsDragAndDrop()
	{
		browser = new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/drag.xhtml");
		Actions mouseactions = new Actions(browser);
		mouseactions.moveToElement(browser.findElement(By.id("form:drag"))).dragAndDrop(browser.findElement(By.id("form:drag")), browser.findElement(By.id("form:drop_content"))).perform();
				
	}
	
	//@Test
	public void MouseActionsDragAndDropby()
	{
		browser = new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/drag.xhtml");
		Actions mouseactions = new Actions(browser);
		mouseactions.moveToElement(browser.findElement(By.id("form:conpnl_content"))).dragAndDropBy(browser.findElement(By.id("form:conpnl_content")),150,0 ).perform();
		mouseactions.moveToElement(browser.findElement(By.id("form:conpnl_content"))).dragAndDropBy(browser.findElement(By.id("form:conpnl_content")),-50,0 ).perform();	
	}
	
	//@Test
	public void MouseActionsDragAndDropby2()
	{
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/drag.xhtml");
		
		Actions mouseactions = new Actions(browser);
		//mouseactions.scrollToElement(browser.findElement(By.xpath("//*[@id='form:j_idt125']//span[1]"))).perform();
		//JavascriptExecutor js= (JavascriptExecutor)browser;
		//vertical scroll down
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		int i=0;
		while(i<=50)
		{
		mouseactions.moveToElement(browser.findElement(By.xpath("//*[@id='form:j_idt125']//span[1]"))).dragAndDropBy(browser.findElement(By.xpath("//*[@id='form:j_idt125']//span[1]")),10,0 ).perform();
		String text = browser.findElement(By.id("form:displayRange")).getText();
		String[] eachvalue =text.split(" ");
		int fromvalue = Integer.parseInt(eachvalue[1]);
		i=fromvalue;
		//mouseactions.moveToElement(browser.findElement(By.xpath("//*[@id='form:j_idt125']//span[2]"))).dragAndDropBy(browser.findElement(By.xpath("//*[@id='form:j_idt125']//span[2]")),-50,0 ).perform();	
		}
		}
	
	//@Test
	public void KeyboardActions()
	{
		browser = new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("https://www.facebook.com/");
		Actions mouseactions = new Actions(browser);
		//mouseactions.moveToElement(browser.findElement(By.id("email"))).sendKeys("sathish").keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
				
	}
	
	//@Test
	public void KeyboardActions2()
	{
		browser = new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("https://www.facebook.com/");
		Actions mouseactions = new Actions(browser);
		//mouseactions.moveToElement(browser.findElement(By.id("email"))).sendKeys("sathish kumar").keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.SHIFT).keyDown(Keys.TAB).keyUp(Keys.SHIFT).keyUp(Keys.TAB).perform();
		//mouseactions.moveToElement(browser.findElement(By.id("email"))).keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();		
	}
	
	@Test
	public void KeyboardActions3() throws AWTException
	{
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.facebook.com/");
		Actions mouseactions = new Actions(browser);
		mouseactions.moveToElement(browser.findElement(By.id("email"))).sendKeys("sathish").doubleClick().contextClick().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		/*r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);*/
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
}
