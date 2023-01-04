package actionclass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");
     
		
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		 Actions act =new Actions(driver);
		 WebElement sourceElement = driver.findElement(By.xpath("//*[contains(text(),' 5000 ')]"));
		 WebElement destinationElement = driver.findElement(By.xpath("//*[@id='amt8']/li"));
		 //act.dragAndDrop(sourceElement, destinationElement).perform();
		 act.clickAndHold(sourceElement).moveToElement(destinationElement).release().perform();
		 
		 
		 
		 
		 
		 
		 driver.close();
		 
		 
	}

}
