package com.fb.uitestinghelloworld.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleWebHomePage {

    private WebDriver driver;

    @FindBy(name = "q")
    WebElement searchBox;
    @FindBy(name = "btnK")
    WebElement searchButton;

    public GoogleWebHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("https://www.google.com/xhtml");
    }

    public void typeInSearchBox(String searchTerm) {
        //WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchTerm);
        searchBox.sendKeys(Keys.TAB);
    }

    public void clickSearchButton() {
        //WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();
    }

}
