package createuserrequest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/createuserrequest/createuserrequest.feature"},
        glue = {"commonsteps", "createuserrequest"},
        plugin = {"pretty","html:reports/API-CreateUserRequest-Report.html"}
)
public class CreateUserRequestRunner extends AbstractTestNGCucumberTests {
}
