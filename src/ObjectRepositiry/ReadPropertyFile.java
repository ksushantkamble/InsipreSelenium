package ObjectRepositiry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertyFile {

	static WebDriver driver;
	public static void main(String[] args) throws Exception 
	{
		Properties prop = new Properties(); 
		
		FileInputStream ip = new FileInputStream("D:\\java basic\\InspireSelenium\\src\\ObjectRepositiry\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		String url=prop.getProperty("URL");
		
		//String implicit=prop.getProperty("implicitwait");
		
		//driver.manage().timeouts().implicitlyWait(Integer.parseInt(implicit), TimeUnit.SECONDS);
		
		//System.out.println(Integer.parseInt(implicit));
		
		
		
	
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty(prop.getProperty("driverk"),prop.getProperty("driverpath"));
			driver=new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.gecko.driver","D:\\Selenium Jars and Browser Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(prop.getProperty("name"));
		
		
		driver.findElement(By.cssSelector(prop.getProperty("createNewAcc_cssSelector"))).click();
		

	}

}
