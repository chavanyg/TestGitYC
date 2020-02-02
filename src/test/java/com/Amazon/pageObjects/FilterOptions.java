package com.Amazon.pageObjects;

import com.Amazon.testCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FilterOptions {
    @FindBy(xpath = "//i[@class = 'hm-icon nav-sprite']")
    @CacheLookup
    WebElement iconToFilter ;

    @FindBy(xpath = "//*[contains(text(), %s)]")
    @CacheLookup
    WebElement clickfilter;

    //Action Methods
    public void clickFilterIcon(){
        iconToFilter.click();
    }

    public void clickFilter(String filterItem){
        clickFilterIcon();
        if(filterItem.contains("'")) {
            filterItem = filterItem.replace("'", "/'");
        }
        System.out.println("filterItem: "+filterItem);
        BaseClass.driver.findElement(By.xpath(filterItem)).click();
    }



}
