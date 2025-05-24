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

    // Sortable List Elements
    @FindBy(id = "sortableList")
    private WebElement list1;

    @FindBy(css = "#sortableList li:nth-child(1)")
    private WebElement oneList;

    @FindBy(css = "#sortableList li:nth-child(2)")
    private WebElement twoList;

    @FindBy(css = "#sortableList li:nth-child(3)")
    private WebElement threeList;

    @FindBy(css = "#sortableList li:nth-child(4)")
    private WebElement fourList;

    @FindBy(css = "#sortableList li:nth-child(5)")
    private WebElement fiveList;

    @FindBy(css = "#sortableList li:nth-child(6)")
    private WebElement sixList;

    // Sortable Grid Elements
    @FindBy(id = "sortableGrid")
    private WebElement grid1;

    @FindBy(css = "#sortableGrid li:nth-child(1)")
    private WebElement oneGrid;

    @FindBy(css = "#sortableGrid li:nth-child(2)")
    private WebElement twoGrid;

    @FindBy(css = "#sortableGrid li:nth-child(3)")
    private WebElement threeGrid;

    @FindBy(css = "#sortableGrid li:nth-child(4)")
    private WebElement fourGrid;

    @FindBy(css = "#sortableGrid li:nth-child(5)")
    private WebElement fiveGrid;

    @FindBy(css = "#sortableGrid li:nth-child(6)")
    private WebElement sixGrid;

    @FindBy(css = "#sortableGrid li:nth-child(7)")
    private WebElement sevenGrid;

    @FindBy(css = "#sortableGrid li:nth-child(8)")
    private WebElement eightGrid;

    @FindBy(css = "#sortableGrid li:nth-child(9)")
    private WebElement nineGrid;

    // Selectable List Elements
    @FindBy(id = "selectableList")
    private WebElement list2;

    @FindBy(css = "#selectableList li:nth-child(1)")
    private WebElement element1;

    @FindBy(css = "#selectableList li:nth-child(2)")
    private WebElement element2;

    @FindBy(css = "#selectableList li:nth-child(3)")
    private WebElement element3;

    @FindBy(css = "#selectableList li:nth-child(4)")
    private WebElement element4;

    // Selectable Grid Elements
    @FindBy(id = "selectableGrid")
    private WebElement grid2;

    @FindBy(css = "#selectableGrid li:nth-child(1)")
    private WebElement oneGrid2;

    @FindBy(css = "#selectableGrid li:nth-child(2)")
    private WebElement twoGrid2;

    @FindBy(css = "#selectableGrid li:nth-child(3)")
    private WebElement threeGrid2;

    @FindBy(css = "#selectableGrid li:nth-child(4)")
    private WebElement fourGrid2;

    @FindBy(css = "#selectableGrid li:nth-child(5)")
    private WebElement fiveGrid2;

    @FindBy(css = "#selectableGrid li:nth-child(6)")
    private WebElement sixGrid2;

    @FindBy(css = "#selectableGrid li:nth-child(7)")
    private WebElement sevenGrid2;

    @FindBy(css = "#selectableGrid li:nth-child(8)")
    private WebElement eightGrid2;

    @FindBy(css = "#selectableGrid li:nth-child(9)")
    private WebElement nineGrid2;

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
        driver.get("https://your-base-url.com/interaction");
    }
}
