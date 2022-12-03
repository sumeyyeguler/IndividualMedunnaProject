package stepDefinitions.api_stepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojo.AppointmentPojo;

import java.util.Optional;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class api10 {
    Response response;
    AppointmentPojo actualAppointment;

    @Given("SG medunnada")
    public void sgMedunnada() {
        response = given().when().header("Authorization", "Bearer " +
                generateToken()).get("https://medunna.com/api/appointments/319329");
        response.prettyPrint();
    }

    @When("SG get the request")
    public void sgGetTheRequest() throws JsonProcessingException {
        ObjectMapper obj = new ObjectMapper();
        actualAppointment = obj.readValue(response.asString(), AppointmentPojo.class);
    }


    @Then("dogrular")
    public void dogrular() {
        Integer id=301213;
        Assert.assertEquals(id, actualAppointment.getPatient().getId());
        Assert.assertEquals("2022-11-21T00:00:00Z", actualAppointment.getStartDate());
        Assert.assertEquals("2022-11-21T01:00:00Z", actualAppointment.getEndDate());
        Assert.assertEquals("CANCELLED", actualAppointment.getStatus());

        //deneme
        //deneme
        // FIXME: 3.12.2022 


    }
}
