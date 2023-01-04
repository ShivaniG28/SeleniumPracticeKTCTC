package tables;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TableClass4 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");
     
		
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> allCNames= driver.findElements(By.xpath("//*[@class ='dataTable']//tr/td[1]/a"));
		
		for(WebElement each :allCNames)
		{
			System.out.println(each.getText());
		}
		
List<WebElement> cntPrice= driver.findElements(By.xpath("//*[@class ='dataTable']//tr/td[4]/a"));
		
		for(WebElement each :cntPrice)
		{
			System.out.println(each.getText());
		}
		driver.close();
	}

}
