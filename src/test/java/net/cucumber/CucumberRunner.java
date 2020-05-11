package net.cucumber;

/**
 * @user bizadmin
 */
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;
@CucumberOptions(
        features = {"src/test/java/net/cucumber/features/helloworld.feature"}
        , glue = "net.cucumber.stepdefinitions"
        ,plugin = {"html:target/cucumber-html-report"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
