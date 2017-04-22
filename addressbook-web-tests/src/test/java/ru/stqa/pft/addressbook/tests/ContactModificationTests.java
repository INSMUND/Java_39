package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Pavel1 on 3/27/2017.
 */
public class ContactModificationTests extends Testbase{

    @Test
    public void testContactModification() {
        applicationManager.getNavigationHalper().gotoHomePage();
        if (!applicationManager.getContactHalper().isThereAContact()) {
            applicationManager.getNavigationHalper().gotoContactPage();
            applicationManager.getContactHalper().createContact(new ContactData("iulia", "piotr", "shilonosova", "iulaSH", "iuliashilonosova@gmail.com", "test11"), true);

        }
        List<ContactData> before = applicationManager.getContactHalper().getContactDataList();
        applicationManager.getContactHalper().editContact(before.size() - 1);
        ContactData contact = new ContactData(before.get(before.size() - 1).getId(), "marina", "piotr", "shilonosova", "ssttt", "iuliashilonosova@gmail.com", null);
        applicationManager.getContactHalper().fillContact(contact, false);
        applicationManager.getContactHalper().updateContact();
        applicationManager.getNavigationHalper().returntoHomePage();
        List<ContactData> after = applicationManager.getContactHalper().getContactDataList();
        before.remove(before.size() - 1);
        before.add(contact);
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        after.sort(byId);
        before.sort(byId);
        Assert.assertEquals(after, before);
    }
}
