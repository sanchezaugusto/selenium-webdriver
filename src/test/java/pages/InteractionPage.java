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


    // Draggable Options Tabs
    @FindBy(id = "draggableExample-tab-simple")
    private WebElement simpleOption;

    @FindBy(id = "draggableExample-tab-axisRestriction")
    private WebElement axisOption;

    @FindBy(id = "draggableExample-tab-containerRestriction")
    private WebElement containerOption;

    @FindBy(id = "draggableExample-tab-cursorStyle")
    private WebElement cursorOption;

    // Simple Drag
    @FindBy(id = "dragBox")
    private WebElement dragBox;

    // Axis Restricted
    @FindBy(id = "restrictedX")
    private WebElement dragBoxX;

    @FindBy(id = "restrictedY")
    private WebElement dragBoxY;

    // Container Restricted
    @FindBy(xpath = "//*[text()=\"I'm contained within the box\"]")
    private WebElement elementD1;

    @FindBy(xpath = "//*[text()=\"I'm contained within my parent\"]")
    private WebElement elementD2;

    @FindBy(id = "containmentWrapper")
    private WebElement containerWrapper;

    // Cursor Style
    @FindBy(id = "cursorCenter")
    private WebElement center;

    @FindBy(id = "cursorTopLeft")
    private WebElement topLeft;

    @FindBy(id = "cursorBottom")
    private WebElement bottom;

    // Constructor
    public InteractionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo() {
        driver.get("https://your-base-url.com/interaction"); // Reemplaza con BASE_URL real
    }
}
