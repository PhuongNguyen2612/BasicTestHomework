package com.phuong.homework.test.selenium;

import com.phuong.homework.core.webdriver.DriverWrapper;
import com.phuong.homework.core.webdriver.model.DriverType;
import com.phuong.homework.google.pages.GoogleFooter;
import com.phuong.homework.testListener.TestListener;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
@Epic("Smoke Tests")
@Feature("About Page Test")
public class AboutPageTest extends SeleniumBaseTest {

    @BeforeMethod(description = "Open chrome driver and navigate to google page")
    public void preCondition(){
        DriverWrapper.setDriver(DriverType.CHROME);
        DriverWrapper.getDriver().navigate().to(baseUrl);
    }

    @Test(description = "Redirect to About page")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Redirect to About page")
    public void testAboutButton() {
        String url = new GoogleFooter().clickAboutButton().getUrl();
        Assert.assertTrue(url.contains("about.google"));
    }


    @Test(description = "Redirect to Product using navigation bar")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Redirect to Product using navigation bar")
    public void testNavigateBar_Product(){
        String url = new GoogleFooter()
                .clickAboutButton()
                .clickProductButton()
                .getUrl();
        Assert.assertTrue(url.contains("products"));
    }

    @Test(description = "Redirect to Commit using navigation bar")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Redirect to Commit using navigation bar")
    public void testNavigateBar_Commit(){
        String url = new GoogleFooter()
                .clickAboutButton()
                .clickCommitButton()
                .getUrl();
        Assert.assertTrue(url.contains("commitments"));
    }

    @Test(description = "Redirect to Story using navigation bar")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Redirect to Story using navigation bar")
    public void testNavigateBar_Story(){
        String url = new GoogleFooter()
                .clickAboutButton()
                .clickStoryButton()
                .getUrl();
        Assert.assertTrue(url.contains("stories"));
    }

}