package br.com.inmetrics.casetest.tests;

import br.com.inmetrics.casetest.pages.Home;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Teste Register")
public class tests {
    @Test
    @DisplayName("Registrar um novo usuário")
    public void testRegister() {
        //Abrir o navegador
        WebDriverManager.chromedriver().setup();
        WebDriver browser = new ChromeDriver();

        //Abrir o site de teste
        Home home = new Home (browser);
        home.abrirSite();
        
        //Digitar o nome do campo emailadress
        browser.findElement(By.id("reg_email")).sendKeys("emersonl33@hotmail.com");

        //Digitar a senha no campo Password
        browser.findElement(By.id("reg_password")).sendKeys("030695");

        //Clicar no botão register
        browser.findElement(By.name("register")).click();
    }
}
