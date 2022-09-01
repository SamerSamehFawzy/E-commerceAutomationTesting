package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_RegistrationPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
   P01_RegistrationPage register = new P01_RegistrationPage();

   @Given("user go to register page")
   public void user_go_to_register_page(){

      register.RegisterBtn1().click();
   }

   @When("user select gender type")
   public void user_select_gender_type(){

      register.genderType().click();
   }

   @And("user enter first name {string} and last name {string}")
   public void user_enter_first_name_and_last_name(String first,String last){

      register.firstName().sendKeys(first);
      register.lastName().sendKeys(last);
   }

   @And("user enter date of birth")
   public void user_enter_date_of_birth(){

      Select select = new Select(register.birthDay());
      select.selectByIndex(5);

      select = new Select(register.birthMonth());
      select.selectByValue("4");

      select = new Select(register.birthYear());
      select.selectByVisibleText("1994");
   }

   @And("user enter email {string}")
   public void user_enter_email(String email){

      register.email().sendKeys(email);

      //int leftLimit = 97; // letter 'a'
      //int rightLimit = 122; // letter 'z'
      //int targetStringLength = 10;
      //Random random = new Random();

      //String generatedString = random.ints(leftLimit, rightLimit + 1)
      //        .limit(targetStringLength)
      //        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
      //        .toString();

      //register.email().sendKeys(generatedString+"@example.com");
   }

   @And("user enter company Name")
   public void user_enter_company_name(){

      register.companyName().sendKeys("AMIT Learning");
   }

   @And("user enter password and confirm password")
   public void user_enter_password_and_confirm_password(){

      register.password().sendKeys("123456789");
      register.confirmPassword().sendKeys("123456789");
   }

   @And("user click on register button")
   public void user_click_on_register_button(){

      register.RegisterBtn2().click();
   }

   @Then("user will be directed to registration page with message \"Your registration completed\"")
   public void user_will_be_directed_to_registration_page_with_message(){

      SoftAssert soft = new SoftAssert();


      soft.assertTrue(register.registerMsg().isDisplayed());

      String msgColor = register.registerMsg().getCssValue("color");
      //String msgColorHex = Color.fromString(msgColor).asHex();
      soft.assertEquals(msgColor,"rgba(76, 177, 124, 1)");

      soft.assertAll();



   }


}
