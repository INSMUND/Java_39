package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;


public class GroupDeletionTests extends Testbase {


    
    @Test
    public void testGroupDeletion() {
        applicationManager.getNavigationHalper().gotoGroupPage();
        if (!applicationManager.getGroupHelper().isThereAGroup())
        {
            applicationManager.getGroupHelper().createGroup(new GroupData("test11", null, null) );
            applicationManager.getNavigationHalper().returntoGroupPage();
        }
        List<GroupData> before=applicationManager.getGroupHelper().getGroupDataList();
        applicationManager.getGroupHelper().selectGroup(before.size()-1);
        applicationManager.getGroupHelper().deleteSelectedGroups();
        applicationManager.getNavigationHalper().returntoGroupPage();
        List<GroupData> after=applicationManager.getGroupHelper().getGroupDataList();
        before.remove(before.size()-1);
        Assert.assertEquals(new HashSet<Object>(after), new HashSet<Object>(before));
    }



}
