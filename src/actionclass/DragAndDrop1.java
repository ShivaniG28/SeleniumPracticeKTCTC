package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");
     
		
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	
		
		driver.get("https://www.facebook.com/");
		 Actions act =new Actions(driver);
		 act.click(driver.findElement(By.id("email"))).keyDown(Keys.SHIFT).sendKeys("Welcome to KTCTC").keyUp(Keys.SHIFT).perform();
		
		 
		 driver.close();
		 
	}

}
