package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {

String baseUrl="https://demo.nopcommerce.com/";


@Before
    public void openBroeser(){openBrowser(baseUrl);}




@Test
    public void UserShouldNavigateToRegisterPageSuccessfully(){
// click on the registerlink
    driver.findElement(By.xpath("//div[@class='header']/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
String actualResult=driver.findElement(By.xpath("//div[@class='header']/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
String expectedResult ="Register";
    Assert.assertEquals(expectedResult,actualResult);

}
@Test

    public void userSholdRegisterAccountSuccessfully(){
    //click on registerlink

    driver.findElement(By.xpath("//div[@class='header']/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
    //gender "female"
    driver.findElement(By.xpath("//span[@class='female']")).click();
    //enter firstname
    driver.findElement(By.xpath("/input[@id='FirstName']/")).sendKeys("ripu");
    //enter lastname
    driver.findElement(By.id("LastName")).sendKeys("patel");
    //select a D.O.M

    driver.findElement(By.xpath("//div[@class='date-picker-wrapper']/select[3]")).getText();
    //enter email
    driver.findElement(By.xpath("//div[@class='form-fields']/div[5]")).sendKeys("tomsmith@gmail.com");


    //enter password
    driver.findElement(By.id("Password")).sendKeys("Tom123");
    //enter conformpassword
    driver.findElement(By.id("ConfirmPassword")).sendKeys("Tom123");


}
}
