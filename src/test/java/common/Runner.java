package common;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @user bizadmin
 */
public class Runner {

    private static final String SKIPPED_STATUS = "Skipped";

    public Runner() {
        // Default constructor.
    }

    @BeforeMethod(alwaysRun = true)
    public void skipTests(final Method method) {
        String[] groups = method.getAnnotation(Test.class).groups();
        if (Arrays.asList(groups).contains(SKIPPED_STATUS)) {
            String description = method.getAnnotation(Test.class).description();
            new SkipException("Menu mneomonics are not handled on Mac under Java 1.7+");
       }
    }
}
