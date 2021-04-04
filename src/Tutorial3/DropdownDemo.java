package Tutorial3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Jars and Browser Drivers\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		
		Select sel=new Select(element);
		
		sel.selectByVisibleText("Adobe Photoshop");
		
		WebElement FirstOption=sel.getFirstSelectedOption();
		
		System.out.println("First Element is: "+FirstOption.getText());
		
		List<WebElement> AllOptions=sel.getOptions();
		
		for(WebElement webElement:AllOptions)
		{
			System.out.println("Options are:  "+webElement.getText());
		}
		
		
		
		
		
		
	}

}
