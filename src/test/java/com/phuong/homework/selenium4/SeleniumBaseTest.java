package com.phuong.homework.selenium4;

import com.phuong.homework.BaseTest;
import com.phuong.homework.core.webdriver.DriverWrapper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public abstract class SeleniumBaseTest extends BaseTest {

    @BeforeMethod
    public void preCondition() {
        DriverWrapper.getDriver().navigate().to("https://google.com");
    }

    @AfterTest
    public void postCondition() {
        DriverWrapper.getDriver().quit();
    }

}
