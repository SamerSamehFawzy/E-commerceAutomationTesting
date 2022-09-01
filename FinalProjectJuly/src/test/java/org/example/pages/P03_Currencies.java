package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_Currencies {
    public WebElement currencyDrpDown()
    {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public WebElement euroSign()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span"));
    }

    public List<WebElement> allItemswithEuroSign()
    {
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }
}

