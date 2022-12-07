package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalanderPagination {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //        find the webEelment username
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.xpath("//input[@class='button']")).click();
        // click on pim button
        driver.findElement(By.xpath("//b[text()='PIM']")).click();
        // click on emp list
        driver.findElement(By.xpath("//a[text()='Employee List']")).click();
        // get all the ids from the columns
        List<WebElement> columnid = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        // treavrse throuw loop
        boolean idFound=false;
        while(!idFound) {
            //        get all the ids from the columns
            List<WebElement> columnID = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            for (int i = 0; i < columnID.size(); i++) {

//extract the id from the entry in list
                String id = columnID.get(i).getText();
//            check if it is the desired id
                if (id.equalsIgnoreCase("40907A")) {
//                check the checkbox associated with this particular  row
                    System.out.println("i have found the id on row number " + (i + 1));
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    idFound=true;
                    break;
                }

            }
            if (!idFound){
                WebElement nextButton = driver.findElement(By.xpath("//a[text()='Next']"));
                nextButton.click();
            }
        }


    }
}

