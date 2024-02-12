package br.com.inmetrics.casetest.tests;
import br.com.inmetrics.casetest.pages.Home;
import br.com.inmetrics.casetest.pages.Register;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@DisplayName("Teste Register")
public class Tests {
    public WebDriver browser;
    @BeforeEach
    public void inicio(){
        //Abrir o navegador
        WebDriverManager.chromedriver().setup();
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    @DisplayName("Registrar um novo usuário")
    public void testRegister() {

        //Abrir o site de teste
        Home home = new Home (browser);
        home.abrirSite();

        //Clicar no Botao MyAccount
        home.linkMyAccount();

        //Registrar o usuário
        Register registro = new Register(browser);
        registro.registrarUsuario("ornot175@gmail.com", "SPFC1993@");

    }
    @AfterEach
    public void fim(){
        //fechar browser
        browser.quit();
    }
}
