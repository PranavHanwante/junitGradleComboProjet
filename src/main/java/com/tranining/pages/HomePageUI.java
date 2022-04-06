package com.tranining.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageUI  {

    WebDriver driver;

    @FindBy(xpath = "//input[@title='Search']")
    WebElement popUpCancel;

    @FindBy(xpath = "//a[text()='Terms']")
    WebElement termsOfUse;

    public HomePageUI(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public  HomePageUI sendInputData() {
        popUpCancel.isDisplayed();
        popUpCancel.sendKeys("ASD");
        return this;
    }

    public TermsOfUsePageUI clickTermsOfUse(){
        termsOfUse.click();
        return new TermsOfUsePageUI(driver);
    }

}
