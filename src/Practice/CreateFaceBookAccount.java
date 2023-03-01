package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFaceBookAccount {

    public void dropDown (WebElement web, String value){
        Select select = new Select(web);
        select.selectByValue(value);

    }

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().fullscreen();

        driver.findElement(By.linkText("Create new account")).click();

        Thread.sleep(3000);

        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("Johnsmith1604@yahoo.com");

        CreateFaceBookAccount cf = new CreateFaceBookAccount();
        cf.dropDown(driver.findElement(By.name("birthday_month")),"3");
        cf.dropDown(driver.findElement(By.name("birthday_day")),"13");
        cf.dropDown(driver.findElement(By.name("birthday_year")),"2000");




    }
}
