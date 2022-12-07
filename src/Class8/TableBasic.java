package Class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableBasic {
    public static void main(String[] args) {
            //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            // create a WebDriver instance
            WebDriver driver = new ChromeDriver();

            // go to website
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        //        print the whole table on the console

        WebElement allTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String textAllTable = allTable.getText();
        System.out.println(textAllTable);
    }
}
