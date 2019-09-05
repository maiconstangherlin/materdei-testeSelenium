import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RonaldoTest {

    static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    public void nomeUsuarioInvalido() throws InterruptedException {
        driver.get("https://www.medplusweb.com.br/");

        WebElement txtLogin = driver.findElement(By.id("txtLogin"));
        txtLogin.sendKeys("teste");
        txtLogin.submit();

        WebElement mensagem = driver.findElement(By.xpath("//*[@id=\"mensagem\"]"));
        assertNotNull(mensagem);
    }

    @AfterClass
    public static void afterClass() {
        driver.quit();
    }

}
