package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by Pavel1 on 3/27/2017.
 */
public class GroupModificationTests extends Testbase{
    @Test
    public void testGroupModification() {
        applicationManager.getNavigationHalper().gotoGroupPage();
        applicationManager.getGroupHelper().selectGroup();
        applicationManager.getGroupHelper().editGroup();
        applicationManager.getGroupHelper().fillGroup(new GroupData("test123", "test12", "test13"));
        applicationManager.getGroupHelper().updateGroup();
        applicationManager.getNavigationHalper().returntoGroupPage();
    }
}
