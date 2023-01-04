package tables;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TableClass3 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");
     
		
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
	WebElement cntPrice = driver.findElement(By.xpath("//*[contains(text(),'Bank')]/parent::td/following-sibling::td[3]"));
	
	System.out.println(cntPrice.getText());
	driver.close();

	}

}
