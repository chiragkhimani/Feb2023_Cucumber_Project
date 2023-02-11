package com.automation.steps;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("user open website")
	public void user_open_website() {
		System.out.println("Step 1");
	}

	@Then("verify user is on login page")
	public void verify_user_is_on_login_page() {
		System.out.println("Step 2");
	}

	@Then("verify user is on homepage")
	public void verify_user_is_on_homepage() {
		System.out.println("Step 4");
	}

	@Then("verify invalid login error message is displayed")
	public void verify_invalid_login_error_message_is_displayed() {
		System.out.println("Step 4");
	}

	@When("user click on burger icon")
	public void user_click_on_burger_icon() {
		System.out.println("Step 5");
	}

	@When("click on logout button")
	public void click_on_logout_button() {
		System.out.println("Step 6");
	}

	@When("user click on add to cart button of first item")
	public void user_click_on_add_to_cart_button_of_first_item() {
		Assert.assertTrue("Login page is not displayed", true);
	}

	@Then("verify cart icon display qantity of item")
	public void verify_cart_icon_display_qantity_of_item() {

	}

	@When("user click on cart icon")
	public void user_click_on_cart_icon() {

	}

	@Then("verify user is on cart page")
	public void verify_user_is_on_cart_page() {

	}

	@When("user click on remove button")
	public void user_click_on_remove_button() {

	}

	@Then("verify cart page is empty")
	public void verify_cart_page_is_empty() {

	}

	@When("user login with username {string} and password {string}")
	public void user_login_with_username_and_password(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	@Then("verify user can see below dropdown option")
	public void verify_user_can_see_below_dropdown_option(List<String> listOfData) {
		for(String item : listOfData) {
			System.out.println(item);
		}
	}

}
