package Class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        // create instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();
        // find the button click me for the alert and click on it
        WebElement simpleAlerts = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlerts.click();
        Thread.sleep(2000);
        Alert salert1 = driver.switchTo().alert();
        salert1.accept();

        // find the button for confirmaton alert ND CLICK on it

        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmationAlert.click();
        Alert confAler1 = driver.switchTo().alert();
        confAler1.dismiss();
        Thread.sleep(2000);

        // find the prompt alert and them send some text and accept it
        WebElement prompAler = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        prompAler.click();
        Thread.sleep(2000);
        // swith the focus to the alert
        Alert promp1 = driver.switchTo().alert();
        promp1.sendKeys("abracbraaa");
        promp1.accept();
    }
}