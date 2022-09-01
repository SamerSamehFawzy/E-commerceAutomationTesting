package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_WishListPage {

    public WebElement wishListItem()
    {
        return Hooks.driver.findElement(By.cssSelector("td[class=\"product\"] a"));
    }
}

