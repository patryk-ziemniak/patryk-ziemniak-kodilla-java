package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_COOKIE_BUTTON = "//button[@data-cookiebanner=\"accept_button\"]";
    public static final String XPATH_REGISTRATION_BUTTON = "//a[@data-testid=\"open-registration-form-button\"]";
    public static final String XPATH_DIV_BIRTH = "//div[@class=\"mbs _52lq fsl fwb fcb\"]";
    public static final String XPATH_SELECT_BIRTH_DAY = "//select[@name=\"birthday_day\"]";
    public static final String XPATH_SELECT_BIRTH_MONTH = "//select[@name=\"birthday_month\"]";
    public static final String XPATH_SELECT_BIRTH_YEAR = "//select[@name=\"birthday_year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement acceptCookies = driver.findElement(By.xpath(XPATH_COOKIE_BUTTON));
        acceptCookies.click();

        WebElement registerAccount = driver.findElement(By.xpath(XPATH_REGISTRATION_BUTTON));
        registerAccount.click();

        while (!driver.findElement(By.xpath(XPATH_DIV_BIRTH)).isDisplayed()) ;

        WebElement selectComboBDay = driver.findElement(By.xpath(XPATH_SELECT_BIRTH_DAY));
        Select selectBDay = new Select(selectComboBDay);
        selectBDay.selectByValue("10");

        WebElement selectComboBMonth = driver.findElement(By.xpath(XPATH_SELECT_BIRTH_MONTH));
        Select selectBMonth = new Select(selectComboBMonth);
        selectBMonth.selectByValue("maj");

        WebElement selectComboBYear = driver.findElement(By.xpath(XPATH_SELECT_BIRTH_YEAR));
        Select selectBYear = new Select(selectComboBYear);
        selectBYear.selectByValue("2000");
    }
}
