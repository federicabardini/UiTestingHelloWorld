package com.fb.uitestinghelloworld.steps;

import com.fb.uitestinghelloworld.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class SearchResultsSteps {

    private WebDriver driver;

    @Before
    public void setup() {
        this.driver = DriverFactory.getDriver();
    }

    @After
    public void teardown() {
        DriverFactory.destroyDriver();
    }


    @Then("^Google displays some results$")
    public void google_displays_some_results() {
        List<WebElement> resultBoxes = driver.findElements(By.cssSelector("[data-hveid]"));
        assertThat("number of results greater than 0", resultBoxes.size(), greaterThan(0));
        driver.quit();
    }

    @Then("^Google displays no results$")
    public void google_displays_no_results() {
        Boolean noResultsExist = driver.getPageSource().contains("non ha prodotto risultati in nessun documento.");
        assertThat("nothing found as a result", noResultsExist, equalTo(true));
        driver.quit();
    }


}
