package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.example.pages.P05_hoverCategories;




    public class D05_hoverStepDef {

        P05_hoverCategories hover = new P05_hoverCategories();

        String subCategoryName;

        @When("user hover category and select subcategory")
        public void hoverCategories() throws InterruptedException {

            Actions action = new Actions(Hooks.driver);

            action.moveToElement(hover.category()).perform();
            Thread.sleep(500);

            subCategoryName = hover.subCategory().getText().toLowerCase().trim();

            hover.subCategory().click();
        }

        @Then("user will directed successfully to subcategory page")
        public void hoverSuccessfully() {

            String pageTitle = hover.pageTitle().getText().toLowerCase().trim();
            Assert.assertEquals(pageTitle, subCategoryName);


        }

    }


