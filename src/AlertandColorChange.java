import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertandColorChange {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		//WebElement button = driver.findElement(By.xpath("//*[contains(text(),'Click Me')]"));
		
		//WebDriverWait wt= new WebDriverWait(driver, 10);
	
		//wt.until(ExpectedCondition.elementToBeClickale(By.xpath("//*[contains(text(),'Click Me')]")));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("wUDww")).click();
		WebElement button = driver.findElement(By.xpath("//*[contains(text(),'Click Me')]"));
		button.click();
		
		driver.close();
	}

}
