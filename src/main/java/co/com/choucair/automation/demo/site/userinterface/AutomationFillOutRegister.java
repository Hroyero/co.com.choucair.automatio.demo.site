package co.com.choucair.automation.demo.site.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationFillOutRegister {
    public static final Target INPUT_FIRST_NAME = Target.the("input donde escribimos nuestro primer nombre").located(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"));
    public static final Target INPUT_LAST_NAME = Target.the("input donde escribimos nuestro apellido").located(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]"));
    public static final Target INPUT_ADDRESS = Target.the("input donde escribimos nuestra direccion").located(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]"));
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("input donde escribimos nuestro correo electronico").located(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]"));
    public static final Target INPUT_PHONE = Target.the("input donde escribimos nuestro numero de telefono").located(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]"));
    public static final Target GENDER = Target.the("seleccionamos el genero masculino").located(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]"));
    public static final Target HOBBIES = Target.the("seleccionamos el hobbie movies").located(By.xpath("//input[@id='checkbox2']"));
    public static final Target LANGUAGES_LIST = Target.the("lista de lenguages").located(By.xpath("//div[@id='msdd']"));
    public static final Target SELECT_LANGUAGES = Target.the("seleccionamos español en el lenguaje").located(By.xpath("//a[contains(text(),'Arabic')]"));
    public static final Target EMPTY = Target.the("click para cerrar la pestalla de lenguages").located(By.xpath("//label[contains(text(),'Languages')]"));
    public static final Target SKILL = Target.the("seleccionamos la skill de soporte de cliente ").located(By.xpath("//select[@id='Skills']"));
    public static final Target COUNTRY = Target.the("seleccionamos el pais colombbia").located(By.xpath("//select[@id='countries']"));
    public static final Target COUNTRY_TWO = Target.the("seleccionamos el segundo pais").located(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[10]/div[1]/span[1]/span[1]/span[1]"));
    public static final Target INPUT_COUNTRY = Target.the("input donde escribimos el pais").located(By.xpath("//body/span[1]/span[1]/span[1]/input[1]"));
    public static final Target DATE_OF_BIRTH_YEAR = Target.the("seleccionamos el año").located(By.cssSelector("#yearbox"));
    public static final Target DATE_OF_BIRTH_MONTH = Target.the("seleccionamos el mes").located(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]"));
    public static final Target DATE_OF_BIRTH_DAY = Target.the("seleccionamos el DIA").located(By.cssSelector("#daybox"));
    public static final Target INPUT_PASSWORD = Target.the("donde escribimos la contraseña").located(By.cssSelector("#firstpassword"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("donde confirmamos la contraseña").located(By.cssSelector("#secondpassword"));
    public static final Target BROWSE = Target.the("seleccionar archivo").located(By.xpath("//input[@id='imagesrc']"));
    public static final Target BUTTON_SUBMIT= Target.the("boton submit para registrar").located(By.cssSelector("#submitbtn"));







}
