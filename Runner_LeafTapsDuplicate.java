package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(features="src/test/java/feature/LeafTapsDuplicate.feature"
,glue="steps_LeafTaps_duplicate",monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE)

public class Runner_LeafTapsDuplicate extends AbstractTestNGCucumberTests {

}
