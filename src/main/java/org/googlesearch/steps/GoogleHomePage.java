package org.googlesearch.steps;

import net.thucydides.core.annotations.Step;
import org.googlesearch.Pages.HomePage;

public class GoogleHomePage {
	
	HomePage homePage;
	
	@Step
	public void opensGoogleSearch() 
	{
		homePage.open();
	}
	
	@Step
	public void enterTheWordGoogleSearch(String wordSearch) {
		homePage.enterWordToSearch(wordSearch);
	}


	@Step
	public void clickBtnSearch() 
	{
		homePage.clickOnBtnSearch();
	}
	
	@Step
	public void clickBtnFirtsList() 
	{
		homePage.clickFirstList();
	}
}
