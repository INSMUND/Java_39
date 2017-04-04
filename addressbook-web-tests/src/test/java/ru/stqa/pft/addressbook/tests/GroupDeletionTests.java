package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupDeletionTests extends Testbase {


    
    @Test
    public void testGroupDeletion() {
        applicationManager.getNavigationHalper().gotoGroupPage();
        if (!applicationManager.getGroupHelper().isThereAGroup())
        {
            applicationManager.getGroupHelper().createGroup(new GroupData("test11", null, null) );
            applicationManager.getNavigationHalper().returntoGroupPage();
        }
        applicationManager.getGroupHelper().selectGroup();
        applicationManager.getGroupHelper().deleteSelectedGroups();
        applicationManager.getNavigationHalper().returntoGroupPage();
    }


}
