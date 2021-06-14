package Homework06.features.Expences;

import Homework06.base.BaseUiTest;
import Homework06.common.Conficuration;
import Homework06.enums.ExpenseSubMenuButtons;
import Homework06.enums.NavigationBarTabs;
import Homework06.pages.AllExpensesPage;
import Homework06.pages.LoginPage;
import org.junit.Test;

public class NewExpensesTest extends BaseUiTest {

    @Test
    public void createNewExpensePositiveTest(){
        AllExpensesPage expensesScreen = (AllExpensesPage) new LoginPage(driver)
        .authoriseScenario(Conficuration.STUDENT_LOGIN, Conficuration.STUDENT_PASSWORD)
                .moveCursorToNavigationTab(NavigationBarTabs.EXPENSES)
                . clickSubMenuButton(ExpenseSubMenuButtons.EXPENSE_REQUEST);

        expensesScreen
                .clickOnCreateNewExpenseButton()
                .enterDescription("test 1234")
                .selectBusinessUnit(1)
                .selectExpenditure(87)
                .setExpenseSum(1000)
                .clickNotifyDateChangedCheckBox()
                .selectDateInDatePicker(20)
                .clickSubmit()
                .checkNewExpensePopUp();
    }
}
