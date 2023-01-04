package radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Dr\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		
		WebElement radio = driver.findElement(By.xpath("//*[@value = 'Option 1']"));
		System.out.println(radio.isDisplayed());
		System.out.println(radio.isEnabled());
		
			radio.click();
			System.out.println(radio.isSelected());
					
			WebElement radio1 = driver.findElement(By.xpath("//*[@value = 'Option 2']"));
			System.out.println(radio1.isDisplayed());
			System.out.println(radio1.isEnabled());
			System.out.println(radio1.isSelected());
		

	}

}
