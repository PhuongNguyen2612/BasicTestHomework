package com.phuong.homework.core.webdriver;

import com.phuong.homework.core.webdriver.manager.ChromeDriverManager;
import com.phuong.homework.core.webdriver.manager.EdgeDriverManager;
import com.phuong.homework.core.webdriver.manager.FireFoxDriverManager;
import com.phuong.homework.core.webdriver.model.DriverType;
import org.openqa.selenium.WebDriver;

/**
 * This class provide driver instance to get driver
 */
public class DriverWrapper {
    private static WebDriver driver = null;

    private DriverWrapper() {
    }

    public static WebDriver getDriver() {
        if (driver == null){
            setDriver(DriverType.CHROME);
        }
        return driver;
    }

    public static void setDriver(DriverType driverType){
        switch (driverType){
            case CHROME:
                driver = ChromeDriverManager.getChromeManagerInstance().createDriver();
                break;
            case FIREFOX:
                driver = FireFoxDriverManager.getFirefoxManagerInstance().createDriver();
                break;
            case EDGE:
                driver = EdgeDriverManager.getEdgeManagerInstance().createDriver();
                break;
        }
    }


}
