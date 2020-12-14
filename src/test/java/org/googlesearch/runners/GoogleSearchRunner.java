package org.googlesearch.runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
  features="src/test/resources/features/googlesearch.feature",
  glue = "org.googlesearch.stepdefinitions",
        snippets = SnippetType.CAMELCASE
  )
public class GoogleSearchRunner {
}


