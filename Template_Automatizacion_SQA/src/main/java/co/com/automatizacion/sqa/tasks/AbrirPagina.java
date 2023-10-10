package co.com.automatizacion.sqa.tasks;

import co.com.automatizacion.sqa.userInterfaces.PaginaParaAbrir;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task
{
    private PaginaParaAbrir paginaParaAbrir;
    public static AbrirPagina abrirPagina()
    {

        return Tasks.instrumented(AbrirPagina.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaParaAbrir), Click.on(PaginaParaAbrir.BOTON_AMOR));
    }
}
