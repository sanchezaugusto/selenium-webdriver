package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementPage {

    private final WebDriver driver;
    private static final String BASE_URL = "https://demoqa.com";
    // Element Page Options
    @FindBy(xpath = "//span[text()='Text Box']")                private WebElement textBoxOption;
    @FindBy(xpath = "//span[text()='Check Box']")               private WebElement checkBoxOption;
    @FindBy(xpath = "//span[text()='Radio Button']")            private WebElement radioButtonOption;
    @FindBy(xpath = "//span[text()='Web Tables']")              private WebElement webTableOption;
    @FindBy(xpath = "//span[text()='Buttons']")                 private WebElement buttonsOption;
    @FindBy(xpath = "//span[text()='Links']")                   private WebElement linksOption;
    @FindBy(xpath = "//span[text()='Broken Links - Images']")   private WebElement brokenLinksImagesOption;
    @FindBy(xpath = "//span[text()='Upload and Download']")     private WebElement uploadDownloadOption;
    @FindBy(xpath = "//span[text()='Dynamic Properties']")      private WebElement dynamicPropertiesOption;

    // Text Box Elements
    @FindBy(id = "userName")                    public WebElement fullNameBox;
    @FindBy(id = "userEmail")                   public WebElement emailBox;
    @FindBy(css = "textarea#currentAddress")    public WebElement currentAddressBox;
    @FindBy(css = "textarea#permanentAddress")  public WebElement permanentAddressBox;
    @FindBy(id = "submit")                      public WebElement submitButton;

    @FindBy(id = "name")                 public WebElement nameMessage;
    @FindBy(id = "email")                public WebElement emailMessage;
    @FindBy(css = "p#currentAddress")    public WebElement currentAddressMessage;
    @FindBy(css = "p#permanentAddress")  public WebElement permanentAddressMessage;

    // Check Box Elements
    @FindBy(css = ".rct-checkbox")        private WebElement checkBox;
    @FindBy(id = "tree-node-home")        private WebElement homeCheck;
    @FindBy(id = "tree-node-desktop")     private WebElement desktopCheck;
    @FindBy(id = "tree-node-notes")       private WebElement notesCheck;
    @FindBy(id = "tree-node-commands")    private WebElement commandsCheck;
    @FindBy(id = "tree-node-documents")   private WebElement documentsCheck;
    @FindBy(id = "tree-node-workspace")   private WebElement workspaceCheck;
    @FindBy(id = "tree-node-react")       private WebElement reactCheck;
    @FindBy(id = "tree-node-angular")     private WebElement angularCheck;
    @FindBy(id = "tree-node-veu")         private WebElement veuCheck;
    @FindBy(id = "tree-node-office")      private WebElement officeCheck;
    @FindBy(id = "tree-node-public")      private WebElement publicCheck;
    @FindBy(id = "tree-node-private")     private WebElement privateCheck;
    @FindBy(id = "tree-node-classified")  private WebElement classifiedCheck;
    @FindBy(id = "tree-node-general")     private WebElement generalCheck;
    @FindBy(id = "tree-node-downloads")   private WebElement downloadsCheck;
    @FindBy(id = "tree-node-word")        private WebElement wordCheck;
    @FindBy(id = "tree-node-excel")       private WebElement excelCheck;

    // Radio Button Elements
    @FindBy(css = "label[for='yesRadio']")        private WebElement yesRadioButton;
    @FindBy(xpath = "//*[contains(text(),'You have Selected')]") private WebElement radioButtonMessage;
    @FindBy(css = "label[for='impressiveRadio']") private WebElement impressiveRadioButton;

    // Buttons Elements
    @FindBy(xpath = "//button[text()='Click Me']")       private WebElement clickMeButton;
    @FindBy(id = "dynamicClickMessage")                  private WebElement clickMeButtonMessage;
    @FindBy(id = "rightClickBtn")                        private WebElement rightClickMeButton;
    @FindBy(id = "rightClickMessage")                    private WebElement rightClickMeButtonMessage;
    @FindBy(id = "doubleClickBtn")                       private WebElement doubleClickMeButton;
    @FindBy(id = "doubleClickMessage")                   private WebElement doubleClickMeButtonMessage;

    // Web Table Elements
    @FindBy(id = "addNewRecordButton") private WebElement addNewRecordButton;
    @FindBy(id = "firstName")          private WebElement firstNameBox;
    @FindBy(id = "lastName")           private WebElement lastNameBox;
    @FindBy(id = "userEmail")          private WebElement userEmailBox;
    @FindBy(id = "age")                private WebElement ageBox;
    @FindBy(id = "salary")             private WebElement salaryBox;
    @FindBy(id = "department")         private WebElement departmentBox;
    @FindBy(css = "button#submit")     private WebElement submitButtonWebTable;
    @FindBy(id = "closeLargeModal")    private WebElement closeButton;
    @FindBy(id = "searchBox")          private WebElement searchBox;

    // Links & Images
    @FindBy(css = "img[src='/images/Toolsqa.jpg']")     private WebElement validImageLink;
    @FindBy(css = "img[src='/images/Toolsqa_1.jpg']")   private WebElement brokenImageLink;
    @FindBy(linkText = "Click Here for Valid Link")     private WebElement validLink;
    @FindBy(linkText = "Click Here for Broken Link")    private WebElement brokenLink;

    public ElementPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void gotoElements() {
        driver.get(BASE_URL + "/elements");
    }

    public void clickTextBoxOption(){
        textBoxOption.click();
    }

}

