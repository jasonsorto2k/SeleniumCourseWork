package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {

    public static void main(String[] args) {


        // HW1:
        //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        //fill out the form
        //click on register
        //close the browser

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Jason");
        driver.findElement(By.id("customer.lastName")).sendKeys("Sorto");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Sesame Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Bikini Bottom");
        driver.findElement(By.id("customer.address.state")).sendKeys("Pacific Ocean");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("1-800-learnJava");
        driver.findElement(By.id("customer.ssn")).sendKeys("122679089");

        driver.findElement(By.id("customer.username")).sendKeys("Jaysort0");
        driver.findElement(By.id("customer.password")).sendKeys("bolognebank01");
        driver.findElement(By.id("repeatedPassword")).sendKeys("bolognebank01");

        driver.findElement(By.className("button")).click();

        driver.quit();


    }
}
