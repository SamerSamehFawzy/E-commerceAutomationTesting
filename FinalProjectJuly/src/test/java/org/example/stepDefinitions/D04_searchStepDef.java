package org.example.stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import org.example.pages.P04_Search;




public class D04_searchStepDef {
    P04_Search search = new P04_Search();

    @Given("user click on search field")
    public void search(){

        search.searchField().click();
    }

    @When("user search with product name {string} and press enter")
    public void searchWord(String productName){

        search.searchField().sendKeys(productName);
        search.searchField().sendKeys(Keys.ENTER);
    }

    @When("user search with SKU {string} and press enter")
    public void searchSKU(String sku){

        search.searchField().sendKeys(sku);
        search.searchField().sendKeys(Keys.ENTER);
    }

    @Then("user could find valid results")
    public void searchSuccessful(){

        String url = "https://demo.nopcommerce.com/search?q=";

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains(url));

        int size = search.searchResults().size();
        soft.assertTrue(size > 0);

        soft.assertAll();
    }
}
