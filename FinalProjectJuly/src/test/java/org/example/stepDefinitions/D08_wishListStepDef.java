package org.example.stepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_HomePage;
import org.example.pages.P07_WishListPage;
import org.testng.Assert;



public class D08_wishListStepDef {
    P06_HomePage home = new P06_HomePage();
    P07_WishListPage addedItem = new P07_WishListPage();

    String productName;

    @When("guest user click on wishlist button for any product")
    public void wishlist(){

        productName = home.products().get(2).getText();
        home.wishlist().get(2).click();
    }

    @Then("product will be added to wishlist page")
    public void wishlistPage(){

        home.wishlistBtn().click();
        String itemAdded = addedItem.wishListItem().getText();
        Assert.assertEquals(itemAdded,productName);
    }
}
