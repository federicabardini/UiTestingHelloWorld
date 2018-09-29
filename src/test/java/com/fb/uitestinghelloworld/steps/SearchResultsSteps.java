package com.fb.uitestinghelloworld.steps;

import com.fb.uitestinghelloworld.DriverFactory;
import com.fb.uitestinghelloworld.pages.GoogleImagesResultsPage;
import com.fb.uitestinghelloworld.pages.GoogleWebResultsPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class SearchResultsSteps {

    private GoogleWebResultsPage page;
    private GoogleImagesResultsPage pageI;

    @Before
    public void setup() {
        WebDriver driver = DriverFactory.getDriver();
        page = new GoogleWebResultsPage(driver);
        pageI = new GoogleImagesResultsPage(driver);
    }

    @After
    public void teardown() {
        DriverFactory.destroyDriver();
    }


    @Then("^Google displays some results$")
    public void google_displays_some_results() {
        List<WebElement> resultBoxes = page.getResultBoxes();
        assertThat("number of results greater than 0", resultBoxes.size(), greaterThan(0));
    }

    @Then("^Google displays no results$")
    public void google_displays_no_results() {
        //boolean noResults = page.hasNoResults();
        //assertThat("nothing found as a result", noResults, equalTo(true));

        boolean noResultsExist = page.hasNoResultsMessage();
        assertThat("nothing found as a result", noResultsExist, equalTo(true));
    }

    @Then("^I get some cats images displayed as a result$")
    public void google_images_displays_results() {
        List<WebElement> resultBoxes = pageI.getsResultImages();
        assertThat("Number of results greater than 0", resultBoxes.size(), greaterThan(0));
    }

}
