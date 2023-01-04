package Assignments;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentSharePriceFromTable 
{
public static void main(String[] args) 
{
		
		String str = "Welcome"+"to"+" KTCTC";
		String str2 = "Hello";
		String str3 = str+str2;
		
		// This logic is not working on tables
		System.setProperty("webdriver.chrome.driver","C:\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		String cName;
		String cntPrice;

		List<WebElement> allCNames = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr"));
		
		/*for (int i=1;i<=allCNames.size();i++)
		{
			cName = driver.findElement(By.xpath("//*[@class='dataTable']/tbody/tr["+i+"]//td[1]/a")).getText();
			//System.out.println(cName);
			cntPrice = driver.findElement(By.xpath("//*[@class='dataTable']/tbody/tr["+i+"]//td[4]")).getText();
			//System.out.println(cntPrice);
			float cntPrice1 =Float.parseFloat(cntPrice);	
			String percChange = driver.findElement(By.xpath("//*[@class='dataTable']/tbody/tr["+i+"]//td[5]/font")).getText();
			
			float percChange1 =Float.parseFloat(percChange);	
			if(cntPrice1 >=300 && cntPrice1 <= 700)
			{
				System.out.print(cName +"  ");
				System.out.println(cntPrice1);
			}
			
			
		}*/
		for (int i=2;i<=allCNames.size();i++)
		{
			cName = driver.findElement(By.xpath("//*[@class='dataTable']/tbody/tr["+i+"]//td[1]/a")).getText();
			//System.out.println(cName);
			String	group = driver.findElement(By.xpath("//*[@class='dataTable']/tbody/tr["+i+"]//td[2]")).getText();
			String prevClose = driver.findElement(By.xpath("//*[@class='dataTable']/tbody/tr["+i+"]//td[3]")).getText();
			cntPrice = driver.findElement(By.xpath("//*[@class='dataTable']/tbody/tr["+i+"]//td[4]")).getText();
			//System.out.println(cntPrice);
			float cntPrice1 =Float.parseFloat(cntPrice);	
			String percChange = driver.findElement(By.xpath("//*[@class='dataTable']/tbody/tr["+i+"]//td[5]/font")).getText();
		
			float percChange1 =Float.parseFloat(percChange);	
			//String a="+ 4.0";
			
			if(percChange1>4.0)
			{
				System.out.print(cName +"  ");
				System.out.print(group +"  ");
				System.out.print(prevClose +"  ");
				System.out.print(cntPrice1 +" ");
				System.out.println(percChange1);
			}
			
		}
		System.out.println("After for loop");
		
		
	}

}
