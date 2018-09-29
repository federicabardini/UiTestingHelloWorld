package com.fb.uitestinghelloworld.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleImagesResultsPage {


    private WebDriver driver;


    public GoogleImagesResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getsResultImages() {
        List<WebElement> resultImages = driver.findElements(By.cssSelector("[jscontroller]"));
        return resultImages;
    }


}
