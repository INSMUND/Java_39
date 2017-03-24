package ru.stqa.pft.addressbook;


import org.testng.annotations.Test;



public class GroupCreationTests extends Testbase {

    @Test
    public void testGroupCreation() {
       // wd.get("http://localhost/addressbook/");
      //  login();
        gotoGroupPage();
        initGroupCreation();
        fillGroup(new GroupData("test11", "test12", "test13"));
        submitGroupCreation();
        returntoGroupPage();
    }

}
