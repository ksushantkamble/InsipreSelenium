package Tutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormDemo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/login.html");
		
		WebElement email=driver.findElement(By.id("email"));
		
		WebElement password=driver.findElement(By.name("passwd"));
		
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		
		System.out.println("text field set");
		
		email.clear();
		password.clear();
		
		System.out.println("Text field cleared");
		
		WebElement login=driver.findElement(By.id("SubmitLogin"));
		
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		
		login.submit();
		
		System.out.println("Login done with click method");

	}

}
