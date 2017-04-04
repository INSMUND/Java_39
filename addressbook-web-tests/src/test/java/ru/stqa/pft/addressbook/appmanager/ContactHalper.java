package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

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
    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void deleteContact() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
        wd.switchTo().alert().accept();
    }
    public void editContact() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
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
}
