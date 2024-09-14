package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.IkeaShoppingPage;
import org.openqa.selenium.devtools.v85.page.Page;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class IkeaShoppingTest
{
    IkeaShoppingPage page = new IkeaShoppingPage();

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
    public void sortProductsFrom() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
//        page.sort.click();
        Thread.sleep(3000);
        page.highToLow.click();
        soft.assertAll();
    }

    @And("Add three random products to the cart")
    public void addRandomProductsToTheCart()
    {

    }

    @Then("Compare every product in the cart with product details")
    public void compareEveryProductInTheCartWithProductDetails()
    {

    }

    @And("Check total price in the cart is calculated correctly")
    public void checkTotalPriceInTheCartIsCalculatedCorrectly()
    {

    }

    @When("Move the second product in the cart to favourites")
    public void moveTheSecondProductInTheCartToFavourites()
    {

    }

    @And("Remove the third product from the cart")
    public void removeTheThirdProductFromTheCart()
    {

    }

    @Then("proceed to checkout with fake data until I reach Review and Pay")
    public void proceedToCheckoutWithFakeDataUntilIReachReviewAndPay()
    {

    }
}
