package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
     @Test
     public void test1(){
            driver.get("https://www.youtube.com/watch?v=QQliGCtqD2w&t=879s");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.quit();
        }
}
