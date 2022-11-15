package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class O_CricBuzz {

		@Test
		public void cricbuzzTest()
		{
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.cricbuzz.com/live-cricket-scorecard/43171/aus-vs-afg-38th-match-super-12-group-1-icc-mens-t20-world-cup-2022");
		//	WebElement ele = driver.findElement(By.xpath("(//div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']/descendant::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[2]"));
			
					String bowl="";
			       List<WebElement> ele = driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms ']"));
			       for (WebElement bowler : ele) {
			    	   
			    	   bowl= bowler.getText();
			    	   
			    	   System.out.println(bowl);
			    	   
					
				}
			       
			       		//=driver.findElements(By.xpath(""))
			       
		}
		
	
	
}
