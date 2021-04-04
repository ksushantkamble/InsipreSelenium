package tutorial4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.guru99.com/");
		
		List<WebElement> listofElements=driver.findElements(By.tagName("button"));
		
		System.out.println(listofElements.size());
		
		for(WebElement listElement:listofElements)
		{
			System.out.println(listElement.getText());
			
		}
	}

}
