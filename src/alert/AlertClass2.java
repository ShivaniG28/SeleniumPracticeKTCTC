package alert;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AlertClass2 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");
     
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://demoqa.com/alerts");
		 
		 driver.findElement(By.id("timerAlertButton")).click();
		  WebDriverWait wt= new WebDriverWait(driver, 8);
		  wt.until(ExpectedConditions.alertIsPresent());
		   
		  Alert alt = driver.switchTo().alert();
		  alt.accept();
		  
		  driver.close();
		  
	}

}
