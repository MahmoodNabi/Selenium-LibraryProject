package com.libraryProject.step_definition.Librarian;

import com.libraryProject.pages.LibrarianPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.libraryProject.utils.Driver;
public class change_User_status {
LibrarianPage librarianPage = new LibrarianPage();


    @Then("click a user module")
    public void click_a_user_module() {
librarianPage.user_module.click();
    }
    @Then("choose first active user and click edit user")
    public void choose_first_active_user_and_click_edit_user() {
        librarianPage.first_activeUser.click();
    }



    @Then("change user status to inactive")
    public void change_user_status_to_inactive() {
librarianPage.change_user_status();
    }

    @Then("save changes")
    public void save_changes() {
librarianPage.save_changeButton.click();
    }
    @Then("select inactive users")
    public void select_inactive_users() {
        librarianPage.status1();
    }

    @Then("choose first inactive user and click edit user")
    public void choose_first_inactive_user_and_click_edit_user() {
        librarianPage.first_activeUser.click();
    }

    @Then("change user status to active")
    public void change_user_status_to_active() {
        librarianPage.change_user_status_active();
    }


}
