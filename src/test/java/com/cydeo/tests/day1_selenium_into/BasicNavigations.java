package com.cydeo.tests.day1_selenium_into;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1- Set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the Selenium WebDriver
        //this is the line opening an empty browser
        WebDriver driver = new ChromeDriver();
        //SessionID = 58DSAFADASDF58

        //This line will maximize the browser size
        driver.manage().window().maximize();

       //  driver.manage().window().fullscreen();

        //3- Go to "https://wwww.tesla.com"
        driver.get("https://www.tesla.com");

        //get the little of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //  use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate forward
        driver.navigate().forward();


        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use navigat().to():
        driver.navigate().to("http://www.google.com");

        // get the current title after getting the google page
        currentTitle = driver.getTitle();


        // System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("currentTitle = " + currentTitle);

        // Get the current URL using Selenium
        currentURL= driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


       // this will close  the currently opened window
        driver.close();

        // this will close all of  the currently opened window
        driver.quit();




    }
}
