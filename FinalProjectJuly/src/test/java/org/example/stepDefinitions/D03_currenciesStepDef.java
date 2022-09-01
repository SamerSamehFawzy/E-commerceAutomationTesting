package org.example.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.pages.P03_Currencies;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class D03_currenciesStepDef {
    P03_Currencies currencies = new P03_Currencies();

    @Given("user select random currency")
    public void selectCurrency(){

        Select selectCurrencies = new Select(currencies.currencyDrpDown());
        selectCurrencies.selectByIndex(1);
    }

    @And("currency is changed correctly")
    public void currencyChange(){

        // check first element with euro sign (easy method)

        //String euro = currencies.euroSign().getText();
        //Assert.assertTrue(euro.contains("€"));

        // check all elements with euro sign (advanced method)

        int size = currencies.allItemswithEuroSign().size();

        for (int i=0; i<size; i++){

            Assert.assertTrue(currencies.allItemswithEuroSign().get(i).getText().contains("€"));
        }

    }
}
