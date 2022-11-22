package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        //Click on Forgot your password
        clickOnElement(By.xpath("//div[@class = 'orangehrm-login-forgot']"));

        // This is text from requirement
        String expectedMessage = "Reset Password";

        // find the expected message element
        String actualMessage = getTextFromElement(By.xpath("//h6[@class = 'oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));

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
