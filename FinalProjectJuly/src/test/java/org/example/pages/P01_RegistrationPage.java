package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class P01_RegistrationPage {
    public WebElement RegisterBtn1()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
    }

    public WebElement genderType()
    {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"gender-male\"]"));
    }

    public WebElement firstName()
    {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"FirstName\"]"));
    }

    public WebElement lastName()
    {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"LastName\"]"));
    }

    public WebElement birthDay()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement birthMonth()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement birthYear()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement email()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement companyName()
    {
        return Hooks.driver.findElement(By.id("Company"));
    }

    public WebElement password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement RegisterBtn2()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement registerMsg()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
}


