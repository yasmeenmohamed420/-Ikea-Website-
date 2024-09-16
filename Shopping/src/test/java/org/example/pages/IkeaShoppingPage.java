package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class IkeaShoppingPage
{
 // public List<WebElement> hotelNames;
 public IkeaShoppingPage()
 {
  PageFactory.initElements(Hooks.driver,this);
 }

    //Locator
    @FindBy(xpath = "//div[@class=\"hnf-header__container hnf-page-container__main\"]/ul/li[3]/a[@class=\"hnf-btn hnf-btn--small hnf-leading-icon hnf-btn--tertiary hnf-header__profile-link__default\"]")
    public WebElement singUpLink;

    @FindBy(xpath = "//div[@class=\"menuModalBodyContainer\"]/div/form/button[2]")
    public WebElement signUp;

    @FindBy(xpath = "//input[@id=\"first-name\"]")
    public WebElement FirstName;

    @FindBy(xpath = "//input[@id=\"last-name\"]")
    public WebElement LastName;

    @FindBy(xpath = "//input[@id=\"email\"]")
    public WebElement email;

    @FindBy(xpath = "//input[@id=\"password\"]")
    public WebElement pass;

    @FindBy(xpath = "//label[@for=\"privacy-policy-checkbox\"]")
    public WebElement condition;

    @FindBy(xpath = "class=\"pp-skapa__btn pp-skapa__btn--primary pp-skapa__btn--fluid sign-up-content-right_createAccount__Jwuq1\"")
    public WebElement createAccount;

    @FindBy(xpath = "//button[@class=\"hnf-tabs__tab hnf-tabs__tab--active\"]")
    public WebElement offarButton;

    @FindBy(xpath = "//img[@src=\"https://www.ikea.com/global/assets/logos/brand/ikea.svg\"]")
    public WebElement Logo;

    @FindBy(xpath = "//img[@src=\"https://www.ikea.com/images/ef/2b/ef2b11286d961c09e48cbd1316799891.jpg?f=s\"]")
    public WebElement newlowerPrice;

    @FindBy(xpath = "//img[@src=\"https://www.ikea.com/ext/ingkadam/m/76d735ccbe19129/original/PH194108.jpg?f=s\"]")
    public WebElement sofa;

    @FindBy(xpath = "//div[@class=\"plp-filter-bar__options\"]/button[class=\"plp-pill plp-pill--small plp-trailing-icon\"]")
    public WebElement sort;

    @FindBy(xpath = "//div[@class=\"plp-drop-down\"]/fieldset/label[3]/span[1]")
    public WebElement highToLow;

    @FindBy(xpath = "//div[@class=\"plp-product-list__products \"]/div/div/div[4]/div/button[1]")
    public List<WebElement>addProduct;

   @FindBy(xpath = "//div[@class=\"CartList_cartList__pA6bB\"]/div/div/div/div/div[1]/div[1]/div[2]/span[1]")
   public List<WebElement>nameProduct;

   @FindBy(xpath = "//div[@class=\"CartList_cartList__pA6bB\"]/div/div/div/div/div[1]/div[2]/div/span")
   public List<WebElement>priceProduct;

   @FindBy(xpath="//span[@class=\"pip-header-section__title--big notranslate\"]")
   public WebElement productNameDetalis;

    @FindBy(xpath="//div[@class=\"pip-temp-price-module__primary-currency-price\"]/span/span[1]")
    public WebElement productPriceDetalis;

    @FindBy(xpath="//div[@class=\"Summary_receipt__d7Qzo\"]/div[2]/span[2]/span/span/span[2]")
    public WebElement totalPrice;

    @FindBy(xpath="//div[@class=\"CartList_cartList__pA6bB\"]/div[2]/div/div/div/div[2]/button[2]")
    public WebElement moveSecondFavorite;

    @FindBy(xpath="//div[@class=\"CartList_cartList__pA6bB\"]/div[3]/div/div/div/div[2]/button[1]")
    public WebElement removeThirdProduct;

    @FindBy(xpath = "//button[@class=\"skapa-wrapper-prefix-btn skapa-wrapper-prefix-btn--emphasised skapa-wrapper-prefix-btn--fluid  skapa-wrapper-prefix-noOutline\"]")
    public WebElement checkOut;

    @FindBy(xpath = "div[class=\"col-md-offset-3 col-md-6 col-xs-12\"]")
    public WebElement fullName;

    @FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]/div[7]/input[1]")
    public WebElement emailAddress;

    @FindBy(xpath = "//input[@class=\"form-control input-lg-4 directionLTR\"]")
    public WebElement phoneNumber;

    @FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]/div[10]/input[1]")
    public WebElement address;

    @FindBy(xpath = "//input[@placeholder=\"Building Name/Apartment No./Floors No.\"]")
    public WebElement buildingName;

    @FindBy(xpath = "//select[@id='NewAddress_AreaId']")
    public WebElement Governorate;

    @FindBy(xpath = "//select[@id=NewAddress_CityAreaId\"]")
    public WebElement Aria;

    @FindBy(xpath = "//button[@id=\"billingSubmitButton\"]")
    public WebElement countinue1;

    @FindBy(xpath = "//button[@id=\"billingSubmitButton\"]")
    public WebElement countinue2;

}
