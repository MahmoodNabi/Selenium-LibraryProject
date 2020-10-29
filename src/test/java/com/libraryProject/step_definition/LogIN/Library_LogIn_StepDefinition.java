package com.libraryProject.step_definition.LogIN;

import com.libraryProject.pages.LoginPage;
import com.libraryProject.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Library_LogIn_StepDefinition {
LoginPage loginPage=new LoginPage();
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
    }
    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String string) {
        loginPage.login(string);
    }

//
    @Then("user should be see dashboard page")
    public void userShouldBeSeeDashboardPage() {
String expectedresult ="Dashboard";
String  actualresult= loginPage.dashBoard().trim();
        Assert.assertTrue("User does not see Dashboard", expectedresult.equals(actualresult) );
    }
    @Then("user should be see {string} page")
    public void user_should_be_see_page(String string) {
        String expectedresult2 = "Book Management";
        String actualresult2 = loginPage.studentPage();
        Assert.assertTrue("Student does not see page", expectedresult2.equals(actualresult2));
    }
    @When("user logs in with valid username {string} and wrong password {string}")
    public void userLogsInWithValidUsernameAndWrongPassword(String username, String password) {
    loginPage.login(username, password);

    }

    @Then("use verifies that {string} message is displayed")
    public void useVerifiesThatMessageIsDisplayed(String expected) {
        String actual = loginPage.getWarningMessageText();
        Assert.assertTrue("Warning message is not displayed", expected.equals(actual));

    }
}
