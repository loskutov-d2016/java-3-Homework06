package Homework06.enums;

import Homework06.base.SubMenuButtons;
import org.openqa.selenium.By;

public class ExpenseSubMenuButtons implements SubMenuButtons {
    EXPENSE_REQUEST(".//span[@class='title' and text()='Заявки на расходы']");
    private final By by;

    ExpenseSubMenuButtons(String xpath) {this.by = By.xpath();}

    public By getBy(){return by;}
}
