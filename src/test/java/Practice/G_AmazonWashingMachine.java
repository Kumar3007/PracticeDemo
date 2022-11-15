package Practice;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G_AmazonWashingMachine {

	@Test
	public void AmazonWashingMachine()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("washing machine");
		driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
		
		String washingMachine = "Amazon Basics 6.5 Kg Fully Automatic Top Loading Washing Machine (Grey, LED panel, Memory Feature) : Amazon.in: Home & Kitchen";
			
		driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']/descendant::span[text()='Amazon Basics 6.5 Kg Fully Automatic Top Loading Washing Machine (Grey, LED panel, Memory Feature)']")).click();
		handleWindows(driver);
		
		//validation of title page
			String title = driver.getTitle();
			System.out.println(title);
			String expectedTitle = washingMachine;
			String actualTitle = driver.getTitle();
			assertEquals(actualTitle, expectedTitle);
			System.out.println("page title is verified");
			
			
			String keys="";

			List<WebElement> key = driver.findElements(By.xpath("//td[@class='a-span3']"));
			for (WebElement keyElement : key) {
				keys=keyElement.getText();
		for (int i = 0; i < keys.length(); i++) {
				System.out.println();
				}

			
			String values="";

			List<WebElement> value = driver.findElements(By.xpath("//td[@class='a-span9']"));
			for (WebElement valueElement : value) {
				values=valueElement.getText();
			}
			}	
			
		}
		
		public static void handleWindows(WebDriver driver)
		{
					String mainWindow = driver.getWindowHandle();
					Set<String> allWindows = driver.getWindowHandles();
					
					for (String lv : allWindows)
					{
						driver.switchTo().window(lv);
//						
					}
					
	}
	

}
