package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByXpath 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ui.cogmento.com");
		
		driver.findElement(By.name("email")).sendKeys("sushantykamble@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Arati298");
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a")).click();
		
	
		
		
		
	}

}
