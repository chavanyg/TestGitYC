package com.Amazon.testCases;

import com.Amazon.pageObjects.FilterOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TC_FilterOptions extends BaseClass {

    @Test
    public void setFilter () throws InterruptedException {
      //  FilterOptions fl = new FilterOptions();
       // fl.clickFilter("Men's Fashion");
        String amazonHandle = driver.getWindowHandle();
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList <String> tabs = new ArrayList <String> (driver.getWindowHandles());
        //driver.findElement(By.cssSelector("Body")).sendKeys((Keys.CONTROL + "t")    );
        driver.switchTo().window(tabs.get(1));
        driver.get("https://www.facebook.com");
        for (String window1: tabs) {
            driver.switchTo().window(window1);
            System.out.println("Name : "+driver.getTitle());
            System.out.println("URL " + driver.getCurrentUrl());
        }
        //driver.switchTo().window(amazonHandle);
        //WebElement BdayYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        driver.findElement(By.xpath("//select[contains(@name, 'birthday_day')]/option[2]")).click();
        driver.findElement(By.xpath("//select[contains(@name, 'birthday_month')]/option[3]")).click();
        driver.findElement(By.xpath("//select[contains(@name, 'birthday_year')]/option[25]")).click();






        //driver.quit();
    }
}
