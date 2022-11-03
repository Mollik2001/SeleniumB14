package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        // find the webelement button
        WebElement btn = driver.findElement(By.cssSelector("button#buttoncheck"));
        String text = btn.getText();
        System.out.println(text);

        // get the value of the attribute "Id" from this webelement

        String idValue = btn.getAttribute("id");
        System.out.println(idValue);
    }
}
