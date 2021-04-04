package BasicLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		List <WebElement> linklist=driver.findElements(By.tagName("a"));
		
		int a=linklist.size();
		
		System.out.println(a);
		
		for(int i=0;i<linklist.size();i++) 
		{
			String linktext=linklist.get(i).getText();
			System.out.println(linktext);
		}
	}

}
