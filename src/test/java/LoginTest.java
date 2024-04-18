
import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//import org.testng.annotations.Listeners;
import static org.testng.Assert.assertEquals;
@Listeners(ExtentTestNGITestListener.class)


public class LoginTest extends Hooks {

    public LoginPage loginPage;
    public WebDriverWait wait;

    @BeforeMethod
    public void SetupPageObject() {
        loginPage = new LoginPage(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @Test(description = " this test verifies the fiels with incorrect username and incorect password  ")
    public void loginTest() throws InterruptedException {
        loginPage.clickButtonLogin();
        wait.until(ExpectedConditions.visibilityOf(loginPage.getFieldLogin()));
       // Thread.sleep(3000);
        loginPage.setUsernameField();
        Thread.sleep(3000);
        loginPage.setPasswordField();
        Thread.sleep(3000);
        loginPage.clickSecondButtonLogin();
        Thread.sleep(3000);
       // wait.until(ExpectedConditions.visibilityOf(loginPage.getFieldError()));
        loginPage.clickSecondFieldUsername();
        //Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.getButtonClose()));
        loginPage.clickButtonClose();
        Thread.sleep(3000);


    }

    /*
    @Test
    public void loginTest() throws InterruptedException {
        extentTest = extentReports.createTest("Testing the login functionality", "Testing login functionality using test data provided");
        loginPage.clickLoginIcon();
        loginPage.setUsername();
        loginPage.setPassword("choochoo");
        loginPage.clickLoginButton();
        assertEquals(loginPage.getCorrectName().getText(), "dino");
        extentTest.pass("The user was able to login succesfully! Test passed successfully");
    }

    @Test
    public void negativeLoginTest1() throws InterruptedException {
        extentTest = extentReports.createTest("Testing the login functionality without username", "");
        loginPage.clickLoginIcon();
        loginPage.setPassword("choochoo");
        loginPage.clickLoginButton();
        assertEquals(loginPage.getLoginError().getText(), "Please fill in the username!");
        extentTest.pass("The user was not able to login succesfully! Test passed successfully");
}
*/
    @Test(description = " This test verifies  correct Username  And Password")
    public void loginTestWithCorrectUsernameAndPassword() throws InterruptedException {
       // extentTest = extentReports.createTest("Testing the login functionality with the correct username and password", "Testing login functionality using test data provided");
        loginPage.clickLoginIcon();
        Thread.sleep(3000);
        loginPage.setUsername();
        Thread.sleep(3000);
        loginPage.setPassword();
        Thread.sleep(3000);
        loginPage.clickLoginButton();
        Thread.sleep(3000);
        assertEquals(loginPage.getCorrectName().getText(), "dino");
        //extentTest.pass("The user was  able to login succesfully! Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }


    @Test(description = " loginTestWithoutUsername ")
    public void loginTestWithoutUsername() throws InterruptedException {
        //extentTest = extentReports.createTest("Testing the login functionality without username", "Testing login functionality using test data provided");
        loginPage.clickLoginIcon1();
        Thread.sleep(3000);
        loginPage.setPassword1();
        Thread.sleep(3000);
        loginPage.clickLoginButton1();
        assertEquals(loginPage.getLoginError().getText(), "Please fill in the username!");
        //extentTest.pass("The user was  able to login succesfully! Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");

}


    /* @Test
    public void login1TestPasswordReveal() throws InterruptedException {
        //extentTest = extentReports.createTest("Testing the login functionality with password reveal", "Testing login functionality using test data provided");
        loginPage.clickLoginIconn();
        Thread.sleep(3000);
        loginPage.setUsernamee();
        Thread.sleep(3000);
        loginPage.setPasswordd();
        Thread.sleep(3000);
        loginPage.clickPasswordReveal();
        Thread.sleep(3000);
        loginPage.setPasswordd();
        loginPage.clickLoginButtonn();
        assertEquals(loginPage.getCorrectName().getText(), "dino");
        //extentTest.pass("The user was  able to login succesfully! Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    } */


    @Test(description = " loginTestWithoutPassword ")
    public void loginTestWithoutPassword() throws InterruptedException {
        //extentTest = extentReports.createTest("Testing the login functionality without password", "Testing login functionality using test data provided");
        loginPage.clickLoginIcon2();
        Thread.sleep(3000);
        loginPage.setUsername2();
        Thread.sleep(3000);
        loginPage.clickLoginButton2();
        Thread.sleep(3000);
        assertEquals(loginPage.getLoginError().getText(), "Please fill in the password!");
        //extentTest.pass("The user was  able to login succesfully! Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }


    @Test(description = " loginTestWithCorrectUsernameAndWrongPassword ")
    public void loginTestWithCorrectUsernameAndWrongPassword() throws InterruptedException {
        //extentTest = extentReports.createTest("Testing the login functionality with the correct username and wrong password", "Testing login functionality using test data provided");
        loginPage.clickLoginIcon3();
        Thread.sleep(3000);
        loginPage.setUsername3();
        Thread.sleep(3000);
        loginPage.setPassword3();
        Thread.sleep(3000);
        loginPage.clickLoginButton3();
        Thread.sleep(3000);
        assertEquals(loginPage.getLoginError3().getText(), "Incorrect username or password!");
        //extentTest.pass("The user was  able to login succesfully! Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }

    @Test(description = "loginTestWithWrongUsernameAndCorrectPassword")
    public void loginTestWithWrongUsernameAndCorrectPassword() throws InterruptedException {
        //extentTest = extentReports.createTest("Testing the login functionality with the correct username and wrong password", "Testing login functionality using test data provided");
        loginPage.clickLoginIcon4();
        Thread.sleep(3000);
        loginPage.setUsername4();
        Thread.sleep(3000);
        loginPage.setPassword4();
        Thread.sleep(3000);
        loginPage.clickLoginButton4();
        Thread.sleep(3000);
        assertEquals(loginPage.getLoginError4().getText(), "Incorrect username or password!");
        //extentTest.pass("The user was  able to login succesfully! Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");

    }
}


