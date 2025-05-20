package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    private WebDriver driver;

    // Campos del formulario
    @FindBy(id = "firstName")
    private WebElement nameBox;

    @FindBy(id = "lastName")
    private WebElement lastNameBox;

    @FindBy(id = "userEmail")
    private WebElement emailBox;

    @FindBy(css = "label[for='gender-radio-1']")
    private WebElement genderCheckBox;

    @FindBy(id = "userNumber")
    private WebElement mobileNumberBox;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirthBox;

    @FindBy(id = "subjectsInput")
    private WebElement subjectsBox;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressBox;

    @FindBy(id = "state")
    private WebElement stateDropdown;

    @FindBy(id = "city")
    private WebElement cityDropdown;

    @FindBy(id = "submit")
    private WebElement submitButton;

    // Elementos del modal
    @FindBy(css = ".modal-content")
    private WebElement modalContent;

    @FindBy(css = ".modal-title.h4")
    private WebElement modalTitle;

    @FindBy(css = "tr:has(td:contains('Student Name')) td:nth-child(2)")
    private WebElement studentName;

    @FindBy(css = "tr:has(td:contains('Student Email')) td:nth-child(2)")
    private WebElement studentEmail;

    @FindBy(css = "tr:has(td:contains('Gender')) td:nth-child(2)")
    private WebElement gender;

    @FindBy(css = "tr:has(td:contains('Mobile')) td:nth-child(2)")
    private WebElement mobile;

    @FindBy(css = "tr:has(td:contains('Date of Birth')) td:nth-child(2)")
    private WebElement dob;

    @FindBy(css = "table")
    private WebElement table;

    @FindBy(id = "closeLargeModal")
    private WebElement closeButton;

    // Constructor
    public FormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
