package tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.findElement(By.xpath("//*[contains(text(),'Multiselect drop down')]//ancestor::p//following-sibling::div//div//div[@class=' css-1hwfws3']")).click();
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Green')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Blue')]")).click();
	}

}
