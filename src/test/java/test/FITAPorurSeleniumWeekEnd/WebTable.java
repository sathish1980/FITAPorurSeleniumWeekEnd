package test.FITAPorurSeleniumWeekEnd;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	
	WebDriver browser;
	String expectedCountry ="Italy";
	@Test
	public void WebTableImplemenation() throws InterruptedException, IOException
	{

		int count=0;
		int filename =0;
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/table.xhtml");
		
		List<WebElement> allPages = browser.findElements(By.xpath("//*[@class='ui-paginator-pages']//a"));
	
			for(int j=1;j<=allPages.size();j++)
			{
				browser.findElement(By.xpath("//*[@class='ui-paginator-pages']//a["+j+"]")).click();
				
				Thread.sleep(3000);
		
		List<WebElement> allRows = browser.findElements(By.xpath("//table//tbody[@id='form:j_idt89_data']//tr"));
		for(int i=1;i<=allRows.size();i++)
		{
			
			String actualCountry =browser.findElement(By.xpath("//table//tbody[@id='form:j_idt89_data']//tr["+i+"]//td[2]//span[3]")).getText();
			if(expectedCountry.equalsIgnoreCase(actualCountry))
			{
				filename=filename+1;
				String name = browser.findElement(By.xpath("//table//tbody[@id='form:j_idt89_data']//tr["+i+"]//td[1]")).getText();
				System.out.println(name);
				if(count<1)
				{
					TakeScreenshot();
					count =count+1;
				}
			}
		}
		count=0;
			}
		
	}
	
	
	public void TakeScreenshot() throws IOException
	{
		 Date date = new Date();
	      //This method returns the time in millis
	      long timeMilli = date.getTime();
	      System.out.println("Time in milliseconds using Date class: " + timeMilli);

	      //creating Calendar instance
	      Calendar calendar = Calendar.getInstance();
	      //Returns current time in millis
	      long timeMilli2 = calendar.getTimeInMillis();
		TakesScreenshot t = (TakesScreenshot)browser;
		File SourceFile = t.getScreenshotAs(OutputType.FILE);
		File DestinationFile =new File(System.getProperty("user.dir")+"\\Screenshot\\"+timeMilli2+".png");
		FileUtils.copyFile(SourceFile, DestinationFile);
	}

}
