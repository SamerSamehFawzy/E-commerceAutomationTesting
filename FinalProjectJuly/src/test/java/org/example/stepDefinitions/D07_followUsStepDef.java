package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_HomePage;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P06_HomePage home = new P06_HomePage();

    @When("user opens facebook link")
    public void facebook(){

        home.facebook().click();
    }

    @When("user opens twitter link")
    public void twitter(){

        home.twitter().click();
    }

    @When("user opens rss link")
    public void rss(){

        home.rss().click();
    }

    @When("user opens youtube link")
    public void youtube() {

        home.youtube().click();
    }

    @Then("{string} is opened in new tab")
    public void open_link(String url) throws InterruptedException{

        Thread.sleep(2000);

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));

        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);

    }
}
