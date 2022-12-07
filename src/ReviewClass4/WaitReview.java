package ReviewClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WaitReview {
    public static void main(String[] args) {

        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        maximize
        driver.manage().window().maximize();

        //open url
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


        // click the text box
        WebElement CheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        CheckBox.click();
// click on remove button
        WebElement Removebtn = driver.findElement(By.xpath("//button[text()='Remove']"));
        Removebtn.click();
        // get the text
        WebElement findText = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(findText.getText());







    }
}