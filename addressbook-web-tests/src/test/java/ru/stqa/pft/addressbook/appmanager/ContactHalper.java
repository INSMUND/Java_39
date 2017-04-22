package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel1 on 3/24/2017.
 */
public class ContactHalper extends HelperBase {


    public ContactHalper(WebDriver wd) {
        super(wd);

    }
    public void fillContact(ContactData contactData,boolean creation) {
        type (By.name("firstname"),contactData.getName());
        type(By.name("middlename"),contactData.getMiddlename());
        type(By.name("lastname"),contactData.getLastname());
        type(By.name("nickname"),contactData.getNickname());
        type(By.name("address"),contactData.getAddress());
        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        }else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }


     //   if (isElementPresent(By.name("new_group"))) {
      //      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
      //  }

    }

    public void enterNewContact() {
       click(By.xpath("//div[@id='content']/form/input[21]"));
    }
    public void selectContact(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();

    }

    public void deleteContact() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
        wd.switchTo().alert().accept();
    }
    public void editContact(int index) {
        List<WebElement> editList = wd.findElements(By.xpath("//img[@title='Edit']"));
        editList.get(index).click();

    }
    public void updateContact() {
        click(By.xpath("//div[@id='content']/form[1]/input[22]"));
    }


    public void createContact(ContactData contactData,boolean creation) {

        fillContact(contactData,creation);
        enterNewContact();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));

    }
    public List<ContactData> getContactDataList() {


        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = wd.findElements(By.xpath("//*[@id=\"maintable\"]//tr[@name]"));
        for (WebElement element : elements) {
            int Id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            List<WebElement> innerElements = element.findElements(By.tagName("td"));
            String lastname = innerElements.get(1).getText();
            String firstname = innerElements.get(2).getText();
            ContactData contact = new ContactData(Id, firstname, null, lastname, null, null, null);
            contacts.add(contact);


        }
        return contacts;
    }
}
