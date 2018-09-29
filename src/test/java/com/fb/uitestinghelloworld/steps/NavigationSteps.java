package com.fb.uitestinghelloworld.steps;

import com.fb.uitestinghelloworld.DriverFactory;
import com.fb.uitestinghelloworld.pages.GoogleWebHomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class NavigationSteps {

    private WebDriver driver;


    @Before
    public void setup() {
        this.driver = DriverFactory.getDriver();
    }

    @After
    public void teardown() {
        DriverFactory.destroyDriver();
    }


    @Given("^the Google home page$")
    public void the_Google_home_page() throws Exception {
        GoogleWebHomePage page = new GoogleWebHomePage(driver);
        page.open();
        Thread.sleep(50);
    }


}
