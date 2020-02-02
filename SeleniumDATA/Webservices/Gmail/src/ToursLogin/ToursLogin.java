package ToursLogin;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToursLogin {
	private static final String Excelsheet = null;
	static ChromeDriver driver;
	
	@Test(Dataprovider = "TestData")
	public void mains(String [] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Yogesh\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		String Username = "mercury";
		String Password = "mercury";
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		//Assert.assertTrue(driver.getTitle.matches("Find a Flight: Mercury Tours:"), "Invalid Credentials");
		System.out.println("Login Succesful");
	}
	
}
