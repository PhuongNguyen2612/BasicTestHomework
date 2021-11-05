package com.phuong.homework.core.webdriver;

import com.phuong.homework.BaseTest;
import com.phuong.homework.core.logger.MyLogger;
import com.phuong.homework.core.webdriver.manager.ChromeDriverManager;
import org.openqa.selenium.WebDriver;

public class DriverWrapper {
    private static WebDriver driver = null;

    private DriverWrapper() {
        this.driver = ChromeDriverManager.getChromeManagerInstance().createDriver();
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            MyLogger.LOGGER.info("----create new driver-----");
            new DriverWrapper();
        }
        return driver;
    }
}
