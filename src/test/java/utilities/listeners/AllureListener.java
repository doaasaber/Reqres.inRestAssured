package utilities.listeners;
import commonsteps.CommonSteps;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Attachment;

public class AllureListener {
    @Attachment(value = "Screenshot on Failure", type = "image/png")
    public static String attachScreenshot(String screenshot) {
        return screenshot;
    }


    @After
    public void onTestFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            try {

                attachScreenshot("Request: " + CommonSteps.request.toString());
                attachScreenshot("Response: " + CommonSteps.response.getBody().asString());

            } catch (Exception e) {
                attachScreenshot("Error while capturing failure details: " + e.getMessage());
            }
        }
    }
}
