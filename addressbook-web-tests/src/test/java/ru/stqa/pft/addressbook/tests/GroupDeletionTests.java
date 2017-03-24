package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;


public class GroupDeletionTests extends Testbase {


    
    @Test
    public void testGroupDeletion() {

        applicationManager.getNavigationHalper().gotoGroupPage();
        applicationManager.getGroupHelper().selectGroup();
        applicationManager.getGroupHelper().deleteSelectedGroups();
        applicationManager.getGroupHelper().returntoGroupPage();
    }


}
