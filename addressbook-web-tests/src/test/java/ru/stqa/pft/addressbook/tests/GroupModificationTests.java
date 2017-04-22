package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Pavel1 on 3/27/2017.
 */
public class GroupModificationTests extends Testbase{
    @Test
    public void testGroupModification() {
        applicationManager.getNavigationHalper().gotoGroupPage();
        if (!applicationManager.getGroupHelper().isThereAGroup())
        {
            applicationManager.getGroupHelper().createGroup(new GroupData("test11", null, null) );
            applicationManager.getNavigationHalper().returntoGroupPage();
        }
        List<GroupData> before=applicationManager.getGroupHelper().getGroupDataList();
        applicationManager.getGroupHelper().selectGroup(before.size()-1);
        applicationManager.getGroupHelper().editGroup();
        GroupData group=new GroupData(before.get(before.size()-1).getId(), "test123", null, null);
        applicationManager.getGroupHelper().fillGroup(group);
        applicationManager.getGroupHelper().updateGroup();
        applicationManager.getNavigationHalper().returntoGroupPage();
        List<GroupData>after=applicationManager.getGroupHelper().getGroupDataList();
        before.remove(before.size()-1);
        before.add(group);
        Comparator<? super GroupData> byId=(g1, g2)->Integer.compare(g1.getId(),g2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before,after);
    }
}
