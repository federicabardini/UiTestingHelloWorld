package com.fb.uitestinghelloworld.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleWebResultsPage {

    private WebDriver driver;

    @FindAll(@FindBy(css = "[data-hveid]"))
    List<WebElement> resultBoxes;


    public GoogleWebResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public List<WebElement> getResultBoxes() {
        //List<WebElement> resultBoxes = driver.findElements(By.cssSelector("[data-hveid]"));
        return resultBoxes;
    }

    public boolean hasNoResults() {
        boolean noResults = resultBoxes.size() == 0;
        return noResults;
    }

    public boolean hasNoResultsMessage() {
        boolean noResultsExist = driver.getPageSource().contains("non ha prodotto risultati in nessun documento.");
        return noResultsExist;
    }

}
