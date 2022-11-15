package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B_iccCricket {

	
		@Test
		public void IccCricketTesT()
		{
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.icc-cricket.com/rankings/mens/overview");
			driver.findElement(By.xpath("(//div[@class='main-navigation__header u-hide-desktop']/descendant::button[@class='linked-list__dropdown-label js-dropdown-btn'])[4]")).click();
			driver.findElement(By.xpath("(//a[@class='linked-list__link ' and normalize-space(text())='Player Rankings'])[1]")).click();
			
			
		}
}
