package createuserrequest;
import commonsteps.CommonSteps;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.given;

public class CreateUserRequestSteps {
    @When("user send a POST request to  {string}")
    public void userSendACreateRequest(String endpoint) {
        CommonSteps.startTime = System.currentTimeMillis();
        CommonSteps.response = given().header("Content-Type", "application/json")
                .body(CommonSteps.request.toJSONString())
                .log().all()
                .when()
                .post(endpoint);
        CommonSteps.endTime=System.currentTimeMillis();

    }


    @When("user send a POST request to  {string} with empty data")
    public void userSendAPOSTRequestToWithEmptyData(String endpoint) {
        CommonSteps.response = given().header("Content-Type", "application/json")
                .body("")
                .when()
                .post(endpoint);
    }
}
