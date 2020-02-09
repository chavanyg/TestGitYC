package testCases;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.ReadConfig;

public class BaseClass {
    ReadConfig readConfig =  new ReadConfig();
    String userid = readConfig.getUserID();
    String password = readConfig.getPassword();
    String url = readConfig.getURL();
    String chromePath = readConfig.getDriverpath();
    public static WebDriver driver;

    @BeforeClass
    public void invokeUrl(){
        //System.out.println("chromePath = "+chromePath);
        //System.setProperty("webdriver.chrome.driver", chromePath);
        //ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterClass
    public void cleanup(){
        System.out.println("Test Completed...");
    }
}
