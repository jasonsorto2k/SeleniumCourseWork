package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//      Go to Syntax Projects .com
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

//      Get the drop-down
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));
//      Use the Select class
        Select sel = new Select(DD);

//      select by value
        sel.selectByValue("New Jersey");
//      select by visible text
        sel.selectByVisibleText("Ohio");

        Thread.sleep(2000);

//      When it comes MultiSelect Dropdown we can also deselect
        sel.deselectByValue("New Jersey");

        sel.deselectByVisibleText("Ohio");

        System.out.println("The drop down is multiple "+sel.isMultiple());




    }
}
