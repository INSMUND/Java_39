package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.openqa.selenium.OutputType.*;

public class ContactDeletionTests extends Testbase {



    @Test
    public void testContactDeletion() {
        applicationManager.getNavigationHalper().gotoHomePage();
        if (!applicationManager.getContactHalper().isThereAContact())
        {
            applicationManager.getNavigationHalper().gotoContactPage();
          applicationManager.getContactHalper().createContact(new ContactData("iulia", "piotr", "shilonosova", "iulaSH", "iuliashilonosova@gmail.com","test11"),true);

        }
        applicationManager.getContactHalper().selectContact();
        applicationManager.getContactHalper().deleteContact();

    }
}