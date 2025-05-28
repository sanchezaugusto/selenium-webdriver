package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ElementPage;

public class InteractionTest {

    private WebDriver driver;
    private ElementPage elementPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        elementPage = new ElementPage(driver);
        elementPage.gotoElements();
        elementPage.clickTextBoxOption();
    }

    @Test
    public void test1(){

    }
}
