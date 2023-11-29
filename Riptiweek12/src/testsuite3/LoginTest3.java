package testsuite3;

import browserfactory3.BaseTest3;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest3 extends BaseTest3 {

    String baseUrl = "http://the-internet.herokuapp.com/login";


    @Before
    public void setup() {
        openBrowser(baseUrl);

    }

    @Test

    public void UserSholdLoginSuccessfullyWithValidCredentials() {


        //  WebElement logilink =driver.findElement(By.id("radius"));//click on log in link
        //  logilink.click();
        //valid email
        //valid password
        WebElement emaillogin = driver.findElement(By.id("username"));
        emaillogin.sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        // driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        //click on login button
        driver.findElement(By.xpath("//button[@class='radius']/i")).click();
        String actualResult = driver.findElement(By.xpath("//div[@class='example']/h2")).getText();
        String expectedResult = "Secure Area";
        Assert.assertEquals(actualResult, expectedResult);


    }
@Test

    public void verifyTheUsernameErrorMessage() {


        //Enter “tomsmith1” username
        driver.findElement(By.id("username")).sendKeys("tomsmith1");
        //Enter “SuperSecretPassword1!” password
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//form[@name='login']/button/i")).click();
        String expectedResult = "Your username is invalid!\n" +
                "×";
        String actualResult = driver.findElement(By.xpath("//html[@class='no-js']/body/div[1]")).getText();
    System.out.println(actualResult);
       Assert.assertEquals(actualResult, expectedResult);


    }
    @Test
    public void verifyThePasswordErrorMessage(){

        //enter username
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        //enter invalid password
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.xpath("//form[@name='login']/button/i")).click();
        String actualResult=driver.findElement(By.xpath("//html[@class='no-js']/body/div[1]")).getText();
        System.out.println(actualResult);
        String expectedResult= "Your password is invalid!\n" +
                "×";
        System.out.println(expectedResult);
       Assert.assertEquals(expectedResult,actualResult);

    }
}
