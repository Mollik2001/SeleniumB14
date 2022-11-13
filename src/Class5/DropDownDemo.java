package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

// finf the webelement dropdown by loking select tag
        WebElement dropDwon = driver.findElement(By.xpath("//select[@id='select-demo']"));

        // use select class
        Select select=new Select(dropDwon);

        // select an option  by index
        select.selectByIndex(5);
        Thread.sleep(3000);
        select.selectByVisibleText("Saturday");
        Thread.sleep(2000);
        select.selectByValue("Monday");

        // get all the option available in the dropdown
        List<WebElement> options=select.getOptions();
        // loops/
        for (int i = 0; i <options.size() ; i++) {
          WebElement option=  options.get(i);
            // System.out.println(option.getText());
            String text= option.getText();
            if(text.equalsIgnoreCase("Friday")){
                select.selectByIndex(i);
            }






        }


    }
}
