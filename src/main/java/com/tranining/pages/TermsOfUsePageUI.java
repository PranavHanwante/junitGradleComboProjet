package com.tranining.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TermsOfUsePageUI {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='nrAB0c aYyAOe']")
    WebElement headerText;

    @FindBy(xpath = "//a[text()='Privacy']")
    WebElement privacyFotter;


    @FindBy(xpath = "//h1[@class='Yolzzd']")
    WebElement termsOfUse;

    public TermsOfUsePageUI(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getHeaderText() {
        headerText.isDisplayed();
        Actions a = new Actions(driver);
        a.moveToElement(headerText).doubleClick().build().perform();
        return headerText.getText();
    }

    public TermsOfUsePageUI clickPrivacy() {
        privacyFotter.click();
        return this;
    }


   public void doubleClickTermsofUseHeader() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='Yolzzd']")));
       termsOfUse.isDisplayed();
//       Actions a = new Actions(driver);
//       a.moveToElement(termsOfUse).doubleClick().build().perform();
    }


}
