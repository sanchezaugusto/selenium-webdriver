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


    // Constructor
    public AlertsWindowPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo() {
        driver.get("https://demoqa.com/alertsWindows");
    }
}
