package ExtentReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Chapter3 {
	public static void main(String[] args) throws IOException {
		ExtentReports extentReports = new ExtentReports();//engine
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("report.html");//reporter
		extentReports.attachReporter(sparkReporter);
		
		
		extentReports.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());
		
		
	}

}
