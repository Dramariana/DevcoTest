package net.onlinenotepad.task;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Actor;

import static net.onlinenotepad.userinterfaces.OnlinenotepadHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task {
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RICHTEXTNOTE));
    }

    public static GoTo richtextnote() {
        return instrumented(GoTo.class);

    }
}
