package test.FITAPorurSeleniumWeekEnd;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerts {
	
	WebDriver browser;
		@Test
		public void MouseActionsDragAndDrop() throws InterruptedException
		{
			browser = new ChromeDriver();
			browser.manage().window().maximize();
			browser.get("https://www.leafground.com/alert.xhtml");
			browser.findElement(By.id("j_idt88:j_idt91")).click();
			browser.switchTo().alert().accept();
			String Actual = browser.findElement(By.id("simple_result")).getText();
			Assert.assertEquals("You have successfully clicked an alert", Actual);
			browser.findElement(By.id("j_idt88:j_idt93")).click();
			browser.switchTo().alert().dismiss();
			String Actual1 = browser.findElement(By.id("result")).getText();
			Assert.assertEquals("User Clicked : Cancel", Actual1);
			browser.findElement(By.id("j_idt88:j_idt104")).click();
			Alert alt = browser.switchTo().alert();
			alt.sendKeys("Fita technology");
			alt.accept();
			String Actual2 = browser.findElement(By.id("confirm_result")).getText();
			Assert.assertEquals("User entered name as: Fita technology", Actual2);
			browser.findElement(By.id("j_idt88:j_idt95")).click();
			WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
			wait.until(ExpectedConditions.elementToBeClickable(browser.findElement(By.id("j_idt88:j_idt98"))));
			Thread.sleep(1000);
			browser.findElement(By.id("j_idt88:j_idt98")).click();
		}
		

}
