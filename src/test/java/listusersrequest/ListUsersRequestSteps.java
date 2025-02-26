package listusersrequest;

import commonsteps.CommonSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class ListUsersRequestSteps {

    @When("user send a GET request to  {string}")
    public void userSendAGetRequest(String endpoint) {
        CommonSteps.request.put("page",2);
        CommonSteps.response = given()
                .contentType(ContentType.JSON)
                .queryParam(String.valueOf(CommonSteps.request)) // Passing JSON request body
                .when()
                .get(endpoint);
    }



    @Then("validate on response")
    public void validateOnResponse() {
        CommonSteps.response.prettyPrint();
        //List<?> booking = CommonSteps.response.jsonPath().getList("$");
        //assertThat("booking size greater than 0",booking.size()>0);
    }

}
