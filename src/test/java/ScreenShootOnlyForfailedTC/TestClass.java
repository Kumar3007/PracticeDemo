package ScreenShootOnlyForfailedTC;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass extends BaseClass{
	@Test(testName="TestGoogle")
	public void TestGoogle() throws Throwable
	{
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("HYR tutorials");
		String expectedTitle="HYR Tutorials - Google Search";
		String actualTitle=driver.getTitle();
		
	}
	
	@Test(testName="Facebook")
	public void Facebook() throws InterruptedException
	{
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials",Keys.ENTER);
		
		
		SoftAssert softassert = new SoftAssert();
		//Title Assertion
		String actualTitle = driver.getTitle();
		String expectedTitle="Log in to Facebook";
		softassert.assertEquals(actualTitle, expectedTitle,"Title is mismatched");
		
		//URL Assertion
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl="https://www.facebook.com";
		softassert.assertEquals(actualUrl, expectedUrl,"URL is mismatched");
		
		//Text Assertion
		String actualText = driver.findElement(By.name("email")).getAttribute("value");
		String expectedText="";
		softassert.assertEquals(actualText, expectedText,"username is mismatched");
		
		//Border Assertion		
		String actualBorder = driver.findElement(By.name("email")).getCssValue("border");
		String expectedBorder="1px solid rgb(240,40,73)";
		softassert.assertEquals(actualBorder, expectedBorder);
		
	
		softassert.assertAll();
	}
	
	@Test(testName="TestOrangeHRM")
	public void TestOrangeHRM() throws InterruptedException
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		 driver.findElement(By.id("txtUsername")).sendKeys("admin");
		 Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin1234");
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
		
	}
	
}
