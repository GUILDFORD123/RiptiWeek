package testsuite2;

import browserfactory2.Basetest2;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest2 extends Basetest2 {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
@Before

public void setup(){openBrowser(baseUrl);}

    @Test

    public void userSholdLoginSuccessfullyWithValidCredentials() {
 //userSholdLoginSuccessfullyWithValidCredentials
        WebElement login = driver.findElement(By.className("submit"));
        login.click();

        WebElement emaillogin =driver.findElement(By.id("Username"));
        emaillogin.sendKeys(" Password");
        driver.findElement(By.id("Password")).sendKeys(" admin123");
        driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']/button")).click();
        String actualResult =driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[12]")).getText();


    }
    }