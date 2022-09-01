package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_LoginPage;
import org.testng.asserts.SoftAssert;import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_LoginPage;
import org.testng.asserts.SoftAssert;


public class D02_loginStepDef {
    P02_LoginPage login = new P02_LoginPage();

    @Given("user go to login page")
    public void goLoginPage(){

        login.loginBtn1().click();
    }

    @When("user enter email {string} and password {string}")
    public void email_password(String email, String password){

        login.emailLog().sendKeys(email);
        login.passwordLog().sendKeys(password);
    }

    @And("user click on log in button")
    public void logtoHomePage(){

        login.loginBtn2().click();
    }

    @Then("user will be logged in successfully")
    public void loginSuccessfully(){

        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        soft.assertTrue(login.myAccountBtn().isDisplayed());
        soft.assertAll();
    }

}


