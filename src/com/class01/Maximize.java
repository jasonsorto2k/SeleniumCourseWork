package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.instagram.com/emily_amaya/");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        driver.close();
    }
}
