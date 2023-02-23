package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderTask2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver drive = new ChromeDriver();

        drive.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        drive.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        drive.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        drive.findElement(By.className("button")).click();

        String title = drive.getTitle();
        System.out.println(title);

        if (title.equalsIgnoreCase("Web Orders")){
            System.out.println("Match");
        }else{
            System.out.println("No Match");
        }

        drive.findElement(By.id("ctl00_logout")).click();

        drive.quit();






    }
}
