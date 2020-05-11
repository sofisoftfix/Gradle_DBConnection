package net.cucumber.stepdefinitions;

/**
 * @user bizadmin
 */
import static org.testng.Assert.*;
import common.ReRun;
import org.testng.annotations.Test;
import common.Runner;


public class FailedTest extends Runner {

    /*@Test
    @Description("Failing Test")
    public void failingTest() {
        assertEquals(1, 2);
    }*/
    @Test(groups = {"Skipped"},
            description = "C6298541 - UK Reconcile data from Epay transaction with Load Request - (SVP-936)")
   // @Test(retryAnalyzer = ReRun.class)
    public void successfulTest() {
        System.out.println("no cucumber");
        assertEquals(2+2,5,"Addition Problem! 2+2 must be 4!\n");
    }

   // @Test(retryAnalyzer = ReRun.class)
    @Test(groups = {"Skipped"},
            description = "C6298541 - UK Reconcile data from Epay transaction with Load Request - (SVP-936)")
    public void test2() {
        //Fail Scenario
        assertEquals(2+2,4,"Addition Problem! 2+2 must be 4!\n");
    }
}
