package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends Testbase {


    @Test
    public void testContactCreation() {
        applicationManager.gotoContactPage();
        applicationManager.fillContact(new ContactData("iulia", "piotr", "shilonosova", "iulaSH", "iuliashilonosova@gmail.com"));
        applicationManager.enterNewContact();
    }


}
