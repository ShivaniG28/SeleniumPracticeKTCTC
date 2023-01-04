package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\Dr\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		
		driver.get("https://demoqa.com/date-picker");
		
		WebElement textbox = driver.findElement(By.id("datePickerMonthYearInput"));
		
		for(int i=0;i<15;i++)
		{
			textbox.sendKeys(Keys.BACK_SPACE);
		}
		
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		Select yerSel = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		yerSel.selectByVisibleText("2017");
		
		Select monSel = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		monSel.selectByVisibleText("March");
		
		//driver.findElement(By.xPath("//*[@class = 'react-datepicker__month']//*[contains(@class,'025')] and "))
		
		driver.findElement(By.xpath("//*[contains(@class,'react-datepicker__day react-datepicker__day--017')]")).click();

		
		
	}

}
