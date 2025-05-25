package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(tagName = "h1")
    private WebElement title;

    @FindBy(xpath = "//*[text()='Elements']")
    private WebElement elementsCard;

    @FindBy(xpath = "//*[text()='Forms']")
    private WebElement formsCard;

    @FindBy(xpath = "//*[text()='Alerts, Frame & Windows']")
    private WebElement alertsFramesCard;

    @FindBy(xpath = "//*[text()='Widgets']")
    private WebElement widgetsCard;

    @FindBy(xpath = "//*[text()='Interactions']")
    private WebElement interactionsCard;

    @FindBy(xpath = "//*[text()='Book Store Application']")
    private WebElement bookStoreCard;

    private static final String BASE_URL = "https://your-base-url.com"; // Reemplaza con el valor real

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo() {
        driver.get(BASE_URL);
    }
}
