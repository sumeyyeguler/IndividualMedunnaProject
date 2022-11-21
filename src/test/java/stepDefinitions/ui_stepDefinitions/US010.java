package stepDefinitions.ui_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.awt.image.DirectColorModel;
import java.util.List;

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
        homePage.signinPasswordTextBox.sendKeys(ConfigReader.getProperty("doktorGecerliPassword"));

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
        homePage.dropDownMyPages.click();
    }

    @And("Kullanici MY Appointments'e tiklar")
    public void kullaniciMYAppointmentsETiklar() {
        homePage.dropDownMyAppointments.click();
    }

    @Then("Kullanici randevu listesinin gorunur oldugunu test eder")
    public void kullaniciRandevuListesininGorunurOldugunuTestEder() {
        Assert.assertTrue(homePage.appointmentText.isDisplayed());
        List<WebElement>appointmentList=homePage.appointmentList;
        for (int i = 0; i <appointmentList.size() ; i++) {
           Assert.assertTrue( appointmentList.get(i).isDisplayed());
        }


    }

    @Then("Kullanici zaman dilimlerinin gorunur oldugunu test eder")
    public void kullaniciZamanDilimlerininGorunurOldugunuTestEder() {
        Assert.assertTrue(homePage.appointmentFromDate.isDisplayed());
        Assert.assertTrue(homePage.appointmentToDate.isDisplayed());
    }

    @Then("Kullanici patient id, start date, end date, status bilgilerini gorunur oldugunu test eder")
    public void kullaniciPatientIdStartDateEndDateStatusBilgileriniGorunurOldugunuTestEder() {
        List<WebElement>appointmentHeaderList=homePage.appointmentHeaderList;
        for (int i = 0; i <appointmentHeaderList.size() ; i++) {
            Assert.assertTrue(appointmentHeaderList.get(i).isDisplayed());
        }
    }

    @And("{int} sn beklenir")
    public void snBeklenir(int saniye) {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @And("Sayfa kapatilir.")
    public void sayfaKapatilir() {
        Driver.closeDriver();
    }

}
