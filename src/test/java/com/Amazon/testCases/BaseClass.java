package com.Amazon.testCases;

import com.Amazon.pageObjects.Login;
import com.Amazon.utilities.ReadConfig;
import org.apache.commons.exec.Executor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    ReadConfig readConfig = new ReadConfig();
    public String userid = readConfig.getUserID();
    public String password = readConfig.getPassword();
    public String url = readConfig.getURL();
    public static WebDriver driver;

     @Parameters("BrowserType")
     @BeforeClass
     public void SetUp(String br) throws InterruptedException {
        //Invoke URL
        if(br.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
            driver = new ChromeDriver();
        } else {
            System.out.println("Unrecognized browser");
        }
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        Login login = new Login(driver);
        //Thread.sleep(2000);
        login.clickSigninLink();
        login.clickSignin();
        //Thread.sleep(2000);
        login.setTxtUserid(userid);
        login.clickContinue();
        //Thread.sleep(3000);
        login.setTxtPassword(password);
        login.selectRememberMe();
        login.clickLogin();
         /*Thread.sleep(3000);
         driver.navigate().refresh();
         Thread.sleep(2000);
         login.setTxtPassword1(password);
         Thread.sleep(3000);

         JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("scroll(0,250);");

         login.clickLogin1();
        */
     }
}
