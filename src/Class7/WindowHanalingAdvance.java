package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHanalingAdvance {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");

        //click on help
        WebElement helpbtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpbtn.click();
        // click on privace
        WebElement privacybtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacybtn.click();
        // the tittle of my desired page is Google Acoount Help
        // get all the window handles
        Set<String> allWindowHandle = driver.getWindowHandles();
        for (String handle : allWindowHandle) {
            // switching the focus to the current handle from list
            driver.switchTo().window(handle);
            // get the tittl of the window to which the driver has swithed.
            String tittle = driver.getTitle();

            // compare if the tittle id of the help
            if (tittle.equalsIgnoreCase("Google Account Help")){
                System.out.println("the current page under focus on: "+tittle);
                break;
            }
            // need full code




        }




    }
}
