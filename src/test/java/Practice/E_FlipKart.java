package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E_FlipKart {
	
	@Test
	public void FlipKartTest() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("WaterHeater");
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
			
	}

}
