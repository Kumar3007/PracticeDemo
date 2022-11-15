package ScreenShootOnlyForfailedTC;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	//public static String screenshootsSubfolderName;
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

	public void CaptureScreenShot(String filename)
	{
//		if(screenshootsSubfolderName==null)
//		{
//			LocalDateTime myDateObj = LocalDateTime.now();
//		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//
//		    screenshootsSubfolderName = myDateObj.format(myFormatObj);
//		   
//		}
//		
	    
		TakesScreenshot t= (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);//near output use control+
		File dest = new File("./screenshots/"+filename);
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
	}
	
	
}
