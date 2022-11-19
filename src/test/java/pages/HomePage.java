package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //HomePage Navbar
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement dropDownLoginIcon;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement dropDownRegister;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement iconSigninButton;

    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement dropDownMyPages;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement dropDownMyAppointments;

    //Appointments
    @FindBy(xpath = "(//tr)[2]")
    public List<WebElement> appointmentList;

    @FindBy(xpath = "//h2[@id='appointment-heading']")
    public WebElement appointmentText;

    @FindBy(xpath = "//th")
    public List<WebElement> appointmentHeaderList;

    @FindBy(xpath = "//input[@id='fromDate']")
    public WebElement appointmentFromDate;

    @FindBy(xpath ="//input[@id='toDate']" )
    public WebElement appointmentToDate;
    //Register
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement registrationSSN;
    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement registrationSSNFeedbackText;
    @FindBy(xpath = "//div[@class='form-group']")
    public WebElement validSSN;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement registirationFirstName;

    //Sign In
    @FindBy(xpath = "//input[@id='username']")
    public WebElement signinUsernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement signinPasswordTextBox;

    @FindBy(xpath = "(//span[text()='Sign in'])[3]")
    public WebElement signInLoginButton;

    //Account succesfully login page
    @FindBy(xpath = "//h1")
    public WebElement welcomeToMedunnaText;

    //
    //GRUP

    ////*[text()='Failed to sign in!']
}
