package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

/**
 * Created by Pavel1 on 3/24/2017.
 */
public class Testbase {

    protected final ApplicationManager applicationManager = new ApplicationManager(BrowserType.FIREFOX);

    @BeforeMethod
    public void setUp() throws Exception {
        applicationManager.init();
    }

    @AfterMethod
    public void tearDown() {
        applicationManager.stop();
    }

}
