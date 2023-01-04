package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		/*WebElement emailTexbox = driver.findElement(By.id("email"));
		emailTexbox.sendKeys("KTCTC");
		emailTexbox.clear();
		driver.findElement(By.id("email")).sendKeys("KTCTC");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).submit();*/
		
		
		
		//driver.close();
		List<WebElement> textBoxList = driver.findElements(By.xpath("//form//div//input"));
		 
		for(int i=0; i<textBoxList.size();i++)
			
		{
			textBoxList.get(i).sendKeys("Ktctc");
			
		}
		/*for(WebElement each : textBoxList)
		{
			each.sendKeys("Ktctc");
		}*/
		
		//driver.close();
	}


}
