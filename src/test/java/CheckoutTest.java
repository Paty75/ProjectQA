
import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

//import static org.testng.AssertJUnit.assertEquals;
@Listeners(ExtentTestNGITestListener.class)
public class CheckoutTest extends Hooks {

    public CheckoutPage checkoutPage;
    public WebDriverWait wait;

    @BeforeMethod
    public void SetupPageObject() {
        checkoutPage = new CheckoutPage(driver);
        wait = new WebDriverWait(driver, 30);
    }

    //@Test
    // public void checkoutTest() throws InterruptedException {}
    @Test(description = "   ")
    public void checkoutSimpleSearchAwesomeGranitChips() throws InterruptedException {
       // extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'granit'");
        checkoutPage.clickButton1Search();
        Thread.sleep(3000);
        //wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getLinkAwesomeGranitChips()));
        checkoutPage.clickLinkAwesomeGranitChips();
        Thread.sleep(3000);
        // wait.until(ExpectedConditions.visibilityOf(checkoutPage.getIconAwesomeGranitChips()));
        checkoutPage.clickCartShoppingAwesomeGranitChips();
        Thread.sleep(3000);
        //extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'granit");
       // extentTest.pass("The search returned two products! Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }

    @Test(description = "   ")
    public void checkoutSimpleSearchAwesomeGranitChipsWishList() throws InterruptedException {
       // extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'granit'");
        checkoutPage.clickButtonWishListSearch();
        Thread.sleep(3000);
        //wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getLinkAwesomeGranitChipsWishList()));
        checkoutPage.clickLinkAwesomeGranitChipsWishList();
        Thread.sleep(3000);
        checkoutPage.clickHeartButtonWishList();
        Thread.sleep(3000);
        checkoutPage.clickShowHartButtonWishList();
        Thread.sleep(3000);
        //extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'granit");
        //extentTest.pass("The search returned two products! Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }

    @Test(description = "   ")
    public void checkoutDeleteAnItemFromBasketAwesomeGranitChips() throws InterruptedException {
       // extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'granit'");
        checkoutPage.clickButtonSearchAwesomeGranitChipsDeleteAnItem();
        Thread.sleep(3000);
        checkoutPage.clickLinkAwesomeGranitChipsDeleteAnItem();
        Thread.sleep(3000);
        checkoutPage.clickCartShoppingAwesomeGranitChipsDeleteAnItem();
        Thread.sleep(3000);
        checkoutPage.clickShoppingcartAwesomeGranitChipsDeleteAnItem();
        Thread.sleep(3000);
        checkoutPage.clickButtonTrashAwesomeGranitChipsDeleteAnItem();
        Thread.sleep(3000);
        //extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'granit");
        //extentTest.pass("The search returned two products! Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }

    @Test(description = " Searching keyword chiar  ")
    public void checkoutAwesomeMetalChair() throws InterruptedException {
        //extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'chair'");
        checkoutPage.clickButton2Search();
        Thread.sleep(3000);
        checkoutPage.clickLinkAwesomeMetalChair();
        Thread.sleep(3000);
        checkoutPage.clickShoppingCartAwesomeMetalChair();
        Thread.sleep(3000);
       // extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'chair");
        //extentTest.pass("The search returned two products! Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }

    @Test(description = " This  test verifies sort fields ")
    public void checkoutSort() throws InterruptedException {
        //extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'sort'");
        //extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'sort");
        checkoutPage.clickButtonProducts();
        Thread.sleep(3000);
        checkoutPage.clickButtonSortProducts();
        Thread.sleep(3000);
        checkoutPage.selectOption(checkoutPage.getButtonSortProducts(), "Sort by name (Z to A)");
        Thread.sleep(3000);
       // extentTest.pass("The search returned two products! Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }


    @Test(description = "   ")
    public void checkoutSearchGorgeousSoftPizza() throws InterruptedException {
       // extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'pizza'");
        checkoutPage.clickSearch2();
        Thread.sleep(3000);
        checkoutPage.clickCardLinkGorgeousSoftPizza();
        Thread.sleep(3000);
        checkoutPage.clickShoppingCartGorgeousSoftPizza();
        Thread.sleep(3000);
       // extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'pizza");
        //extentTest.pass("The search returned two products! Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");


    }

    @Test(description = "   ")
    public void checkoutContinueTesting() throws InterruptedException {
       // extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'continue testing'");
        checkoutPage.clickContainerElement();
        wait.until(ExpectedConditions.visibilityOf(checkoutPage.getSearchInput()));
        checkoutPage.searchInput();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getButtonFirstSearch()));
        checkoutPage.clickButtonFirstSearch();
        Thread.sleep(2000);
        checkoutPage.clickProductLink();
        //Thread.sleep(3000);
       wait.until(ExpectedConditions.visibilityOf(checkoutPage.getProductPhotoAwesomeGraniteChips()));
        checkoutPage.clickHeartButton();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getShowHartButton()));
        checkoutPage.clickShowHartButton();
       // wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getShowHartButton()));
        //checkoutPage.clickShowHartButton();
        //wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getShowHartButton()));
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("fa-layers-counter.shopping_cart_badge")));
        Thread.sleep(3000);
        checkoutPage.clickAddToCartButton();
        Thread.sleep(3000);
       // wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getShowHartButton()));
        //checkoutPage.clickShowHartButton();
        //wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getAddToCartMessage()));
        // Thread.sleep(3000);
        // wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getShowCartIcon()));
       // wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getShowCartIcon()));
        checkoutPage.clickShowCartIcon();
        // checkoutPage.getAddToCartMessage();
        Thread.sleep(2000);
        checkoutPage.clickButtonCheckout();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getFirstName()));
        Thread.sleep(2000);
        checkoutPage.enterFirstName();
        Thread.sleep(2000);
        checkoutPage.enterLastName();
        Thread.sleep(2000);
        checkoutPage.enterAddress();
        Thread.sleep(2000);
        checkoutPage.clickButtonContinueCheckout();
        Thread.sleep(2000);
        checkoutPage.clickButtonCompleteYourOrder();
        //Thread.sleep(3000);
        assertEquals("Thank you for your order!", checkoutPage.getPageTitle().getText());
        checkoutPage.clickContinueShopping();
        //Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOf(checkoutPage.getButtonSearchTheSecondTime()));
        checkoutPage.buttonSearchTheSecondTime();
        // wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getButtonQuestion()));
        Thread.sleep(2000);
        checkoutPage.clickSecondButtonSearch();
        Thread.sleep(2000);
        checkoutPage.clickButtonQuestion();
        Thread.sleep(2000);
        //wait.until(ExpectedConditions.visibilityOf(checkoutPage.getHelpContent()));
        checkoutPage.clickHelpContent();
        //Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getButtonReset()));
        checkoutPage.clickButtonCloseHelp();
        Thread.sleep(2000);
        checkoutPage.clickButtonReset();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getButtonContainer()));
        Thread.sleep(2000);
        checkoutPage.clickButtonContainer();
        //Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOf(checkoutPage.getButtonSearch()));
        // wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getButtonSearch()));
        checkoutPage.buttonSearch();
        Thread.sleep(2000);
        checkoutPage.clickThirdButtonSearch();
        Thread.sleep(2000);
        checkoutPage.selectOption(checkoutPage.getButtonSort(), "Sort by name (Z to A)");
        // checkoutPage.selectOption(checkoutPage.selectButtonSort(),"Sort by name(A to Z) ");
        Thread.sleep(2000);
        /*checkoutPage.FirstPart();
        checkoutPage.ProceedToCheckout();
        Thread.sleep(3000);
        checkoutPage.SecondPart();
        Thread.sleep(3000); */
        //extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'continue testing");
       // extentTest.pass("The search returned two products! Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }
    //@Test
    //public void sortProductsTest() throws InterruptedException {
    // checkoutPage.selectOption();


    @Test(description = "   ")
    public void checkFirstNameIsMandatory() {
        checkoutPage.fillContinueTestingExcept(checkoutPage.getFirstName());
        assertEquals("First Name is required", checkoutPage.getFieldError().getText());
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }

    @Test(description = "   ")
    public void ButtonResetAwesomeSoftShirt() throws InterruptedException {
        checkoutPage.clickLogoProducts();
       // Thread.sleep(3000);
       wait.until(ExpectedConditions.visibilityOf(checkoutPage.getLinkAwesomeSoftShirt()));
        checkoutPage.clickAddToCart();
        //Thread.sleep(3000);
       wait.until(ExpectedConditions.visibilityOf(checkoutPage.getCartBadgeImage()));
        checkoutPage.clickCartBadgeImage();
        Thread.sleep(3000);
        checkoutPage.clickButtonReset1();
       // Thread.sleep(3000);
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }

    @Test(description = "   ")
    public void Sort1() throws InterruptedException {
        //extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'sort'");
        Thread.sleep(3000);
        checkoutPage.selectOption(checkoutPage.getButtonSort(), "Sort by name (Z to A)");
        Thread.sleep(3000);
        //extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'sort");
        //extentTest.pass("Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }

    @Test(description = "   ")
    public void Sort2() throws InterruptedException {
       // extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'sort'");
        Thread.sleep(3000);
        checkoutPage.selectOption(checkoutPage.getButtonSort(), "Sort by name (A to Z)");
        Thread.sleep(3000);
        //extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'sort");
       // extentTest.pass("Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }

    @Test(description = "   ")
    public void Sort3() throws InterruptedException {
       // extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'sort'");
        Thread.sleep(3000);
        checkoutPage.selectOption(checkoutPage.getButtonSort(), "Sort by price (low to high)");
        Thread.sleep(3000);
        //extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'sort");
        //extentTest.pass("Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }

    @Test(description = "   ")
    public void Sort4() throws InterruptedException {
       // extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'sort'");
        Thread.sleep(3000);
        checkoutPage.selectOption(checkoutPage.getButtonSort(), "Sort by price (high to low)");
        Thread.sleep(3000);
        //extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'sort");
       // extentTest.pass("Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");


    }

    @Test(description = "   ")
    public void AddToCart2ProductsFromHomePage() throws InterruptedException {
       // extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'Cart'");
       checkoutPage.clickLogoProducts1();
        Thread.sleep(3000);
        // wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getLinkIncredibleConcreteHat()));
        wait.until(ExpectedConditions.visibilityOf(checkoutPage.getCardFooter()));
        //Thread.sleep(3000);
        checkoutPage.clickAddToCartButtonIncredibleConcreteHat();
        Thread.sleep(3000);
        checkoutPage.clickAddToCartButtonLicensedSteelGloves();
        Thread.sleep(3000);
        checkoutPage.clickShowCartIcon1();
        Thread.sleep(3000);
        checkoutPage.clickButtonCheckout1();
        Thread.sleep(3000);
        checkoutPage.enterFieldFirstName();
        Thread.sleep(3000);
        checkoutPage.enterFieldLastName();
        Thread.sleep(3000);
        checkoutPage.enterFieldAdress();
        Thread.sleep(3000);
        //extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'cart");
        //extentTest.pass("Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }


    @Test(description = "   ")
    public void checkoutRefinedFrozenMouse() throws InterruptedException {
        //extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'mouse'");
        checkoutPage.clickButtonAddToCartMouse();
        Thread.sleep(2000);
        checkoutPage.clickShoopingButton();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getIconCart()));
        checkoutPage.clickIconCart();
        Thread.sleep(2000);
        assertEquals(checkoutPage.getTitleLink().getText(), "Refined Frozen Mouse");
        //extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'mouse");
       // extentTest.pass("Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }


    @Test(description = "   ")
    public void checkoutRefinedFrozenMouse1() throws InterruptedException {
       // extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'mouse'");
        checkoutPage.clickButtonAddToCartMouse1();
        Thread.sleep(2000);
        checkoutPage.clickShoopingButton1();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getIconCart1()));
        checkoutPage.clickIconCart1();
        checkoutPage.clickButtonCheckout2();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getFieldFirstName1()));
        checkoutPage.enterFieldFirstName1();
        Thread.sleep(2000);
        checkoutPage.enterFieldLastName1();
        Thread.sleep(2000);
        checkoutPage.enterFieldAdress1();
        Thread.sleep(2000);
        checkoutPage.clickContinueCheckout();
        Thread.sleep(2000);
        //assertEquals(checkoutPage.getFirstNameError().getText(),"First Name is required");
        //assertEquals("First Name is required", checkoutPage.getFirstNameError().getText());
       /* checkoutPage.addProductToCart();
        checkoutPage.completeMandatoryFields1();
        checkoutPage.clickContinueCheckout();*/
        //extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'mouse");
        //extentTest.pass("Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }

    @Test(description = "   ")
    public void checkFirstNameIsMandatory1() {
        checkoutPage.fillMandatoryFieldsExcept(checkoutPage.getFieldFirstName1());
        //assertEquals("First Name is required", checkoutPage.getFirstNameError().getText());
        assertEquals(checkoutPage.getFirstNameError().getText(), "First Name is required");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }


    @Test(description = "   ")
    public void checkoutRefinedFrozenMouseWithoutFirstName() throws InterruptedException {
       // extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'mouse'");
        checkoutPage.clickButtonAddToCartMouse2();
        Thread.sleep(2000);
        checkoutPage.clickShoopingButton2();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getIconCart2()));
        checkoutPage.clickIconCart2();
        checkoutPage.clickButtonCheckout3();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getFieldFirstName2()));
        //checkoutPage.enterFieldFirstName2();
        //Thread.sleep(2000);
        checkoutPage.enterFieldLastName2();
        Thread.sleep(2000);
        checkoutPage.enterFieldAdress2();
        Thread.sleep(2000);
        checkoutPage.clickContinueCheckout1();
        Thread.sleep(2000);
        assertEquals("First Name is required", checkoutPage.getFirstNameError().getText());
       // extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'mouse");
       // extentTest.pass("Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
     }

    @Test(description = "   ")
    public void checkoutRefinedFrozenMouseWithoutLastName() throws InterruptedException {
        //extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'mouse'");
        checkoutPage.clickButtonAddToCartMouse3();
        Thread.sleep(2000);
        checkoutPage.clickShoopingButton3();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getIconCart3()));
        checkoutPage.clickIconCart3();
        checkoutPage.clickButtonCheckout4();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getFieldFirstName3()));
        checkoutPage.enterFieldFirstName3();
        Thread.sleep(2000);
        //checkoutPage.enterFieldLastName3();
       // Thread.sleep(2000);
        checkoutPage.enterFieldAdress3();
        Thread.sleep(2000);
        checkoutPage.clickContinueCheckout2();
        Thread.sleep(2000);
        assertEquals("Last Name is required", checkoutPage.getFirstNameError().getText());
       // extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'mouse");
        //extentTest.pass("Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }



    @Test(description = "   ")
    public void checkoutRefinedFrozenMouseWithoutAddress() throws InterruptedException {
       // extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'mouse'");
        checkoutPage.clickButtonAddToCartMouse4();
        Thread.sleep(2000);
        checkoutPage.clickShoopingButton4();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getIconCart4()));
        checkoutPage.clickIconCart4();
        checkoutPage.clickButtonCheckout5();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getFieldFirstName4()));
        checkoutPage.enterFieldFirstName4();
        Thread.sleep(2000);
        checkoutPage.enterFieldLastName4();
         Thread.sleep(2000);
        //checkoutPage.enterFieldAdress4();
       // Thread.sleep(2000);
        checkoutPage.clickContinueCheckout3();
        Thread.sleep(2000);
        assertEquals("Address is required", checkoutPage.getFirstNameError().getText());
       // extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'mouse");
       // extentTest.pass("Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }


    @Test(description = "   ")
    public void checkoutTwoAssert() throws InterruptedException {
        //extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'bacon'");
        checkoutPage.clickImageProducts();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getLinkPracticalWoodenBacon()));
        checkoutPage.clickLinkPracticalWoodenBacon();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartPracticalWoodenBacon();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getImageShoopingCartBadgePracticalWoodenBacon()));
        checkoutPage.clickImageShoopingCartBadgePracticalWoodenBacon();
        //Thread.sleep(2000);
        //assertEquals("Practical Wooden Bacon", checkoutPage.getImageTitleLinkPracticalWoodenBacon().getText());
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getImageProductss()));
        checkoutPage.clickImageProductss();
        Thread.sleep(2000);
        checkoutPage.clickButtonAddToCartRefinedFrozenMouse();
        Thread.sleep(2000);
        checkoutPage.clickShoopingButtonRefinedFrozenMouse();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getIconCartRefinedFrozenMouse()));
        checkoutPage.clickIconCartRefinedFrozenMouse();
        Thread.sleep(2000);
        assertEquals("Refined Frozen Mouse", checkoutPage.getImageTitleLinkRefinedFrozenMouse().getText());
        assertEquals("Practical Wooden Bacon", checkoutPage.getImageTitleLinkPracticalWoodenBacon().getText());
        //extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'mouse");
        //extentTest.pass("Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }



    @Test(description = "get total amount of products")
    public void checkoutLicensedSteelGloves() throws InterruptedException {
       // extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'gloves'");
        checkoutPage.clickLinkLicensedSteelGloves1();
        Thread.sleep(2000);
        checkoutPage.clickShoopingCartLicensedSteelGloves1();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getIconCartLicensedSteelGloves1()));
        checkoutPage.clickIconCartLicensedSteelGloves1();
        Thread.sleep(2000);
        checkoutPage.clickButtonAddItem();
        Thread.sleep(2000);
        /*checkoutPage.clickButtonLicensedSteelGloves1();
        Thread.sleep(2000);
        *wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getFieldFirstNameLicensedSteelGloves1()));
        checkoutPage.enterFieldFirstNameLicensedSteelGloves1();
        Thread.sleep(2000);
        checkoutPage.enterFieldLastNameLicensedSteelGloves1();
        Thread.sleep(2000);
        checkoutPage.enterFieldAdressLicensedSteelGloves1();
        Thread.sleep(2000);
        checkoutPage.clickContinueCheckout4();*/
        assertEquals("Total: $29.98", checkoutPage.getIconTotalAmount().getText());
        //extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'gloves");
       // extentTest.pass("Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }

    @Test(description = "   ")
    public void checkoutLicensedSteelGloves2() throws InterruptedException {
        //extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'gloves'");
        checkoutPage.addProductToCartLicensedSteelGloves();
        Thread.sleep(2000);
        checkoutPage.completeMandatoryFieldsLicensedSteelGloves();
        Thread.sleep(2000);
        checkoutPage.continueCheckoutLicensedSteelGloves();
        Thread.sleep(2000);

        /*checkoutPage.clickLinkLicensedSteelGloves2();
        Thread.sleep(2000);
        checkoutPage.clickShoopingCartLicensedSteelGloves2();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getIconCartLicensedSteelGloves2()));
        checkoutPage.clickIconCartLicensedSteelGloves2();
        Thread.sleep(2000);
        checkoutPage.clickButtonAddItem1();
        Thread.sleep(2000);
        checkoutPage.clickButtonLicensedSteelGloves2();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getFieldFirstNameLicensedSteelGloves2()));
        checkoutPage.enterFieldFirstNameLicensedSteelGloves2();
        Thread.sleep(2000);
        checkoutPage.enterFieldLastNameLicensedSteelGloves2();
        Thread.sleep(2000);
        checkoutPage.enterFieldAdressLicensedSteelGloves2();
        Thread.sleep(2000);
        checkoutPage.clickContinueCheckout5(); */
        //extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'gloves");
       // extentTest.pass("Test passed successfully");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");

    }


   /* @Test
    public void checkoutLicensedSteelGlovesNegativeTests() throws InterruptedException {
        extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'gloves'");



        extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'gloves");
        extentTest.pass("Test passed successfully");

    } */
   @Test(description = "   ")
   public void checkFirstNameIsMandatoryLicensedSteelGloves2() {
       checkoutPage.fillMandatoryFieldsExceptLicensedSteelGloves(checkoutPage.getFieldFirstNameLicensedSteelGloves2());
       //assertEquals("First Name is required", checkoutPage.getFirstNameErrorLicensedSteelGloves().getText());
       assertEquals(checkoutPage.getFirstNameErrorLicensedSteelGloves().getText(), "First Name is required");
       ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");

   }

    @Test(description = "   ")
    public void checkLastNameIsMandatoryLicensedSteelGloves2() {
        checkoutPage.fillMandatoryFieldsExceptLicensedSteelGloves(checkoutPage.getFieldLastNameLicensedSteelGloves2());
        assertEquals("Last Name is required",checkoutPage.getLastNameErrorLicensedSteelGloves().getText());
       // assertEquals(checkoutPage.getLastNameErrorLicensedSteelGloves().getText(), "Last Name is required");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }

    @Test(description = "   ")
    public void checkAddressIsMandatoryLicensedSteelGloves2() {
        checkoutPage.fillMandatoryFieldsExceptLicensedSteelGloves(checkoutPage.getFieldAddressNameLicensedSteelGloves2());
        assertEquals("Address is required", checkoutPage.getAddressErrorLicensedSteelGloves().getText());
        //assertEquals(checkoutPage.getAddressErrorLicensedSteelGloves().getText(), "Address is required");
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }


    @Test(description = "   ")
    public void PracticalWoodenBacon() throws InterruptedException {
        //extentTest = extentReports.createTest("Testing the Search functionality", "The test is searching for the keyword 'bacon'");
        checkoutPage.clickButtonPracticalWoodenBacon();
        Thread.sleep(2000);



        //extentTest.log(Status.INFO, "The search engine is looking up for the keyword 'bacon");
       // extentTest.pass("Test passed successfully");

    }


    @Test(description = " This test checkout adding all the products to the basket")
    public void AddAllTheProductsInTheBasket() throws InterruptedException {
        checkoutPage.clickImageContainer();
        Thread.sleep(2000);
        checkoutPage.clickFirstLink();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartFirstLink();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer();
        Thread.sleep(2000);
        checkoutPage.clickSecondLink();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartSecondLink();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer();
        Thread.sleep(2000);
        checkoutPage.clickThirdLink();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartThirdLink();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer();
        Thread.sleep(2000);
        checkoutPage.clickFourthLink();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartFourthLink();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer();
        Thread.sleep(2000);
        checkoutPage.clickFifthLink();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartFifthLink();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer();
        Thread.sleep(2000);
        checkoutPage.clickSixthLink();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartSixthLink();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer();
        Thread.sleep(2000);
        checkoutPage.clickSeventhLink();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartSeventhLink();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer();
        Thread.sleep(2000);
        checkoutPage.clickEighthLink();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartEighthLink();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer();
        Thread.sleep(2000);
        checkoutPage.clickNinthLink();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartNinthLink();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer();
        Thread.sleep(2000);
        checkoutPage.clickTenthLink();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartTenthLink();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getShoppingCartTotal()));
        checkoutPage.clickShoppingCartTotal();
        Thread.sleep(2000);
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
   }


    @Test(description = " This test checkout adding all the products to the basket")
    public void AddAllTheProductsInTheBasketCheckout() throws InterruptedException {
        checkoutPage.clickImageContainer1();
        Thread.sleep(2000);
        checkoutPage.clickFirstLink1();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartFirstLink1();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer1();
        Thread.sleep(2000);
        checkoutPage.clickSecondLink1();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartSecondLink1();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer1();
        Thread.sleep(2000);
        checkoutPage.clickThirdLink1();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartThirdLink1();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer1();
        Thread.sleep(2000);
        checkoutPage.clickFourthLink1();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartFourthLink1();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer1();
        Thread.sleep(2000);
        checkoutPage.clickFifthLink1();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartFifthLink1();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer1();
        Thread.sleep(2000);
        checkoutPage.clickSixthLink1();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartSixthLink1();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer1();
        Thread.sleep(2000);
        checkoutPage.clickSeventhLink1();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartSeventhLink1();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer1();
        Thread.sleep(2000);
        checkoutPage.clickEighthLink1();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartEighthLink1();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer1();
        Thread.sleep(2000);
        checkoutPage.clickNinthLink1();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartNinthLink1();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer1();
        Thread.sleep(2000);
        checkoutPage.clickTenthLink1();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartTenthLink1();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getShoppingCartTotal1()));
        checkoutPage.clickShoppingCartTotal1();
        Thread.sleep(2000);
        checkoutPage.clickButtonCheckoutTotal();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getFieldFirstNameCheckoutTotal()));
        checkoutPage.enterFieldFirstNameCheckoutTotal();
        Thread.sleep(2000);
        checkoutPage.enterFieldLastNameCheckoutTotal();
        Thread.sleep(2000);
        checkoutPage.enterFieldAddressCheckoutTotal();
        Thread.sleep(2000);
        checkoutPage.clickContinueCheckoutTotal();
        Thread.sleep(2000);
        checkoutPage.clickFieldCompleteYourOrder();
        Thread.sleep(2000);
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");

   }

    @Test(description = " This test checkout adding all the products to the basket")
    public void DeleteAnItemFromAddAllTheProductsInTheBasket() throws InterruptedException {
        checkoutPage.clickImageContainer2();
        Thread.sleep(2000);
        checkoutPage.clickFirstLink2();
        Thread.sleep(1000);
        checkoutPage.clickAddToCartFirstLink2();
        Thread.sleep(1000);
        checkoutPage.clickImageContainer2();
        Thread.sleep(1000);
        checkoutPage.clickSecondLink2();
        Thread.sleep(1000);
        checkoutPage.clickAddToCartSecondLink2();
        Thread.sleep(1000);
        checkoutPage.clickImageContainer2();
        Thread.sleep(1000);
        checkoutPage.clickThirdLink2();
        Thread.sleep(1000);
        checkoutPage.clickAddToCartThirdLink2();
        Thread.sleep(1000);
        checkoutPage.clickImageContainer2();
        Thread.sleep(1000);
        checkoutPage.clickFourthLink2();
        Thread.sleep(1000);
        checkoutPage.clickAddToCartFourthLink2();
        Thread.sleep(1000);
        checkoutPage.clickImageContainer2();
        Thread.sleep(1000);
        checkoutPage.clickFifthLink2();
        Thread.sleep(1000);
        checkoutPage.clickAddToCartFifthLink2();
        Thread.sleep(1000);
        checkoutPage.clickImageContainer2();
        Thread.sleep(1000);
        checkoutPage.clickSixthLink2();
        Thread.sleep(1000);
        checkoutPage.clickAddToCartSixthLink2();
        Thread.sleep(1000);
        checkoutPage.clickImageContainer2();
        Thread.sleep(1000);
        checkoutPage.clickSeventhLink2();
        Thread.sleep(1000);
        checkoutPage.clickAddToCartSeventhLink2();
        Thread.sleep(1000);
        checkoutPage.clickImageContainer2();
        Thread.sleep(2000);
        checkoutPage.clickEighthLink2();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartEighthLink2();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer2();
        Thread.sleep(2000);
        checkoutPage.clickNinthLink2();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartNinthLink2();
        Thread.sleep(2000);
        checkoutPage.clickImageContainer2();
        Thread.sleep(2000);
        checkoutPage.clickTenthLink2();
        Thread.sleep(2000);
        checkoutPage.clickAddToCartTenthLink2();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getShoppingCartTotal2()));
        checkoutPage.clickShoppingCartTotal2();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getButtonTrashLicensedSteelGloves()));
        checkoutPage.clickButtonTrashLicensedSteelGloves();
        Thread.sleep(5000);
        checkoutPage.clickCheckoutTotal1();
        Thread.sleep(5000);
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
    }




    @Test(description = " This test sort and delete items products from the basket utilising button minus ")
    public void SortAndDeleteItems() throws InterruptedException {
       checkoutPage.clickSortButton();
        Thread.sleep(2000);
        checkoutPage.selectOption(checkoutPage.getSortButton(), "Sort by price (low to high)");
        Thread.sleep(2000);
        checkoutPage.clickCartIconBacon();
        //Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getShoppingCartBacon()));
        checkoutPage.clickShoppingCartBacon();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getContainerLogo()));
        checkoutPage.clickContainerLogo();
        Thread.sleep(2000);
        checkoutPage.clickAwesomeGranitChipsFromHomePage();
        Thread.sleep(5000);
        //wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getShoppingCartBacon()));
        checkoutPage.clickShoppingCart();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getContainerLogo()));
        checkoutPage.clickContainerLogo();
        Thread.sleep(2000);
        checkoutPage.clickAwesomeGranitChipsFromHomePage();
        Thread.sleep(5000);
        //wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getShoppingCartBacon()));
        checkoutPage.clickShoppingCart();
        Thread.sleep(5000);
        checkoutPage.clickButtonMinus();
        Thread.sleep(5000);
        checkoutPage.clickButtonMinus();
        Thread.sleep(5000);
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The system");
   }

   @Test(description = "Changing quantity test.Asserting that the price is updated correctly")
    public void quantityTest() throws InterruptedException {
       checkoutPage.clickAddProductGraniteChipsToCartLink();
       checkoutPage.clickAddProductGraniteChipsToCartButton();
       checkoutPage.clickCartButton();
       Thread.sleep(3000);
       ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product is: " + checkoutPage.productPrice());
       double expectedTotal = checkoutPage.productPrice() * 2;
       ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product after updating should be: " + expectedTotal);
       checkoutPage.clickPlusQuantity();
       Thread.sleep(3000);
      ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product after update is: " + checkoutPage.productPrice());
       assertEquals(checkoutPage.productPrice(), expectedTotal);
     ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product is matching the expected price");


   }


    @Test(description = "Calculating the price of a product with taxes")
    public void PriceCalculationTest() throws InterruptedException {
        checkoutPage.clickAddProductGraniteChipsToCartLink();
        checkoutPage.clickAddProductGraniteChipsToCartButton();
        checkoutPage.clickCartButton();
        Thread.sleep(3000);
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product is: " + checkoutPage.productPrice());
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The price of the product is: " + checkoutPage.taxPrice());
        double expectedTotal = checkoutPage.productPrice() + checkoutPage.taxPrice();
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The expected total should be:: " + expectedTotal);
        ExtentTestNGITestListener.getTest().log(Status.INFO, "The actual total price is: " + checkoutPage.totalPrice());
        assertEquals (checkoutPage.totalPrice(), expectedTotal);
}
}






