package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver drive = new ChromeDriver();

        drive.get("https://www.amazon.com/");

        drive.findElements(By.tagName("a"));

        




    }
}
