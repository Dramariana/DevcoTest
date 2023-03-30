package net.onlinenotepad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.online-notepad.net/")
public class OnlinenotepadHomePage extends PageObject {

    public static final Target RICHTEXTNOTE = Target.the("richtextnote").located(By.id("richtextnote-tab"));

    public static final Target TASKLIST = Target.the("tasklist").located(By.id("tasklist-tab"));

    public static final Target EDITOR = Target.the("editor").located(By.id("editor"));

    public static final Target NOTE_NAME = Target.the("noteName").located(By.id("noteName"));

    public static final Target SAVE_BUTTON = Target.the("btnsave").located(By.className("btn save-file-btn saveNotesBtn richtextnoteBtn"));

    public static final Target SIDE_BAR = Target.the("side-bar").located(By.className("side-bar"));

    public static final Target BOLD_TYPE = Target.the("boldtyoe").located(By.xpath("//body/div[2]/section[1]/div[1]/div[1]/div[3]/div[3]/div[2]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));

}
