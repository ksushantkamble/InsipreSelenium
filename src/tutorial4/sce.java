package tutorial4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars and Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://engineering.saraswatikharghar.edu.in/");
		
		driver.findElement(By.xpath("//*[@id=\"popmake-9001\"]/button")).click();
		
		
		
		
		
		

	}

}
