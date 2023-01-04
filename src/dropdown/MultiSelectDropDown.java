package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		Select sel = new Select(driver.findElement(By.id("fruits")));
		
		boolean flag = sel.isMultiple();
		System.out.println(flag);
		
        List<WebElement> allOptions1 = sel.getOptions();
		
		for (WebElement each:allOptions1)
		{
			System.out.println(each.getText());
		}
		
		sel.selectByIndex(0);
		sel.selectByValue("orange");
		sel.selectByVisibleText("Apple");
	    
		List<WebElement> allOptions = sel.getAllSelectedOptions();
		
		for(WebElement each : allOptions) 
		{
			System.out.println(each.getText());
		}
			
        WebElement selOption = sel.getFirstSelectedOption();
		
		System.out.println(selOption.getText());
		
		sel.deselectByValue("orange");
		
		sel.deselectAll();
		
		
		
		
		driver.close();
		
		
		
	}

}
