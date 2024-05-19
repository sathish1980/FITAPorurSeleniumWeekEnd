import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports {
	
	 public ExtentHtmlReporter htmlReporter;
	    
	 public ExtentReports extent;
	    //helps to generate the logs in test report.
	 public ExtentTest test;
	String reportpath = System.getProperty("user.dir")+"\\Reports\\testReport.html";
	public void StartRport()
	{
		htmlReporter = new ExtentHtmlReporter(reportpath);
     
     //initialize ExtentReports and attach the HtmlReporter
     extent = new ExtentReports();
     extent.attachReporter(htmlReporter);
     
   //To add system or environment info by using the setSystemInfo method.
     //extent.setSystemInfo("OS", OS);
     //extent.setSystemInfo("Browser", browser);
     
     //configuration items to change the look and feel
     //add content, manage tests etc
     htmlReporter.config().setChartVisibilityOnOpen(true);
     htmlReporter.config().setDocumentTitle("Extent Report Demo");
     htmlReporter.config().setReportName("Test Report");
     htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
     htmlReporter.config().setTheme(Theme.DARK);
     htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	}
	

}
