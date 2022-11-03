package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");

        WebElement username = driver.findElement(By.cssSelector("input[name='txtUsername']"));
        username.sendKeys("Admin");

        WebElement pass = driver.findElement(By.cssSelector("input#txtPassword"));
        pass.sendKeys("Hum@nhrm123");

        WebElement login = driver.findElement(By.cssSelector("input[type*='submit']"));
        login.click();
        WebElement adminmessage = driver.findElement(By.cssSelector("a#welcome"));
       boolean displayStatus=adminmessage.isDisplayed();
        System.out.println("Welcome Admin message is displayed :"+displayStatus);







    }
}
