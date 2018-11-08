package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_FILLDAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_FILLMONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_FILLYEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_FILLDAY)).isDisplayed());

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_FILLDAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(12);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_FILLMONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(4);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_FILLYEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(19);
    }
}
