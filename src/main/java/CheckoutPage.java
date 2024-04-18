import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;


public class CheckoutPage extends BasePage {

    public WebDriverWait wait;
    // AwesomeGranitChips
    @FindBy(css = ".btn.btn-light.btn-sm")
    private WebElement button1Search;
    //@FindBy(css = ".card-link")
    // @FindBy(css = ".text-center.card-body")
    @FindBy(css = "a.card-link[href='#/product/1']")
    private WebElement linkAwesomeGranitChips;
    @FindBy(css = ".product-image")
    //@FindBy(css = ".col.col-lg-4.col")
    private WebElement imageAwesomeGranitChips;
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    //@FindBy(css = ".btn.btn-link")
    //@FindBy(css =".col.col-lg-2.text-center.col")
    private WebElement cartShoppingAwesomeGranitChips;
    // AwesomeMetalChair
    @FindBy(css = ".btn.btn-light.btn-sm")
    private WebElement button2Search;
    @FindBy(css = "a.card-link[href='#/product/3']")
    private WebElement linkAwesomeMetalChair;
    @FindBy(css = ".product-image")
    private WebElement imageAwesomeMetalChair;
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement shoppingCartAwesomeMetalChair;
    @FindBy(css = ".btn.btn-light.btn-sm")
    private WebElement buttonWishListSearch;
    //@FindBy(css = ".card-link")
    // @FindBy(css = ".text-center.card-body")
    @FindBy(css = "a.card-link[href='#/product/1']")
    private WebElement linkAwesomeGranitChipsWishList;
    @FindBy(css = ".product-image")
    //@FindBy(css = ".col.col-lg-4.col")
    private WebElement imageAwesomeGranitChipsWishList;
    @FindBy(css = ".svg-inline--fa.fa-heart.fa-w-16.fa-3x")
    private WebElement heartButtonWishList;
    @FindBy(css = ".svg-inline--fa.fa-heart-broken.fa-w-16.fa-3x")
    private WebElement showHartButtonWishlist;
    @FindBy(css = ".btn.btn-light.btn-sm")
    private WebElement buttonSearchAwesomeGranitChipsDeleteAnItem;
    //@FindBy(css = ".card-link")
    // @FindBy(css = ".text-center.card-body")
    @FindBy(css = "a.card-link[href='#/product/1']")
    private WebElement linkAwesomeGranitChipsDeleteAnItem;
    @FindBy(css = ".product-image")
    //@FindBy(css = ".col.col-lg-4.col")
    private WebElement imageAwesomeGranitChipsDeleteAnItem;
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    //@FindBy(css = ".btn.btn-link")
    //@FindBy(css =".col.col-lg-2.text-center.col")
    private WebElement cartShoppingAwesomeGranitChipsDeleteAnItem;
    @FindBy(css = ".fa-layers-counter.shopping_cart_badge")
    private WebElement cartbadgeAwesomeGranitChipsDeleteAnItem;
    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement shoppingcartAwesomeGranitChipsDeleteAnItem;

    // Scoatem din cos Aesome Metal Chair un produs.

   /* @FindBy(css = "a.card-link[href='#/product/3']")
    private WebElement linkkAwesomeMetalChair;

    public WebElement getLinkkAwesomeMetalChair() {
        return linkAwesomeMetalChair;
    }
    public void clickLinkkAwesomeMetalChair(){
        linkAwesomeMetalChair.click();
    }

    @FindBy(css =".product-image")
    private WebElement imageeAwesomeMetalChair;
    public WebElement getImageeAwesomeMetalChair() {
        return imageeAwesomeMetalChair;
    }
    @FindBy(css = ".col.col-lg-2.text-center.col")
    private WebElement textCenter;
    public WebElement getTextCenter() {
        return textCenter;
    }


    @FindBy(css = ".fa-layers-counter.shopping_cart_badge")
    private WebElement numberOfItems;
    public void clickNumberOfItems() {
        numberOfItems.click();
    }
    public WebElement getNumberOfItems() {
        return numberOfItems;
    }
    //@FindBy(css = ".shopping-cart-icon.fa-layers.fa-fw")
    @FindBy(css =".img")
    private WebElement shoppingCartIcon;
    public WebElement getShoppingCartIcon() {
        return shoppingCartIcon;
    }
    public void clickShoppingCartIcon() {
        shoppingCartIcon.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-trash.fa-w-14")
    private WebElement buttonTrash;
    public void clickButtonTrash() {
        buttonTrash.click();
    } */


    // Awesome Granit Chips - adaugare produs la wish list
    @FindBy(css = "item_1_title_link")
    private WebElement messagetitlelinkAwesomeGranitChipsDeleteAnItem;
    @FindBy(css = ".svg-inline--fa.fa-trash.fa-w-14")
    private WebElement buttonTrashAwesomeGranitChipsDeleteAnItem;


    @FindBy(css = ".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement buttonProducts;
    //@FindBy(xpath = "//div[text()='Sort by name (Z to A)']")
    // private WebElement divElement;
    @FindBy(css = ".sort-products-select.form-control.form-control-sm")
    // @FindBy(css = ".col-md-auto")
    private WebElement buttonSortProducts;
    // GorgeousSoftPizza
    @FindBy(css = ".btn.btn-light.btn-sm")
    private WebElement search2;
    @FindBy(css = "a.card-link[href='#/product/9']")
    private WebElement cardLinkGorgeousSoftPizza;
    @FindBy(css = ".product-image")
    private WebElement imageGorgeousSoftPizza;
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement shoppingCartGorgeousSoftPizza;

    /*  //  continue testing
    @FindBy(css = ".container")
    private WebElement containerElement;
    @FindBy(id = "input-search")
    private WebElement searchInput;
    @FindBy(css = ".btn.btn-light.btn-sm")
    private WebElement buttonFirstSearch;
    @FindBy(css = "a.card-link[href='#/product/1']")
    private WebElement productLink;
    @FindBy(css = ".col.col-lg-4.col")
    private WebElement productPhotoAwesomeGraniteChips;
    @FindBy(css = ".svg-inline--fa.fa-heart.fa-w-16.fa-3x")
    private WebElement heartButton;
    @FindBy(css = ".svg-inline--fa.fa-heart-broken.fa-w-16.fa-3x")
    private WebElement showHartButton;
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartButton;
    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement showCartIcon;
    @FindBy(css = ".subheader-container")
    private WebElement addToCartMessage;
    @FindBy(css = ".btn.btn-success")
    private WebElement buttonCheckout;
    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(css = ".error")
    private WebElement fieldError;
    @FindBy(id = "last-name")
    private WebElement lastName;
    @FindBy(id = "address")
    private WebElement addressField;
    @FindBy(css = ".btn.btn-success")
    private WebElement buttonContinueCheckout;
    @FindBy(css = ".svg-inline--fa.fa-angle-right.fa-w-8")
    private WebElement buttonCompleteYourOrder;
    @FindBy(css = ".text-center")
    private WebElement pageTitle;
    @FindBy(xpath = "//a[text()=' Continue shopping']")
    // @FindBy(css = ".svg.svg-inline--fa.fa-angle-right.fa-w-8 ")
    // @FindBy(xpath ="//svg[<path fill=\"currentColor\" d=\"M224.3 273l-136 136c-9.4 9.4-24.6 9.4-33.9 0l-22.6-22.6c-9.4-9.4-9.4-24.6 0-33.9l96.4-96.4-96.4-96.4c-9.4-9.4-9.4-24.6 0-33.9L54.3 103c9.4-9.4 24.6-9.4 33.9 0l136 136c9.5 9.4 9.5 24.6.1 34z\"></path>]") )
    // private WebElement svgElement;
    private WebElement continueShopping;
    @FindBy(css = ".mr-auto.form-control.form-control-sm")
    private WebElement buttonSearchTheSecondTime;
    @FindBy(css = ".btn.btn-light.btn-sm")
    private WebElement secondButtonSearch;
    @FindBy(css = ".svg-inline--fa.fa-question.fa-w-12")
    // @FindBy(css = ".nav-item")
    private WebElement buttonQuestion;
    @FindBy(css = ".modal-content")
    private WebElement helpContent;
    @FindBy(css = ".close")
    private WebElement buttonCloseHelp;
    //@FindBy(css = ".nav-item")
    @FindBy(css = ".svg-inline--fa.fa-undo.fa-w-16")
    //@FindBy(css = ".fade.modal.show")
    private WebElement buttonReset;
    @FindBy(css = ".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement buttonContainer;
    @FindBy(css = ".mr-auto.form-control.form-control-sm")
    // @FindBy(css = ".col-md-auto")
    private WebElement buttonSearch;
    @FindBy(css = ".btn.btn-light.btn-sm")
    private WebElement thirdButtonSearch;
    @FindBy(css = ".sort-products-select.form-control.form-control-sm")
    // @FindBy(css = ".col-md-auto")
    private WebElement buttonSort;
   /* public void selectOption(WebElement element, String option) {
        Select optionSelect = new Select(element);
        optionSelect.selectByVisibleText(option);
    } */   //  sfarsit continue testing  */


    public CheckoutPage(WebDriver driver) {

        super(driver);
        wait = new WebDriverWait(driver, 30);
    }

    public void clickButton1Search() {
        button1Search.click();
    }

    public WebElement getLinkAwesomeGranitChips() {
        return linkAwesomeGranitChips;
    }

    public void clickLinkAwesomeGranitChips() {
        linkAwesomeGranitChips.click();
    }

    public WebElement getImageAwesomeGranitChips() {
        return imageAwesomeGranitChips;
    }

    public void clickCartShoppingAwesomeGranitChips() {
        cartShoppingAwesomeGranitChips.click();
    }

    public void clickButton2Search() {
        button2Search.click();
    }

    public WebElement getLinkAwesomeMetalChair() {
        return linkAwesomeMetalChair;
    }

    // @FindBy(css =".svg-inline--fa.fa-cart-plus.fa-w-18.fa-2x")
    // @FindBy(css =".container-fluid.svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x.")
    // @FindBy(css =".svg.svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x .btn.btn-link")
    //@FindBy(css = ".col.col-lg-2.text-center.col .svg.svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")


//

    public void clickLinkAwesomeMetalChair() {
        linkAwesomeMetalChair.click();
    }

    public WebElement getImageAwesomeMetalChair() {
        return imageAwesomeMetalChair;
    }

    public void clickShoppingCartAwesomeMetalChair() {
        shoppingCartAwesomeMetalChair.click();
    }

    public void clickButtonWishListSearch() {
        button1Search.click();
    }

    public WebElement getLinkAwesomeGranitChipsWishList() {
        return linkAwesomeGranitChipsWishList;
    }

    // Method to perform search
   /* public void searchForItem(String item) {
        wait.until(ExpectedConditions.visibilityOf(searchInput));
        getSearchInput().sendKeys(item);
    }*/

    public void clickLinkAwesomeGranitChipsWishList() {
        linkAwesomeGranitChipsWishList.click();
    }

    public WebElement getImageAwesomeGranitChipsWishList() {
        return imageAwesomeGranitChipsWishList;
    }

    public WebElement getHeartButtonWishList() {
        return heartButtonWishList;
    }

    public void clickHeartButtonWishList() {
        heartButtonWishList.click();
    }

    public void clickShowHartButtonWishList() {
        showHartButtonWishlist.click();
    }

    public WebElement getShowHartButtonWishlist() {
        return showHartButtonWishlist;
    }

    public void clickButtonSearchAwesomeGranitChipsDeleteAnItem() {
        buttonSearchAwesomeGranitChipsDeleteAnItem.click();
    }

    public WebElement getLinkAwesomeGranitChipsDeleteAnItem() {
        return linkAwesomeGranitChipsDeleteAnItem;
    }

    public void clickLinkAwesomeGranitChipsDeleteAnItem() {
        linkAwesomeGranitChipsDeleteAnItem.click();
    }

    public WebElement getImageAwesomeGranitChipsDeleteAnItem() {
        return imageAwesomeGranitChipsDeleteAnItem;
    }

    public void clickCartShoppingAwesomeGranitChipsDeleteAnItem() {
        cartShoppingAwesomeGranitChipsDeleteAnItem.click();
    }

    public WebElement getCartbadgeAwesomeGranitChipsDeleteAnItem() {
        return cartbadgeAwesomeGranitChipsDeleteAnItem;
    }

    public void clickShoppingcartAwesomeGranitChipsDeleteAnItem() {
        shoppingcartAwesomeGranitChipsDeleteAnItem.click();
    }

    public WebElement getShoppingcartAwesomeGranitChipsDeleteAnItem() {
        return shoppingcartAwesomeGranitChipsDeleteAnItem;
    }

    public WebElement getMessagetitlelinkAwesomeGranitChipsDeleteAnItem() {
        return messagetitlelinkAwesomeGranitChipsDeleteAnItem;
    }

    public void clickButtonTrashAwesomeGranitChipsDeleteAnItem() {
        buttonTrashAwesomeGranitChipsDeleteAnItem.click();
    }

    public void clickButtonProducts() {
        buttonProducts.click();
    }

    public WebElement getButtonProducts() {
        return buttonProducts;
    }

    public void clickButtonSortProducts() {
        buttonSortProducts.click();
    }

    public WebElement getButtonSortProducts() {
        return buttonSortProducts;
    }

    public void clickSearch2() {
        search2.click();
    }

    public void clickCardLinkGorgeousSoftPizza() {
        cardLinkGorgeousSoftPizza.click();
    }

    public WebElement getImageGorgeousSoftPizza() {
        return imageGorgeousSoftPizza;
    }

    public void clickShoppingCartGorgeousSoftPizza() {
        shoppingCartGorgeousSoftPizza.click();
    }
 //          //  Continue Testing

    @FindBy(css = ".container")
    private WebElement containerElement;
    @FindBy(id = "input-search")
    private WebElement searchInput;
    @FindBy(css = ".btn.btn-light.btn-sm")
    private WebElement buttonFirstSearch;
    @FindBy(css = "a.card-link[href='#/product/1']")
    private WebElement productLink;
    @FindBy(css = ".col.col-lg-4.col")
    private WebElement productPhotoAwesomeGraniteChips;
    @FindBy(css = ".svg-inline--fa.fa-heart.fa-w-16.fa-3x")
    private WebElement heartButton;
    @FindBy(css = ".svg-inline--fa.fa-heart-broken.fa-w-16.fa-3x")
    private WebElement showHartButton;
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartButton;
    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement showCartIcon;
    @FindBy(css = ".subheader-container")
    private WebElement addToCartMessage;
    @FindBy(css = ".btn.btn-success")
    private WebElement buttonCheckout;
    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(css = ".error")
    private WebElement fieldError;
    @FindBy(id = "last-name")
    private WebElement lastName;
    @FindBy(id = "address")
    private WebElement addressField;
    @FindBy(css = ".btn.btn-success")
    private WebElement buttonContinueCheckout;
    @FindBy(css = ".svg-inline--fa.fa-angle-right.fa-w-8")
    private WebElement buttonCompleteYourOrder;
    @FindBy(css = ".text-center")
    private WebElement pageTitle;
    @FindBy(xpath = "//a[text()=' Continue shopping']")
    // @FindBy(css = ".svg.svg-inline--fa.fa-angle-right.fa-w-8 ")
    // @FindBy(xpath ="//svg[<path fill=\"currentColor\" d=\"M224.3 273l-136 136c-9.4 9.4-24.6 9.4-33.9 0l-22.6-22.6c-9.4-9.4-9.4-24.6 0-33.9l96.4-96.4-96.4-96.4c-9.4-9.4-9.4-24.6 0-33.9L54.3 103c9.4-9.4 24.6-9.4 33.9 0l136 136c9.5 9.4 9.5 24.6.1 34z\"></path>]") )
    // private WebElement svgElement;
    private WebElement continueShopping;
    @FindBy(css = ".mr-auto.form-control.form-control-sm")
    private WebElement buttonSearchTheSecondTime;
    @FindBy(css = ".btn.btn-light.btn-sm")
    private WebElement secondButtonSearch;
    @FindBy(css = ".svg-inline--fa.fa-question.fa-w-12")
    // @FindBy(css = ".nav-item")
    private WebElement buttonQuestion;
    @FindBy(css = ".modal-content")
    private WebElement helpContent;
    @FindBy(css = ".close")
    private WebElement buttonCloseHelp;
    //@FindBy(css = ".nav-item")
    @FindBy(css = ".svg-inline--fa.fa-undo.fa-w-16")
    //@FindBy(css = ".fade.modal.show")
    private WebElement buttonReset;
    @FindBy(css = ".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement buttonContainer;
    @FindBy(css = ".mr-auto.form-control.form-control-sm")
    // @FindBy(css = ".col-md-auto")
    private WebElement buttonSearch;
    @FindBy(css = ".btn.btn-light.btn-sm")
    private WebElement thirdButtonSearch;
    @FindBy(css = ".sort-products-select.form-control.form-control-sm")
    // @FindBy(css = ".col-md-auto")
    private WebElement buttonSort;
   /* public void selectOption(WebElement element, String option) {
        Select optionSelect = new Select(element);
        optionSelect.selectByVisibleText(option);
    } */   //  sfarsit continue testing


    public void clickContainerElement() {
        containerElement.click();
    }

    public WebElement getContainerElement() {
        return containerElement;
    }


    public WebElement getSearchInput() {
        return searchInput;
    }

    public void searchInput() {
        searchInput.sendKeys("awesome");
    }

    public void clickButtonFirstSearch() {
        buttonFirstSearch.click();
    }
    public WebElement getButtonFirstSearch() {
        return buttonFirstSearch;
    }

    public void clickProductLink() {
        productLink.click();
    }

    public WebElement getProductPhotoAwesomeGraniteChips() {
        return productPhotoAwesomeGraniteChips;

    }

    public WebElement getHeartButton() {
        return heartButton;
    }

    public void clickHeartButton() {
        heartButton.click();
    }

    public void clickShowHartButton() {
        showHartButton.click();
    }

    public WebElement getShowHartButton() {
        return showHartButton;
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public void clickShowCartIcon() {
        showCartIcon.click();
    }

    public WebElement getShowCartIcon() {
        return showCartIcon;
    }

    public WebElement getAddToCartMessage() {
        return addToCartMessage;
    }

    public void clickButtonCheckout() {
        buttonCheckout.click();
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public void enterFirstName() {
        firstName.sendKeys(" Ana");
    }

    public WebElement getFieldError() {
        return fieldError;
    }

    public WebElement getLastNameName() {
        return lastName;
    }

    public void enterLastName() {
        lastName.sendKeys(" Andrei");
    }

    public void enterAddress() {
        addressField.sendKeys("Str.Capitan Preotescu nr.10,sector 4 ");
    }

    public void clickButtonContinueCheckout() {
        buttonCheckout.click();
    }

    public void clickButtonCompleteYourOrder() {
        buttonCompleteYourOrder.click();
    }

    public WebElement getPageTitle() {
        return pageTitle;
    }

    public void clickContinueShopping() {
        continueShopping.click();
    }

    public WebElement getContinueShopping() {
        return continueShopping;
    }

    public WebElement getButtonSearchTheSecondTime() {
        return buttonSearchTheSecondTime;
    }

    public void buttonSearchTheSecondTime() {
        buttonSearchTheSecondTime.sendKeys("m");
    }

    public void clickSecondButtonSearch() {
        secondButtonSearch.click();
    }

    //public WebElement getButtonQuestion() {
    //return buttonQuestion;
    //}
    public void clickButtonQuestion() {
        buttonQuestion.click();
    }

    public WebElement getHelpContent() {
        return helpContent;
    }

    public void clickHelpContent() {
        helpContent.click();
    }

    public void clickButtonCloseHelp() {
        buttonCloseHelp.click();
    }

    public WebElement getButtonCloseHelp() {
        return buttonCloseHelp;
    }

    public void clickButtonReset() {
        buttonReset.click();
    }
    // @FindBy(id = "placeholder")

    public WebElement getButtonReset() {
        return buttonReset;
    }

    //public void clickButtonSearch() {
    //buttonSearch.click();
    //}

    public void clickButtonContainer() {
        buttonContainer.click();
    }

    public WebElement getButtonContainer() {
        return buttonContainer;
    }

    public WebElement getButtonSearch() {
        return buttonSearch;
    }

    public void buttonSearch() {
        buttonSearch.sendKeys("1%A9j");
    }

    public void clickThirdButtonSearch() {
        thirdButtonSearch.click();
    }

    public void clickButtonSort() {
        buttonSort.click();
    }


    public WebElement getButtonSort() {
        return buttonSort;
    }

    public void selectOption(WebElement element, String option) {
        Select optionSelect = new Select(element);
        optionSelect.selectByVisibleText(option);
    }

    /* public void FirstPart() {
         clickContainerElement();
         wait.until(ExpectedConditions.visibilityOf(getSearchInput()));
         searchInput();
         // Thread.sleep(3000);
         // checkoutPage.clickButtonFirstSearch();
         //Thread.sleep(3000);
         clickProductLink();
         //Thread.sleep(3000);
         // checkoutPage.getProductPhotoAwesomeGraniteChips();
         wait.until(ExpectedConditions.visibilityOf(getProductPhotoAwesomeGraniteChips()));
         //Thread.sleep(3000);
         clickHeartButton();
         //Thread.sleep(3000);
         wait.until(ExpectedConditions.visibilityOf(getShowHartButton()));
         //wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getShowHartButton()));
         // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("fa-layers-counter.shopping_cart_badge")));
         //Thread.sleep(3000);
         //Thread.sleep(3000);
         clickAddToCartButton();
         wait.until(ExpectedConditions.elementToBeClickable(getAddToCartMessage()));
         // Thread.sleep(3000);
         // wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getAddToCartMessage()));
         //Thread.sleep(3000);
         //checkoutPage.clickShowHartButton();
         clickShowCartIcon();
         // checkoutPage.getAddToCartMessage();
         //Thread.sleep(3000);
     }
         public void ProceedToCheckout(){
        clickButtonCheckout();
         wait.until(ExpectedConditions.elementToBeClickable(getFirstName()));
        // Thread.sleep(3000);
         enterFirstName();
         //Thread.sleep(3000);
         enterLastName();
         //Thread.sleep(3000);
         enterAddress();
         //Thread.sleep(3000);
         clickButtonContinueCheckout();
        // Thread.sleep(3000);
         clickButtonCompleteYourOrder();
         //Thread.sleep(3000);
         assertEquals("Thank you for your order!", getPageTitle().getText());
         clickContinueShopping();
         //Thread.sleep(3000);
         wait.until(ExpectedConditions.visibilityOf(getButtonSearchTheSecondTime()));

         }

         public void SecondPart() {
        buttonSearchTheSecondTime();
         // wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getButtonQuestion()));
         //Thread.sleep(3000);
         clickSecondButtonSearch();
         //Thread.sleep(3000);
         clickButtonQuestion();
         //Thread.sleep(3000);
         //wait.until(ExpectedConditions.visibilityOf(checkoutPage.getHelpContent()));
        clickHelpContent();
         //Thread.sleep(3000);
         wait.until(ExpectedConditions.elementToBeClickable(getButtonReset()));
        clickButtonCloseHelp();
         //Thread.sleep(3000);
         clickButtonReset();
         wait.until(ExpectedConditions.elementToBeClickable(getButtonContainer()));
         //Thread.sleep(5000);
         clickButtonContainer();
         //Thread.sleep(3000);
         wait.until(ExpectedConditions.visibilityOf(getButtonSearch()));
         // wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.getButtonSearch()));
         buttonSearch();
         //Thread.sleep(5000);
        clickThirdButtonSearch();
        clickButtonSort();
         //Thread.sleep(5000);
          selectOption(getButtonSort(), "Sort by name (A to Z)");
         // checkoutPage.selectOption(checkoutPage.selectButtonSort(),"Sort by name(A to Z ");
         // Thread.sleep(5000);


     } */
    public void completeMandatoryFields() {
        wait.until(ExpectedConditions.elementToBeClickable(getFirstName()));
        enterFirstName();
        enterLastName();
        enterAddress();
        selectOption(getButtonSort(), "Sort by name (Z to A)");
    }

    public void fillContinueTestingExcept(WebElement fieldToSkip) {
        /*clickContainerElement();
        searchInput();
        clickProductLink();
        clickHeartButton(); */
        clickAddToCartButton();
        clickShowCartIcon();
        clickButtonCheckout();
        wait.until(ExpectedConditions.elementToBeClickable(getFirstName()));
        completeMandatoryFields();

       /* enterFirstName();
        enterLastName();
        enterAddress(); */
        clickButtonContinueCheckout();
        clickButtonCompleteYourOrder();
        clickContinueShopping();
       /* buttonSearchTheSecondTime();
        clickSecondButtonSearch();
        clickButtonQuestion();
        clickHelpContent();
        clickButtonCloseHelp();
        clickButtonReset();
        clickButtonContainer();
        buttonSearch();
        clickThirdButtonSearch();
        selectOption(getButtonSort(), "Sort by name (Z to A)");*/
        fieldToSkip.clear();
    }


    //HomePageAwesomeSoftShirt + Reset Button
    @FindBy(css = ".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement logoProducts;

    public WebElement getLogoProducts() {
        return logoProducts;
    }

    public void clickLogoProducts() {
        logoProducts.click();
    }

    //@FindBy(css = "a.card-link[href='#/product/5']")
    @FindBy(css = ".card-link")
    private WebElement linkAwesomeSoftShirt;

    public WebElement getLinkAwesomeSoftShirt() {
        return linkAwesomeSoftShirt;
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-2x")
    //@FindBy (css = ".btn.btn-link")
    private WebElement addToCart;

    public void clickAddToCart() {
        addToCart.click();
    }

    @FindBy(css = ".fa-layers-counter.shopping_cart_badge")
    private WebElement cartBadgeImage;

    public void clickCartBadgeImage() {
        cartBadgeImage.click();
    }

    public WebElement getCartBadgeImage() {
        return cartBadgeImage;
    }

    @FindBy(css = ".svg-inline--fa.fa-undo.fa-w-16")
    private WebElement buttonReset1;

    public void clickButtonReset1() {
        buttonReset1.click();
    }

    // sort (all sort)

    @FindBy(css = ".sort-products-select.form-control.form-control-sm")
    private WebElement sort;

    public void clickSort() {
        sort.click();
    }

    public WebElement getSort1() {
        return sort;
    }

    // adda to cart 2 items from home page

   // @FindBy(css = "a.card-link[href='#/product/2']")
    @FindBy(xpath = "//a[text() = 'Incredible Concrete Hat']")
    // @FindBy(linkText = "Incredible Concrete Hat")
    private WebElement linkIncredibleConcreteHat;

    public WebElement getLinkIncredibleConcreteHat() {
        return linkIncredibleConcreteHat;
    }
   /* public void clickLinkIncredibleConcreteHat() {
        linkIncredibleConcreteHat.click();

    } */

    @FindBy(css = ".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement logoProducts1;

    public WebElement getLogoProducts1() {
        return logoProducts1;
    }

    public void clickLogoProducts1() {
        logoProducts1.click();
    }

    @FindBy(css = ".text-muted.text-center.card-footer")
    private WebElement cardFooter;

    public WebElement getCardFooter() {
        return cardFooter;
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-2x")
    private WebElement addToCartButtonIncredibleConcreteHat;

    public void clickAddToCartButtonIncredibleConcreteHat() {
        addToCartButtonIncredibleConcreteHat.click();
    }

    @FindBy(css = "a.card-link[href='#/product/8']")
    //@FindBy(linkText = "Licensed Steel Gloves")

    private WebElement linkLicensedSteelGloves;

    public WebElement getLinkLicensedSteelGloves() {
        return linkLicensedSteelGloves;
    }

    /* public void clickLinkLicensedSteelGloves() {
         linkLicensedSteelGloves.click();
     } */
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-2x")
    private WebElement addToCartButtonLicensedSteelGloves;

    public void clickAddToCartButtonLicensedSteelGloves() {
        addToCartButtonLicensedSteelGloves.click();
    }

    @FindBy(css = ".fa-layers-counter.shopping_cart_badge")
    private WebElement showCartIcon1;

    public void clickShowCartIcon1() {
        showCartIcon1.click();
    }

    @FindBy(css = ".btn.btn-success")
    private WebElement buttonCheckout1;

    public void clickButtonCheckout1() {
        buttonCheckout1.click();
    }

    @FindBy(id = "first-name")
    private WebElement fieldFirstName;

    public WebElement getFieldFirstName() {
        return fieldFirstName;
    }

    public void enterFieldFirstName() {
        fieldFirstName.sendKeys(" Ana");
    }

    @FindBy(id = "last-name")
    private WebElement fieldLastName;

    public void enterFieldLastName() {
        fieldLastName.sendKeys(" Andrei");
    }

    @FindBy(id = "address")
    // @FindBy(css = ".form_input.form-control")
    // @FindBy(id = "placeholder")
    private WebElement fieldAdress;

    public void enterFieldAdress() {
        fieldAdress.sendKeys("Bucuresti, str.Nemuririi nr.198, sector 4, cod postal 097654");
    }

    // Refined Frozen Mouse

    @FindBy(linkText = "Refined Frozen Mouse")
    private WebElement buttonAddToCartMouse;

    public void clickButtonAddToCartMouse() {
        buttonAddToCartMouse.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement shoopingButton;

    public void clickShoopingButton() {
        shoopingButton.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement iconCart;

    public WebElement getIconCart() {
        return iconCart;
    }

    public void clickIconCart() {
        iconCart.click();
    }

    @FindBy(id = "item_0_title_link")
    private WebElement titleLink;

    public WebElement getTitleLink() {
        return titleLink;
    }


    // REFINED FROZEN MOUSE

    @FindBy(linkText = "Refined Frozen Mouse")
    private WebElement buttonAddToCartMouse1;

    public void clickButtonAddToCartMouse1() {
        buttonAddToCartMouse1.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement shoopingButton1;

    public void clickShoopingButton1() {
        shoopingButton1.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement iconCart1;

    public WebElement getIconCart1() {
        return iconCart1;
    }

    public void clickIconCart1() {
        iconCart1.click();
    }

    @FindBy(css = ".btn.btn-success")
    private WebElement buttonCheckout2;

    public void clickButtonCheckout2() {
        buttonCheckout2.click();
    }

    @FindBy(id = "first-name")
    private WebElement fieldFirstName1;

    public WebElement getFieldFirstName1() {
        return fieldFirstName1;
    }

    public void enterFieldFirstName1() {
        fieldFirstName1.sendKeys(" Ana");
    }

    /*@FindBy(css = ".error")
    private WebElement firstNameError;
    public WebElement getFirstNameError() {
        return firstNameError;
    } */
    @FindBy(id = "last-name")
    private WebElement fieldLastName1;

    public void enterFieldLastName1() {
        fieldLastName1.sendKeys(" Andrei");
    }

    @FindBy(id = "address")
    // @FindBy(css = ".form_input.form-control")
    // @FindBy(id = "placeholder")
    private WebElement fieldAdress1;

    public void enterFieldAdress1() {
        fieldAdress1.sendKeys("Bucuresti, str.Nemuririi nr.198, sector 3, cod postal 097654");
    }

    @FindBy(css = ".btn.btn-success")
    private WebElement continueCheckout;

    public void clickContinueCheckout() {
        continueCheckout.click();
    }

    public void addProductToCart() {
        clickButtonAddToCartMouse1();
        clickShoopingButton1();
        wait.until(ExpectedConditions.elementToBeClickable(getIconCart1()));
        clickIconCart1();
        clickButtonCheckout2();
        //wait.until(ExpectedConditions.elementToBeClickable(getFieldFirstName1()));
    }

    public void completeMandatoryFields1() {
        wait.until(ExpectedConditions.elementToBeClickable(getFieldFirstName1()));
        enterFieldFirstName1();
        enterFieldLastName1();
        enterFieldAdress1();
    }

    public void checkoutButton() {
        clickContinueCheckout();
    }

    public void fillMandatoryFieldsExcept(WebElement fieldToSkip) {
        addProductToCart();
        completeMandatoryFields1();
        checkoutButton();
        fieldToSkip.clear();
    }

    //  Refined Frozen Mouse without FirstName

    @FindBy(linkText = "Refined Frozen Mouse")
    private WebElement buttonAddToCartMouse2;

    public void clickButtonAddToCartMouse2() {
        buttonAddToCartMouse2.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement shoopingButton2;

    public void clickShoopingButton2() {
        shoopingButton2.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement iconCart2;

    public WebElement getIconCart2() {
        return iconCart2;
    }

    public void clickIconCart2() {
        iconCart2.click();
    }

    @FindBy(css = ".btn.btn-success")
    private WebElement buttonCheckout3;

    public void clickButtonCheckout3() {
        buttonCheckout3.click();
    }

    @FindBy(id = "first-name")
    private WebElement fieldFirstName2;

    public WebElement getFieldFirstName2() {
        return fieldFirstName2;
    }

    public void enterFieldFirstName2() {
        fieldFirstName2.sendKeys(" Ana ");
    }

    @FindBy(css = ".error")
    private WebElement firstNameError;

    public WebElement getFirstNameError() {
        return firstNameError;
    }

    @FindBy(id = "last-name")
    private WebElement fieldLastName2;

    public void enterFieldLastName2() {
        fieldLastName2.sendKeys(" Andrei");
    }

    @FindBy(id = "address")
    // @FindBy(css = ".form_input.form-control")
    // @FindBy(id = "placeholder")
    private WebElement fieldAdress2;

    public void enterFieldAdress2() {
        fieldAdress2.sendKeys("Bucuresti, str.Nemuririi nr.198, sector 3, cod postal 097654");
    }

    @FindBy(css = ".btn.btn-success")
    private WebElement continueCheckout1;

    public void clickContinueCheckout1() {
        continueCheckout1.click();
    }

    //  Refined Frozen Mouse without LastName

    @FindBy(linkText = "Refined Frozen Mouse")
    private WebElement buttonAddToCartMouse3;

    public void clickButtonAddToCartMouse3() {
        buttonAddToCartMouse3.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement shoopingButton3;

    public void clickShoopingButton3() {
        shoopingButton3.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement iconCart3;

    public WebElement getIconCart3() {
        return iconCart3;
    }

    public void clickIconCart3() {
        iconCart2.click();
    }

    @FindBy(css = ".btn.btn-success")
    private WebElement buttonCheckout4;

    public void clickButtonCheckout4() {
        buttonCheckout4.click();
    }

    @FindBy(id = "first-name")
    private WebElement fieldFirstName3;

    public WebElement getFieldFirstName3() {
        return fieldFirstName3;
    }

    public void enterFieldFirstName3() {
        fieldFirstName3.sendKeys(" Ana ");
    }

    @FindBy(css = ".error")
    private WebElement firstNameError1;

    public WebElement getFirstNameError1() {
        return firstNameError1;
    }

    @FindBy(id = "last-name")
    private WebElement fieldLastName3;

    public void enterFieldLastName3() {
        fieldLastName3.sendKeys(" ");
    }

    @FindBy(id = "address")
    // @FindBy(css = ".form_input.form-control")
    // @FindBy(id = "placeholder")
    private WebElement fieldAdress3;

    public void enterFieldAdress3() {
        fieldAdress3.sendKeys("Bucuresti, str.Nemuririi nr.198, sector 3, cod postal 097654");
    }

    @FindBy(css = ".btn.btn-success")
    private WebElement continueCheckout2;

    public void clickContinueCheckout2() {
        continueCheckout2.click();
    }

    // Refined Frozen Mouse without Adress


    @FindBy(linkText = "Refined Frozen Mouse")
    private WebElement buttonAddToCartMouse4;

    public void clickButtonAddToCartMouse4() {
        buttonAddToCartMouse4.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement shoopingButton4;

    public void clickShoopingButton4() {
        shoopingButton4.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement iconCart4;

    public WebElement getIconCart4() {
        return iconCart4;
    }

    public void clickIconCart4() {
        iconCart4.click();
    }

    @FindBy(css = ".btn.btn-success")
    private WebElement buttonCheckout5;

    public void clickButtonCheckout5() {
        buttonCheckout5.click();
    }

    @FindBy(id = "first-name")
    private WebElement fieldFirstName4;

    public WebElement getFieldFirstName4() {
        return fieldFirstName4;
    }

    public void enterFieldFirstName4() {
        fieldFirstName4.sendKeys(" Ana ");
    }

    @FindBy(css = ".error")
    private WebElement firstNameError2;

    public WebElement getFirstNameError2() {
        return firstNameError2;
    }

    @FindBy(id = "last-name")
    private WebElement fieldLastName4;

    public void enterFieldLastName4() {
        fieldLastName4.sendKeys(" Andrei ");
    }

    @FindBy(id = "address")
    // @FindBy(css = ".form_input.form-control")
    // @FindBy(id = "placeholder")
    private WebElement fieldAdress4;

    public void enterFieldAdress4() {
        fieldAdress4.sendKeys("Bucuresti, str.Nemuririi nr.198, sector 3, cod postal 097654\"");
    }

    @FindBy(css = ".btn.btn-success")
    private WebElement continueCheckout3;

    public void clickContinueCheckout3() {
        continueCheckout3.click();
    }

    //  Two ASSERT PracticalWoodenBacon & Refined Frozen Mouse

    @FindBy(css = ".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement imageProducts;

    public void clickImageProducts() {
        imageProducts.click();
    }
    public WebElement getImageProducts() {
        return imageProducts;
    }

    //@FindBy(linkText = "Practical Wooden Bacon")
    @FindBy(css = "a.card-link[href='#/product/4']")
    private WebElement linkPracticalWoodenBacon;
    public void clickLinkPracticalWoodenBacon() {
        linkPracticalWoodenBacon.click();
    }
    public WebElement getLinkPracticalWoodenBacon() {
        return linkPracticalWoodenBacon;
    }
    @FindBy(css =".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartPracticalWoodenBacon;
    public void clickAddToCartPracticalWoodenBacon() {
        addToCartPracticalWoodenBacon.click();
    }
    @FindBy(css =".fa-layers-counter.shopping_cart_badge")
    private WebElement imageShoopingCartBadgePracticalWoodenBacon;

    public void clickImageShoopingCartBadgePracticalWoodenBacon() {
        imageShoopingCartBadgePracticalWoodenBacon.click();
    }
    public WebElement getImageShoopingCartBadgePracticalWoodenBacon() {
        return imageShoopingCartBadgePracticalWoodenBacon ;
    }
    @FindBy(id ="item_4_title_link")
    private WebElement imageTitleLinkPracticalWoodenBacon;
    public WebElement getImageTitleLinkPracticalWoodenBacon() {
        return  imageTitleLinkPracticalWoodenBacon;
    }
    @FindBy(css = ".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement imageProductss;

    public void clickImageProductss() {
        imageProductss.click();
    }
    public WebElement getImageProductss() {
        return imageProductss;
    }

    @FindBy(linkText = "Refined Frozen Mouse")
    private WebElement buttonAddToCartRefinedFrozenMouse;

    public void clickButtonAddToCartRefinedFrozenMouse() {
        buttonAddToCartRefinedFrozenMouse.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement shoopingButtonRefinedFrozenMouse;

    public void clickShoopingButtonRefinedFrozenMouse() {
        shoopingButtonRefinedFrozenMouse.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement iconCartRefinedFrozenMouse;

    public WebElement getIconCartRefinedFrozenMouse() {
        return iconCartRefinedFrozenMouse;
    }

    public void clickIconCartRefinedFrozenMouse() {
        iconCartRefinedFrozenMouse.click();
    }
    @FindBy(id ="item_0_title_link")
    private WebElement imageTitleLinkRefinedFrozenMouse;
    public WebElement getImageTitleLinkRefinedFrozenMouse() {
        return  imageTitleLinkRefinedFrozenMouse;
    }


    // Licensed Steel Gloves
    @FindBy (css = "a.card-link[href='#/product/8']")
    private WebElement linkLicensedSteelGloves1;
    public void clickLinkLicensedSteelGloves1() {
        linkLicensedSteelGloves1.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement shoopingCartLicensedSteelGloves1;
    public void clickShoopingCartLicensedSteelGloves1() {
        shoopingCartLicensedSteelGloves1.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement iconCartLicensedSteelGloves1;

    public WebElement getIconCartLicensedSteelGloves1() {
        return iconCartLicensedSteelGloves1;
    }

    public void clickIconCartLicensedSteelGloves1() {
        iconCartLicensedSteelGloves1.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-plus-circle.fa-w-16")
    private WebElement buttonAddItem;
    public void clickButtonAddItem() {
        buttonAddItem.click();
    }
    @FindBy(css = ".amount-total")
    private WebElement iconTotalAmount;
    public WebElement getIconTotalAmount() {
        return iconTotalAmount;
    }


    @FindBy(css = ".btn.btn-success")
    private WebElement buttonCheckoutLicensedSteelGloves1;

    public void clickButtonLicensedSteelGloves1() {
        buttonCheckoutLicensedSteelGloves1.click();
    }

    @FindBy(id = "first-name")
    private WebElement fieldFirstNameLicensedSteelGloves1;

    public WebElement getFieldFirstNameLicensedSteelGloves1() {
        return fieldFirstNameLicensedSteelGloves1;
    }

    public void enterFieldFirstNameLicensedSteelGloves1() {
        fieldFirstNameLicensedSteelGloves1.sendKeys(" Anca ");
    }

   /* @FindBy(css = ".error")
    private WebElement firstNameError2;

    public WebElement getFirstNameError2() {
        return firstNameError2;
    }  */

    @FindBy(id = "last-name")
    private WebElement fieldLastNameLicensedSteelGloves1;

    public void enterFieldLastNameLicensedSteelGloves1() {
        fieldLastNameLicensedSteelGloves1.sendKeys(" Popescu ");
    }

    @FindBy(id = "address")
    // @FindBy(css = ".form_input.form-control")
    // @FindBy(id = "placeholder")
    private WebElement fieldAdressLicensedSteelGloves1;

    public void enterFieldAdressLicensedSteelGloves1() {
        fieldAdressLicensedSteelGloves1.sendKeys(" Bucuresti, str.Nemuririi nr.178, sector 3, cod postal 097654 ");
    }

    @FindBy(css = ".btn.btn-success")
    private WebElement continueCheckout4;

    public void clickContinueCheckout4() {
        continueCheckout4.click();
    }


    // Licensed Steel Gloves2 for NEGATIVE TESTS
    @FindBy (css = "a.card-link[href='#/product/8']")
    private WebElement linkLicensedSteelGloves2;
    public void clickLinkLicensedSteelGloves2() {
        linkLicensedSteelGloves2.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement shoopingCartLicensedSteelGloves2;
    public void clickShoopingCartLicensedSteelGloves2() {
        shoopingCartLicensedSteelGloves2.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement iconCartLicensedSteelGloves2;

    public WebElement getIconCartLicensedSteelGloves2() {
        return iconCartLicensedSteelGloves2;
    }

    public void clickIconCartLicensedSteelGloves2() {
        iconCartLicensedSteelGloves2.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-plus-circle.fa-w-16")
    private WebElement buttonAddItem1;
    public void clickButtonAddItem1() {
        buttonAddItem1.click();
    }
    @FindBy(css = ".btn.btn-success")
    private WebElement buttonCheckoutLicensedSteelGloves2;

    public void clickButtonLicensedSteelGloves2() {
        buttonCheckoutLicensedSteelGloves2.click();
    }

    @FindBy(id = "first-name")
    private WebElement fieldFirstNameLicensedSteelGloves2;

    public WebElement getFieldFirstNameLicensedSteelGloves2() {
        return fieldFirstNameLicensedSteelGloves2;
    }

    public void enterFieldFirstNameLicensedSteelGloves2() {
        fieldFirstNameLicensedSteelGloves2.sendKeys(" Anca ");
    }

    @FindBy(css = ".error")
    private WebElement firstNameErrorLicensedSteelGloves;

    public WebElement getFirstNameErrorLicensedSteelGloves() {
        return firstNameErrorLicensedSteelGloves;
    }

    @FindBy(id = "last-name")
    private WebElement fieldLastNameLicensedSteelGloves2;

    public WebElement getFieldLastNameLicensedSteelGloves2() {
        return fieldLastNameLicensedSteelGloves2;
    }
    public void enterFieldLastNameLicensedSteelGloves2() {
        fieldLastNameLicensedSteelGloves2.sendKeys(" Popescu ");
    }
    @FindBy(css = ".error")
    private WebElement lastNameErrorLicensedSteelGloves;

    public WebElement getLastNameErrorLicensedSteelGloves() {
        return lastNameErrorLicensedSteelGloves;
    }

    @FindBy(id = "address")
    // @FindBy(css = ".form_input.form-control")
    // @FindBy(id = "placeholder")
    private WebElement fieldAddressLicensedSteelGloves2;

    public WebElement getFieldAddressNameLicensedSteelGloves2() {
        return fieldAddressLicensedSteelGloves2;
    }
    public void enterFieldAddressLicensedSteelGloves2() {
        fieldAddressLicensedSteelGloves2.sendKeys(" Bucuresti, str.Nemuririi nr.178, sector 3, cod postal 097654 ");
    }
    @FindBy(css = ".error")
    private WebElement addressErrorLicensedSteelGloves;
    public WebElement getAddressErrorLicensedSteelGloves() {
        return addressErrorLicensedSteelGloves;
    }

    @FindBy(css = ".btn.btn-success")
    private WebElement continueCheckout5;

    public void clickContinueCheckout5() {
        continueCheckout5.click();
    }




    public void addProductToCartLicensedSteelGloves() {
        clickLinkLicensedSteelGloves2();
        clickShoopingCartLicensedSteelGloves2();
        wait.until(ExpectedConditions.elementToBeClickable(getIconCartLicensedSteelGloves2()));
        clickIconCartLicensedSteelGloves2();
        clickButtonAddItem1();
        clickButtonLicensedSteelGloves2();
    }

    public void completeMandatoryFieldsLicensedSteelGloves() {
        wait.until(ExpectedConditions.elementToBeClickable(getFieldFirstNameLicensedSteelGloves2()));
        enterFieldFirstNameLicensedSteelGloves2();
        enterFieldLastNameLicensedSteelGloves2();
        enterFieldAddressLicensedSteelGloves2();
    }
    public void continueCheckoutLicensedSteelGloves() {
        clickContinueCheckout5();
    }

    public void fillMandatoryFieldsExceptLicensedSteelGloves(WebElement fieldToSkip) {
        addProductToCartLicensedSteelGloves();
        completeMandatoryFieldsLicensedSteelGloves();
        continueCheckoutLicensedSteelGloves();
        fieldToSkip.clear();
    }

   // @FindBy(xpath = "//a[@class='.btn.btn-link' and contains(@href, '#/product/6') and text()='Practical Wooden Bacon']")
   @FindBy(xpath = "//div[@class='container']//div[@class='row']/div[9]//svg[@class='svg-inline--fa fa-cart-plus fa-w-18 fa-2x']")
   private WebElement buttonPracticalWoodenBacon;

    public void clickButtonPracticalWoodenBacon() {
        buttonPracticalWoodenBacon.click();
    }



    // All items added in basket card

    @FindBy(css = ".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement imageContainer;
    public void clickImageContainer() {
        imageContainer.click();
    }
    public WebElement getImageContainer() {
        return imageContainer;
    }
    @FindBy(css = "a.card-link[href='#/product/1']")
    private WebElement firstLink;

    public void clickFirstLink() {
        firstLink.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartFirstLink;
    public void clickAddToCartFirstLink() {
        addToCartFirstLink.click();
    }
    @FindBy(css = "a.card-link[href='#/product/3']")
    private WebElement secondLink;
    public void clickSecondLink() {
        secondLink.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartSecondLink;
    public void clickAddToCartSecondLink() {
       addToCartSecondLink.click();
    }

    @FindBy(css = "a.card-link[href='#/product/5']")
    private WebElement thirdLink;
    public void clickThirdLink() {
        thirdLink.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartThirdLink;
    public void clickAddToCartThirdLink() {
        addToCartThirdLink.click();
    }

    @FindBy(css = "a.card-link[href='#/product/9']")
    private WebElement fourthLink;
    public void clickFourthLink() {
        fourthLink.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartFourthlink;
    public void clickAddToCartFourthLink() {
        addToCartFourthlink.click();
    }

    @FindBy(css = "a.card-link[href='#/product/2']")
    private WebElement fifthLink;

    public void clickFifthLink() {
        fifthLink.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartFifthLink;
    public void clickAddToCartFifthLink() {
        addToCartFifthLink.click();
    }
    @FindBy(css = "a.card-link[href='#/product/8']")
    private WebElement sixthLink;

    public void clickSixthLink() {
        sixthLink.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartSixthLink;
    public void clickAddToCartSixthLink() {
        addToCartSixthLink.click();
    }

    @FindBy(css = "a.card-link[href='#/product/7']")
    private WebElement seventhLink;

    public void clickSeventhLink() {
        seventhLink.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartSeventhLink;
    public void clickAddToCartSeventhLink() {
        addToCartSeventhLink.click();
    }

    @FindBy(css = "a.card-link[href='#/product/4']")
    private WebElement eighthLink;

    public void clickEighthLink() {
        eighthLink.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartEighthLink;
    public void clickAddToCartEighthLink() {
        addToCartEighthLink.click();
    }

    @FindBy(css = "a.card-link[href='#/product/6']")
    private WebElement ninthLink;

    public void clickNinthLink() {
        ninthLink.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartNinthLink;
    public void clickAddToCartNinthLink() {
        addToCartNinthLink.click();
    }

    @FindBy(css = "a.card-link[href='#/product/0']")
    private WebElement tenthLink;

    public void clickTenthLink() {
        tenthLink.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartTenthLink;
    public void clickAddToCartTenthLink() {
        addToCartTenthLink.click();
    }
    @FindBy(css = ".fa-layers-counter.shopping_cart_badge")
    private WebElement shoppingCartTotal;

    public WebElement getShoppingCartTotal() {
        return shoppingCartTotal;
    }

    public void clickShoppingCartTotal() {
        shoppingCartTotal.click();
    }


    // AddAllTheProductsInTheBasketCheckout

    @FindBy(css = ".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement imageContainer1;
    public void clickImageContainer1() {
        imageContainer1.click();
    }
    public WebElement getImageContainer1() {
        return imageContainer1;
    }
    @FindBy(css = "a.card-link[href='#/product/1']")
    private WebElement firstLink1;

    public void clickFirstLink1() {
        firstLink.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartFirstLink1;
    public void clickAddToCartFirstLink1() {
        addToCartFirstLink1.click();
    }
    @FindBy(css = "a.card-link[href='#/product/3']")
    private WebElement secondLink1;
    public void clickSecondLink1() {
        secondLink1.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartSecondLink1;
    public void clickAddToCartSecondLink1() {
        addToCartSecondLink1.click();
    }

    @FindBy(css = "a.card-link[href='#/product/5']")
    private WebElement thirdLink1;
    public void clickThirdLink1() {
        thirdLink1.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartThirdLink1;
    public void clickAddToCartThirdLink1() {
        addToCartThirdLink1.click();
    }

    @FindBy(css = "a.card-link[href='#/product/9']")
    private WebElement fourthLink1;
    public void clickFourthLink1() {
        fourthLink1.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartFourthlink1;
    public void clickAddToCartFourthLink1() {
        addToCartFourthlink1.click();
    }

    @FindBy(css = "a.card-link[href='#/product/2']")
    private WebElement fifthLink1;

    public void clickFifthLink1() {
        fifthLink1.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartFifthLink1;
    public void clickAddToCartFifthLink1() {
        addToCartFifthLink1.click();
    }
    @FindBy(css = "a.card-link[href='#/product/8']")
    private WebElement sixthLink1;

    public void clickSixthLink1() {
        sixthLink1.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartSixthLink1;
    public void clickAddToCartSixthLink1() {
        addToCartSixthLink1.click();
    }

    @FindBy(css = "a.card-link[href='#/product/7']")
    private WebElement seventhLink1;

    public void clickSeventhLink1() {
        seventhLink1.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartSeventhLink1;
    public void clickAddToCartSeventhLink1() {
        addToCartSeventhLink1.click();
    }

    @FindBy(css = "a.card-link[href='#/product/4']")
    private WebElement eighthLink1;

    public void clickEighthLink1() {
        eighthLink1.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartEighthLink1;
    public void clickAddToCartEighthLink1() {
        addToCartEighthLink1.click();
    }

    @FindBy(css = "a.card-link[href='#/product/6']")
    private WebElement ninthLink1;

    public void clickNinthLink1() {
        ninthLink1.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartNinthLink1;
    public void clickAddToCartNinthLink1() {
        addToCartNinthLink1.click();
    }

    @FindBy(css = "a.card-link[href='#/product/0']")
    private WebElement tenthLink1;

    public void clickTenthLink1() {
        tenthLink1.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartTenthLink1;
    public void clickAddToCartTenthLink1() {
        addToCartTenthLink1.click();
    }
    @FindBy(css = ".fa-layers-counter.shopping_cart_badge")
    private WebElement shoppingCartTotal1;

    public WebElement getShoppingCartTotal1() {
        return shoppingCartTotal1;
    }

    public void clickShoppingCartTotal1() {
        shoppingCartTotal1.click();
    }

    @FindBy(css = ".btn.btn-success")
    private WebElement buttonCheckoutTotal;
    public void clickButtonCheckoutTotal() {
        buttonCheckoutTotal.click();
    }
    @FindBy(id = "first-name")
    private WebElement fieldFirstNameCheckoutTotal;

    public WebElement getFieldFirstNameCheckoutTotal() {
        return fieldFirstNameCheckoutTotal;
    }

    public void enterFieldFirstNameCheckoutTotal() {
        fieldFirstNameCheckoutTotal.sendKeys(" Veronica ");
    }

   /* @FindBy(css = ".error")
    private WebElement firstNameErrorCheckoutTotal;

    public WebElement getFirstNameErrorCheckoutTotal() {
        return firstNameErrorCheckoutTotal;
    } */

    @FindBy(id = "last-name")
    private WebElement fieldLastNameCheckoutTotal;

    public WebElement getFieldLastNameCheckoutTotal() {
        return fieldLastNameCheckoutTotal;
    }
    public void enterFieldLastNameCheckoutTotal() {
        fieldLastNameCheckoutTotal.sendKeys(" Popescu ");
    }
   /* @FindBy(css = ".error")
    private WebElement lastNameErrorCheckoutTotal;
    public WebElement getLastNameErrorCheckoutTotal() {
        return lastNameErrorCheckoutTotal;
    } */

    @FindBy(id = "address")
    // @FindBy(css = ".form_input.form-control")
    // @FindBy(id = "placeholder")
    private WebElement fieldAddressCheckoutTotal;

    public WebElement getFieldAddressCheckoutTotal() {
        return fieldAddressCheckoutTotal;
    }
    public void enterFieldAddressCheckoutTotal() {
        fieldAddressCheckoutTotal.sendKeys(" Bucuresti, str.Nemuririi nr.178, sector 3, cod postal 097654 ");
    }
  /*  @FindBy(css = ".error")
    private WebElement addressErrorCheckoutTotal;
    public WebElement getAddressErrorCheckoutTotal() {
        return addressErrorCheckoutTotal;
    } */

   // @FindBy(css = ".btn.btn-success")
    @FindBy(css = ".svg-inline--fa.fa-angle-right.fa-w-8")
    private WebElement continueCheckoutTotal;

    public void clickContinueCheckoutTotal() {
        continueCheckoutTotal.click();
    }
    @FindBy(css =".btn.btn-success")
    private WebElement fieldCompleteYourOrder;

    public void clickFieldCompleteYourOrder() {
        fieldCompleteYourOrder.click();
    }


    // delete an item from AddAllTheProductsInTheBasket,respective LicensedSteelGloves

    @FindBy(css = ".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement imageContainer2;
    public void clickImageContainer2() {
        imageContainer2.click();
    }
    public WebElement getImageContainer2() {
        return imageContainer2;
    }
    @FindBy(css = "a.card-link[href='#/product/1']")
    private WebElement firstLink2;

    public void clickFirstLink2() {
        firstLink2.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartFirstLink2;
    public void clickAddToCartFirstLink2() {
        addToCartFirstLink2.click();
    }
    @FindBy(css = "a.card-link[href='#/product/3']")
    private WebElement secondLink2;
    public void clickSecondLink2() {
        secondLink2.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartSecondLink2;
    public void clickAddToCartSecondLink2() {
        addToCartSecondLink2.click();
    }

    @FindBy(css = "a.card-link[href='#/product/5']")
    private WebElement thirdLink2;
    public void clickThirdLink2() {
        thirdLink2.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartThirdLink2;
    public void clickAddToCartThirdLink2() {
        addToCartThirdLink2.click();
    }

    @FindBy(css = "a.card-link[href='#/product/9']")
    private WebElement fourthLink2;
    public void clickFourthLink2() {
        fourthLink2.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartFourthlink2;
    public void clickAddToCartFourthLink2() {
        addToCartFourthlink2.click();
    }

    @FindBy(css = "a.card-link[href='#/product/2']")
    private WebElement fifthLink2;

    public void clickFifthLink2() {
        fifthLink2.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartFifthLink2;
    public void clickAddToCartFifthLink2() {
        addToCartFifthLink2.click();
    }
    @FindBy(css = "a.card-link[href='#/product/8']")
    private WebElement sixthLink2;

    public void clickSixthLink2() {
        sixthLink2.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartSixthLink2;
    public void clickAddToCartSixthLink2() {
        addToCartSixthLink2.click();
    }

    @FindBy(css = "a.card-link[href='#/product/7']")
    private WebElement seventhLink2;

    public void clickSeventhLink2() {
        seventhLink2.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartSeventhLink2;
    public void clickAddToCartSeventhLink2() {
        addToCartSeventhLink2.click();
    }

    @FindBy(css = "a.card-link[href='#/product/4']")
    private WebElement eighthLink2;

    public void clickEighthLink2() {
        eighthLink2.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartEighthLink2;
    public void clickAddToCartEighthLink2() {
        addToCartEighthLink2.click();
    }

    @FindBy(css = "a.card-link[href='#/product/6']")
    private WebElement ninthLink2;

    public void clickNinthLink2() {
        ninthLink2.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartNinthLink2;
    public void clickAddToCartNinthLink2() {
        addToCartNinthLink2.click();
    }

    @FindBy(css = "a.card-link[href='#/product/0']")
    private WebElement tenthLink2;

    public void clickTenthLink2() {
        tenthLink2.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addToCartTenthLink2;
    public void clickAddToCartTenthLink2() {
        addToCartTenthLink2.click();
    }
    @FindBy(css = ".fa-layers-counter.shopping_cart_badge")
    private WebElement shoppingCartTotal2;

    public WebElement getShoppingCartTotal2() {
        return shoppingCartTotal2;
    }

    public void clickShoppingCartTotal2() {
        shoppingCartTotal2.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-trash.fa-w-14")
   // @FindBy(css = ".col-md-auto")
    //@FindBy(css = ".btn.btn-link")
    private WebElement buttonTrashLicensedSteelGloves;

    public WebElement getButtonTrashLicensedSteelGloves() {
        return buttonTrashLicensedSteelGloves;
    }
    public void clickButtonTrashLicensedSteelGloves() {
        buttonTrashLicensedSteelGloves.click();
    }
    @FindBy(css = ".btn.btn-success")
    private WebElement checkoutTotal1;

    public void clickCheckoutTotal1() {
        checkoutTotal1.click();
    }

    @FindBy(css = ".sort-products-select.form-control.form-control-sm")
    private WebElement sortButton;
    public WebElement getSortButton() {
        return sortButton;
    }
    public void clickSortButton() {
        sortButton.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-2x")
    private WebElement cartIconBacon;

    public void clickCartIconBacon() {
        cartIconBacon.click();
    }
    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement shoppingCartBacon;

    public void clickShoppingCartBacon() {
        shoppingCartBacon.click();
    }
    public WebElement getShoppingCartBacon() {
        return shoppingCartBacon;
    }
    @FindBy(css =".svg-inline--fa.fa-shopping-bag.fa-w-14.fa-3x.brand-logo")
    private WebElement containerLogo;

    public void clickContainerLogo() {
        containerLogo.click();
    }
    public WebElement getContainerLogo() {
        return containerLogo;
    }
    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-2x")
    private WebElement awesomeGranitChipsFromHomePage;
    public void clickAwesomeGranitChipsFromHomePage() {
        awesomeGranitChipsFromHomePage.click();

    }
    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement shoppingCart;

    public void clickShoppingCart() {
        shoppingCart.click();
    }
    public WebElement getShoppingCart() {
        return shoppingCart;
    }
    @FindBy(css = ".svg-inline--fa.fa-minus-circle.fa-w-16")
    private WebElement buttonMinus;
    public void clickButtonMinus() {
        buttonMinus.click();
    }

    @FindBy(linkText = "Awesome Granite Chips")
    private WebElement addProductGraniteChipsToCartLink;

    public void clickAddProductGraniteChipsToCartLink() {
        addProductGraniteChipsToCartLink.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-cart-plus.fa-w-18.fa-3x")
    private WebElement addProductGraniteChipsToCartButton;

    public void clickAddProductGraniteChipsToCartButton() {
        addProductGraniteChipsToCartButton.click();
    }

    @FindBy(css = ".svg-inline--fa.fa-shopping-cart.fa-w-18")
    private WebElement cartButton;

    public void clickCartButton() {
        cartButton.click();
}
   //@FindBy(xpath = "(//td[@class='amount'])[1]")

   /* private  WebElement itemPrice;
    public double productPrice() {
        String amountValue = itemPrice.getText();// $15.99
        String cleanAmountValue = amountValue.replace("$","");
        double amountValueDouble = Double.parseDouble(cleanAmountValue);
        return Double.parseDouble(cleanAmountValue);
    }
*/
    @FindBy(css =".svg-inline--fa.fa-plus-circle.fa-w-16")
    private WebElement plusQuantity;
    public void clickPlusQuantity() {
        plusQuantity.click();
    }
   @FindBy(xpath = "(//td[@class='amount'])[1]")
   // @FindBy(css =".td.amount:first-of-type")
   //@FindBy(xpath = "//td[@class='amount']")
  // @FindBy (xpath = "//tr[@class='amount-total']")
  // @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[2]")

   private WebElement itemPrice;

    @FindBy(xpath = "(//td[@class='amount'])[2]")
    private WebElement taxPrice;

    @FindBy(xpath = "(//td[@class='amount'])[3]")
    private WebElement totalPrice;

    public double productPrice() {
        String amountValue = itemPrice.getText(); // $15.99
        String cleanAmountValue = amountValue.replace("$", "");
        return Double.parseDouble(cleanAmountValue);
}

    public double taxPrice() {
        String taxValue = taxPrice.getText(); // $15.99
        String cleanTaxValue = taxValue.replace("$", "");
        return Double.parseDouble(cleanTaxValue);
    }

    public double totalPrice() {
        String totalValue = totalPrice.getText(); // $15.99
        String cleanTotalValue = totalValue.replace("$", "");
        return Double.parseDouble(cleanTotalValue);
    }




































































//place for locators and methods

}
