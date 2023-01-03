package com.cydeo.tests.day2_locators_getText_getAttribute.day2_HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_4 {
    public static void main(String[] args) {
       // TC #4: Practice Cydeo – Class locator practice
      //  1- Open a chrome browser


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        // 2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs  ");

       // 3- Click to “Home” link
        WebElement homeTestLink =driver.findElement(By.linkText("Home"));
        homeTestLink.click();

       // 4- Verify title is as expected:
       // Expected: Practice

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!");
        }

       // PS: Locate “Home” link using “className” locator
        WebElement classNameTestLink =driver.findElement(By.className("nav-link"));
        classNameTestLink.click();
    }
}
