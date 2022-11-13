package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaits {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        // click create new acoount
        WebElement createAccountbtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccountbtn.click();

        // send first name
        WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
        fname.sendKeys("mollik");

    }

}
