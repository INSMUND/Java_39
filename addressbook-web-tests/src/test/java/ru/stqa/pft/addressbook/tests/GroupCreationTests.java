package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends Testbase {

    @Test
    public void testGroupCreation() {
       // wd.get("http://localhost/addressbook/");
      //  login();
        applicationManager.gotoGroupPage();
        applicationManager.initGroupCreation();
        applicationManager.fillGroup(new GroupData("test11", "test12", "test13"));
        applicationManager.submitGroupCreation();
        applicationManager.returntoGroupPage();
    }

}
