package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){

        // Input username to username field element
        sendTextToElement(By.name("username"), "Admin");

        // Input password to password field element
        sendTextToElement(By.name("password"), "admin123");

        // find the login button and click on it
        clickOnElement(By.xpath("//button[@class ='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));

        // This is text from requirement
        String expectedMessage = "Dashboard";

        // find the expected message element
        String actualMessage = getTextFromElement(By.xpath("//h6[@class = 'oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));

        // verifying actual and expected message
        Assert.assertEquals(expectedMessage, actualMessage);

        // Print to be sure expecting write message or not
        System.out.println("Expected Message : "+ expectedMessage);

        // Print to be sure about Actual message
        System.out.println("Actual Message : " + actualMessage );

    }

    @After
    public void testDown(){
       closeBrowser();
    }
}
