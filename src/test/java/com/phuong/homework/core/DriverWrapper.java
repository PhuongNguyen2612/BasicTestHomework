package com.phuong.homework.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverWrapper {
    private static WebDriver driver = null;

    private  DriverWrapper(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("window-size=1000,1000");
        this.driver = new ChromeDriver(chromeOptions);
    }

    public static WebDriver getDriver(){
        if (driver != null){
            return driver;
        } else {
            new DriverWrapper();
            return driver;
        }
    }
}
