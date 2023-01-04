package actionclass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import property.file.PropertyHelper;
public class ActonClass {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");
     
		
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    PropertyHelper pHelp = new PropertyHelper("env.properties");	
		
		driver.get(pHelp.getPropertyValue("baseUrl")+"buttons");
		
		Actions act = new Actions(driver);
		act.click(driver.findElement(By.xpath("//div//button[starts-with(text(),'Click Me')]"))).perform();
		act.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();
		act.moveToElement(driver.findElement(By.id("rightClickBtn"))).contextClick().perform();
		
		}

}
