Feature: Ikea Website Shopping Automation
  @happy
  Scenario: Sign up and shop on Ikea's website
    Given Open the Ikea website
    When sign up to the website
    Then Scroll down to Trending categories at New lower price
    And click on Sofas
    And Sort products from high to low
    And Add three random products to the cart
    Then Compare every product in the cart with product details
    And Check total price in the cart is calculated correctly
    When Move the second product in the cart to favourites
    And Remove the third product from the cart
    Then proceed to checkout with fake data until I reach Review and Pay
