package co.com.automatizacion.sqa.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCategoriaAmor extends PageObject
{
    public static final Target producto1=Target.the("Se selecciona el producto numero 1")
            .located(By.xpath("/html/body/div[2]/div[6]/section[2]/div/div[1]/div/div/div[2]/div/div[1]/div/div[1]/figure/div/div[1]/a/span"));
}
