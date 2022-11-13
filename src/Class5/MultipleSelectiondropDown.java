package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelectiondropDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

    //        maximize
        driver.manage().window().maximize();

    //        find the WebElement that contains the select class
    WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

    //        using select class
    Select sel=new Select(DD);

//        By index
        sel.selectByIndex(3);
//        by visible text
        sel.selectByVisibleText("Texas");

        Thread.sleep(3000);
//        deselect by index
        sel.deselectByIndex(3);

    //        write down the code to select all the options in the drop Down
    List<WebElement> options = sel.getOptions();
        for(int i=0;i<options.size();i++){

        sel.selectByIndex(i);
    }
        Thread.sleep(3000);
sel.deselectAll();
}
}
