package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Pavel1 on 3/24/2017.
 */
public class NavigationHalper {
FirefoxDriver wd;

    public NavigationHalper(FirefoxDriver wd) {
        this.wd=wd;
    }

    public void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void gotoContactPage() {
        wd.findElement(By.linkText("add new")).click();
    }


}
