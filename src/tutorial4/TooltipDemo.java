package tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/tool-tips");
		
		WebElement tooltipbtn=driver.findElement(By.id("toolTipButton"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(tooltipbtn).perform();
		
		WebElement toolTipText=driver.findElement(By.xpath("//*[contains(text(),'You hovered')]"));
		
		String text=toolTipText.getText();
		
		System.out.println(text);
		
	}

}
