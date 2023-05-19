package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarSearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    public NewAndUsedCarSearchPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "(//h1[normalize-space()='New & Used Car Search - carsguide'])[1]")
    WebElement newAndUsedCarSearchElement;
    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement anyMake;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement anyModel;
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement anyLocation;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement priceMax;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarLink;


    public String getNewAndUsedCarSearchTextElement(){
        return getTextFromElement(newAndUsedCarSearchElement);
    }
    public void selectMake(String make){
        selectByVisibleTextFromDropDown(anyMake, make);
    }
    public void selectModel(String model){
        selectByVisibleTextFromDropDown(anyModel, model);
    }
    public void selectLocation(String location){
        selectByVisibleTextFromDropDown(anyLocation, location);
    }
    public void selectPrice(String price){
        selectByVisibleTextFromDropDown(priceMax, price);
    }
    public void clickOnFindMyNextCarLink(){
        clickOnElement(findMyNextCarLink);
    }
}
