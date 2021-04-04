package tutorial4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformanceDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		long starTime= System.currentTimeMillis();
		
		driver.get("https://www.facebook.com");
		
		long endTime= System.currentTimeMillis();
		
		System.out.println(endTime-starTime);
		
		driver.navigate().to("https://www.google.com");
	}

}
