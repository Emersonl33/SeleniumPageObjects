package br.com.inmetrics.casetest.pages;

import br.com.inmetrics.casetest.PaginaMae;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home extends PaginaMae {
    private final By BotaoMyAccount = By.id("menu-item-50");

    public Home(WebDriver browser) {
        super(browser);
    }

    public void abrirSite(){
        browser.get("https://practice.automationtesting.in");
    }

    public void linkMyAccount(){
        browser.findElement(BotaoMyAccount).click();
    }

}
