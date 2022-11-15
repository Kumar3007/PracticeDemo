package Practice;

import java.awt.List;
import java.util.Collections;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class M_mockflipkart {
	@Test
	public void filpKartTest()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Redmi");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		java.util.List<WebElement> ele = driver.findElements(By.xpath("//div[@class='_4rR01T']"));

		TreeSet<String> set = new TreeSet<String>(Collections.reverseOrder());
		for (WebElement web : ele) 
		{
			set.add(web.getText());
		}
		for (String str : set) 
		{
			System.out.println(str);
		}


	}

}


