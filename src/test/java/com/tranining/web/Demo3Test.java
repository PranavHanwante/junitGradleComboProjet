package com.tranining.web;

import com.tranining.anotations.AzamaraBro;

import com.tranining.pages.HomePageUI;
import com.tranining.pages.TermsOfUsePageUI;
import com.tranining.webbase.FlipkartWebBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Demo3Test extends FlipkartWebBase {
    public WebDriver driver;

    @Test
    public void testDemo3A() {
        driver = super.driver;
        String text = new HomePageUI(driver).sendInputData().clickTermsOfUse().clickPrivacy().getHeaderText();
        System.out.println(text);
        driver.navigate().back();
        new TermsOfUsePageUI(driver).doubleClickTermsofUseHeader();
        driver.navigate().back();
        new HomePageUI(driver).sendInputData();


    }

    @AzamaraBro
    @Test
    public void testDemo3B() {
        driver = super.driver;
        String text = new HomePageUI(driver).sendInputData().clickTermsOfUse().clickPrivacy().getHeaderText();
        System.out.println(text);
        driver.navigate().back();
        new TermsOfUsePageUI(driver).doubleClickTermsofUseHeader();
        driver.navigate().back();
        new HomePageUI(driver).sendInputData();
    }

}
