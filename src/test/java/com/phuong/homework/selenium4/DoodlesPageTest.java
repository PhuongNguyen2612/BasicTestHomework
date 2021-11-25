package com.phuong.homework.selenium4;

import com.phuong.homework.google.pages.GoogleHomeSearchPage;
import com.phuong.homework.testListener.TestListener;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
@Epic("Smoke Tests")
@Feature("Doodle Page Test")
public class DoodlesPageTest extends SeleniumBaseTest{

    @Test(description = "Redirect to doodle page")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Access to doodle page")
    public void testDoodlesButton() {
        String title = new GoogleHomeSearchPage()
                .clickDoodlesButton()
                .getTitle();
        Assert.assertTrue(title.contains("Google Doodles"));
    }

    @Test(description = "Search on doodle page")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Search on doodle page")
    public void testSearchOnDoodlesPage() {
        String url = new GoogleHomeSearchPage()
                .clickDoodlesButton()
                .setTextToSearchField("bee")
                .clickSearchButton()
                .getUrl();
        Assert.assertTrue(url.contains("bee"));
    }

}
