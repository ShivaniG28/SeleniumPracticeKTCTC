package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import property.file.PropertyHelper;

public class ActionClassASS {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");
     
		
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    PropertyHelper pHelp = new PropertyHelper("env.properties");	
		
		driver.get(pHelp.getPropertyValue("baseUrl")+"tool-tip");
		 Actions act =new Actions(driver);
		 //WebElement sel=
		 act.moveToElement(driver.findElement(By.id("toolTipButton"))).contextClick().perform();
		 /*sel.isEnabled();
		 act.moveToElement(sel);
		 String str= sel.getText();
		 System.out.println(str);*/
		 
		 driver.close();
		  
		 
		 
		 
		 

	}

}
