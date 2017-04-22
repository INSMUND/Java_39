package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel1 on 3/24/2017.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }



    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroup(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());

    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();


    }
    public void editGroup() {
        click(By.xpath("//div[@id='content']/form/input[6]"));
    }
    public void updateGroup() {
        click(By.name("update"));
    }


    public void createGroup(GroupData group) {
        initGroupCreation();
       fillGroup(group);
        submitGroupCreation();


    }

    public boolean isThereAGroup() {
        return isElementPresent(By.name("selected[]"));
    }
    public List<GroupData> getGroupDataList (){
        List<GroupData> groups=new ArrayList<GroupData>();
        List<WebElement> elements=wd.findElements(By.cssSelector("span.group"));
        for(WebElement element:elements){
            String name=element.getText();
            int index=Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            GroupData group=new GroupData(index,name,null,null);
            groups.add(group);
        }
        return groups;
    }
}
