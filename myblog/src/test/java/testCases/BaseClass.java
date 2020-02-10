package testCases;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.ReadConfig;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    ReadConfig readConfig =  new ReadConfig();
    String userid = readConfig.getUserID();
    String password = readConfig.getPassword();
    String url = readConfig.getURL();
   // String chromePath = readConfig.getDriverpath();
    public static WebDriver driver;

    @BeforeClass
    public void invokeUrl() throws InterruptedException {
        //System.out.println("chromePath = "+chromePath);
      //  System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        ChromeOptions options = new ChromeOptions();

        //options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");


        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        boolean headless_check = GraphicsEnvironment.isHeadless();
       System.out.println("headless_check : " + headless_check);
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(30);


        driver.get(url);
    }

    @AfterClass
    public void cleanup(){
        System.out.println("Test Completed...");
    }
}
