package radio.checkbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckboxAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		
		WebElement checkBox = driver.findElement(By.xpath("//*[@value='checkbox1']"));

		System.out.println(checkBox.isDisplayed());
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());
		
		checkOrUncheckCHeckBox( driver, By.xpath("//*[@value='checkbox1']"),true);
		
		//checkBox.click();
		
		System.out.println(checkBox.isDisplayed());
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());
		
		driver.close();

	}
	
	public static void checkOrUncheckCHeckBox(WebDriver driver, By loc, boolean checkuncheck)
	{
		WebElement checkBox = driver.findElement(By.xpath("//*[@value='checkbox1']"));
		
		if(checkuncheck==false)
		{
			if(checkBox.isSelected()==true)
			{
				checkBox.click();
			}
		}
		else
		{
			if(checkBox.isSelected()==false)
			{
				checkBox.click();
			}
		}
	}

}
