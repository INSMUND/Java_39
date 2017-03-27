package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Pavel1 on 3/27/2017.
 */
public class ContactModificationTests extends Testbase{

    @Test
    public void testContactModification() {
        applicationManager.getNavigationHalper().gotoHomePage();
        applicationManager.getContactHalper().editContact();
        applicationManager.getContactHalper().fillContact(new ContactData("marina", "piotr", "shilonosova", "ssttt", "iuliashilonosova@gmail.com"));
        applicationManager.getContactHalper().updateContact();
        applicationManager.getNavigationHalper().returntoHomePage();
    }
}
