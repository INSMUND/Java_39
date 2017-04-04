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
        if (isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                &&isElementPresent(By.name("new"))){
            return;
        }

        click(By.linkText("groups"));
    }

    public void gotoContactPage() {
        if (isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Edit / add address book entry")
                &&isElementPresent(By.name("new_group"))){
            return;
        }

        click(By.linkText("add new"));
    }
    public void gotoHomePage() {
        if (isElementPresent(By.id("maintable")))
        {
            return;
        }
        click(By.linkText("home"));
    }
    public void returntoHomePage() {
        if (isElementPresent(By.id("maintable")))
        {
            return;
        }
        click(By.linkText("home page"));
    }
    public void returntoGroupPage() {
        if (isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                &&isElementPresent(By.name("new"))){
            return;
        }
        click(By.linkText("group page"));
    }


}
