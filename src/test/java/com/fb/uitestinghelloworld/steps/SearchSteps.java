package com.fb.uitestinghelloworld.steps;

import com.fb.uitestinghelloworld.DriverFactory;
import com.fb.uitestinghelloworld.pages.GoogleWebHomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchSteps {

    private GoogleWebHomePage page;

    @Before
    public void setup() {
        WebDriver driver = DriverFactory.getDriver();
        page = new GoogleWebHomePage(driver);
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

}
