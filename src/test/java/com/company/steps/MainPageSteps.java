package com.company.steps;

import com.company.pages.InventoryPage;
import com.company.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageSteps {
    private MainPage mainPage;
    private InventoryPage inventoryPage;

    public MainPageSteps() {
        mainPage = new MainPage();
        inventoryPage = new InventoryPage();
    }

}
