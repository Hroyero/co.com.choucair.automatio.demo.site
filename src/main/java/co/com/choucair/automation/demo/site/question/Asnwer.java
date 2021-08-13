package co.com.choucair.automation.demo.site.question;

import co.com.choucair.automation.demo.site.userinterface.AutomationRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Asnwer implements Question<Boolean>{
    private String question;

    public Asnwer(String question) {
        this.question = question;
    }


    public static Asnwer toThe(String question) {
        return new Asnwer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       boolean result;
       String textRegister = Text.of(AutomationRegister.TEXT_REGISTER).viewedBy(actor).asString();
       if(question.equals(textRegister)){
           result = true;
       }else{
           result = false;
       }
       return result;
    }
}
