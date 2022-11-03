package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Mollik");

        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();



    }
}
