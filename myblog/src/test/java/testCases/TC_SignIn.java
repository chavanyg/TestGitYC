package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.SignIn;

import java.util.concurrent.TimeUnit;

public class TC_SignIn extends BaseClass {

    @Test
    public void checkSignIn(){
        WebDriver lDriver = BaseClass.driver;
        lDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SignIn si = new SignIn();
        String title = si.readTitle();
        if (title.contains("Kaushalyacha")){
            System.out.println("Blog invoked successfully.");
        }
        else {
            System.out.println("Blog not opened.");
        }
    }


}
