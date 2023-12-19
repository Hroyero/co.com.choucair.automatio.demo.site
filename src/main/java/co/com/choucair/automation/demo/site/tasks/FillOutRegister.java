package co.com.choucair.automation.demo.site.tasks;

import co.com.choucair.automation.demo.site.model.AutomationDemonData;
import co.com.choucair.automation.demo.site.userinterface.AutomationFillOutRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static co.com.choucair.automation.demo.site.userinterface.AutomationFillOutRegister.*;

public class FillOutRegister implements Task {
    protected String path = "C:\\Users\\Ryzen\\Pictures\\hollmans.jpeg";

    public FillOutRegister(List<AutomationDemonData> automationDemonData) {
        this.automationDemonData = automationDemonData;
    }

    List<AutomationDemonData> automationDemonData;
    public static FillOutRegister onThePage(List<AutomationDemonData> automationDemonData) {
        return Tasks.instrumented(FillOutRegister.class, automationDemonData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(automationDemonData.get(0).getFirstName()).into(INPUT_FIRST_NAME),
                        Enter.theValue(automationDemonData.get(0).getLastName()).into(INPUT_LAST_NAME),
                        Enter.theValue(automationDemonData.get(0).getAddress()).into(INPUT_ADDRESS),
                        Enter.theValue(automationDemonData.get(0).getEmailAddress()).into(INPUT_EMAIL_ADDRESS),
                        Enter.theValue(automationDemonData.get(0).getPhone()).into(INPUT_PHONE),
                        Click.on(GENDER),
                        Click.on(HOBBIES),
                        Click.on(LANGUAGES_LIST),
                        Click.on(SELECT_LANGUAGES),
                        Click.on(EMPTY),
                      //  Click.on(SELECT_SKILL),
                        SelectFromOptions.byValue(automationDemonData.get(0).getSkill()).from(SKILL),
                       // SelectFromOptions.byValue(automationDemonData.get(0).getCountry()).from(COUNTRY),
                        Click.on(COUNTRY_TWO),
                        Enter.theValue(automationDemonData.get(0).getCountryTwo()).into(INPUT_COUNTRY),
                        Hit.the(Keys.ENTER).into(COUNTRY_TWO),
                        SelectFromOptions.byValue(automationDemonData.get(0).getYear()).from(DATE_OF_BIRTH_YEAR),
                        SelectFromOptions.byValue(automationDemonData.get(0).getMonth()).from(DATE_OF_BIRTH_MONTH),
                        SelectFromOptions.byValue(automationDemonData.get(0).getDay()).from(DATE_OF_BIRTH_DAY),
                        Enter.theValue(automationDemonData.get(0).getPassword()).into(INPUT_PASSWORD),
                        Enter.theValue(automationDemonData.get(0).getConfirmPassword()).into(INPUT_CONFIRM_PASSWORD),
                        (Enter.keyValues(path).into(BROWSE)),
                        Click.on(BUTTON_SUBMIT));
    }
}
