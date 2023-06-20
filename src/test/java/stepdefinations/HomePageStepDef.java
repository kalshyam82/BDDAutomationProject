package stepdefinations;

import com.oppenheimer.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class HomePageStepDef  {
    public WebDriver driver =null ;

    public HomePage homePage;

            @Before
            public void beforemethod(){
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @Given("Browser is open")
    public void browser_is_open() throws FileNotFoundException {
        driver.get("http://localhost:8080/");
    }

    @Given("User is on Home page")
    public void user_is_on_home_page() {
        System.out.println(driver.getTitle());
    }

    @After()
    public void afterMethod(){
     driver.close();

    }

    @Then("Verify HomePage is displayed")
    public void verifyHomePageIsDisplayed() {
        homePage =new HomePage(driver);
        homePage.verifyHomePage();
    }

    @Then("Verify Upload CSV panel is displayed")
    public void verifyUploadCSVPanelIsDisplayed() {
        homePage =new HomePage(driver);
        homePage.verifyHomePage();
    }

    @Then("Verify Refresh Tax Relief button is displayed")
    public void verifyRefreshTaxReliefButtonIsDisplayed() {
        homePage =new HomePage(driver);
        homePage.verifyRefreshTaxRelief();
    }

    @Then("Verify {string}  gets Tax Relief {string}")
    public void verifyGetsTaxRelief(String natID, String expTaxRelief) {
        homePage =new HomePage(driver);
        homePage.verifyTaxRelief(natID, expTaxRelief);
    }

    @Then("Verify Total Tax Relief panel is displayed")
    public void verifyTotalTaxReliefPanelIsDisplayed() {
        homePage =new HomePage(driver);
        homePage.verifyTotalTaxRelief();
    }

    @Then("Verify Dispense Now button is displayed")
    public void verifyDispenseNowButtonIsDisplayed() {
        homePage =new HomePage(driver);
        homePage.verifyDispenseNow();
    }

    @Then("Click on Dispense Now button")
    public void clickOnDispenseNowButton() {
        homePage =new HomePage(driver);
        homePage.clickDispenseNow();
    }

    @And("Verify Cash Dispensed message is displayed")
    public void verifyCashDispensedMessageIsDisplayed() {
        homePage =new HomePage(driver);
        homePage.verifyCashDispensed();
    }
}
