package SeleniumHW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
use xpath to complete this
goto http://practice.syntaxtechs.net/basic-first-form-demo.php
Syntax - Website to practice Syntax Automation Platform
Syntax Automation Platform has great examples like Ajax, JQuery, Bootstrap etc which are used in most of the
web applications around the world.
enter the message in the text box
click on show message
Enter value of a
Enter value of B
click on the button get total
also please print the value of the attribute type of the button GET TOTAL
 */

public class xPathTask {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.manage().window().maximize();

        WebElement message = driver.findElement(By.xpath("//input[@id='user-message']"));
        message.sendKeys("Hello, my name is Jason Sorto.");
        Thread.sleep(3000);

        WebElement showMessage = driver.findElement(By.xpath("//button[text()='Show Message']"));
        showMessage.click();

        WebElement valueA = driver.findElement(By.xpath("//input[@id='sum1']"));
        valueA.sendKeys("20");

        WebElement valueB = driver.findElement(By.xpath("//input[@id='sum2']"));
        valueB.sendKeys("40");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()= 'Get Total']")).click();
        String totalValue = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();

        System.out.println("a + b = " + totalValue);

        Thread.sleep(3000);
        driver.quit();


    }
}
