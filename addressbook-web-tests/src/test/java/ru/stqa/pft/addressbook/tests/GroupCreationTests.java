package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends Testbase {

    @Test
    public void testGroupCreation() {
        applicationManager.getNavigationHalper().gotoGroupPage();
        applicationManager.getGroupHelper().initGroupCreation();
        applicationManager.getGroupHelper().fillGroup(new GroupData("test11", "test12", "test13"));
        applicationManager.getGroupHelper().submitGroupCreation();
        applicationManager.getNavigationHalper().returntoGroupPage();
    }

}
