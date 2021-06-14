package Homework06.views;

import Homework06.base.BaseView;
import Homework06.base.SubMenu;
import Homework06.base.SubMenuButtons;
import Homework06.enums.ExpenseSubMenuButtons;
import Homework06.pages.AllExpensesPage;
import org.openqa.selenium.WebDriver;

public class ExpenseSubMenu extends SubMenu {

    public ExpenseSubMenu(WebDriver driver) {super(driver);}

    @Override
    public BaseView clickSubMenuButton(SubMenuButtons) {
        if (buttons instanceof ExpenseSubMenuButtons) {
            switch ((ExpenseSubMenuButtons) buttons) {
                case EXPENSE_REQUEST:
                    driver.findElement(((ExpenseSubMenuButtons) buttons).getBy()).click();
                    return new AllExpensesPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        } else {
            throw new IllegalArgumentException("Incorrect button type");
        }
    }
}
