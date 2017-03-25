package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Pavel1 on 3/24/2017.
 */
public class SessionHalper extends HelperBase{
  //FirefoxDriver wd;

    public SessionHalper(FirefoxDriver wd) {

            super(wd);
        }



    public void login(String username, String password) {
        type (By.name("user"),username);
        type(By.name("pass"),password);

       click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }
}
