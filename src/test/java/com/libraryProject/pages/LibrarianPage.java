package com.libraryProject.pages;
import com.libraryProject.utils.ConfigurationReader;
import com.libraryProject.utils.Driver;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LibrarianPage extends BasePage {
    @FindBy(xpath = "//*[@id='tbl_users']/thead/tr")
    private WebElement table_users;

    @FindBy(xpath = "//*[@id='edit_user_form']/div[1]/div/div[3]/div[2]/div/select")
    public static WebElement change_status_dropdown;

    @FindBy(xpath = "//*[@id='menu_item']/li[2]")
    public WebElement user_module;

    @FindBy(xpath = "//*[@id='tbl_users']/tbody/tr[1]/td[1]/a")
    public WebElement first_activeUser;

    @FindBy(xpath = "//*[@id='edit_user_form']/div[2]/button[2]")
    public WebElement save_changeButton;

    @FindBy(id = "user_status")
    public static WebElement status;


    public void change_user_status() {
        Select select = new Select(change_status_dropdown);
        select.selectByVisibleText("INACTIVE");
    }

    public void status1() {
        Select select1 = new Select(status);
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        select1.selectByValue("INACTIVE");
    }

    public void change_user_status_active() {
        Select select = new Select(change_status_dropdown);
        select.selectByVisibleText("ACTIVE");


    }
}