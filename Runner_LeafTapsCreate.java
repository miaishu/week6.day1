package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(features="src/test/java/feature/LeafTapsCreate.feature"
,glue="steps_LeafTaps_create",monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE)

public class Runner_LeafTapsCreate extends AbstractTestNGCucumberTests {

}
