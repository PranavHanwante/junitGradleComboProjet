package com.tranining.webbase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FlipkartWebBase {
    //    public WebDriver driver;

    private static ThreadLocal<WebDriver> thread = new ThreadLocal<>();

    @BeforeEach()
    public void setup() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        driver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();

        thread.set(new ChromeDriver());
        thread.get().manage().window().maximize();
        thread.get().get("https://www.google.com/");
        thread.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterEach
    public void tearDown() {
//        driver.quit();
        thread.get().quit();
    }

    public static WebDriver getDriver() {
        return thread.get();
    }
}
