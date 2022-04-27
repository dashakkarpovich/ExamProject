package test;

import Ulits.ConfigFileReader;
import framework.browser.Browser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
        private Browser browser = Browser.BROWSER;
        private ConfigFileReader config = ConfigFileReader.configFileReader;
        @BeforeTest

        public void before(){
            browser.getDriver().manage().window().maximize();
        }
    }

