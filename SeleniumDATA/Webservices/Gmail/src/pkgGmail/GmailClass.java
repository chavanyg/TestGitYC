package pkgGmail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.*;

public class GmailClass {

	public static void main(String [] args) throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver", "D:\\Yogesh\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.gmail.com";
		driver.get(url);
		driver.findElement(By.id("identifierId")).sendKeys("chavanyg");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(10000);
		if (driver.findElement(By.id("password")).isDisplayed()) {
			driver.findElement(By.cssSelector("input[type=password]")).sendKeys("samrattttt");
			System.out.println("Element found");
		} else {
			System.out.println("Element not found");
		}
				
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(20000);
		
		//Invoke new tab
		Robot robot = new Robot();                          
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_T); 
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("http://www.newtours.demoaut.com/");

		//driver.close();
			
	}
}
