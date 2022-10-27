package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("Mollik");
        driver.findElement(By.id("customer.lastName")).sendKeys("Miah");
        driver.findElement(By.id("customer.address.street")).sendKeys("124 Landon st");
        driver.findElement(By.id("customer.address.city")).sendKeys("Buffalo");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("14208");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567");
        driver.findElement(By.name("customer.ssn")).sendKeys("123456789");
        driver.findElement(By.name("customer.username")).sendKeys("Mollik11");
        driver.findElement(By.id("customer.password")).sendKeys("abc123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("abc123");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);


    }

}
