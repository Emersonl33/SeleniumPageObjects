package br.com.inmetrics.casetest.pages;

import br.com.inmetrics.casetest.PaginaMae;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register extends PaginaMae {

    public Register(WebDriver browser) {
        super(browser);
    }
    public void registrarUsuario(String email, String senha){

        
        browser.findElement(By.id("reg_email")).sendKeys(email);

        
        browser.findElement(By.id("reg_password")).sendKeys(senha);

        
        browser.findElement(By.name("register")).click();
    }
}
