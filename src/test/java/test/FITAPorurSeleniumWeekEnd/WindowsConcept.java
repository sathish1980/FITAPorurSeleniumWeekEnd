package test.FITAPorurSeleniumWeekEnd;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsConcept {

	WebDriver browser;
	@Test
	public void WindowsImplementation()
	{
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/window.xhtml");
		// get the current window name
		String parentWindow = browser.getWindowHandle();
		browser.findElement(By.id("j_idt88:new")).click();
		// get all the opened window used in the automation session
		
		Set<String> allWindows = browser.getWindowHandles();
		for(String eachWindowName : allWindows)
		{
			if(!parentWindow.equalsIgnoreCase(eachWindowName))
			{
			browser.switchTo().window(eachWindowName);
			List<WebElement> elementExist = browser.findElements(By.id("menuform:j_idt40"));
			if(elementExist.size()>0)
			{
				browser.findElement(By.id("menuform:j_idt40")).click();
				browser.findElement(By.id("menuform:m_input")).click();
				browser.findElement(By.id("j_idt88:name")).sendKeys("sathish");
			}
			}
		}
		//browser.switchTo().window(parentWindow);
	}
}
