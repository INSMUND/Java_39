package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;


import java.util.concurrent.TimeUnit;

/**
 * Created by Pavel1 on 3/24/2017.
 */
public class ApplicationManager {
    private WebDriver wd;

    private NavigationHalper navigationHalper;
    private GroupHelper groupHelper;
    private SessionHalper sessionHalper;
    private ContactHalper contactHalper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init() {
      
        if (browser.equals(BrowserType.FIREFOX))wd = new FirefoxDriver();
        else
            if(browser.equals(BrowserType.CHROME))wd=new ChromeDriver(); else
               if (browser.equals(BrowserType.IE)) wd=new InternetExplorerDriver();

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