package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {@Given("^I will login application$")
public void i_will_login_application() {
	Base.driver.get(Base.reader.getUrl());
   
}

@Given("^I will navigate to Registration page$")
public void i_will_navigate_to_Registration_page() {
   
}

@And("^I will give login details$")
public void i_will_give_login_details(DataTable arg1) {

}

@When("^I will select primary policy$")
public void i_will_select_primary_policy() {
    
}

@And("^I click on continue button$")
public void i_click_on_continue_button() {
   
}

@And("^I should see that the user account has successfully created$")
public void i_should_see_that_the_user_account_has_successfully_created() {
    
}


	

}
