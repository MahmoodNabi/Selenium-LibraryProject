package com.libraryProject.pages;

import com.libraryProject.utils.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 public class LoginPage extends BasePage {
@FindBy(xpath = "//*[@id='menu_item']/li[1]/a/span[1]")
private WebElement dashboard;
@FindBy (xpath = "//*[@id='books']/div[1]/div[1]/h3")
private WebElement studentPage;
    @FindBy(id = "inputEmail")
    private WebElement username;

    @FindBy(id = "inputPassword")
    private WebElement password;

    @FindBy(css = "[class='alert alert-danger']")
    private WebElement warningMessage;

    public String getWarningMessageText() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return warningMessage.getText().trim();
    }

    public void login(String usernameValue, String passwordValue) {
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

   /* public void login() {
        String usernameValue = ConfigurationReader.getProperty("storemanager.username");
        String passwordValue = ConfigurationReader.getProperty("password");

        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }*/

    public void login(String role) {
        String usernameValue="";
        String passwordValue ="";
        if (role.equalsIgnoreCase("librarian")) {
            usernameValue = ConfigurationReader.getProperty("librarianUsername");
            passwordValue = ConfigurationReader.getProperty("librarianPassword");

        } else if (role.equalsIgnoreCase("student")) {
            usernameValue = ConfigurationReader.getProperty("studentUsername");
            passwordValue = ConfigurationReader.getProperty("studentPassword");

        } else {
            System.out.println("Invalid role");
        }

        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

     public String dashBoard (){
         String actualresult =  dashboard.getText();
         return actualresult;
     }
     public String studentPage(){
        String actualresult = studentPage.getText();
        return actualresult;

     }
}
