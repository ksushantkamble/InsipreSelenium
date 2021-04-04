package tutorial4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aaa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\Selenium Jars and Browser Drivers\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
	}

}
