package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

import java.util.List;

public class P06_HomePage {
    public WebElement sliders(String num)
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child("+num+")"));
    }

    public WebElement facebook()
    {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"facebook\"] a"));
    }

    public WebElement twitter()
    {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"twitter\"] a"));
    }

    public WebElement rss()
    {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"rss\"] a"));
    }

    public WebElement youtube()
    {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"youtube\"] a"));
    }

    public List<WebElement> wishlist()
    {
        return Hooks.driver.findElements(By.cssSelector("button[title=\"Add to wishlist\"]"));
    }

    public List<WebElement> products()
    {
        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a"));
    }

    public WebElement wishlistBtn()
    {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
    }




}
