package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WidgetPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[text()='Accordian']")
    private WebElement accordianOption;

    @FindBy(xpath = "//*[text()='Auto Complete']")
    private WebElement autoCompleteOption;

    @FindBy(xpath = "//*[text()='Date Picker']")
    private WebElement datePickerOption;

    @FindBy(xpath = "//*[text()='Slider']")
    private WebElement sliderOption;

    @FindBy(xpath = "//*[text()='Progress Bar']")
    private WebElement progressBarOption;

    @FindBy(xpath = "//*[text()='Tabs']")
    private WebElement tabsOption;

    @FindBy(xpath = "//*[text()='Tool Tips']")
    private WebElement toolTipOption;

    @FindBy(xpath = "//*[text()='Menu']")
    private WebElement menuOption;

    @FindBy(xpath = "//*[text()='Select Menu']")
    private WebElement selectMenuOption;

    // Constructor
    public WidgetPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo() {
        driver.get("https://your-base-url.com/widgets");
    }
}
