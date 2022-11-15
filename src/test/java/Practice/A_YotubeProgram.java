package Practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A_YotubeProgram {
	
	public static void main(String[] args) throws Throwable {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://Youtube.com");
			
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("ootanava mava ootanva");
			driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer' and text()='O Antava Full Song | Pushpa Songs | Allu Arjun, Samantha | DSP | Sukumar | Indravathi Chauhan']")).click();
		
	}

}
