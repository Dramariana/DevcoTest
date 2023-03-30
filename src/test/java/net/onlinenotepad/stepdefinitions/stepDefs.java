package net.onlinenotepad.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.onlinenotepad.task.GoTo;
import net.onlinenotepad.userinterfaces.OnlinenotepadHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class stepDefs {

    @Managed(driver = "firefox", uniqueSession = true)
    public WebDriver hisBrowser;
    private final Actor user = Actor.named("Mariana");

   OnlinenotepadHomePage onlinenotepadHomePage;
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        user.can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();
    }




    @Given("user enters online-notepad site")
    public void userEntersOnlineNotepadSite() {
        user.wasAbleTo(Open.browserOn().the(onlinenotepadHomePage));

    }

    @When("user select nota de texto enriquecido button")
    public void userSelectNotaDeTextoEnriquecidoButton() {
        user.attemptsTo(GoTo.richtextnote());
    }

    @Then("user can write a note in bold type")
    public void userCanWriteANoteInBoldType() {
    }


}
