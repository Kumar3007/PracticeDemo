package Practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F_MicTestScript {
	
	@Test
	public void MicTestScript() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
			
			ChromeOptions options=new ChromeOptions();
			
			
			WebDriver driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://mictests.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@id='mic-launcher']")).click();
			Thread.sleep(5000);
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-geolocation");
			Robot rb=new Robot();
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_TAB);
			
			
	}

}
