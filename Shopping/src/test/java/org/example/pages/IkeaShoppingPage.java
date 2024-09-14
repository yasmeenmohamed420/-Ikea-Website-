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

//    @FindBy(xpath = "//label[@for=\"privacy-policy-checkbox\"]")
//    public WebElement condition;

//    @FindBy(xpath = "class=\"pp-skapa__btn pp-skapa__btn--primary pp-skapa__btn--fluid sign-up-content-right_createAccount__Jwuq1\"")
//    public WebElement createAccount;

    @FindBy(xpath = "//button[@class=\"hnf-tabs__tab hnf-tabs__tab--active\"]")
    public WebElement offarButton;

    @FindBy(xpath = "//img[@src=\"https://www.ikea.com/global/assets/logos/brand/ikea.svg\"]")
    public WebElement Logo;

    @FindBy(xpath = "//img[@src=\"https://www.ikea.com/images/ef/2b/ef2b11286d961c09e48cbd1316799891.jpg?f=s\"]")
    public WebElement newlowerPrice;

    @FindBy(xpath = "//img[@src=\"https://www.ikea.com/ext/ingkadam/m/76d735ccbe19129/original/PH194108.jpg?f=s\"]")
    public WebElement sofa;

    @FindBy(xpath = "//div[@class=\"plp-filter-bar__options\"]/button[1]/span")
    public WebElement sort;

    @FindBy(xpath = "//div[@class=\"plp-drop-down\"]/fieldset/label[3]/span[1]")
    public WebElement highToLow;

}
