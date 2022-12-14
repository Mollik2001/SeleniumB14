package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        //         traverse through list of checkboxes to find the desired one
        for (WebElement checkBox : checkBoxes) {
// get the attribute value to check if this is the right option to select

            String optionName = checkBox.getAttribute("value");
//            if condition to make sure it is the right checkbox
// if we want select all of check box just remove if condition
            if (optionName.equalsIgnoreCase("Option-3")) {
//                if passed click on it

                checkBox.click();

            }
        }
    }

}
