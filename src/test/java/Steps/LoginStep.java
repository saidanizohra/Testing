package Steps;

import Base.BaseUtil;
import Transformation.EmailTransform;
import Transformation.SalaryTransform;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPgae;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {

        //System.out.println("I should see the userform page");
        Assert.assertEquals("Its not displayed", base.Driver.findElement(By.id("Initial")).isDisplayed(), true);
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Navigate login page");
        base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");

        //throw new PendingException();
    }

    // @And("^I enter the username as admin and password as admin$")
    // public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //System.out.println("Enter the user name and password");
    // throw new PendingException();
    //}

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //System.out.println("Click lgin button");
        // throw new PendingException();
        //base.Driver.findElement(By.name("Login")).submit();
        LoginPgae page = new LoginPgae(base.Driver);
        page.ClickLogin();
    }


    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        /*List<List<String>> data= table.raw();*/
        // data.get();
       /* System.out.println("the value is " + data.get(0).get(0).toString());
        System.out.println("the value is " + data.get(0).get(1).toString());*/
        //create a arraylist
        List<User> users = new ArrayList<User>();
        //store all the users
        users = table.asList(User.class);
        LoginPgae page = new LoginPgae(base.Driver);
        for (User user : users) {
            //base.Driver.findElement(By.name("UserName")).sendKeys(user.username);
           // base.Driver.findElement(By.name("Password")).sendKeys(user.password);
            page.Login(user.username, user.password);


        }
    }


    @And("^I enter the ([^\"]*) and ([^\"]*)$")
    public void iEnterTheUsernameAndPassword(String Username, String Password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The userName is " + Username);
        System.out.println("The password is " + Password);
    }




    public class User {
        public String username, password;

        public User(String userName, String password) {
            username = userName;
            password = password;
        }
    }


}
