package com.fb.uitestinghelloworld.steps;

import com.fb.uitestinghelloworld.DriverFactory;
import com.fb.uitestinghelloworld.pages.GoogleImagesHomePage;
import com.fb.uitestinghelloworld.pages.GoogleWebHomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class SearchSteps {

    private GoogleWebHomePage page;
    private GoogleImagesHomePage pageI;
    private WebDriver driver;

    @Before
    public void setup() {
        driver = DriverFactory.getDriver();
        page = new GoogleWebHomePage(driver);
        pageI = new GoogleImagesHomePage(driver);
    }

    @After
    public void teardown() {
        DriverFactory.destroyDriver();
    }

    @Given("^I typed \"([^\"]*)\" in the search bar$")
    public void i_type_in_the_search_bar(String searchTerm) throws InterruptedException {
        page.typeInSearchBox(searchTerm);
        Thread.sleep(50);  // Let the user actually see something!
    }


    @When("^I click on Search button$")
    public void click_search_button() {
        page.clickSearchButton();
    }


    @Given("^I typed \"([^\"]*)\" in the Google images search bar$")
    public void i_type_something_in_the_search_bar(String searchedText) throws InterruptedException {
        pageI.searchBox(searchedText);
        Thread.sleep(50);
    }

    @When("^I click on the lens icon$")
    public void i_click_search_lens_button() {
        pageI.clickSearchLens();
    }


}
