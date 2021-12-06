package com.phuong.homework.test;

import com.phuong.homework.BaseTest;
import com.phuong.homework.core.webdriver.DriverWrapper;
import com.phuong.homework.core.webdriver.model.DriverType;
import com.phuong.homework.google.pages.GoogleHomeSearchPage;
import com.phuong.homework.testListener.TestListener;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
@Epic("Smoke Tests")
@Feature("Doodle Page Test")
public class DoodlesPageTest extends BaseTest {

    @BeforeMethod(description = "Open chrome driver and navigate to google page")
    public void preCondition(){
        DriverWrapper.setDriver(DriverType.CHROME);
        DriverWrapper.getDriver().navigate().to(baseUrl);
    }

    @Test(description = "Redirect to doodle page")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Access to doodle page")
    public void testDoodlesButton() {
        String title = new GoogleHomeSearchPage()
                .clickDoodlesButton()
                .getTitle();
        Assert.assertTrue(title.contains("Google Doodles"));
    }

    @DataProvider(name = "searchValues")
    public Object[][] getSearchValues() {
        return new Object[][]{{"bee"}, {"celebrating"}, {"halloween"}};
    }

    @Test(description = "Search on doodle page", dataProvider = "searchValues")
    @Severity(SeverityLevel.MINOR)
    @Description("Test Description: Search on doodle page")
    public void testSearchOnDoodlesPage(String text) {
        String url = new GoogleHomeSearchPage()
                .clickDoodlesButton()
                .setTextToSearchField(text)
                .clickSearchButton()
                .getUrl();
        Assert.assertTrue(url.contains(text));
    }

}
