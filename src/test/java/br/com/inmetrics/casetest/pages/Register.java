package br.com.inmetrics.casetest.pages;

import br.com.inmetrics.casetest.PaginaMae;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register extends PaginaMae {

    public Register(WebDriver browser) {
        super(browser);
    }
    public void registrarUsuario(String email, String senha){

        //Digitar o nome do campo emailadress
        browser.findElement(By.id("reg_email")).sendKeys(email);

        //Digitar a senha no campo Password
        browser.findElement(By.id("reg_password")).sendKeys(senha);

        //Clicar no botão register
        browser.findElement(By.name("register")).click();
    }
}
