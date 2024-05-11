package test.FITAPorurSeleniumWeekEnd;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadiobuttonandCheckbox {
	
	WebDriver browser;
	//@Test
	public void Radiobutton()
	{
		browser = new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/radio.xhtml");
		browser.findElement(By.xpath("//*[@id='j_idt87:console1']//label[text()='Safari']//parent::td//div[starts-with(@class,'ui-radiobutton-box')]")).click();
	
	}

	String expectedBrowser= "Edge";
	//@Test
	public void dynamicRadiobutton()
	{
		browser = new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/radio.xhtml");
		List<WebElement> allBrowser = browser.findElements(By.xpath("//*[@id='j_idt87:console1']//tr//td"));
		for(WebElement eachbrowser :allBrowser)
		{
			String actualBrowser = eachbrowser.findElement(By.tagName("label")).getText();
			System.out.println(actualBrowser);
			if(expectedBrowser.equalsIgnoreCase(actualBrowser))
			{
				eachbrowser.findElement(By.cssSelector("div[class^='ui-radiobutton-box']")).click();
				String IsCheckBoxClicked = eachbrowser.findElement(By.cssSelector("div[class^='ui-radiobutton-box']")).getAttribute("class");
				if(IsCheckBoxClicked.contains("ui-state-active"))
					System.out.println("pass");
				break;
			}
		}
	
	}
	
	@Test
	public void dynamicRadiobuttonnanotherway()
	{
		boolean isclick=false;
		String basepath ="//*[@id='j_idt87:console1']//tr//td";
		browser = new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/radio.xhtml");
		//List<WebElement> allBrowser = browser.findElements(By.xpath("//*[@id='j_idt87:console1']//tr//td"));
		List<WebElement> allBrowser = browser.findElements(By.xpath(basepath));
		for(int i=1;i<=allBrowser.size();i++)
		{
			//String actualBrowser =  browser.findElement(By.xpath("//*[@id='j_idt87:console1']//tr//td["+i+"]//label")).getText();
			String actualBrowser =  browser.findElement(By.xpath(basepath+"["+i+"]//label")).getText();
			
			//String actualBrowser = eachbrowser.findElement(By.tagName("label")).getText();
			System.out.println(actualBrowser);
			if(expectedBrowser.equalsIgnoreCase(actualBrowser))
			{
				browser.findElement(By.xpath("//*[@id='j_idt87:console1']//tr//td["+i+"]//div[starts-with(@class,'ui-radiobutton-box')]")).click();
				
				
				//eachbrowser.findElement(By.cssSelector("div[class^='ui-radiobutton-box']")).click();
				//String IsCheckBoxClicked = eachbrowser.findElement(By.cssSelector("div[class^='ui-radiobutton-box']")).getAttribute("class");
				String IsCheckBoxClicked = browser.findElement(By.xpath("//*[@id='j_idt87:console1']//tr//td["+i+"]//div[starts-with(@class,'ui-radiobutton-box')]")).getAttribute("class");
				
				if(IsCheckBoxClicked.contains("ui-state-active"))
				{
					isclick=true;
				}
				Assert.assertTrue(isclick);
				break;
			}
		}
	
	}
	
	@Test
	public void SelectCheckbox()
	{
		browser = new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/dashboard.xhtml");
		browser.findElement(By.id("menuform:j_idt40")).click();
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(browser.findElement(By.id("menuform:m_checkbox"))));
		browser.findElement(By.id("menuform:m_checkbox")).click();
		wait.until(ExpectedConditions.elementToBeClickable(browser.findElement(By.xpath("(//*[@class='col-12']//div[starts-with(@class,'ui-chkbox-box')])[1]"))));
		browser.findElement(By.xpath("(//*[@class='col-12']//div[starts-with(@class,'ui-chkbox-box')])[1]")).click();
		browser.findElement(By.className("ui-toggleswitch-slider")).click();
		wait.until(ExpectedConditions.visibilityOfAllElements(browser.findElement(By.xpath("//*[@class='ui-growl-message']//span"))));
		System.out.println(browser.findElement(By.xpath("//*[@class='ui-growl-message']//span")).getText());
		wait.until(ExpectedConditions.invisibilityOfAllElements(browser.findElement(By.xpath("//*[@class='ui-growl-message']//span"))));
		//uncheck the toggle
		browser.findElement(By.className("ui-toggleswitch-slider")).click();
		wait.until(ExpectedConditions.visibilityOfAllElements(browser.findElement(By.xpath("//*[@class='ui-growl-message']//span"))));
		System.out.println(browser.findElement(By.xpath("//*[@class='ui-growl-message']//span")).getText());
		
		
	}
	
	
}
