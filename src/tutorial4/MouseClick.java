package tutorial4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars and Browser Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement doubleClick=driver.findElement(By.id("doubleClickBtn"));
		
		WebElement rightClick=driver.findElement(By.id("rightClickBtn"));
		
		WebElement dynamicClick=driver.findElement(By.xpath("//div[@class='row']//descendant::button[4]"));
		
		Actions action=new Actions(driver);
		
		action.doubleClick(doubleClick).build().perform();
		
		action.contextClick(rightClick).build().perform();
		
		action.click(dynamicClick).build().perform();
		

	}

}
