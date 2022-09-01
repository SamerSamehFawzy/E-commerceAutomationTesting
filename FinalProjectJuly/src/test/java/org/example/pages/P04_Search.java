package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

import java.util.List;

public class P04_Search {
    public WebElement searchField()
    {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
    }

    public List<WebElement> searchResults()
    {
        return Hooks.driver.findElements(By.className("product-title"));
    }
}
