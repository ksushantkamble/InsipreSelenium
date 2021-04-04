package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("sushant");
		
		driver.findElement(By.name("pass")).sendKeys("kamble");
		
		//driver.findElement(By.partialLinkText("Create a")).click();
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		String s=driver.findElement(By.className("_58mk")).getText();
		
		System.out.println(s);
		
		
		
		

	}

}
