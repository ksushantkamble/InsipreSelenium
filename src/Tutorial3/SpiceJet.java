package Tutorial3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpiceJet 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		driver.findElement(By.xpath("//div[@id='travelOptions']/descendant::input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXTaction\"]")).click();
		
		driver.findElement(By.xpath("//div[@class='dropdownDiv']/descendant::a[text()=' Pune (PNQ)']")).click();
		
		driver.findElement(By.xpath("//div[@class='dropdownDiv']/descendant::a[text()=' Delhi (DEL)']")).click();
		
		driver.findElement(By.xpath("//*[text()='23']")).click();
		
		driver.findElement(By.xpath("//div[@id='Div1']/descendant::button")).click();
		
		driver.findElement(By.xpath("//*[text()='29']")).click();
		
		driver.findElement(By.xpath("//div[@class='row1 adult-infant-child']")).click();
		WebElement drpdown = driver.findElement(By.xpath("//p[@id='adultDropdown']/descendant::select"));
		
		Select select = new Select(drpdown);
	    select.selectByValue("3");
		
		
		driver.findElement(By.xpath("//div[@class='currency-dropdown']/select[@id='ctl00_mainContent_DropDownListCurrency']")).click();
		
		
		
		driver.findElement(By.xpath("//div[@class='currency-dropdown']/descendant::option[text()='USD']")).click();
		
		
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		String xpath1="//table[@id='availabilityTable0']/descendant::tr[";
		
		String xpath2="]/td[3]/descendant::span[1]";
		
		String fare[]=new String[7];
		
		for(int i=4;i<fare.length;i++) 
		{
			fare[i]=driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
			System.out.println(fare[i]);
		}
	}
	

}
