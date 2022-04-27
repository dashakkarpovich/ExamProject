package project;

import Ulits.ConfigFileReader;
import element.TextElement;
import framework.browser.Browser;
import org.openqa.selenium.By;

public class WelcomPages extends BasePage {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private Browser browser = Browser.BROWSER;
    public void open() {
        browser.goTo(config.getApplicationUrl());
    }

    public int isOpened(){
        return openPage.findElements().size();
    }
    private TextElement clickToButtonHERE = new TextElement(By.xpath("//a[@class='start__link']"), "clickToButtonHERE");
    public TextElement openPage = new TextElement(By.xpath("//div[@id='app']"), "openPage");
    public void clickButtonHERE() {
        clickToButtonHERE.click();
    }



}


