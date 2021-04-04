package tutorial4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.toolsqa.com/");
		
		
		
		//WebElement link_Home = driver.findElement(By.xpath("//ul[@id='primary-menu']/descendant::a[2]/span/span"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("VIDEOS"))).build().perform(); 
		
		
	}

}
