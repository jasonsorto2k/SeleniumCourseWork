package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) throws InterruptedException {

        // tell your project where the web-driver is located

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        // create an instance of the driver
        WebDriver driver = new ChromeDriver();

        // now methods can be called upon
        // open the website google.com
        driver.get("https://www.facebook.com/");

        // get the current URL that is in browser
        String URL = driver.getCurrentUrl();

        //Print out the URL
        System.out.println(URL);

        // get the title of the webpage
        String Title = driver.getTitle();
        System.out.println("The title of the page is " + Title);

        Thread.sleep(30000);

        //Method to close the browser
        driver.quit();
    }
}












