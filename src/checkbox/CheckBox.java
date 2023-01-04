package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		/*WebElement check = driver.findElement(By.xpath("//*[@value = 'checkbox1']"));
	  System.out.println(check.isDisplayed());
	  System.out.println(check.isEnabled());
		check.click();
		System.out.println(check.isSelected());
		
		WebElement check1 = driver.findElement(By.xpath("//*[@value = 'checkbox2']"));
		  System.out.println(check.isDisplayed());
		  System.out.println(check.isEnabled());
		  System.out.println(check.isSelected());*/
		  
		  List<WebElement> checkbox = driver.findElements(By.xpath("//body//div[4]//input"));
		  
		  for(int i=3;i<checkbox.size();i++)
		  {
			  checkbox.get(i).click();
		  }
		  for(int i=3;i<checkbox.size();i++)
		  {
			  checkbox.get(i).click();
		  }
		  WebElement check1 = driver.findElement(By.xpath("//*[@value = 'checkbox2']"));
		  System.out.println(check1.isDisplayed());
		  System.out.println(check1.isEnabled());
		  System.out.println(check1.isSelected());
	}

}
