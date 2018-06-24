package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

public class Gestionnairedetags extends BaseUtil {
    private BaseUtil base;

    public Gestionnairedetags(BaseUtil base) {
        this.base = base;
    }

    @And("^je clique sur la rubrique Gestionnaire de tags de la zone lattérale Classification$")
    public void jeCliqueSurLaRubriqueGestionnaireDeTagsDeLaZoneLatteraleClassification() throws Throwable {
        Thread.sleep(8000);
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.xpath("//a[contains(text(),'Gestionnaire de tags')]")).click();
        Thread.sleep(8000);
        return;
    }

    @And("^je clique sur le bouton Ok du popup$")
    public void jeCliqueSurLeBoutonOkDuPopup() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-edit-tag-ok-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    return;
    }


    @And("^je clique sur l'icône Modifier le tag en survolant sur un tag$")
    public void jeCliqueSurLIconeModifierLeTagEnSurvolantSurUnTag() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//a[contains(text(),'tag1')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(1270, 350);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return;
    }

    @And("^je modifie le nom du tag par tag$")
    public void jeModifieLeNomDuTagParTag() throws Throwable {
        base.Driver.findElement(By.xpath("//input[contains(@id,'page_x002e_ctool_x002e_admin-console_x0023_default-edit-tag-name')]")).clear();
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//input[contains(@id,'page_x002e_ctool_x002e_admin-console_x0023_default-edit-tag-name')]")).sendKeys("tag");
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        base.Driver.findElement(By.xpath("//button[contains(@id,'page_x002e_ctool_x002e_admin-console_x0023_default-edit-tag-ok-button')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return;
    }

    @Then("^le message Tag mis à jour - les tags mis à jour peuvent temporairement disparaitre des résultats de recherche pour cause de réindexations'affiche$")
    public void leMessageTagMisÀJourLesTagsMisaJourPeuventTemporairementDisparaitreDesResultatsDeRecherchePourCauseDeReindexationsAffiche() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//span[contains(text(),'Tag mis à jour - les tags mis à jour peuvent temporairement disparaître des résultats de recherche pour cause de réindexation.')]")).isDisplayed();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;
    }

    @And("^je vérifie si le tag attaché au document se modifie aussi$")
    public void jeVerifieSiLeTagAttacheAuDocumentSeModifieAussi() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//a[contains(text(),'filtest')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//a[contains(text(),'tag')]")).isDisplayed();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;

    }


    @And("^je clique sur le bouton Rechercher$")
    public void jeCliqueSurLeBoutonRechercher() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-search-button-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;
    }

    @Then("^tous les tags s'affiche$")
    public void tousLesTagsSAffiche() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//a[contains(text(),'tag1')]")).isDisplayed();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//a[contains(text(),'tag2')]")).isDisplayed();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//a[contains(text(),'tag3')]")).isDisplayed();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;


    }


    @And("^j'ai saisi \"([^\"]*)\" dans la zone de recherche$")
    public void jAiSaisiDansLaZoneDeRecherche(String arg1) throws Throwable {
        arg1="*";
        Thread.sleep(8000);
        //base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-search-text")).sendKeys(arg1);
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;
    }

    @And("^j'ai saisi un mot dans la zone de recherche$")
    public void jAiSaisiUnMotDansLaZoneDeRecherche() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-search-text")).sendKeys("tag3");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;

    }

    @Then("^le tag souhaité est affiché$")
    public void leTagSouhaiteEstAffiche() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//a[contains(text(),'tag3')]")).isDisplayed();
        return;
    }
}
