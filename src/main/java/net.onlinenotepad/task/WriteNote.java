package net.onlinenotepad.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.onlinenotepad.userinterfaces.OnlinenotepadHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WriteNote implements Task {

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NOTE_NAME));
        actor.attemptsTo(Enter.theValue("SCENARIO 1").into(NOTE_NAME));
        actor.attemptsTo(Click.on(BOLD_TYPE));
        actor.attemptsTo(Click.on(EDITOR));
        actor.attemptsTo(Enter.theValue("HOLA DEVCO").into(EDITOR));
        actor.attemptsTo(Click.on(SAVE_BUTTON));
    }

    public static WriteNote boltType() {
        return instrumented(WriteNote.class);

    }
}
