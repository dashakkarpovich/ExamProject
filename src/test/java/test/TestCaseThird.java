package test;

import element.TextElement;
import org.openqa.selenium.By;

public class TestCaseThird extends BaseTest{
        TextElement coockie = new TextElement(By.xpath("//button[@class='button button--solid button--transparent']"),"coockie");

        public void cliclCookie(){
            coockie.click();
        }
    }

