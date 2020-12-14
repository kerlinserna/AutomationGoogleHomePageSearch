package org.googlesearch.Pages;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@DefaultUrl("https://www.google.com/")
public class HomePage extends PageObject {
	
	@FindBy(xpath="//input[@class='gLFyf gsfi']")
	WebElement textBoxSource;
 
	@FindBy(xpath="//div[@class='tfB0Bf']//input[@class='gNO89b']")
	WebElement btnSearch;
	
	@FindBy(xpath="//div[@class='aajZCb']/ul/*[1]")
	WebElement btnFisrtList;


	
	
	public void enterWordToSearch(String wordSearch) {
		textBoxSource.sendKeys(wordSearch);
	}
	
	public void clickOnBtnSearch() 
	{
		btnSearch.click();
	}
	
	public void clickFirstList() {
		btnFisrtList.click();
		WaitUntil.the((Target) btnFisrtList, isVisible()).forNoMoreThan(20).seconds();
	}


	
}
