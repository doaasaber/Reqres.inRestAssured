package deleteuserrequest;
import commonsteps.CommonSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.given;
public class DeleteUserRequestSteps {
    @When("user send a Delete request to  {string}{string}")
    public void userSendADeleteRequest(String endpoint,String userId) {

        CommonSteps.response = given().header("Content-Type", "application/json")
                .body(CommonSteps.request.toJSONString())
                .when()
                .delete(endpoint+userId);
    }

}
