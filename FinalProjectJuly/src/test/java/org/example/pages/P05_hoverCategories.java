package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class P05_hoverCategories {
    public WebElement category()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
    }

    public WebElement subCategory()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a"));
    }

    public WebElement pageTitle()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
}

