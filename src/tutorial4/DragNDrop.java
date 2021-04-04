package tutorial4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars and Browser Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/droppable");
		
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement dest=driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(source, dest).build().perform();
		

	}

}
