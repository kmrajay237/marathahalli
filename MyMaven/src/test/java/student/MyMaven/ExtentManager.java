package student.MyMaven;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class ExtentManager {
	//The ExtentReports report client for starting reporters and building reports.
	private static ExtentReports extent;
	//Defines a test.
	private static ExtentTest test;
	//Primary interface implemented by each reporter.
	private static ExtentHtmlReporter htmlRepoter;
	private static String filepath="./report/extentreport.html";
	public static ExtentReports GetExtent() {
		if(extent!=null)
			//Avoid Creating new instance of html code
			return extent;
		// initialize ExtentReports and attach the HtmlReporter
		extent=new ExtentReports();
		//// attach only HtmlReporter
		extent.attachReporter(getHtmlReporter());
		return extent;
	}
	private static ExtentHtmlReporter getHtmlReporter() {
		// initialize the HtmlReporter
		htmlRepoter=new ExtentHtmlReporter(filepath);
		//make the charts visible on Report open
		htmlRepoter.config().setChartVisibilityOnOpen(true);
		htmlRepoter.config().setDocumentTitle("Sample Title");
		htmlRepoter.config().setReportName("Smoke Testing");
		return htmlRepoter;
	}
	public static ExtentTest createTest(String name,String description) {
		// creating tests
		test=extent.createTest(name,description);
		return test;
	}
}
