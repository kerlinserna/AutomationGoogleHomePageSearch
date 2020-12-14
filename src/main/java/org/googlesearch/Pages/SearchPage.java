package org.googlesearch.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;


@DefaultUrl("https://www.google.com/search?q=the+name+of+the+wind&oq=&aqs=chrome.0.69i59i450l5.1412758527j0j15&sourceid=chrome&ie=UTF-8")
public class SearchPage extends PageObject {

// next page
    @FindBy(xpath = "//*[@id='result-stats']")
    WebElement txtTextoTittle;

    @FindBy(xpath = "//*[@class='yuRUbf']//*[contains(text(),'The Name of the Wind by Patrick Rothfuss - Goodreads')]")
    WebElement txtElemt;

    @FindBy(xpath = "//*[@class='yuRUbf']//*[contains(text(),'The Name of the Wind by Patrick Rothfuss - Goodreads')]")
    WebElement txtElemtClic;

    @FindBy(xpath = "//*[@id='bookAuthors']//*[@itemprop='name']")
    WebElement txtValidation;
    
    @FindBy(xpath = "//*[@class='aajZCb']")
    WebElement txtSuggestionsList;
    
    @FindBy(xpath = "//*[@class='aajZCb']/*[2]/*[1]")
    WebElement btnSuggestionsList;


    //next page
    public void titllevalidation() {
        //assertThat(getDriver()..isDisplayed(), Matchers.is(true));
        assert txtTextoTittle.isEnabled();
    }

    public String validationsearch() {
    	return  txtElemt.getText();       
    }

    public void clickfirstsarch() {
        txtElemtClic.click();
    }

    public String validationsearchnextpage() {
        return txtValidation.getText();
    }
    
    public void suggestionsList()
    {
        assert txtSuggestionsList.isEnabled();
    }
    
    public void clickSuggestionsList()
    {
    	btnSuggestionsList.click();
    }
    
    
    
}
