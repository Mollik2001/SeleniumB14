package Reviewclass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioBtnDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        // create instance
        WebDriver driver = new ChromeDriver();
        // open web
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@name='color']"));
        // what does this list contain
        // it contains all the 6 Webelements
        // using foor loop//
        for (WebElement checkbox:checkBoxes){
            String color = checkbox.getAttribute("value");
            {
                if (color.equalsIgnoreCase("orange")){
                    checkbox.click();
                    break;
                }

            }
        }


    }

}
