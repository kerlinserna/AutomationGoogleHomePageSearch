package org.googlesearch.stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.googlesearch.steps.GoogleHomePage;
import org.googlesearch.steps.SearchHomePage;


public class GoogleSearchTestsStepDefinition {
	@Steps
	SearchHomePage searchnextpage;
	@Steps
	GoogleHomePage search;


	@Given("I am on the homepage")
	public void iAmOnTheHomepage() {
		search.opensGoogleSearch();
	}

	@When("I type {string} into the search field")
	public void iTypeIntoTheSearchField(String wordSearch) {
	search.enterTheWordGoogleSearch(wordSearch);
	}

	@When("I click the Google Search button")
	public void iClickTheGoogleSearchButton() {
		search.clickBtnSearch();
	}

	@Then("I go to the search results page")
	public void iGoToTheSearchResultsPage() {
		searchnextpage.validationtettlilogo();
	}
	@Then("the first result is {string}")
	public void theFirstResultIs(String string) {
		searchnextpage.validationthesearch(string);
	}

	@When("I click on the first result link")
	public void iClickOnTheFirstResultLink() {
		searchnextpage.clicsearch();
	}

	@Then("I go to the {string} The Books page")
	public void iGoToThePage(String string) {
		searchnextpage.validationtittlenextpage(string);
}


	
	////////////
	@Then("the suggestions list is displayed")
	public void theSuggestionsListIsDisplayed() {
		searchnextpage.validationSuggestionsList();
	}

	@When("I click on the first suggestion in the list")
	public void iClickOnTheFirstSuggestionInTheList() {
		searchnextpage.validationClickSuggestionsList();
	
	}

}
