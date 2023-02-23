package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("2406049248");
        driver.findElement(By.id("pass")).sendKeys("EMILY HAS FAT TITS");

        //driver.findElement(By.linkText("Create new account")).click();

        driver.findElement(By.partialLinkText("Forgot password?")).click();












    }
}
