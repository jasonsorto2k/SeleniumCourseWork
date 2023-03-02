package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        WebElement createNewB = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewB.click();

        Thread.sleep(3000);

        WebElement firstName = driver.findElement(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-']"));
        firstName.sendKeys("Jason");



    }
}
