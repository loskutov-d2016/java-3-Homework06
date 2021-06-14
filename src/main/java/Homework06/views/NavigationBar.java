package Homework06.views;

import Homework06.base.BaseView;
import Homework06.base.SubMenu;
import Homework06.enums.NavigationBarTabs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class NavigationBar extends BaseView {

    public NavigationBar(WebDriver driver) {super(driver);}

    public SubMenu moveCursorToNavigationTab(NavigationBarTabs tab) {
        Action actions = new Actions(driver);
        ((Actions) actions)
                .moveToElement(driver.findElement(tab.getBy()))
                .build()
                .perform();

        switch (tab) {
            case  EXPENSES;
            return new ExpenseSubMenu(driver);
            default:
                throw new IllegalArgumentException("Another tabs currenly not implemented");
        }
    }
    public NavigationBar checkTabVisability(NavigationBarTabs tab) {
        Assertions.assertTrue(driver.findElement(tab.getBy()).isDisplayed());
        return  this;
    }
}
