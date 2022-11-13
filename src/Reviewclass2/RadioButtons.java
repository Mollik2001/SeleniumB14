package Reviewclass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        // create instance
        WebDriver driver = new ChromeDriver();
        // open web
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        // find radio button
        List<WebElement>radioBtns=driver.findElements(By.xpath("//input[@name='ageGroup']"));
        //loop
        for (WebElement radioBtn : radioBtns){
            String option = radioBtn.getAttribute("value");
            if (option.equalsIgnoreCase("5 - 15")){
                radioBtn.click();
            }

        }





    }
}
