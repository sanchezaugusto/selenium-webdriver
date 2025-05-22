package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WidgetPage {
    private WebDriver driver;


    // Constructor
    public WidgetPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo() {
        driver.get("https://your-base-url.com/widgets"); // Reemplaza con tu BASE_URL real
    }
}
