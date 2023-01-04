package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClass {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");
     
		
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	
		
		driver.get("https://demoqa.com/frames");
		String msg1 =driver.switchTo().frame("frame1").getTitle();
		System.out.println(msg1);
		String msg = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(msg);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[contains(text(),'Alerts')]")).click();
		
		driver.close();
	}

}
