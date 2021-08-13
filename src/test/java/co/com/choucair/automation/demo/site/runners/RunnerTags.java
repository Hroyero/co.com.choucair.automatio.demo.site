package co.com.choucair.automation.demo.site.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register_automation_demo.feature",
        tags = "@historia",
        glue = "co.com.choucair.automation.demo.site.stepdefinitios",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
