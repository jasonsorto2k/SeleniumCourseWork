package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//      Go to Syntax Projects .com
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");

        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();

        Thread.sleep(1000);


    }
}
