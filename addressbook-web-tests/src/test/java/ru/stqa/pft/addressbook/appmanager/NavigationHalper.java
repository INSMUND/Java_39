package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Pavel1 on 3/24/2017.
 */
public class NavigationHalper extends HelperBase{

    public NavigationHalper(FirefoxDriver wd) {
       super(wd);
    }

    public void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void gotoContactPage() {
        click(By.linkText("add new"));
    }


}
