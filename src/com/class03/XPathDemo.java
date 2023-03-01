package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

        WebElement username = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
        password.sendKeys("test");

        username.clear();
        password.clear();

        WebElement usernameText=driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println( usernameText.getText());

        WebElement passwordText = driver.findElement(By.xpath("//label[text()='Password:']"));
        String pasText = passwordText.getText();
        System.out.println(pasText);


    }
}





