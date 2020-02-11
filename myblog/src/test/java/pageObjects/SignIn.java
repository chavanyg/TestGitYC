package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testCases.BaseClass;

public class SignIn {
    WebDriver lDriver = BaseClass.driver;
    public SignIn(){
        PageFactory.initElements(lDriver, this);
    }
//Find Elements
    @FindBy(xpath = "(//h1[@class = 'title'])")
    @CacheLookup
    private WebElement txtTitle;

    @FindBy(xpath = "//a[contains(text(), 'Shodh')]")
    @CacheLookup
    private WebElement lnkShodh;

    //Test Methods
    public String readTitle(){
        return txtTitle.getText();
    }
}

public void clickLink()
{
    lnkShodh.click();
}
