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
        if (!applicationManager.getContactHalper().isThereAContact())
        {
            applicationManager.getNavigationHalper().gotoContactPage();
            applicationManager.getContactHalper().createContact(new ContactData("iulia", "piotr", "shilonosova", "iulaSH", "iuliashilonosova@gmail.com","test11"),true);

        }
        applicationManager.getContactHalper().editContact();
        applicationManager.getContactHalper().fillContact(new ContactData("marina", "piotr", "shilonosova", "ssttt", "iuliashilonosova@gmail.com",null),false);
        applicationManager.getContactHalper().updateContact();
        applicationManager.getNavigationHalper().returntoHomePage();
    }
}
