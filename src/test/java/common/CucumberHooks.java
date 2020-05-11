package common;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


/**
 * @user bizadmin
 */
public class CucumberHooks {
    private static final String SKIPPED_MSG = "The scenario '%s' was skipped. %s";

    @Before //("@skip_scenario")
    public void skip_scenario(Scenario scenario){
        System.out.println("SKIP SCENARIO: " + scenario.getName());
        Commons.skipCucumberScenario(String.format(SKIPPED_MSG, scenario.getName(), "skipped scenario"));
     }

    @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
}
