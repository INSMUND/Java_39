package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;

/**
 * Created by Pavel1 on 3/24/2017.
 */
public class ApplicationManager {
    private FirefoxDriver wd;

    private NavigationHalper navigationHalper;
    private GroupHelper groupHelper;
    private SessionHalper sessionHalper;
    private ContactHalper contactHalper;



    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd);
        navigationHalper = new NavigationHalper(wd);
        sessionHalper=new SessionHalper(wd);
        contactHalper=new ContactHalper(wd);
        sessionHalper.login("admin", "secret");
    }


    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHalper getNavigationHalper() {
        return navigationHalper;
    }
    public ContactHalper getContactHalper() {
        return contactHalper;
    }


}