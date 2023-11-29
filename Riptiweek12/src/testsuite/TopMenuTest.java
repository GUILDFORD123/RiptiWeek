package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {


        String baseUrl = "https://demo.nopcommerce.com/";






@Before
    public void setup(){
    openBrowser(baseUrl);

        }


@Test
public void userShouldNavigateToComputerPageSuccessfully() {
//
    driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li")).click();
    String actualResult =driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();



}

  //  @After
            public void endtest(){
       // closeBrowser();
    }
@Test
public void userShouldNavigateToElectronicsPageSuccessfully(){
    driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]")).click();
    String actualResult =driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();




}
@Test
public void userShouldNavigateToApparelPageSuccessfull(){
    driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]")).click();
    String actualResult =driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();



}
@Test
public void userShouldNavigateToDigitalDownloadsPageSuccessfull(){

    driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]")).click();
    String actualResult =driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();


}
@Test
public void userShouldNavigateToBooksPageSuccessfully(){

    driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]")).click();
    String actualResult =driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();



}
@Test
    public void userShouldNavigateToJewelryPageSuccessfully(){

    driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]")).click();
    String actualResult =driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();


}
@Test
    public void userShouldNavigateToGiftCardsPageSuccessfull(){
    driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]")).click();
    String actualResult =driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();


}
}


