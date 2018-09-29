package com.fb.uitestinghelloworld.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleImagesHomePage {


    private WebDriver driver;


    public GoogleImagesHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://images.google.com/");
    }

    public void searchBox(String searchText) {
        WebElement searchBox = driver.findElement(By.id("lst-ib"));
        searchBox.sendKeys(searchText);
        searchBox.sendKeys(Keys.TAB);
    }

    public void clickSearchLens() {
        WebElement searchLens = driver.findElement(By.cssSelector("#mKlEF"));
        searchLens.click();
    }


}
