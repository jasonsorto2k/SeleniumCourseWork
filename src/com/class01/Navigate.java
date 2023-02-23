package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

    public static void main(String[] args) {


        // connect to webDriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        // Initiate the instance of Webdriver
        WebDriver webdriver = new ChromeDriver();

        // open google.com
        webdriver.get("https://www.google.com/");

        // now navigate to facebook.com
        webdriver.navigate().to("https://www.facebook.com/");
        //go back (can only be done with .navigate().to)
        webdriver.navigate().back();
        //forward can only be done with .navigate()
        webdriver.navigate().forward();
        //refresh can only be done with .navigate()
        webdriver.navigate().refresh();

        webdriver.quit();


    }
}
