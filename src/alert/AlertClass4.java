package alert;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertClass4 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");
     
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://demoqa.com/alerts");
		 
		 driver.findElement(By.id("promtButton")).click();
		 
		Alert alt = driver.switchTo().alert();
		
	   alt.sendKeys("Shivani");
	   alt.accept();
	   
	    WebElement msg = driver.findElement(By.id("promptResult"));
		
		String str = msg.getText();
		System.out.println(str);
		//calt.dismiss();
		
		driver.close();

	}

}
