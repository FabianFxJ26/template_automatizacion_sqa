package co.com.automatizacion.sqa.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.floristeriamundoflor.com/")
public class PaginaParaAbrir extends PageObject
{
  public static final Target BOTON_AMOR= Target.the("Seleccionar categoria amor").located
          (By.xpath("/html/body/div[2]/header/div[2]/div/div/div[2]/nav/div/ul/li[3]/a"));
}
