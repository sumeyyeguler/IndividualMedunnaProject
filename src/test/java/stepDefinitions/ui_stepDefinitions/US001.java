package stepDefinitions.ui_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US001 {

    HomePage homePage = new HomePage();

    //Background
    @Given("Kullanici medunna sayfasina gider")
    public void kullaniciMedunnaSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("Kullanici sag ustte yer alan account ikonuna tiklar")
    public void kullaniciSagUstteYerAlanAccountIkonunaTiklar() {
    homePage.dropDownLoginIcon.click();
    }

    @And("Kullanici register butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
        homePage.dropDownRegister.click();
    }

    //TC01
    @And("Kullanici gecerli {string} girer")
    public void kullaniciGecerliGirer(String SSN) {
        homePage.registrationSSN.sendKeys(SSN);
    }

    @Then("Kullanici {string} yazisinin gorunmedigini test eder")
    public void kullaniciYazisininGorunmediginiTestEder(String SSNUyari) {
        String uyari=SSNUyari;
        System.out.println("homePage.validSSN.getText() = " + homePage.validSSN.getText());
        Assert.assertEquals(uyari,homePage.validSSN.getText());
    }

    //TC02
    @And("Kullanici gecersiz {string} girer")
    public void kullaniciGecersizGirer(String SSN) {
        homePage.registrationSSN.sendKeys(SSN);
        homePage.registirationFirstName.click();
    }

    @Then("Kullanici {string} yazisinin gorunur oldugunu test eder")
    public void kullaniciYazisininGorunurOldugunuTestEder(String feedback) {
        //Assert.assertTrue(homePage.registrationSSNFeedbackText.isDisplayed());
        System.out.println("homePage.registrationSSNFeedbackText.getText() = " + homePage.registrationSSNFeedbackText.getText());
        Assert.assertEquals(feedback,homePage.registrationSSNFeedbackText.getText());
    }

    //
    @And("Kullanici SSN'i bos biraktiginda Your SSN is invalid. uyarisinin gorunur oldugunu test eder.")
    public void kullaniciSSNIBosBiraktigindaYourSSNIsInvalidUyarisininGorunurOldugunuTestEder() {
        String uyari="Your SSN is required.";
        homePage.registrationSSN.click();
        homePage.registirationFirstName.click();
        Assert.assertTrue(homePage.registrationSSNFeedbackText.isDisplayed());
    }

    //After
    @And("sayfayi kapatir.")
    public void sayfayiKapatir() {

    }

}
