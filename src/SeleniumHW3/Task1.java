package SeleniumHW3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    /*  HW1:
go to http://practice.syntaxtechs.net/basic-checkbox-demo.php
check if the check-box "click on this check box" is Selected
if no  Select the check-box
check gain if the checkbox is Selected or not
Syntax - Website to practice Syntax Automation Platform
Syntax Automation Platform has great examples like Ajax, JQuery, Bootstrap etc
 which are used in most of the web applications around the world.
     */

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        WebElement clickBtn = driver.findElement(By.id("myCheck"));
        System.out.println("The check box is selected = "+clickBtn.isSelected());

        Thread.sleep(1000);

        if(clickBtn.isSelected()==false){
            clickBtn.click();
            System.out.println("Button is now selected");
        }else {
            System.out.println("Button is already selected!");
        }








    }
}
