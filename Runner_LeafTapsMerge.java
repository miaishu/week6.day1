package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(features="src/test/java/feature/LeafTapsMerge.feature"
,glue="steps_LeafTaps_merge",monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE)

public class Runner_LeafTapsMerge extends AbstractTestNGCucumberTests {

}
