package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PrincipalUserInterface {

    public static final Target TXT_USUARIO = Target.the("Boton de usuario de pagina inicio").locatedBy("//a[@id]//span[contains(text(),'{0}')]");
    public static final Target BTN_CATEGORIA_PRODUCTO = Target.the("Boton de usuario de pagina inicio").locatedBy("//article//div[@class='rowSection']//div[@id]//span");
    public static final Target BTN_SELECCIONAR_PRODUCTO = Target.the("Boton de usuario de pagina inicio").locatedBy("//div[@class='cell categoryRight']//li");
    public static final Target BTN_ANADIR_PRODUCTO = Target.the("Boton de usuario de pagina inicio").locatedBy("//button[contains(text(),'ADD')]");
    public static final Target BTN_CARRITO = Target.the("Boton de usuario de pagina inicio").locatedBy("//a[@id='shoppingCartLink']");
    public static final Target TXT_NOMBRE_PRODUCTO = Target.the("Boton de usuario de pagina inicio").locatedBy("//div[@id='Description']//h1");
    public static final Target TXT_NOMBRE_PRODUCTO_CARRITO = Target.the("Boton de usuario de pagina inicio").locatedBy("//label[contains(text(),'{0}')]");
    public static final Target BTN_ELIMINAR_PRODUCTO = Target.the("").locatedBy("//li//div[@class='closeDiv']//div");
}
