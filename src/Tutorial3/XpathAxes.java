package Tutorial3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		//table[@id='contactList']/tbody/tr[2]/td[4]
		
		String beforeXpath="//table[@id='contactList']/tbody/tr[";
		
		String afterXpath="]/td[4]";
		
		for(int i=2;i<=7;i++)
		{
			String amt=driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
			
			int amt1=Integer.parseInt(amt); 
			System.out.println(amt1);
		}
		
	}

}
