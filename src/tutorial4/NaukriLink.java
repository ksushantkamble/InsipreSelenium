package tutorial4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriLink {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com");
		//div[@class='footer anchorList']/descendant::li[7]/a
		String xpath1="//div[@class='footer anchorList']/descendant::li[";
		
		String xpath2="]/a";
		
		String links[]=new String[13];
		
		System.out.println(links.length-1);
		
		for(int i=1;i<=links.length-1;i++) 
		{
			links[i]=driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
			
			System.out.println(links[i]);
		}
		
	
	}

}
