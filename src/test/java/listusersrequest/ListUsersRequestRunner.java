package listusersrequest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/listusersrequest/listusersrequest.feature"},
        glue = {"commonsteps", "listusersrequest"},
        plugin = {"pretty","html:reports/API-ListUsersRequest-Report.html"}
)
public class ListUsersRequestRunner extends AbstractTestNGCucumberTests {
}
