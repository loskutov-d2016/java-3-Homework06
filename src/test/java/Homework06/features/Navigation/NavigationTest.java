package Homework06.features.Navigation;

import Homework06.base.BaseUiTest;
import Homework06.common.Conficuration;
import Homework06.enums.NavigationBarTabs;
import Homework06.pages.LoginPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public  class NavigationTest extends BaseUiTest {
    @ParameterizedTest
    @MethodSource("navigationTabProvider")
    public void checkMainNavigationTabsTest(NavigationBarTabs barTabs) {
        new LoginPage(driver)
                .authoriseScenario(Conficuration.STUDENT_LOGIN,Conficuration.STUDENT_PASSWORD)
                .getPageNavigation()
                .checkTabVisability(barTabs);
    }
    static NavigationBarTabs[] navigationTabProvider() {return NavigationBarTabs.values();}
}
