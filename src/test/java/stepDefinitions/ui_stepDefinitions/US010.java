package stepDefinitions.ui_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;

public class US010 {

    HomePage homePage=new HomePage();
    @And("Kullanici signin butonuna tiklar")
    public void kullaniciSigninButonunaTiklar() {
        homePage.iconSigninButton.click();
    }

    @And("Kullanici Doktor olarak gecerli username girer")
    public void kullaniciDoktorOlarakGecerliUsernameGirer() {
        homePage.signinUsernameTextBox.sendKeys(ConfigReader.getProperty("doktorGecerliUsername"));
    }

    @And("Kullanici Doktor olarak gecerli password girer")
    public void kullaniciDoktorOlarakGecerliPasswordGirer() {
        homePage.signinUsernameTextBox.sendKeys(ConfigReader.getProperty("doktorGecerliPassword"));

    }
    @And("Kullanici Login icin signin butonuna tiklar")
    public void kullaniciLoginIcinSigninButonunaTiklar() {
        homePage.signInLoginButton.click();
    }

    @Then("Kullanici basarili hesap girisi oldugunu dogrular")
    public void kullaniciBasariliHesapGirisiOldugunuDogrular() {
        Assert.assertTrue(homePage.welcomeToMedunnaText.isDisplayed());
    }

    @And("Kullanici  MY Pages'e tiklar")
    public void kullaniciMYPagesETiklar() {

    }

    @And("Kullanici MY Appointments'e tiklar")
    public void kullaniciMYAppointmentsETiklar() {
    }

    @Then("Kullanici randevu listesinin gorunur oldugunu test eder")
    public void kullaniciRandevuListesininGorunurOldugunuTestEder() {
    }

    @Then("Kullanici zaman dilimlerinin gorunur oldugunu test eder")
    public void kullaniciZamanDilimlerininGorunurOldugunuTestEder() {
    }

    @And("{int} sn beklenir.")
    public void snBeklenir(int arg0) {
    }

    @Then("Kullanici patient id, start date, end date, status bilgilerini gorunur oldugunu test eder")
    public void kullaniciPatientIdStartDateEndDateStatusBilgileriniGorunurOldugunuTestEder() {
    }

    @And("{int} sn beklenir")
    public void snBeklenir(int arg0) {
    }



}
