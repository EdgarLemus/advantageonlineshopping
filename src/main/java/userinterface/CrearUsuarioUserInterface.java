package userinterface;

        import net.serenitybdd.screenplay.targets.Target;

public class CrearUsuarioUserInterface {

    public static final Target TXT_NOMBRE_USUARIO = Target.the("Campo de texto de nombre de usuario").locatedBy("//input[@name='usernameRegisterPage']");
    public static final Target TXT_CORREO_ELECTRONICO_USUARIO = Target.the("Campo de texto de correo electronico de usuario").locatedBy("//input[@name='emailRegisterPage']");
    public static final Target TXT_CONTRASENA_USUARIO = Target.the("Campo de texto de contraseña de usuario").locatedBy("//input[@name='passwordRegisterPage']");
    public static final Target TXT_CONFIRMAR_CONTRASENA_USUARIO = Target.the("Campo de texto de confirmar contraseña de usuario").locatedBy("//input[@name='confirm_passwordRegisterPage']");
    public static final Target TXT_PRIMER_NOMBRE_USUARIO = Target.the("Campo de texto de primer nombre de usuario").locatedBy("//input[@name='first_nameRegisterPage']");
    public static final Target TXT_APELLIDO_USUARIO = Target.the("Campo de texto de apellido de usuario").locatedBy("//input[@name='last_nameRegisterPage']");
    public static final Target TXT_TELEFONO_USUARIO = Target.the("Campo de telefono de apellido de usuario").locatedBy("//input[@name='phone_numberRegisterPage']");
    public static final Target CMB_PAIS_USUARIO = Target.the("Campo lista de paises de usuario").locatedBy("//select[@name='countryListboxRegisterPage']");
    public static final Target BTN_PAIS_USUARIO = Target.the("Lista de paises de usuario").locatedBy("//option[contains(text(),'{0}')]");
    public static final Target TXT_CIUDAD_USUARIO = Target.the("Campo de ciudad de apellido de usuario").locatedBy("//input[@name='cityRegisterPage']");
    public static final Target TXT_DIRECCION_USUARIO = Target.the("Campo de direccion de apellido de usuario").locatedBy("//input[@name='addressRegisterPage']");
    public static final Target TXT_DEPARTAMENTO_USUARIO = Target.the("Campo de departamento de apellido de usuario").locatedBy("//input[@name='state_/_province_/_regionRegisterPage']");
    public static final Target TXT_CODIGO_POSTAL_USUARIO = Target.the("Campo de codigo postal de apellido de usuario").locatedBy("//input[@name='postal_codeRegisterPage']");
    public static final Target CHECK_TERMINO_CONDICIONES_USUARIO = Target.the("Check de aceptar terminos y condiciones").locatedBy("//input[@name='i_agree']");
    public static final Target CHECK_RECIBIR_PROMOCIONES_USUARIO = Target.the("Check para recibir promociones").locatedBy("//input[@name='//input[@name='allowOffersPromotion']']");
    public static final Target BTN_REGISTRAR_USUARIO = Target.the("Boton de registrar usuario").locatedBy("//button[@id='register_btnundefined']");
    public static final Target BTN_LOGUEAR_USUARIO = Target.the("Boton de loguear usuario").locatedBy("//a[contains(text(),'ALREADY')]");
    public static final Target MSJ_ERROR = Target.the("Boton de loguear usuario").locatedBy("//label[contains(text(),'User name already')]");
}
