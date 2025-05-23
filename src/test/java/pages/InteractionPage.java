package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteractionPage {

    private WebDriver driver;

    // Opciones principales
    @FindBy(xpath = "//*[text()='Sortable']")
    private WebElement sortableOption;

    @FindBy(xpath = "//*[text()='Selectable']")
    private WebElement selectableOption;

    @FindBy(xpath = "//*[text()='Resizable']")
    private WebElement resizableOption;

    @FindBy(xpath = "//*[text()='Droppable']")
    private WebElement droppableOption;

    @FindBy(xpath = "//*[text()='Dragabble']")
    private WebElement dragableOption;

    // Constructor
    public InteractionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo() {
        driver.get("https://your-base-url.com/interaction"); // Reemplaza con BASE_URL real
    }
}
