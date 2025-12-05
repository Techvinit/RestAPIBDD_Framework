package stepDefinations;
import Resource.TestData;
import static io.restassured.RestAssured.given;

import Resource.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.io.FileNotFoundException;
import java.io.IOException;

import static io.restassured.RestAssured.given;
public class StepDefination extends Utils {

    RequestSpecification loginReqSpec;
    TestData testData = new TestData();
    Response loginResponse;

    @Given("Add login request payload with {string} {string}")
    public void add_login_request_payload_with(String userEmail, String userPassword) throws IOException {

        loginReqSpec =given().spec(requestSpecification()).body(testData.loginData(userEmail,userPassword));
    }
    @When("User call login API with post http request")
    public void user_call_login_api_with_post_http_request() {
        // Write code here that turns the phrase above into concrete actions
        loginResponse =loginReqSpec.when().post("/api/ecom/auth/login").then().extract().response();
    }
    @Then("message is {string}")
    public void message_is(String Expectedmsg) {

    String logresponse =loginResponse.asString();
    JsonPath js = new JsonPath(logresponse);
    String Actualmsg =js.get("message");
        Assert.assertEquals(Actualmsg, Expectedmsg);
    System.out.println(Actualmsg);
    }

}
