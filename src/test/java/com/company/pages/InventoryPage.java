package com.company.pages;

import com.company.utils.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InventoryPage {
    public static String inventoryPageUrl = "https://www.saucedemo.com/inventory.html";

    public WebDriver driver;

    public InventoryPage() {
        driver = DriverSingleton.getInstance();
        PageFactory.initElements(driver, this);
    }

    public InventoryPage goToPage() {
        driver.get(inventoryPageUrl);
        return this;
    }

    public boolean browserIsOnThePage() {
        return this.driver.getCurrentUrl().equals(this.inventoryPageUrl);
    }

    public void logout() {
        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
        WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
        logoutButton.click();
    }

    public void menuButton() {
        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
    }

    public void referenceCheck() {
        WebElement inventoryButton = driver.findElement(By.id("inventory_sidebar_link"));
        assertTrue(inventoryButton.isDisplayed());
        WebElement aboutButton = driver.findElement(By.id("about_sidebar_link"));
        assertTrue(aboutButton.isDisplayed());
        WebElement logoutButton = driver.findElement(By.id("logout_sidebar_link"));
        assertTrue(logoutButton.isDisplayed());
        WebElement resetButton = driver.findElement(By.id("reset_sidebar_link"));
        assertTrue(resetButton.isDisplayed());
    }
}
