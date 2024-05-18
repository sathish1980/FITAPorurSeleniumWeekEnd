package test.FITAPorurSeleniumWeekEnd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Frames {
	
	WebDriver browser;
	@Test
	public void FramesConcept()
	{
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/frame.xhtml");
		List<WebElement> allFrames = browser.findElements(By.tagName("iframe"));
		/*
		 * 3 ways to identify the frames
		 * id
		 * name
		 * index
		 */
		for(int i=0;i<allFrames.size();i++)
		{
			System.out.println(i);
			// navigate in to frame
			browser.switchTo().frame(i);
			// identify the expected element is available in the frame
			List<WebElement> elementExist = browser.findElements(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]"));
			if(elementExist.size()>0)
			{
				browser.findElement(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]")).click();
				break;
			}
			// to come out of the frame
			browser.switchTo().defaultContent();
			
		}
		browser.switchTo().defaultContent();
		
		
	}
	
	@Test
	public void FramesConcept2()
	{
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/frame.xhtml");
		List<WebElement> allFrames = browser.findElements(By.tagName("iframe"));
		/*
		 * 3 ways to identify the frames
		 * id
		 * name
		 * index
		 */
		for(int i=0;i<allFrames.size();i++)
		{
			System.out.println(i);
			// navigate in to frame
			browser.switchTo().frame(i);
			List<WebElement> innerFrame = browser.findElements(By.tagName("iframe"));
			if(innerFrame.size()>0)
			{
				browser.switchTo().frame("frame2");
				List<WebElement> elementExist = browser.findElements(By.xpath("//*[@id='Click' and contains(@style,'8e70ee')]"));
				if(elementExist.size()>0)
				{
					browser.findElement(By.xpath("//*[@id='Click' and contains(@style,'8e70ee')]")).click();
					break;
				}
			}
			// identify the expected element is available in the frame
			
			// to come out of the frame
			browser.switchTo().defaultContent();
			
		}
		browser.switchTo().defaultContent();
		
		
	}

}
