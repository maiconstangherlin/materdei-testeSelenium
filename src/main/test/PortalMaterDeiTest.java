import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertNotNull;

public class PortalMaterDeiTest extends BaseSeleniumTest {

    @Test
    public void testaPortal() {
        driver.get("https://materdei.jacad.com.br/prof/professor.login.logic");

        driver.findElement(By.id("login_prof")).sendKeys("maicon");
        driver.findElement(By.id("senha")).sendKeys("123");

        driver.findElement(By.className("btn-success")).click();

        WebElement message = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div"));
        assertNotNull(message);
    }

}
