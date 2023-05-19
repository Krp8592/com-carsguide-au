package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import cucumber.api.DataTable;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class FindDealersPage extends Utility {

    private static final Logger log = LogManager.getLogger(FindDealersPage.class.getName());
    public FindDealersPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Find a Car Dealership Near You']")
    WebElement findCarResultText;

    By dealersName = By.xpath("//div[@class='dealerListing--name']/a");


    @FindBy(xpath = "//span[normalize-space()='Next']")
    WebElement nextTab;

    public String getFindDealersText(){
        return getTextFromElement(findCarResultText);
    }


    public void getDealersTextDisplayed(DataTable dataTable) throws InterruptedException {
        Thread.sleep(1000);
        boolean flag = true;
        SoftAssert softAssert = new SoftAssert();
        List<List<String>> delearList = dataTable.asLists(String.class);
            for (List<String> dealer : delearList) {
                String numberOfPages = getTextFromElement(By.xpath("//div[@class='listing-pagination']//div"));
                String[] num = numberOfPages.split(" ");
                String number = num[3];
                int noOfPages = Integer.parseInt(number);

                for(int j = 0; j <= noOfPages; j++){
                    List<WebElement> dealer1 = driver.findElements(By.xpath("//div[@class='dealerListing--name']"));
                    ArrayList<String> dealersList = new ArrayList<>();
                    for (WebElement e : dealer1) {
                        String dealerName = e.getText();
                        String[] dealersNames = dealerName.split(",");
                        dealersList.add(dealersNames[0]);
                }
                    for(int i = 0; i < dealersList.size(); i++){
                        if(dealersList.get(i).equalsIgnoreCase(dealer.get(0))){
                            softAssert.assertTrue(true);
                            flag = false;
                        }

                    }
                    clickOnElement(nextTab);
                    if (!flag) {
                        break;
                    }

                }
        }
        softAssert.assertAll();
    }
}
