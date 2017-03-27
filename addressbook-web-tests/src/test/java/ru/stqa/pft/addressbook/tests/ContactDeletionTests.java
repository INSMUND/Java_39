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
import static org.openqa.selenium.OutputType.*;

public class ContactDeletionTests extends Testbase {
    //   FirefoxDriver wd;


    @Test
    public void ContactDeletion() {


        applicationManager.getNavigationHalper().gotoHomePage();
        applicationManager.getContactHalper().selectContact();
        applicationManager.getContactHalper().deleteContact();

    }
}