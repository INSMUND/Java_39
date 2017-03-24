package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;


public class GroupDeletionTests extends Testbase {


    
    @Test
    public void testGroupDeletion() {

        applicationManager.gotoGroupPage();
        applicationManager.selectGroup();
        applicationManager.deleteSelectedGroups();
        applicationManager.returntoGroupPage();
    }


}
