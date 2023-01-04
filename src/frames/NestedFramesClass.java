package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesClass {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");
     
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	
		
		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@srcdoc ='<p>Child Iframe</p>']")));
		String msg= driver.findElement(By.xpath("//body//p")).getText();
		System.out.println(msg);
		
		driver.switchTo().parentFrame();
		String msg1= driver.findElement(By.xpath("//*[contains(text(),'Parent frame')]")).getText();
		System.out.println(msg1);
		driver.switchTo().defaultContent();
		String msg2= driver.findElement(By.xpath("//*[contains(text(),'Sample Nested Iframe page')]")).getText();
		System.out.println(msg2);
		driver.findElement(By.xpath("//span[contains(text(),'Alerts')]")).click();
		
		
		

		
	}

}
