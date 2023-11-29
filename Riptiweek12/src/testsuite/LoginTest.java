package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl ="https://demo.nopcommerce.com/";

    @Before
    public void setuUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void loginsuccssfully(){
        //verify the text "Welcome, Please Sign In!"
        driver.findElement(By.className("ico-login")).click();
        String actualResult=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        String expectedResult= "Welcome, Please Sign In!";
        Assert.assertEquals(actualResult,expectedResult);
    }
@Test

public void usershouldloginSuccessfullywithvalidcredentials(){
    WebElement logilink =driver.findElement(By.className("ico-login"));//click on log in link
    logilink.click();
   //valid email
   //valid password
    WebElement emaillogin= driver.findElement(By.id("Email"));
    emaillogin.sendKeys("khushbu2827@gmail.com");
    driver.findElement(By.id("Password")).sendKeys("Khushbu@2802#");
    driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

    //click on logout
    driver.findElement(By.className("ico-logout")).getText();
    String actualResult= driver.findElement(By.className("ico-logout")).getText();
    String expectedResult="Log out";
    Assert.assertEquals(actualResult,expectedResult);


}

@Test

public void verifyTheErrorMessage(){
    //click on login link
    //ErrorMassage

    WebElement logilink =driver.findElement(By.className("ico-login"));//click on log in link
    logilink.click();
    //invalid email
    //invalid password
    WebElement emaillogin= driver.findElement(By.id("Email"));
    emaillogin.sendKeys("khushbu282@gmail.com");
    driver.findElement(By.id("Password")).sendKeys("Khuhbu@2802");
    driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
    //Verifying error massage
    String actualResult =driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();





}





    @After
    public void endtest(){

     //   closeBrowser();

    }
    //ErrorMassage



}


