package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MainSteps {
    @Given("User is on Netbanking landing page")
    public void user_is_on_netbancking_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User landed on netbanking page");
    }
    @Given("User is on Practice landing page")
    public void user_is_on_practice_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on practice landing page");
    }




        @When("User login into application with {string} and password {string}")
    public void user_login_into_application(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(username + " and password: " + password );
    }
    @When("User signup into application")
    public void user_signup_into_application(List<String> data) {
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
}



    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Home page is displayed");
    }
    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are displayed");
    }

//    @Given("User is on NetBanking landing page")
//    public void getLandingPage(){
//
//    }


}
