package TestBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class NewTab {
	 public static void main(String []args)  
	   {
	     System.out.println("Hello World");
	     System.setProperty("webdriver.chrome.driver", "D:\\Yogesh\\Selenium\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		 driver.get("https://www.gmail.com");
	    }
	/*public static void main (String[] args){		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
	}*/
}
