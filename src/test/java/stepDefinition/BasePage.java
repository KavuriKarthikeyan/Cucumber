package stepDefinition;

import io.cucumber.java.en.Given;

import static pages.HomePage.*;

public class BasePage {

    @Given("^User navigates to the Login page$")
    public void userNavigatesToTheLoginPage() throws InterruptedException {
        navigate_to_page();
        click_hamburger_menu();
        click_signIn_link();
    }




}
