package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends Testbase {


    @Test
    public void testContactCreation() {
        gotoContactPage();
        fillContact(new ContactData("iulia", "piotr", "shilonosova", "iulaSH", "iuliashilonosova@gmail.com"));
        enterNewContact();
    }


}
