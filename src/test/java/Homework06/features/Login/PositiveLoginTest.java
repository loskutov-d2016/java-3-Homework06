package Homework06.features.Login;

import Homework06.base.BaseUiTest;
import Homework06.pages.LoginPage;
import org.junit.Test;

import static Homework06.common.Conficuration.*;

public class PositiveLoginTest extends BaseUiTest {


    @Test
    public void loginWithBaseUserTest() {
        new LoginPage(driver)
        .enterLogin(STUDENT_LOGIN)
        .enterPassword(STUDENT_PASSWORD)
        . clickLoginButton()
        .checkUrl(BASE_URL);
    }
}
