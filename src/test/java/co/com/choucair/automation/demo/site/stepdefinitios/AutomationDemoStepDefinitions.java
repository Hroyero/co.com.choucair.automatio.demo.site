package co.com.choucair.automation.demo.site.stepdefinitios;

import co.com.choucair.automation.demo.site.model.AutomationDemonData;
import co.com.choucair.automation.demo.site.question.Asnwer;
import co.com.choucair.automation.demo.site.tasks.FillOutRegister;
import co.com.choucair.automation.demo.site.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AutomationDemoStepDefinitions {

    @Before
    public void setStage(){ setTheStage(new OnlineCast()); }

    @Dado("^que carlos quiere acceder a la Web Automation Demo Site$")
    public void queCarlosQuiereAccederALaWebAutomationDemoSite() {
        theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }


    @Cuando("^el realiza el registro en la pagina$")
    public void elRealizaElRegistroEnLaPagina(List<AutomationDemonData> automationDemonData) throws Exception {
        theActorInTheSpotlight().attemptsTo(FillOutRegister.onThePage(automationDemonData));
    }

    @Entonces("^el verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row$")
    public void elVerificaQueSeCargaLaPantallaConTextoDoubleClickOnEditIconToEDITTheTableRow(List<AutomationDemonData> automationDemonData)throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Asnwer.toThe(automationDemonData.get(0).getRespuestas())));
    }


}
