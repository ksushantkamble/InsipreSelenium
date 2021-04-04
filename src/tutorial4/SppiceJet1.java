package tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SppiceJet1 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com");
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		WebElement StartCityElement=driver.findElement(By.xpath("//div[@id='marketCityPair_1']/descendant::select[@name='ctl00$mainContent$ddl_originStation1']"));
		
		Select StartCity=new Select(StartCityElement);
		
		StartCity.selectByVisibleText("Ahmedabad (AMD)");
	}

}
