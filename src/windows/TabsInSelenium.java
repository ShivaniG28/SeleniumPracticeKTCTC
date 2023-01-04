package windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsInSelenium {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");
     
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	

		driver.get("https://demoqa.com/browser-windows");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for (String each:allHandles)
		{
			
			if (!each.equals(parentWindow))
			{
				driver.switchTo().window(each);
			}
			
		}
		
		String msg = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(msg);
		
		System.out.println(driver.getWindowHandle());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		
		
		driver.quit();
		
		
	}

}
