package br.com.inmetrics.casetest.tests;
import br.com.inmetrics.casetest.pages.Home;
import br.com.inmetrics.casetest.pages.Login;
import br.com.inmetrics.casetest.pages.Register;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;


@DisplayName("Teste Register")
public class MainTests{
    private WebDriver browser;
    @BeforeEach
    public void setup(){
    
        WebDriverManager.chromedriver().setup();
        this.browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        
        Home home = new Home(browser);
        home.abrirSite();

        
        home.linkMyAccount();

    }
    @Test
    @DisplayName("Registrar")
    public void testRegister() {

        o
        Register registro = new Register(browser);
        registro.registrarUsuario("ornot175@gmail.com", "SPFC1993@");

    }
    @Test
    @DisplayName("Testar Login com credenciais válidas")
    public void testLogincredvalida() {
        
        Login login = new Login(browser);
        login.preencherFormulario("ornot175@gmail.com", "SPFC1993@");

       
        Assert.assertTrue(login.LoginOk());
    }

    @Test
    @DisplayName("Testar Login com credenciais inválidas")
    public void testLogincredinvalida() {
        
        Login login = new Login(browser);
        login.preencherFormulario("ornot175@gmail.com", "1234567");

       
        Assert.assertTrue(login.LoginFail());
    }

    @AfterEach
    public void close(){
        browser.quit();
    }
}
