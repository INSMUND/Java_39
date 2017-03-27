package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Pavel1 on 3/24/2017.
 */
public class NavigationHalper extends HelperBase{

    public NavigationHalper(WebDriver wd) {
       super(wd);
    }

    public void gotoGroupPage() {

        click(By.linkText("groups"));
    }

    public void gotoContactPage() {
        click(By.linkText("add new"));
    }
    public void gotoHomePage() {
        click(By.linkText("home"));
    }
    public void returntoHomePage() {
        click(By.linkText("home page"));
    }
    public void returntoGroupPage() {
        click(By.linkText("group page"));
    }


}
