package deleteuserrequest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/deleteuserrequest/deleteuserrequest.feature"},
        glue = {"commonsteps", "deleteuserrequest","createuserrequest"},
        plugin = {"pretty","html:reports/API-DeleteUserRequest-Report.html"}
)
public class DeleteUserRequestRunner extends AbstractTestNGCucumberTests{
}
