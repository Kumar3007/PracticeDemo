//public class amazonIphone {
//	public static void main(String[] args) {
//
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//input[@id='low-price']")).sendKeys("1000");
//		driver.findElement(By.xpath("//input[@id='high-price']")).sendKeys("5000");
//		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
//		List<WebElement> PriceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
//		ArrayList<String> set = new ArrayList<String>();
//
//		for (WebElement price : PriceList) {
//			set.add(price.getText().toString());
//			Collections.sort(set);
//
//		}
//		System.out.println(set);
//
//	}
//}