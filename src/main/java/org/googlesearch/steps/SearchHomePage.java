package org.googlesearch.steps;

import net.thucydides.core.annotations.Step;
import org.googlesearch.Pages.SearchPage;
import org.junit.Assert;
public class SearchHomePage {
	
	SearchPage searchpage;
	
	@Step
	public void validationtettlilogo() 
	{
		searchpage.titllevalidation();
	}
	
	@Step
	public void validationthesearch(String string){
		Assert.assertEquals(string,searchpage.validationsearch());

    }
    @Step
    public void clicsearch(){

        searchpage.clickfirstsarch();

    }
    @Step
    public void validationtittlenextpage(String string){
		Assert.assertEquals(string, searchpage.validationsearchnextpage());

    }
    
    @Step
    public void validationSuggestionsList(){
    	   searchpage.suggestionsList();
    }
    
    @Step
    public void validationClickSuggestionsList(){
    	   searchpage.clickSuggestionsList();
    }
    
    
    

}
