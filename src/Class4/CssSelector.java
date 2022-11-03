package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        // create a webdrivbe instance
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-first-form-demo.php");
        // get the weebelemt text box
        driver.findElement(By.cssSelector("input[placeholder*='Please enter']")).sendKeys("Abracadbara");
        // another method of doing the avobe operation

        WebElement textbox = driver.findElement(By.cssSelector("input[placeholder*='Please enter']"));
        textbox.sendKeys("Abracadbara");

        WebElement button = driver.findElement(By.cssSelector("button[onclick^='showIn']"));
        button.click();
        //

    }
}
