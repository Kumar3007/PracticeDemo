package MOCK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKart {

		public static void main(String[] args) throws Throwable {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Redmi");
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();	
			List<WebElement> titlesList = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			Thread.sleep(1000);
			ArrayList<String> set = new ArrayList<String>();
			Thread.sleep(1000);
			for (WebElement titles : titlesList) {
			set.add(titles.getText().toString());
			
			Collections.sort(set);
	
		}
			System.out.println(set);
			
			}
		
	
}
