package com.phuong.e3homework.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium4Test extends SeleniumBaseTest {

    public WebDriver openGoogle(){
        ChromeDriverService service = ChromeDriverService.createServiceWithConfig(new ChromeOptions());
        WebDriver driver = new ChromeDriver(service);

        driver.navigate().to("https://www.google.com");

        LOGGER.info("------------ Access to Google ------------");
        return driver;
    }

    @Test
    public void testOpenGoogle(){
        WebDriver driver = openGoogle();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.google.com"));
        driver.quit();
    }

    @Test
    public void testInputSearchVisible(){
        WebDriver driver = openGoogle();

        WebElement inputElement = driver.findElement(By.name("q"));

        Assert.assertTrue(inputElement.isDisplayed());
        Assert.assertTrue(inputElement.isEnabled());

        driver.quit();
    }

    @Test
    public void testInputSearchAction(){
        WebDriver driver = openGoogle();

        WebElement inputElement = driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']"));

        inputElement.sendKeys("epam");
        driver.findElement(By.name("btnK")).submit();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.google.com/search?q=epam"));
        driver.quit();
    }

    @Test
    public void testInputSearchActionEnter(){
        WebDriver driver = openGoogle();

        WebElement inputElement = driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']"));

        inputElement.sendKeys("epam");
        driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']")).sendKeys(Keys.ENTER);

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.google.com/search?q=epam"));
        driver.quit();
    }

    @Test
    public void testDoodlesButton(){
        WebDriver driver = openGoogle();
        WebElement doodlesButton = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[2]"));
        doodlesButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("google.com/doodles"));
        driver.close();
    }

    @Test
    public void testImagesButton(){
        WebDriver driver = openGoogle();
        WebElement imagesButton = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a"));
        imagesButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("google.com.vn/imghp"));
        driver.quit();
    }

    @Test
    public void testGmailButton(){
        WebDriver driver = openGoogle();
        WebElement imagesButton = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
        imagesButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("gmail"));
        driver.quit();
    }

    @Test
    public void testAboutButton(){
        WebDriver driver = openGoogle();
        WebElement imagesButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[1]"));
        imagesButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("about.google/?utm_source"));
        driver.quit();
    }

    @Test
    public void testAdvertisingButton(){
        WebDriver driver = openGoogle();
        WebElement imagesButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[2]"));
        imagesButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("ads.google.com/intl"));
        driver.quit();
    }

    @Test
    public void testBusinessButton(){
        WebDriver driver = openGoogle();
        WebElement imagesButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[3]"));
        imagesButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("business"));
        driver.quit();
    }


}