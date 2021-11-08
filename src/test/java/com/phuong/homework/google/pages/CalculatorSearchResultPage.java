package com.phuong.homework.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This is the page which result after search "Calculator" in google home search page
 */

public class CalculatorSearchResultPage extends GoogleSearchResultPage{

    @FindBy(xpath = "//div[text()='1']") private WebElement number1;

    @FindBy(xpath = "//div[text()='2']") private WebElement number2;

    @FindBy(xpath = "//div[text()='3']") private WebElement number3;

    @FindBy(xpath = "//div[text()='4']") private WebElement number4;

    @FindBy(xpath = "//div[text()='5']") private WebElement number5;

    @FindBy(xpath = "//div[text()='6']") private WebElement number6;

    @FindBy(xpath = "//div[text()='7']") private WebElement number7;

    @FindBy(xpath = "//div[text()='8']") private WebElement number8;

    @FindBy(xpath = "//div[text()='9']") private WebElement number9;

    @FindBy(xpath = "//div[text()='=']") private WebElement equalButton;

    @FindBy(xpath = "//div[text()='÷']") private WebElement divisionButton;

    @FindBy(xpath = "//div[text()='×']") private WebElement multiplyButton;

    @FindBy(xpath = "//div[text()='-']") private WebElement minusButton;

    @FindBy(xpath = "//div[text()='+']") private WebElement plusButton;

    @FindBy(id = "cwos") private WebElement calculatorScreen;

    /**
     * Method choose the number of calculator to click
     * if input is not a number @return not click to anything
     *
     * @param number - number you want to click
     * @return CalculatorSearchResultPage
     */
    public CalculatorSearchResultPage clickNumber(int number){
        switch (number){
            case 1:
                number1.click();
                break;
            case 2:
                number2.click();
                break;
            case 3:
                number3.click();
                break;
            case 4:
                number4.click();
                break;
            case 5:
                number5.click();
                break;
            case 6:
                number6.click();
                break;
            case 7:
                number7.click();
                break;
            case 8:
                number8.click();
                break;
            case 9:
                number9.click();
                break;
            default:
                break;
        }
        return this;
    }

    /**
     * Method choose button of calculator to click
     * if %operator% is not true @return not click to anything
     *
     * @param operator- button you want to click
     * @return CalculatorSearchResultPage
     */
    public CalculatorSearchResultPage clickOperator(char operator){
        switch (operator) {
            case '/':
                divisionButton.click();
                break;
            case 'x':
                multiplyButton.click();
                break;
            case '-':
                minusButton.click();
                break;
            case '+':
                plusButton.click();
                break;
            default:
                break;
        }
        return this;
    }

    /**
     * Method to get result of the calculator
     *
     * @return String - text of result field
     */
    public String getTextFromCalculatorScreen(){
        return calculatorScreen.getText();
    }

}
