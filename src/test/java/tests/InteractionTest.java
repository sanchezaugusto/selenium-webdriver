package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.InteractionPage;

public class InteractionTest {

    private WebDriver driver;
    private InteractionPage interactionPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        interactionPage = new InteractionPage(driver);
        interactionPage.goTo();
    }

    @Test
    public void test1(){

    }
}
