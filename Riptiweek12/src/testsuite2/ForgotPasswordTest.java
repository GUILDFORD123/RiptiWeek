package testsuite2;

import browserfactory2.Basetest2;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends Basetest2 {


    String baseUrl = " https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

@Test
public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //enter username
   // driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("Admin");

    driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
    }

}