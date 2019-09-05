import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.*;

public class PortalMaterDeiAlunoTest extends BaseSeleniumTest {

    @Test
    public void testaPortal() {
        driver.get("https://materdei.jacad.com.br/academico/aluno/login");

        driver.findElement(By.className("btn-success")).click();

        WebElement ra = driver.findElement(By.name("login.login"));
        ra.sendKeys("123");

        WebElement senha = driver.findElement(By.name("login.password"));
        senha.sendKeys("123");
        senha.submit();

        WebElement message = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div"));

        assertNotNull(message);
        assertThat(message.getText(),
                containsString("Login e/ou senha incorretos. Por favor tente novamente"));
    }

}
