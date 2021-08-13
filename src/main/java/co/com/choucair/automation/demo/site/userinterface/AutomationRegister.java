package co.com.choucair.automation.demo.site.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationRegister {
    public static final Target TEXT_REGISTER = Target.the("texto a validar").located(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/h4[1]"));

}
