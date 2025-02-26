package updateuserrequest;

import commonsteps.CommonSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.given;

public class UpdateUserSteps {
    @When("user send a Update request to  {string}{string}")
    public void userSendAUpdateRequest(String endpoint,String userId) {
        CommonSteps.response = given().header("Content-Type", "application/json")
                .body(CommonSteps.request.toJSONString())
                .when()
                .put(endpoint+userId);
    }

}
