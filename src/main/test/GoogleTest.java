import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class GoogleTest {

    static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    @Ignore
    public void teste() {
        driver.get("http://www.google.com");
        WebElement campoPesquisa = driver.findElement(By.name("q"));
        campoPesquisa.sendKeys("Mater Dei");
        campoPesquisa.submit();


        String primeiroResultado = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3/div")).getText();
        assertEquals("Faculdade Mater Dei - Pato Branco", primeiroResultado);
    }

    @Test
    @Ignore
    public void teste2() {
        driver.get("http://www.google.com");
        WebElement campoPesquisa = driver.findElement(By.name("q"));
        campoPesquisa.sendKeys("Mater Dei");

        WebElement btnEstouComSorte = driver.findElements(By.name("btnI")).get(1);
        btnEstouComSorte.click();


    }

    @AfterClass
    public static void afterClass() {
        driver.quit();
    }

}
