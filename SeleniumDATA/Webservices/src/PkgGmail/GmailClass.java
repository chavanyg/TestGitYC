package PkgGmail;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class GmailClass {
	public static void main (String[] args){
		
		WebDriver driver = new FirefoxDriver();
		String gmailUrl = "http://WWW.gmail.com";
		
		//Invoke browser
		driver.navigate().to(gmailUrl);
		
		//Close Driver
		driver.close();
		
		
	}
}
