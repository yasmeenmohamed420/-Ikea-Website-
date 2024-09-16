package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.IkeaShoppingPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.Random;

import static org.example.stepDefs.Hooks.driver;

public class IkeaShoppingTest
{
    IkeaShoppingPage page = new IkeaShoppingPage();
    int totalPrice;

    @Given("Open the Ikea website")
    public void openWebsite()
    {
        SoftAssert soft = new SoftAssert();
        System.out.println("website opend");
        soft.assertEquals(driver.getCurrentUrl(), "https://www.ikea.com/eg/en/");
        soft.assertAll();
    }

    @When("sign up to the website")
    public void signUpToTheWebsite() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        Faker fake = new Faker();
        page.singUpLink.click();
        page.signUp.click();
        page.FirstName.sendKeys(fake.name().firstName());
        page.LastName.sendKeys(fake.name().lastName());
        page.email.sendKeys(fake.internet().safeEmailAddress());
        page.pass.sendKeys(fake.internet().password(8,20,true,true,true));
        soft.assertTrue(page.FirstName.getAttribute("value").length() > 0, "First name is not entered");
        soft.assertTrue(page.LastName.getAttribute("value").length() > 0, "Last name is not entered");
        soft.assertTrue(page.email.getAttribute("value").contains("@"), "Email is invalid");
        soft.assertTrue(page.pass.getAttribute("value").length() >= 8 , "Password is too short");
//        page.condition.click();
        Thread.sleep(10000);
//        page.createAccount.click();

        soft.assertAll();
    }

    @Then("Scroll down to Trending categories at New lower price")
    public void scrollDownTo()
    {
        SoftAssert soft = new SoftAssert();
        page.Logo.click();
        soft.assertTrue(page.Logo.isDisplayed(), "Logo is not displayed");
        page.newlowerPrice.click();
        //soft.assertTrue(page.newlowerPrice.isDisplayed(), "New lower price category is not displayed");
        soft.assertAll();
    }

    @And("click on Sofas")
    public void clickOn()
    {
        SoftAssert soft = new SoftAssert();
        page.sofa.click();
        soft.assertTrue(page.sofa.isDisplayed(), "Sofas category is not displayed");
        soft.assertAll();
    }

    @And("Sort products from high to low")
    public void sortProductsFrom() throws InterruptedException
    {
        SoftAssert soft = new SoftAssert();
//        page.sort.click();
        Thread.sleep(5000);
        page.highToLow.click();
        soft.assertAll();
    }

    @And("Add three random products to the cart")
    public void addRandomProductsToTheCart()
    {
        SoftAssert soft = new SoftAssert();
        int flag=0;
        while (flag<3)
        {
            Random random = new Random();
            int randomIndex = random.nextInt(24);
            WebElement randomProduct = page.addProduct.get(randomIndex);
            randomProduct.click();
            flag++;
        }
        soft.assertAll();
    }

    @Then("Compare every product in the cart with product details")
    public void compareEveryProductInTheCartWithProductDetails()
    {
        SoftAssert soft = new SoftAssert();
        for(int i=0 ;i<3 ;i++)
        {
            soft.assertEquals(page.nameProduct.get(i).getText(),page.productNameDetalis.getText());
            soft.assertEquals(page.priceProduct.get(i).getText(),page.productPriceDetalis.getText());
            totalPrice = Integer.parseInt(page.priceProduct.get(i).getText());
        }
        soft.assertAll();
    }

    @And("Check total price in the cart is calculated correctly")
    public void checkTotalPriceInTheCartIsCalculatedCorrectly()
    {
        SoftAssert soft = new SoftAssert();
        int price = Integer.parseInt(page.totalPrice.getText());
        soft.assertEquals(price,totalPrice);
        soft.assertAll();
    }

    @When("Move the second product in the cart to favourites")
    public void moveTheSecondProductInTheCartToFavourites()
    {
        page.moveSecondFavorite.click();
    }

    @And("Remove the third product from the cart")
    public void removeTheThirdProductFromTheCart()
    {
        page.removeThirdProduct.click();
    }

    @Then("proceed to checkout with fake data until I reach Review and Pay")
    public void proceedToCheckoutWithFakeDataUntilIReachReviewAndPay()
    {
        SoftAssert soft = new SoftAssert();
        page.checkOut.click();
        Faker fake = new Faker();
        page.fullName.sendKeys(fake.name().fullName());
        Select Governorate = new Select(page.Governorate);
        Governorate.selectByVisibleText("Giza");
        Select Aria = new Select (page.Aria);
        Aria.selectByVisibleText("Giza");
        page.emailAddress.sendKeys(fake.internet().safeEmailAddress());
        page.phoneNumber.sendKeys(fake.phoneNumber().phoneNumber());
        page.address.sendKeys(fake.address().fullAddress());
        page.buildingName.sendKeys(fake.address().buildingNumber());
        page.countinue1.click();
        page.countinue2.click();
        soft.assertAll();
    }

}
