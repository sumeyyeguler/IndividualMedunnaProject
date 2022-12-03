package stepDefinitions.db_stepDefinitions;

import io.cucumber.java.en.*;
import io.cucumber.java.sl.In;
import org.junit.Test;
import utilities.DatabaseUtility;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class db10 {
    List<Object> id;
    @Given("SG Database e baglanir")
    public void sg_database_e_baglanir() {
        DatabaseUtility.createConnection();

    }

    @Test
    public void test() {
        DatabaseUtility.createConnection();
        String query = "select * from public.appointments";
        System.out.println("DatabaseUtility.get(query) = " + DatabaseUtility.getColumnData(query,"id"));
    }

    @When("SG randevu listesini getirir")
    public void sg_randevu_listesini_getirir() {
        DatabaseUtility.createConnection();
        String query = "select * from appointment where id=301213";
        System.out.println("DatabaseUtility.getRowMap(query) = " + DatabaseUtility.getRowMap(query));


    }
    @Then("randevu list dogrular")
    public void randevu_list_dogrular() {
    assertTrue((id).contains(301213));
    }

}
