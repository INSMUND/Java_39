package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;


public class GroupCreationTests extends Testbase {

    @Test
    public void testGroupCreation() {
        applicationManager.getNavigationHalper().gotoGroupPage();
        List<GroupData> before=applicationManager.getGroupHelper().getGroupDataList();
        System.out.println(before.size());
        applicationManager.getGroupHelper().initGroupCreation();
        GroupData group =new GroupData("test13", null, null);
        applicationManager.getGroupHelper().fillGroup(group);
        applicationManager.getGroupHelper().submitGroupCreation();
        applicationManager.getNavigationHalper().returntoGroupPage();
        List<GroupData> after=applicationManager.getGroupHelper().getGroupDataList();
        System.out.println(after.size());

        //   group.setId(after.stream().max( (o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());
        before.add(group);
        Comparator<? super GroupData> byId=(g1, g2)->Integer.compare(g1.getId(),g2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(after, before);
    }

}
