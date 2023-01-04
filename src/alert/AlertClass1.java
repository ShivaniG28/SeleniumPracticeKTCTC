package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass1 {

	public static void main(String[] args) 
	{
     System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");
     
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://demoqa.com/alerts");
		 
		 
		 driver.findElement(By.id("alertButton")).click();
		 Alert alt = driver.switchTo().alert();
		 alt.accept();
		 
		 
		 

	}

}
