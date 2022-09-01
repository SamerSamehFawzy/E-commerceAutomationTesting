package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;



public class P02_LoginPage {
    public WebElement loginBtn1()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
    }

    public WebElement emailLog()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement passwordLog()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement loginBtn2() { return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]")); }

    public WebElement myAccountBtn()
    {
        return Hooks.driver.findElement(By.className("ico-account"));
    }

}
