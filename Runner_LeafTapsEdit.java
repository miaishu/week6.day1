package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(features="src/test/java/feature/LeafTapsEdit.feature"
,glue="steps_LeafTaps_edit",monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE)

public class Runner_LeafTapsEdit extends AbstractTestNGCucumberTests {

}
