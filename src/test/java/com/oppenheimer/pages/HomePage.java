package com.oppenheimer.pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class HomePage {
public  WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//label[@class='custom-file-label']")
    WebElement panelUploadCSVFile;

    @FindBy(xpath = "//button[normalize-space()='Refresh Tax Relief Table']")
    WebElement btnRefreshTaxRelief;

    @FindBy(xpath="//h1[normalize-space()='Total Tax Relieves']")
    WebElement panelTotalTaxRelief;

    @FindBy(xpath = "//a[normalize-space()='Dispense Now']")
    WebElement btnDispenseNow;

    @FindBy(xpath = "//div[text()='Cash dispensed']")
    WebElement lblCashDispensed;

    public void  verifyHomePage(){
        Assert.assertTrue(getTitle().equalsIgnoreCase("Technical Challenge for CDS"));
    }

    public void  verifyCSVUpload(){
        Assert.assertTrue(panelUploadCSVFile.isDisplayed());
    }

    public void  verifyTotalTaxRelief(){
        Assert.assertTrue(panelTotalTaxRelief.isDisplayed());
    }

    public void  verifyDispenseNow(){
        Assert.assertTrue(btnDispenseNow.isDisplayed());
    }

    public void  clickDispenseNow(){
        btnDispenseNow.click();
    }

    public void  verifyCashDispensed(){
        String actValue = lblCashDispensed.getText();
        Assert.assertTrue("Cash dispensed".equalsIgnoreCase(actValue));
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void  verifyRefreshTaxRelief(){
        Assert.assertTrue(btnRefreshTaxRelief.isDisplayed());
    }

    public WebElement getTaxRelief(String natID){
        String elementID = "//td[text()='" + natID +"']/following-sibling::td";
        return driver.findElement(By.xpath(elementID));
    }

    public void verifyTaxRelief(String natID, String expTaxRelief){
        WebElement taxRelief = getTaxRelief(natID);
        Assert.assertTrue(taxRelief.getText().equalsIgnoreCase(expTaxRelief));
    }

}
