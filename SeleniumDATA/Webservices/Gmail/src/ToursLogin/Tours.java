package ToursLogin;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tours {
	private static final String Excelsheet = null;
	ChromeDriver driver;
	
	//@Test (Dataprovider = Excelsheet);
	String Username = "mercury";
	String Password = "mercury";
	public void LoginTours (String Username, String Password) {
		System.setProperty("webdriver.chrome.driver", "D:\\Yogesh\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		
		
	}
	
}
