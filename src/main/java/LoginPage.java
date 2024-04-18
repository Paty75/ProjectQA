import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public WebDriverWait wait;

    public LoginPage(WebDriver driver) {

        super(driver);
        wait = new WebDriverWait(driver, 30);
    }
    // Incorrect username&paswword
    @FindBy(css =".svg-inline--fa.fa-sign-in-alt.fa-w-16")
    private WebElement buttonLogin;

    public void clickButtonLogin() {
        buttonLogin.click();
    }
    @FindBy(css = ".fade.modal.show")
    private WebElement fieldLogin;

    public WebElement getFieldLogin () {
        return fieldLogin;
    }

    @FindBy(id ="user-name")
    private WebElement usernameField;

    public void setUsernameField() {
        usernameField.sendKeys("ana");
    }
   // @FindBy(id = "text-field-container")
    //@FindBy(id = "editing-view-port")
   // @FindBy(id = "placeholder")
    @FindBy(id = "password")
    private WebElement passwordField;
    public void setPasswordField() {
        passwordField.sendKeys("123456");
    }
    @FindBy(css =".btn.btn-primary")
    private WebElement secondButtonLogin;

    public void clickSecondButtonLogin() {
        secondButtonLogin.click();
    }
    @FindBy(css = "error")
    private WebElement fieldError;
    public WebElement getFieldError(){
        return fieldError;
    }
    @FindBy(id = "user-name")
    private WebElement secondFieldUsername;

    public void clickSecondFieldUsername() {
        secondFieldUsername.click();
    }

    @FindBy(css = ".close")
    //@FindBy(css = ".span.sr-only")
    private WebElement buttonClose;

    public WebElement getButtonClose() {
        return buttonClose;
    }

    public void clickButtonClose() {
        buttonClose.click();
    }

    /*
    @FindBy (css = ".svg-inline--fa.fa-sign-in-alt.fa-w-16")
    private WebElement loginIcon;

    public void clickLoginIcon() {
        loginIcon.click();
    }

    @FindBy (id = "user-name")
    private WebElement username;

    public void setUsername() {
        username.sendKeys("Dino");
    }

    @FindBy (id = "password")
    private WebElement password;

    public void setPassword(String pass) {
        password.sendKeys(pass);
    }


    @FindBy (css = ".btn.btn-primary")
    private WebElement loginButton;

    public void clickLoginButton () {
        loginIcon.click();
    }

    @FindBy (linkText = "dino")
    private WebElement correctName;

    public WebElement getCorrectName() {
        return correctName;
    }

    @FindBy(css = "error")
    private WebElement loginError;

    public WebElement getLoginError() {
        return loginError;
    //place for locators and methods */

// Correct username&password
   @FindBy (css = ".svg-inline--fa.fa-sign-in-alt.fa-w-16")
   private WebElement loginIcon;
   public  void clickLoginIcon() {
       loginIcon.click();
   }
   @FindBy (id = "user-name")
    private WebElement username;

   public void setUsername() {
       username.sendKeys("dino");
   }

    @FindBy (id = "password")
    private WebElement password;

    public void setPassword() {
        password.sendKeys("choochoo");
    }

    @FindBy (css = ".btn.btn-primary")
    private WebElement loginButton;

    public void clickLoginButton() {
        loginButton.click();
    }
    @FindBy (linkText = "dino")
    private WebElement correctName;
    public WebElement getCorrectName() {
        return correctName;
    }

    // negative test without username

    @FindBy (css = ".svg-inline--fa.fa-sign-in-alt.fa-w-16")
    private WebElement loginIcon1;
    public  void clickLoginIcon1() {
        loginIcon1.click();
    }

    @FindBy (id = "password")
    private WebElement password1;

    public void setPassword1() {
        password1.sendKeys("choochoo");
    }

    @FindBy (css = ".btn.btn-primary")
    private WebElement loginButton1;

    public void clickLoginButton1() {
        loginButton1.click();
    }

    //@FindBy (linkText = "Please fill in the username!")
    @FindBy(css =".error")
    private WebElement loginError;
    public WebElement getLoginError() {
        return loginError;
    }

    // public void loginTest correct username&password with password reveal

    @FindBy (css = ".svg-inline--fa.fa-sign-in-alt.fa-w-16")
    private WebElement loginIconn;
    public  void clickLoginIconn() {
        loginIconn.click();
    }
    @FindBy (id = "user-name")
    private WebElement usernamee;

    public void setUsernamee() {
        usernamee.sendKeys("dino");
    }

    @FindBy (id = "password")
    private WebElement passwordd;

    public void setPasswordd() {
        passwordd.sendKeys("choochoo");
    }

    @FindBy (id = "password-reveal")
    //@FindBy(css = ".reveal")
    private WebElement passwordReveal;
    public void clickPasswordReveal() {
        passwordReveal.click();
    }

    public WebElement getPasswordReveal() {
        return passwordReveal;
    }

    @FindBy (css = ".btn.btn-primary")
    private WebElement loginButtonn;

    public void clickLoginButtonn() {
        loginButtonn.click();
    }
    @FindBy (linkText = "dino")
    private WebElement correctNamee;
    public WebElement getCorrectNamee() {
        return correctNamee;
    }

    //  Login  without password

    @FindBy (css = ".svg-inline--fa.fa-sign-in-alt.fa-w-16")
    private WebElement loginIcon2;
    public  void clickLoginIcon2() {
        loginIcon2.click();
    }
    @FindBy (id = "user-name")
    private WebElement username2;

    public void setUsername2() {
        username2.sendKeys("dino");
    }

    @FindBy (css = ".btn.btn-primary")
    private WebElement loginButton2;

    public void clickLoginButton2() {
        loginButton2.click();
    }

    @FindBy(css =".error")
    private WebElement loginError1;
    public WebElement getLoginError1() {
        return loginError1;
    }

    // correct username& wrong password

    @FindBy (css = ".svg-inline--fa.fa-sign-in-alt.fa-w-16")
    private WebElement loginIcon3;
    public  void clickLoginIcon3() {
        loginIcon3.click();
    }
    @FindBy (id = "user-name")
    private WebElement username3;

    public void setUsername3() {
        username3.sendKeys("dino");
    }

    @FindBy (id = "password")
    private WebElement password3;

    public void setPassword3() {
        password3.sendKeys("gica");
    }

    @FindBy (css = ".btn.btn-primary")
    private WebElement loginButton3;

    public void clickLoginButton3() {
        loginButton3.click();
    }

    @FindBy(css =".error")
    private WebElement loginError3;
    public WebElement getLoginError3() {
        return loginError3;
    }


    // wrong username & correct password

    @FindBy (css = ".svg-inline--fa.fa-sign-in-alt.fa-w-16")
    private WebElement loginIcon4;
    public  void clickLoginIcon4() {
        loginIcon3.click();
    }
    @FindBy (id = "user-name")
    private WebElement username4;

    public void setUsername4() {
        username4.sendKeys("Iolanda");
    }

    @FindBy (id = "password")
    private WebElement password4;

    public void setPassword4() {
        password4.sendKeys("choochoo");
    }

    @FindBy (css = ".btn.btn-primary")
    private WebElement loginButton4;

    public void clickLoginButton4() {
        loginButton4.click();
    }

    @FindBy(css =".error")
    private WebElement loginError4;
    public WebElement getLoginError4() {
        return loginError4;
    }















}
