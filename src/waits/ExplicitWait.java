package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("tctc");
		driver.findElement(By.id("pass")).sendKeys("1234");
		
		WebDriverWait wt = new WebDriverWait(driver, 15);
		 wt.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		
		
		//driver.findElement(By.name("login")).click();
		
		//driver.close();
		

	}

}
