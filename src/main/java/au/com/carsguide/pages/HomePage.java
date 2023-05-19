package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[text()='buy + sell']")
    WebElement buySellMenu;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Search Cars']")
    WebElement searchCarsLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedCarsLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findDealerLink;

    public void mouseHoverOnBuySearchTab() throws InterruptedException {
        Thread.sleep(1000);
        log.info("mouse hover on buy+sell tab" + buySellMenu.toString());
        mouseHoverToElement(buySellMenu);
    }
    public void mouseHoverAndClickOnSearchCars() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click ‘Search Cars’ link");
        mouseHoverToElementAndClick(searchCarsLink);
    }
    public void mouseHoverAndClickOnUserCars() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click ‘Used’ link");
        mouseHoverToElementAndClick(usedCarsLink);
    }
    public void mouseHoverAndClickOnFindDealer() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click ‘Find a dealer link");
        mouseHoverToElementAndClick(findDealerLink);
    }
}
