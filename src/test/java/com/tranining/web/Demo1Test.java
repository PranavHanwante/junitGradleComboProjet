package com.tranining.web;

import com.tranining.pages.HomePageUI;
import com.tranining.pages.TermsOfUsePageUI;
import com.tranining.webbase.FlipkartWebBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Demo1Test extends FlipkartWebBase {
    WebDriver driver;

    @Test
    public void testDemo1A() {
//        driver = super.driver;
        this.driver=getDriver();
        String text = new HomePageUI(driver).sendInputData().clickTermsOfUse().clickPrivacy().getHeaderText();
        System.out.println(text);

        driver.navigate().back();
        new TermsOfUsePageUI(driver).doubleClickTermsofUseHeader();
        driver.navigate().back();
        new HomePageUI(driver).sendInputData();

    }

    @Test
    public void testDemo1B() {
//        driver = super.driver;
        this.driver=getDriver();
        String text = new HomePageUI(driver).sendInputData().clickTermsOfUse().clickPrivacy().getHeaderText();
        System.out.println(text);

        driver.navigate().back();
        new TermsOfUsePageUI(driver).doubleClickTermsofUseHeader();
        driver.navigate().back();
        new HomePageUI(driver).sendInputData();

    }
}
