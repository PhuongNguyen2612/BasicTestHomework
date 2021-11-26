package com.phuong.homework;

import com.phuong.homework.core.webdriver.DriverWrapper;
import com.phuong.homework.core.webdriver.model.DriverType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public abstract class BaseTest {

    protected String baseUrl = "https://www.google.com/";

    private String environment = System.getProperty("environment");
//    private String environment = System.getenv("environment");

    @DataProvider(name = "drivers")
    public Object[][] getDrivers(){
        if (environment == null || environment == "ALL"){
            DriverType[] types = DriverType.values();
            Object[][] result = new Object[types.length][1];
            for (int i = 0; i < types.length; i++) {
                result[i][0] = types[i].name();
            }
            return result;
        } else {
            return new Object[][]{{environment}};
        }
    }

    @AfterMethod(description = "Clear cookies")
    public void clearCookies(){
        DriverWrapper.getDriver().manage().deleteAllCookies();
    }

    @AfterMethod(description = "Close driver")
    public void postCondition() {
        DriverWrapper.getDriver().quit();
    }

}
