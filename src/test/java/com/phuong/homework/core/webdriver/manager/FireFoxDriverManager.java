package com.phuong.homework.core.webdriver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverManager {
    private static FireFoxDriverManager firefoxDriverManagerInstance = null;

    private FireFoxDriverManager() {
    }

    public void setDriverProperty(){
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
    }

    public WebDriver createDriver(){
        setDriverProperty();
        return new FirefoxDriver();
    }

    public static FireFoxDriverManager getFirefoxManagerInstance(){
        if (firefoxDriverManagerInstance ==null){
            firefoxDriverManagerInstance = new FireFoxDriverManager();
        }
        return firefoxDriverManagerInstance;
    }
}
