package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends Testbase {


    @Test
    public void testContactCreation() {
        List<ContactData> before=applicationManager.getContactHalper().getContactDataList();
        applicationManager.getNavigationHalper().gotoContactPage();
        ContactData contact=new ContactData("iulia", "piotr", "shilonosova", "iulaSH", "iuliashilonosova@gmail.com","test11");
        applicationManager.getContactHalper().fillContact(contact,true);

        applicationManager.getContactHalper().enterNewContact();
        applicationManager.getNavigationHalper().returntoHomePage() ;
        List<ContactData> after=applicationManager.getContactHalper().getContactDataList();
        before.add(contact);
        Comparator<? super ContactData> byId=(c1, c2)->Integer.compare(c1.getId(),c2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(after, before);
    }


}
