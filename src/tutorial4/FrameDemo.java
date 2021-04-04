package tutorial4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame(1);
		
		WebElement text=driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
		
		String abc=text.getText();
		
		System.out.println(abc);
	}

}
