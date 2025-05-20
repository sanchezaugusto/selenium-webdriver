package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsWindowPage {
    private WebDriver driver;

    // Menu Options
    @FindBy(xpath = "//*[text()='Browser Windows']")
    private WebElement browserWindowsOption;

    @FindBy(xpath = "//*[text()='Alerts']")
    private WebElement alertsOption;

    @FindBy(xpath = "//*[text()='Nested Frames']")
    private WebElement nestedFramesOption;

    @FindBy(xpath = "//*[text()='Modal Dialogs']")
    private WebElement modalDialogsOption;

    // Browser Windows Elements
    @FindBy(xpath = "//*[text()='Browser Windows']")
    private WebElement browserTitle;

    @FindBy(xpath = "//*[text()='New Tab']")
    private WebElement newTabOption;

    @FindBy(xpath = "//*[text()='New Window']")
    private WebElement newWindowOption;

    @FindBy(xpath = "//*[text()='Message Window']")
    private WebElement messageWindowOption;

    // Alerts Elements
    @FindBy(xpath = "//*[text()='Alerts']")
    private WebElement alertTitle;

    @FindBy(xpath = "//*[text()='Alert Box']")
    private WebElement alertBoxOption;

    @FindBy(xpath = "//*[text()='Confirm Box']")
    private WebElement confirmBoxOption;

    @FindBy(xpath = "//*[text()='Prompt Box']")
    private WebElement promptBoxOption;

    // Frames Elements
    @FindBy(xpath = "//*[text()='Frames']")
    private WebElement frameTitle;

    // Nested Frames Elements
    @FindBy(xpath = "//*[text()='Nested Frames']")
    private WebElement nestedFrameTitle;

    // Modal Dialogs Elements
    @FindBy(xpath = "//*[text()='Modal Dialogs']")
    private WebElement modalDialogTitle;

    @FindBy(xpath = "//*[text()='Modal Dialogs']")
    private WebElement modalTitle;

    @FindBy(id = "showSmallModal")
    private WebElement smallModal;

    @FindBy(id = "showLargeModal")
    private WebElement largeModal;

    @FindBy(id = "closeSmallModal")
    private WebElement closeSmallModalButton;

    @FindBy(id = "closeLargeModal")
    private WebElement closeLargeModalButton;

    // Constructor
    public AlertsWindowPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo() {
        driver.get("https://demoqa.com/alertsWindows");
    }
}
