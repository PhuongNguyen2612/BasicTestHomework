package com.phuong.homework.test;

import com.phuong.homework.BaseTest;
import com.phuong.homework.core.webdriver.DriverWrapper;
import com.phuong.homework.core.webdriver.model.DriverType;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {

    @Test(description = "Open google", dataProvider = "drivers")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Open google")
    public void testOpenGooglePage(String driver) {
        DriverWrapper.setDriver(DriverType.valueOf(driver));
        DriverWrapper.getDriver().navigate().to(baseUrl);
        Assert.assertEquals(true, true);
    }

}
