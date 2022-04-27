package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.RegistrationFirst;
import project.WelcomPages;
import project.RegistrationSecond;

import java.io.IOException;

public class MyTest extends BaseTest {
        WelcomPages welcomPages = new WelcomPages();
        RegistrationFirst registrationFirst = new RegistrationFirst();

        @Test
        public void firstTest() throws IOException, InterruptedException {
            welcomPages.open();
            Assert.assertNotNull(welcomPages.isOpened(), "страница не открылась");
            welcomPages.clickButtonHERE();
            Assert.assertEquals(registrationFirst.checkPageFirst(registrationFirst.numberOfPage), "1 / 4", "Первая страница не отрылась");
            registrationFirst.inputPassword();
            registrationFirst.inputEmail();
            registrationFirst.inputDomain();
            registrationFirst.chooseDomain();
            registrationFirst.acceptTerms();
            registrationFirst.goTosecond();
            RegistrationSecond registartionSecond = new RegistrationSecond();
            Assert.assertEquals(registartionSecond.checkPageSecond(registartionSecond.numberOfPage), "2 / 4", "Вторая страница не отрылась");
            registartionSecond.chooseInterest();
            registartionSecond.uploadImage();
            registartionSecond.goThird();
            Assert.assertEquals(registartionSecond.checkPageSecond(registartionSecond.numberOfPage), "3 / 4", "Вторая страница не отрылась");
        }

        @Test
        public void secondTest() {
            welcomPages.open();
            welcomPages.clickButtonHERE();
            Assert.assertNotNull(welcomPages.isOpened(), "страница не открылась");
            registrationFirst.clickHelpFOrm();
            Assert.assertNotNull(registrationFirst.hiddenForm.findElements().size(), "форма не спряталась");
        }

        @Test
        public void thirdTest() {
            welcomPages.open();
            welcomPages.clickButtonHERE();
            Assert.assertNotNull(welcomPages.isOpened(), "страница не открылась");
            registrationFirst.cliclCookie();
            Assert.assertNull(registrationFirst.coockie.findElements().size(), "coockie не закрылись");
        }

        @Test
        public void forthTest() {
            welcomPages.open();
            welcomPages.clickButtonHERE();
            Assert.assertNotNull(welcomPages.isOpened(), "страница не открылась");
            Assert.assertEquals(registrationFirst.timer.getText(), "00:00:00", "таймер ведет отсчет не с нуля");
        }
    }

