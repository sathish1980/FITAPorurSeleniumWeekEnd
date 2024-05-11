package test.FITAPorurSeleniumWeekEnd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccount {
	
	WebDriver browser;
	public void Launch() throws InterruptedException
	{

				browser = new FirefoxDriver();
				browser.manage().window().maximize();
				browser.get("https://www.facebook.com/");
				// implict wait
				//browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				browser.findElement(By.cssSelector("[data-testid='open-registration-form-button']")).click();
				Thread.sleep(2000);
				browser.findElement(By.name("firstname")).sendKeys("sathish");
				//Explict wait
				WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
				wait.until(ExpectedConditions.elementToBeClickable(browser.findElement(By.name("websubmit"))));
				browser.findElement(By.name("websubmit")).click();
				
	}
	
	public void LasName()
	{
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		browser.findElement(By.name("lastname")).sendKeys("kumar.R");	
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CreateAccount c = new CreateAccount();
		c.Launch();
		c.LasName();
	}

}
