package commonsteps;
import com.github.javafaker.Faker;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import utilities.ExcelReadFile;
import utilities.listeners.Logs;
import static org.hamcrest.Matchers.*;


public class CommonSteps {
    public static ExcelReadFile excelReadFile;
    public static Response response;
    public static JSONObject request = new JSONObject();
    public static final Faker faker = new Faker();
    private String name , job , cellData1 ,cellData2;
    public static long  startTime , endTime ,responseTime;
    @Before
    public static void setup() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails(LogDetail.ALL);
    }
    @Given("the base URL is set")
    public void initiateTest(){
        BaseUrl.propInitiate();
        RestAssured.baseURI=BaseUrl.props.getProperty("Url.Base");
    }

    @Then("validate on response status code \"([^\"]*)\"$")
    public void validateOnResponseStatusCode(int statusCode) {
        response.then()
                .assertThat()
                .statusCode(statusCode);
    }

    @Then("validate on response data")
    public void validateOnResponseData(){
        response.then()
                .assertThat().
                 body("name", equalTo(name))
                .body("job", equalTo(job));

    }


    @When("read data from csv file and send them to the request {string} {string} {string}")
    public void readDataFromCsvFileAndSendThemToTheRequest(String row , String column1 , String column2) {
        excelReadFile = new ExcelReadFile("input.xlsx");
        cellData1=excelReadFile.getCellData("GenerateData",Integer.parseInt(row),Integer.parseInt(column1));
        cellData2=excelReadFile.getCellData("GenerateData",Integer.parseInt(row),Integer.parseInt(column2));
        name=faker.name().firstName();
        job=faker.job().title();
        request.put(cellData1,name);
        request.put(cellData2,job);
    }

    @And("logging response time")
    public void loggingResponseTime(){
        responseTime=endTime-startTime;
        Logs.info("Response Time: " + responseTime + " ms");
        Logs.info("Response Status Code: " + response.getStatusCode());
        Logs.info("Response Body: " + response.getBody().asPrettyString());
    }
}
