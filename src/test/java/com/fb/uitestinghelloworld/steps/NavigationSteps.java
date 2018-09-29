package com.fb.uitestinghelloworld.steps;

import com.fb.uitestinghelloworld.DriverFactory;
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
        driver.get("http://www.google.com/xhtml");
        Thread.sleep(50);  // Let the user actually see something!
    }


}
