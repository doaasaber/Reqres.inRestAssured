package updateuserrequest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/updateuserrequest/updateuserrequest.feature"},
        glue = {"commonsteps", "updateuserrequest"},
        plugin = {"pretty","html:reports/API-UpdateUser-Report.html"}
)
public class UpdateUserRunner extends AbstractTestNGCucumberTests {
}
