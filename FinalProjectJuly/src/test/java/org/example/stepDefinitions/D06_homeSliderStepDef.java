package org.example.stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_HomePage;
import org.testng.Assert;




public class D06_homeSliderStepDef {
    P06_HomePage home = new P06_HomePage();

    @When("user click on first slider")
    public void firstSlider(){

        home.sliders("1").click();
    }

    @Then("relative product for first slider is displayed")
    public void first_product_details_opened() throws InterruptedException{

        //WebDriverWait wait = new WebDriverWait(Hooks.driver,);
        //boolean check =  wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/nokia-lumia-1020"));
        //Assert.assertTrue(check);

        Thread.sleep(2000);
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020"));
    }
    @When("user click on second slider")
    public void secondSlider(){

        home.sliders("2").click();
    }

    @Then("relative product for second slider is displayed")
    public void second_product_details_opened() throws InterruptedException{

        Thread.sleep(2000);
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/iphone-6"));

    }
}
