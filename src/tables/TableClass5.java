package tables;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TableClass5 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");
     
		
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> table = driver.findElements(By.xpath("//*[@class ='dataTable']//tr"));
		
		for(WebElement each : table)
		{
			String cName = driver.findElement(By.xpath("//td[1]/a")).getText();
			System.out.println(cName);
			
			String cntPrice = driver.findElement(By.xpath("//td[4]")).getText();
			System.out.println(cntPrice);
		}
			
		
		driver.close();

	}

}
