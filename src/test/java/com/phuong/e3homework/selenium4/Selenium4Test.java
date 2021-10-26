package com.phuong.e3homework.selenium4;

import org.openqa.selenium.By;
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

    //1
    @Test
    public void testOpenGoogle(){
        WebDriver driver = openGoogle();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.google.com"));
        driver.quit();
    }

    //2
    @Test
    public void testInputSearchVisible(){
        WebDriver driver = openGoogle();

        WebElement inputElement = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));

        Assert.assertTrue(inputElement.isDisplayed());
        Assert.assertTrue(inputElement.isEnabled());

        driver.quit();
    }

    //3
    @Test
    public void testInputSearchAction(){
        WebDriver driver = openGoogle();

        WebElement inputElement = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));

        inputElement.sendKeys("epam");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.google.com/search?q=epam"));
        driver.quit();
    }

    //4
    @Test
    public void testDoodlesButton(){
        WebDriver driver = openGoogle();
        WebElement doodlesButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[2]"));
        doodlesButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.google.com/doodles"));
        driver.quit();
    }

    //5
    @Test
    public void testSignIn(){
        WebDriver driver = openGoogle();
        WebElement signInButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a"));
        signInButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://accounts.google.com/signin/"));
        driver.quit();
    }

    //5
    @Test
    public void testForgotEmail(){
        WebDriver driver = openGoogle();
        WebElement forgotEmailButton = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button"));
        forgotEmailButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://accounts.google.com/signin/v2/usernamerecovery"));
        driver.quit();
    }

    //6
    @Test
    public void test(){

    }
}