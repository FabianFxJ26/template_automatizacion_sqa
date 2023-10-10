package co.sqasa.StepDef;

import co.com.automatizacion.sqa.tasks.AbrirPagina;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class TestStepDefinition
{
    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("than Fabian went buy two products at the floristeria mundoflor")
    public void thanFabianWentBuyTwoProductsAtTheFloristeriaMundoflor() throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Fabian").wasAbleTo(AbrirPagina.abrirPagina());
    }

    @When("he searchs a internet page category list")
    public void heSearchsAInternetPageCategoryList() throws Exception {

    }

    @Then("he finds the products that he likes")
    public void heFindsTheProductsThatHeLikes() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

}
