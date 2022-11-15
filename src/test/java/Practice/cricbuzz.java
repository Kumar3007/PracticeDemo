package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cricbuzz {
	@Test
	public void cricbuzzTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[.='Live Scores']")).click();
		driver.findElement(By.xpath("//a[@title='Australia vs Afghanistan 38th Match, Super 12 Group 1']")).click();
		driver.findElement(By.xpath("//a[@class='cb-nav-tab 'and .='Scorecard']")).click();

		List<WebElement> bowler = driver.findElements(By.xpath("//span[.='Afghanistan Innings']/parent::div[@class='cb-col cb-col-100 cb-scrd-hdr-rw']/following-sibling::div[@class='cb-col cb-col-100 cb-scrd-itms']/child::div[@class='cb-col cb-col-27 ']"));
		List<WebElement> runs = driver.findElements(By.xpath("//span[.='Afghanistan Innings']/parent::div[@class='cb-col cb-col-100 cb-scrd-hdr-rw']/following-sibling::div[@class='cb-col cb-col-100 cb-scrd-itms']/child::div[@class='cb-col cb-col-8 text-right text-bold']"));
	//	ArrayList<Object> score=new ArrayList<Object>();

		for (int i = 0; i < bowler.size(); i++) {
			String bat = bowler.get(i).getText().toString();
			String run = runs.get(i).getText().toString();
			System.out.println(bat+" "+run);
		}
		
		String bowl="";
	       List<WebElement> ele = driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms ']"));
	       for (WebElement bowlers : ele) {
	    	   
	    	   bowl= bowlers.getText();
	    	   
	    	   System.out.println(bowl);
	    	   
			
		}
		
	}
}