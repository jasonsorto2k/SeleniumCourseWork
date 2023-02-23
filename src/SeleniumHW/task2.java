package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task2 {

    // HW2
    //navigate to fb.com
    //click on create new account
    //fill up all the text-boxes
    //click on sign up button
    //close the pop-up
    //close the browser

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().fullscreen();

        driver.findElement(By.linkText("Create new account")).click();

        Thread.sleep(3000);

        driver.findElement(By.name("firstname")).sendKeys("Jason");
        driver.findElement(By.name("lastname")).sendKeys("Sorto");
        driver.findElement(By.name("reg_email__")).sendKeys("Jasonsorto2k@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("bolognebank01");

        driver.findElement(By.name("websubmit")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//img[@class = '_8idr img']")).click();

        driver.quit();


    }


}
