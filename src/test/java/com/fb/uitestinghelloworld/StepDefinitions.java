package com.fb.uitestinghelloworld;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class StepDefinitions {

    private WebDriver driver;

    @Given("^the Google home page$")
    public void the_Google_home_page() throws Exception {
        driver = new ChromeDriver();
        driver.get("http://www.google.com/xhtml");
        Thread.sleep(5000);  // Let the user actually see something!
    }

    @When("^I type \"([^\"]*)\" in the search bar$")
    public void i_type_in_the_search_bar(String searchTerm) throws InterruptedException {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchTerm);
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
    }

    @Then("^Google displays some results$")
    public void google_displays_some_results() {
        List<WebElement> resultBoxes = driver.findElements(By.cssSelector("[data-hveid]"));
        assertThat("number of results greater than 0",resultBoxes.size(), greaterThan(0));
        driver.quit();
    }
}
