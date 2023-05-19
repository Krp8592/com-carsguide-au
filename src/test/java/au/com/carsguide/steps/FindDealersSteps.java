package au.com.carsguide.steps;

import au.com.carsguide.pages.FindDealersPage;
import au.com.carsguide.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class FindDealersSteps {
    @And("^I click Find a Dealer$")
    public void iClickFindADealer() throws InterruptedException {
        new HomePage().mouseHoverAndClickOnFindDealer();
    }

    @Then("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String expTxt) {
        Assert.assertEquals(new FindDealersPage().getFindDealersText(), expTxt);
    }


    @And("^I should see the dealer names <dealersName> are display on page$")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(DataTable dataTable) throws InterruptedException {
        new FindDealersPage().getDealersTextDisplayed(dataTable);
    }
}
