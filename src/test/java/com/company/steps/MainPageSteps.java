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

    @Given("Go to the home page")
    public void goToTheHomePage() {
        mainPage.goToPage();
    }

    @And("User login with username {string} and password as {string}")
    public void theUserProvidesTheUsernameAsAndPasswordAs(String username, String password) {
        mainPage.login(username, password);
    }

    @Then("The user should login successfully and is on the inventory page")
    public void theUserShouldLoginSuccessfullyAndIsOnTheInventoryPage() {
        assertTrue(inventoryPage.browserIsOnThePage());
    }

    @Then("The user should login unsuccessfully and is not on the inventory page")
    public void theUserShouldLoginUnsuccessfullyAndIsNotOnTheInventoryPage() {
        assertFalse(inventoryPage.browserIsOnThePage());
    }

    @Given("Go to the menu and click logout button")
    public void goToTheMenuAndClickLogoutButton() {
        inventoryPage.logout();
    }

    @Then("The user is on home page")
    public void theUserIsOnHomePage() {
        assertTrue(mainPage.browserIsOnTheMainPage());
    };

    @And("Go to the menu")
    public void goToTheMenu() {
        inventoryPage.menuButton();
    }

    @Then("Menu should contain {int} references")
    public void menuShouldContainReferences(int arg0) {
        inventoryPage.referenceCheck();
    }
}
