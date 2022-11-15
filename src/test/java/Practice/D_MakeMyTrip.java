package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.ExcelUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class D_MakeMyTrip {
	
	@Test
	public void MakeMyTrip() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.makemytrip.com/");
			//Thread.sleep(3000);
		//	driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
			
		
			ExcelUtility eLib = new ExcelUtility();
			
			String FromData = eLib.getExcelData("Sheet1", 0, 0);
			driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		    driver.findElement(By.xpath("//span[text()='From']/following-sibling::input[@id='fromCity']")).sendKeys(FromData);
		    Thread.sleep(1000);
		     driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
	}

}
