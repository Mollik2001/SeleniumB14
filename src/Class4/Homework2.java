package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    /*
    HW 2
HRMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.
     */

    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");

        WebElement vUserN = driver.findElement(By.cssSelector("input[name='txtUsername']"));
        vUserN.sendKeys("Molllllllllik");

        WebElement cLogin = driver.findElement(By.cssSelector("input[type*='submit']"));
        cLogin.click();

        WebElement mess = driver.findElement(By.xpath("//span[contains(text(),'Password cannot be')]"));
        String showmess=mess.getText();

      if (showmess.isEmpty()){
    System.out.println(showmess+"is Displayed");
        }
     else {
    System.out.println(showmess+"is Displayed");
       }







    }
}
