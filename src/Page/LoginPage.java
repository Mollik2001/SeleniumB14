package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utlis.CommonMethod;

public class LoginPage {
    public class loginPage extends CommonMethod {

        public WebElement userNameField = driver.findElement(By.id("txtUsername"));
        public WebElement passwordField = driver.findElement(By.id("txtPassword"));
        public WebElement loginButton = driver.findElement(By.id("btnLogin"));
        public WebElement LoginSign = driver.findElement(By.xpath(" //div[text()='LOGIN Panel']"));

    }
}
