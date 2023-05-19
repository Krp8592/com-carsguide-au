package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarSearchPage;
import au.com.carsguide.pages.ResultPage;
import au.com.carsguide.pages.UsedCarsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BuysSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() throws InterruptedException {
        Thread.sleep(2000);
    }

    @When("^I mouse hover on buy\\+sell tab$")
    public void iMouseHoverOnBuySellTab() throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().mouseHoverOnBuySearchTab();
    }

    @And("^I click search cars link$")
    public void iClickSearchCarsLink() throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().mouseHoverAndClickOnSearchCars();
    }

    @Then("^I verify navigation to \"([^\"]*)\" page$")
    public void iVerifyNavigationToPage(String expectedText) {
        Assert.assertEquals(new NewAndUsedCarSearchPage().getNewAndUsedCarSearchTextElement(), expectedText);
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make)  {
        new NewAndUsedCarSearchPage().selectMake(make);
    }


    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCarLink();
    }

    @Then("^I verify the navigation on result page \"([^\"]*)\"$")
    public void iVerifyTheNavigationOnResultPage(String expectedText)  {
        Assert.assertTrue(new ResultPage().resultsText(expectedText), "Expected car make is not displayed.");
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model)  {
        new NewAndUsedCarSearchPage().selectModel(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location)  {
        new NewAndUsedCarSearchPage().selectLocation(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price)  {
        new NewAndUsedCarSearchPage().selectPrice(price);
    }


    @And("^I click Used link$")
    public void iClickUsedLink() throws InterruptedException {
        new HomePage().mouseHoverAndClickOnUserCars();
    }

    @Then("^I navigate to the used car page \"([^\"]*)\" page$")
    public void iNavigateToTheUsedCarPagePage(String expText) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(expText, new UsedCarsPage().getUsedCarForSaleTextElement());
    }

    @And("^I select make on used car page \"([^\"]*)\"$")
    public void iSelectMakeOnUsedCarPage(String make)  {
        new UsedCarsPage().selectMake(make);
    }

    @And("^I select model on used car page \"([^\"]*)\"$")
    public void iSelectModelOnUsedCarPage(String model) throws InterruptedException {
        new UsedCarsPage().selectModel(model);
    }

    @And("^I select location on used car page \"([^\"]*)\"$")
    public void iSelectLocationOnUsedCarPage(String location)  {
        new UsedCarsPage().selectLocation(location);
    }

    @And("^I select price on used car page \"([^\"]*)\"$")
    public void iSelectPriceOnUsedCarPage(String price)  {
        new UsedCarsPage().selectPrice(price);
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String expText)  {
        Assert.assertTrue(new ResultPage().resultsText(expText), "Care make text is not displayed");
    }
}
