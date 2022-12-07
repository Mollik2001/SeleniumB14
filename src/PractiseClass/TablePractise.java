package PractiseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablePractise {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.manage().window().maximize();
        WebElement Username = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        Username.sendKeys("Tester");
        WebElement Passwprd = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        Passwprd.sendKeys("test");
        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginBtn.click();

        // Task. check the checkbox #ScreenSaver
        List<WebElement> secondcolumns = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
        // treverse through the list
        for (int i = 0; i <secondcolumns.size(); i++) {

            String ColumnsText = secondcolumns.get(i).getText();

            if (ColumnsText.equalsIgnoreCase("ScreenSaver")){
                // print out the index of column which contains the Screen Saver
                System.out.println(i+1);


            }


        }



    }
}
