package common;

/**
 * @user bizadmin
 */
import org.junit.AssumptionViolatedException;

public final class Commons {
    private Commons() {
    }

    public static void skipCucumberScenario(String message) {
        throw new AssumptionViolatedException(message);
    }
}