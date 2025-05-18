package tests;

import pages.ElementPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.*;

import static org.testng.Assert.assertEquals;

public class ElementTest {

    private WebDriver driver;
    private ElementPage elementPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        elementPage = new ElementPage(driver);
        elementPage.gotoElements();               // navega a /elements
        elementPage.clickTextBoxOption();         // selecciona Text Box
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

/*    @Test
    public void textBoxShouldWork() {
        elementPage.fillFullName("test");
        assertEquals(elementPage.getFullNameValue(), "test",
                "El campo Full Name no retuvo el valor esperado");
    }

    @Test
    public void emailBoxShouldWork() {
        elementPage.fillEmail("test");
        assertEquals(elementPage.getEmailValue(), "test",
                "El campo Email no retuvo el valor esperado");
    }

    @Test
    public void currentAddressBoxShouldWork() {
        elementPage.fillCurrentAddress("test");
        assertEquals(elementPage.getCurrentAddressValue(), "test",
                "El campo Current Address no retuvo el valor esperado");
    }

    @Test
    public void permanentAddressBoxShouldWork() {
        elementPage.fillPermanentAddress("test");
        assertEquals(elementPage.getPermanentAddressValue(), "test",
                "El campo Permanent Address no retuvo el valor esperado");
    }*/

    @Test
    public void submitButtonShouldWork() {
        // Rellenar y enviar
        elementPage.fullNameBox.sendKeys("jhon doe");;
        elementPage.emailBox.sendKeys("jhon@mail.com");
        elementPage.currentAddressBox.sendKeys("street 123");
        elementPage.permanentAddressBox.sendKeys("street 123");
        elementPage.submitButton.click();

        // Verificar mensajes
        assertEquals(elementPage.nameMessage.getText(), "Name:jhon doe");
        assertEquals(elementPage.emailMessage.getText(), "Email:jhon@mail.com");
        assertEquals(elementPage.currentAddressMessage.getText(), "Current Address :street 123");
        assertEquals(elementPage.permanentAddressMessage.getText(), "Permananet Address :street 123");
    }
}
