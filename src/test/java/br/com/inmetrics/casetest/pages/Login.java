package br.com.inmetrics.casetest.pages;
import br.com.inmetrics.casetest.PaginaMae;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends PaginaMae {

    public Login(WebDriver browser) {
        super(browser);
    }

    public void preencherFormulario(String username, String password) {
        browser.findElement(By.id("username")).sendKeys(username);
        browser.findElement(By.id("password")).sendKeys(password);
        browser.findElement(By.name("login")).click();
    }

    public boolean LoginOk() {
        // Verificar se o usuário está logado
        return browser.findElement(By.linkText("Logout")).isDisplayed();
    }
    public boolean LoginFail() {
        // Verificar se o login falhou a partir de uma mensagem de erro
        return browser.findElement(By.id("customer_login")).isDisplayed();
    }

}
