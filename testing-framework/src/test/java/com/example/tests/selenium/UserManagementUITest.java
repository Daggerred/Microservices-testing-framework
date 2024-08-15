package com.example.tests.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UserManagementUITest {

    @Test
    public void testUserCreation() {
        System.setProperty("webdriver.chrome.driver", "");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/users");
        // Add Selenium code to interact with the UI and validate the results
        driver.quit();
    }
}
