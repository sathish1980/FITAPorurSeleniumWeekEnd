package TestNgBasics;


import java.io.IOException;

import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.*;


;

public class TEstNG1 extends Reports {
	
	/*
	 * Test--> Testcase
	 * @BeforeMethod --It will run before each testcase
	 * @BeforeMethod --It will run after each testcase
	 * @BeforeClass - it will run before all the testcase in that class
	 * @AfterClass - it will run after all the testcase in that class
	 * @BeforeTest --It will run before all the class
	 * @AfterTest --It will run after all the class
	 *  @BeforeSuite --It will run before all the test
	 *  @AfterSuite --It will run after all the test
	 */
	
	/*
	 * ExtentHtmlReporter --> report location
	 * ExtentTest -- write in that report
	 */
	
	@BeforeSuite(alwaysRun=true)
	public void BeforeSuite()
	{
		StartRport();
		System.out.println("Before Suite");
	}
	
	@AfterMethod(alwaysRun=true)
	public void af()
	{
		System.out.println("After method");
	}
	
	@Test(priority=10,enabled=true,groups="Sanity")
	public void Testcase2()
	{
		test = extent.createTest("Test Case 1", "PASSED test case");
		test.log(Status.INFO, "Launch Browser");
		System.out.println("Step 1");
		test.log(Status.INFO, "Enter username");
		//test.info("Enter username");
		System.out.println("Step 2");
		test.log(Status.INFO, "Enter password");
		
		
		//test.log(LogStatus.INFO, "Enter password");
		System.out.println("Step 3");
		test.log(Status.PASS, "Login done");
		try {
			test.addScreenCaptureFromPath("C:\\Users\\kumar\\git\\FITAPorurSeleniumWeekEnd\\Screenshot\\1716022821780.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//test.log(LogStatus.PASS, "Login sucess");
		
		//throw new ArithmeticException("error");
	}
	
	@Test(priority=20,invocationCount=5,invocationTimeOut=60,groups={"SIT","Regression"})
	public void Testcase1()
	{
		System.out.println("Step 1");
		System.out.println("Step 2");
		System.out.println("Step 3");
		System.out.println("Step 4");
		
	}
	
	@BeforeClass(alwaysRun=true)
	public void Beforeclass()
	{
		System.out.println("Before Class");
	}
	
	@Test(dependsOnMethods="Testcase2",priority=-1,timeOut=60,groups= {"Sanity","SIT","Regression"})
	public void Testcase3() throws InterruptedException
	{
		System.out.println("Testcase3");
		//Thread.sleep(3000);
	}
	

	@AfterClass(alwaysRun=true)
	public void aclass()
	{
		System.out.println("After Class");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void Bf()
	{
		System.out.println("Before method");
	}
	
	@AfterTest(alwaysRun=true)
	public void AfterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void EndReport()
	{
		extent.flush();
	}

}
