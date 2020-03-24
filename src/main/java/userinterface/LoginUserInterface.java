package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUserInterface {

    public static final Target BTN_USUARIO = Target.the("Boton de usuario de pagina inicio").locatedBy("//a[@id='menuUserLink']");
    public static final Target BTN_CREAR_USUARIO = Target.the("Boton de crear usuario en modal de pagina inicio").locatedBy("//a[contains(text(),'CREATE NEW')]");
    public static final Target TXT_USUARIO = Target.the("Campo ingresar usuario").locatedBy("//input[@name='username']");
    public static final Target TXT_CONTRASENA = Target.the("Campo ingresar contraseña").locatedBy("//input[@name='password']");
    public static final Target BTN_INGRESAR = Target.the("Boton ingresar usuario").locatedBy("//button[@id='sign_in_btnundefined']");
    public static final Target MSJ_ERROR = Target.the("Campo ingresar usuario").locatedBy("//label[contains(text(),'Incorre')]");
}
