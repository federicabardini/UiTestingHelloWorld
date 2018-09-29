package com.fb.uitestinghelloworld.steps;

import com.fb.uitestinghelloworld.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class SearchSteps {

    private WebDriver driver;


    @Before
    public void setup() {
        this.driver = DriverFactory.getDriver();
    }

    @After
    public void teardown() {
        DriverFactory.destroyDriver();
    }

    @Given("^I typed \"([^\"]*)\" in the search bar$")
    public void i_type_in_the_search_bar(String searchTerm) throws InterruptedException {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchTerm);
        searchBox.submit();
        Thread.sleep(50);  // Let the user actually see something!
    }


    @When("^I click on Search button$")
    public void click_search_button() {
    WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.submit();
    }

}
