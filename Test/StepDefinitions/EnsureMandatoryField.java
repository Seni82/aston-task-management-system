package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;

@StepDefAnnotation
public class EnsureMandatoryField {

    @Given("^I attempt to add a new task$")
    public void i_attempt_to_add_a_new_task() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I simulate add action$")
    public void i_simulate_add_action() {
        throw new PendingException();
    }

    @Then("^the new task is not created\\.$")
    public void i_new_task_is_not_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
