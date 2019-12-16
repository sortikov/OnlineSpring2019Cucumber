package com.vytrack.pages.fleet;

import com.vytrack.utilities.BasePage;
import com.vytrack.utilities.BrowserUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesPage extends BasePage {

    @FindBy(xpath = "//label[text()='Page:']/following-sibling::ul//input")
    public WebElement pageNumber;

    public Integer getPageNumber(){
        return Integer.valueOf(pageNumber.getAttribute("value"));
    }


    @FindBy (css= "[title='Create Car']")
    public WebElement createACarBtn;

    @FindBy (css = "[id ^='custom_entity_type_LicensePlate']")
    public WebElement licensePlateInputBox;

    @FindBy (css = "[id ^='custom_entity_type_Driver']")
    public WebElement driverInputBox;

    @FindBy (css = "[id ^='custom_entity_type_Location']")
    public WebElement locationInputBox;

    @FindBy (css = "[id ^='custom_entity_type_ModelYear']")
    public WebElement modelYearInputBox;

    @FindBy (css = "[id ^='custom_entity_type_Color']")
    public WebElement colorInputBox;

    @FindBy (css = "[id ^='custom_entity_type_Power']")
    public WebElement powerInputBox;

    @FindBy (css = "[class='btn btn-success action-button']")
    public WebElement saveAndCloseBtn;


    @FindBy (xpath = "//span[text()='General Information']")
    public WebElement generalInfo;


    public void clickToCreateACar (){
        BrowserUtils.waitForStaleElement(createACarBtn);
        createACarBtn.click();
    }

    public void enterLicensePlate (String value){
        licensePlateInputBox.clear();
        licensePlateInputBox.sendKeys(value);
    }


    public void enterDriver (String value){
        driverInputBox.clear();
        driverInputBox.sendKeys(value);
    }

    public void enterLocation (String value){
        locationInputBox.clear();
        locationInputBox.sendKeys(value);
    }

    public void enterModelYear (String value){
        modelYearInputBox.clear();
        modelYearInputBox.sendKeys(value);
    }

    public void enterColor (String value){
        colorInputBox.clear();
        colorInputBox.sendKeys(value);
    }

    public void enterPower (String value){
        powerInputBox.clear();
        powerInputBox.sendKeys(value);
    }

    public void clickSaveAndClose (){
        saveAndCloseBtn.click();
    }


    public boolean verifyGeneralInformationIsDisplayed (){
        waitUntilLoaderScreenDisappear();

        try{
            return generalInfo.isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }

    }




}
