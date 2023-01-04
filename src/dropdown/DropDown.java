package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   Select sel = new Select(driver.findElement(By.name("country")));
	   sel.selectByIndex(2);
	   System.out.println(sel.getOptions().size());
	   
	   WebElement select = sel.getFirstSelectedOption();
	   String str = select.getText();
	   System.out.println(str);
	   
	  
	  /* sel.selectByValue("KAZAKHSTAN");
	   
	   System.out.println(sel);
	   
	   sel.selectByVisibleText("JERSEY");
	   System.out.println(sel);
	  
	   sel.selectByVisibleText("BERMUDA");
	   System.out.println(sel);*/
	   //sel.deselectAll();

	}

}
