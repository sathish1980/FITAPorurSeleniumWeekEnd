package TestNgBasics;

import org.testng.annotations.*;

import com.aventstack.extentreports.Status;

public class TestNG2 extends Reports{
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite");
	} 
	
	@Test(priority=0,groups="Regression")
	public void Testcase4()
	{
		try
		{
		test = extent.createTest("Test Case 4", "PASSED test case");
		//test.log(Status.INFO, "Test 4 started");
		
		System.out.println("Testcase4");
		test.log(Status.PASS, "Test 4 passed");}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
