package com.phuong.homework.selenium4;

import com.phuong.homework.google.pages.GoogleFooter;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutPageTest extends SeleniumBaseTest {

    @Test(description = "Redirect to About page")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Redirect to About page")
    public void testAboutButton() {
        String url = new GoogleFooter().clickAboutButton().getUrl();
        Assert.assertTrue(url.contains("about.google"));
    }

    @Test(description = "Redirect to Introduce using navigation bar")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Redirect to Introduce using navigation bar")
    public void testNavigateBar_Introduce(){
        String url = new GoogleFooter()
                .clickAboutButton()
                .clickNavigateButton()
                .clickIntroduceButton()
                .getUrl();
        Assert.assertTrue(url.contains("about.google"));
    }

    @Test(description = "Redirect to Product using navigation bar")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Redirect to Product using navigation bar")
    public void testNavigateBar_Product(){
        String url = new GoogleFooter()
                .clickAboutButton()
                .clickNavigateButton()
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
                .clickNavigateButton()
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
                .clickNavigateButton()
                .clickStoryButton()
                .getUrl();
        Assert.assertTrue(url.contains("stories"));
    }

}