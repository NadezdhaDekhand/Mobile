package HomeWork_7.Cucumber.Steps;
import HomeWork_3.Pages.MainPage;
import HomeWork_3.Pages.SwipePage;
import HomeWork_3.base.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SwipeSteps extends BaseTest {
    MainPage mainPage;
    SwipePage swipePage;

    @Given("^User is on Main page$")
    public void user_is_on_Main_page() throws Exception {
        mainPage = openApp();
    }

    @When("^User click swipe button$")
    public void user_click_swipe_button() throws Exception {
       mainPage.clickSwipeButton();
    }

    @Then("^User should see  message \"([^\"]*)\"$")
    public void user_should_see_message(String str) throws Exception {

        System.out.println(str);
    }
    }





