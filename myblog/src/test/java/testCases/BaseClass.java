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

public class BaseClass {
    ReadConfig readConfig =  new ReadConfig();
    String userid = readConfig.getUserID();
    String password = readConfig.getPassword();
    String url = readConfig.getURL();
   // String chromePath = readConfig.getDriverpath();
    public static WebDriver driver;

    @BeforeClass
    public void invokeUrl(){
        //System.out.println("chromePath = "+chromePath);
        //System.setProperty("webdriver.chrome.driver", chromePath);
        ChromeOptions chromrop = new ChromeOptions();
       /*  chromrop.addArguments("--no-sandbox");
       chromrop.addArguments("--disable-dev-shm-usage");
        chromrop.addArguments("--aggressive-cache-discard");
        chromrop.addArguments("--disable-cache");
        chromrop.addArguments("--disable-application-cache");
        chromrop.addArguments("--disable-offline-load-stale-cache");
        chromrop.addArguments("--disk-cache-size=0");
        //chromrop.addArguments("--headless");
        chromrop.addArguments("--disable-gpu");
        chromrop.addArguments("--dns-prefetch-disable");
        chromrop.addArguments("--no-proxy-server");
        chromrop.addArguments("--log-level=3");
       // chromrop.addArguments("--silent");
        chromrop.addArguments("--disable-browser-side-navigation");
        chromrop.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromrop.setProxy(null);
*/
        System.setProperty("java.awt.headless", "true");
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        boolean headless_check = GraphicsEnvironment.isHeadless();
       System.out.println("headless_check : " + headless_check);

        chromrop.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
       // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterClass
    public void cleanup(){
        System.out.println("Test Completed...");
    }
}
