package StepDefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;
import view.AddTaskPanel;

@StepDefAnnotation
public class ClearField {

    AddTaskPanel taskPanel =  new AddTaskPanel();

    @Given("^I enter data into the application$")
    public void i_enter_data_into_the_application() {
        taskPanel.setFieldData();
    }

    @Given("^I simulate 'clear' action button by calling \"([^\"]*)\" added to button$")
    public void i_simulate_clear_action_button_by_calling_added_to_button(String arg1) {
        if(arg1.equalsIgnoreCase("clear"))
        {taskPanel.ClearFieldForTest();}else{}
    }

    @Then("^all data in field should be empty$")
    public void all_data_in_field_should_be_empty() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}

