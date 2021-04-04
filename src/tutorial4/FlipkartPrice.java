package tutorial4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPrice {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung");
		
		//div[@class='_6t1WkM _3HqJxg']/descendant::div[13]/div[1]/descendant::div[12]
		
		//div[@class='_6t1WkM _3HqJxg']/descendant::div[13]/div[2]/descendant::div[12]//preceding-sibling::div[2]
		
		//div[@class='znxK_-']//following-sibling::div[2]/descendant::div[12]/descendant::div[6]/following-sibling::div/div/div[1]
		
		String Xpath1="//div[@class='znxK_-']//following-sibling::div[";
		
		String Xpath2="]/descendant::div[12]/descendant::div[6]/following-sibling::div/div/div[1]";
		String amt[]=new String[6];
		
		for(int i=1;i<=amt.length-1;i++)
		{
			
		amt[i]=driver.findElement(By.xpath(Xpath1+i+Xpath2)).getText();
			
			//amt1[i]=Integer.parseInt(amt[i]); 
			System.out.println(amt[i]);
			
			
		}
		driver.findElement(By.xpath(Xpath1+"4"+Xpath2+"/ancestor::div[4]/a")).click();
	}

}
