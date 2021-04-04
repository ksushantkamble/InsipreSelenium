package Tutorial3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip 
{

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String textToSelect = "Hello";

		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		WebElement autoOptions= driver.findElement(By.name("q"));
		autoOptions.sendKeys("he");

		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']//li/descedant::div[@class='sbl1']"));

		System.out.println(list);
	}

}
