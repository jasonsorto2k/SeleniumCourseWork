package SeleniumHW3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {

        /* Hw2:
        goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        1. u need to write down the code that can select  1 check box out of 4 mentioned,
        example- option1 , option2 , option 3, option 4
         */


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        List<WebElement> checkBoxes= driver.findElements(By.cssSelector("input[class='cb1-element']"));


        for (WebElement checkBox : checkBoxes) {
            System.out.println(checkBox.getAttribute("value"));

            String optionBox=checkBox.getAttribute("value");
            if(optionBox.equalsIgnoreCase("Option-2")) {
                checkBox.click();
            }
        }
    }
}

