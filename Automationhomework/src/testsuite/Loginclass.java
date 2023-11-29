package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class Loginclass extends BaseTest {


    String baseUrl = "http://automationexercise.com";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    // login with rightcredentional

    public void usershouldlogin() {
        boolean actualResult = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).isEnabled();

//click on signup login

        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]")).click();


        String actualResult1 = driver.findElement(By.xpath("//div[@class='login-form']/h2")).getText();
        System.out.println(actualResult);
        String expectedResult = "Login to your account";
        Assert.assertEquals(actualResult, expectedResult);

        //enteremail and passwors
        driver.findElement(By.xpath("")).sendKeys("tomsmith@gmail.com");//email
        //enter password
        driver.findElement(By.xpath("")).sendKeys("Tom123");//password
        //userclick on login button
        driver.findElement(By.xpath("")).click();
        //Verify that 'Logged in as username' is visible
        String actualResult2 = driver.findElement(By.xpath("")).getText();
        System.out.println(actualResult2);
        String expectedresult = "";
        Assert.assertEquals(actualResult, expectedresult);

        // Click 'Delete Account' button
        driver.findElement(By.xpath("")).click();
        // Verify that 'ACCOUNT DELETED!' is visible
        driver.findElement(By.xpath("")).getText();
        //click on delete account
        driver.findElement(By.xpath("")).click();

//Test Case 3: Login User with incorrect email and password


//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'Login to your account' is visible
//6. Enter incorrect email address and password
//7. Click 'login' button
//8. Verify error 'Your email or password is incorrect!' is visible
//Test Case 4: Logout User
    }
}