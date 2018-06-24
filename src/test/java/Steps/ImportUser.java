package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.InputEvent;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class ImportUser extends BaseUtil {
    private BaseUtil base;

    public ImportUser(BaseUtil base) {
        this.base = base;
    }
    @And("^je clique sur l'icône Importer des utilisateurs$")
    public void jeCliqueSurLIconeImporterDesUtilisateurs() throws Throwable {
        Thread.sleep(5000);
       base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-importusers-button-button")).click();
        Thread.sleep(2000);
        return;
    }

    @And("^je clique sur le bouton Sélect.fichiers du popup$")
    public void jeCliqueSurLeBoutonSelectFichiersDuPopup() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("file-upload-input")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;
    }

    @And("^j'ai choisi un fichier de type json$")
    public void jAiChoisiUnFichier() throws Throwable {
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(185, 185);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);

        Thread.sleep(3000);
        Robot bot1 = new Robot();
        bot1.mouseMove(200, 200);
        bot1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);

        Thread.sleep(3000);
        Robot bot3 = new Robot();
        bot3.mouseMove(200, 180);
        bot3.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);

        Thread.sleep(3000);
        Robot bot2= new Robot();
        bot2.mouseMove(1200, 700);
        bot2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);
        return;

    }

    @And("^je clique sur le bouton confirmer du popup$")
    public void jeCliqueSurLeBoutonConfirmer() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//button[contains(text(),'Confirmer')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        return;
    }


    @Then("^le message Succès de l'import s'affiche$")
    public void leMessageSuccesDeLImportSAffiche() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//span[contains(text(),'Succes de l'import')]")).isDisplayed();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;
    }

    @And("^j'ai choisi un fichier de type hors json$")
    public void jAiChoisiUnFichierDeTypeHorsJson() throws Throwable {
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(210, 130);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);

        Thread.sleep(3000);
        Robot bot2= new Robot();
        bot2.mouseMove(1200, 700);
        bot2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);

        return;
    }

    @Then("^le système reste dans la page principale de gestion des utilisateurs$")
    public void leSystemeResteDansLaPagePrincipaleDeGestionDesUtilisateurs() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-search-text")).isDisplayed();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;
    }

    @And("^je clique sur l'icône Importer un fichier CSV d'utilisateurs$")
    public void jeCliqueSurLIconeImporterUnFichierCSVDUtilisateurs() throws Throwable {
        Thread.sleep(2000);
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-uploadusers-button-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;
    }

    @And("^je clique sur le bouton Choisir un fichier$")
    public void jeCliqueSurLeBoutonChoisirUnFichier() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("template_x002e_html-upload_x002e_console_x0023_default-filedata-file")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;
    }

    @And("^j'ai choisi un fichier de type csv$")
    public void jAiChoisiUnFichierDeTypeCsv() throws Throwable {
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(210, 130);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);

        Thread.sleep(3000);
        Robot bot2= new Robot();
        bot2.mouseMove(1200, 700);
        bot2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);

        return;
    }

    @And("^je clique sur le bouton Ajouter$")
    public void jeCliqueSurLeBoutonAjouter() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("template_x002e_html-upload_x002e_console_x0023_default-upload-button-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return;

    }

    @And("^je clique sur l'icône Télécharger un modèle de fichier d'import$")
    public void jeCliqueSurLIconeTelechargerUnModeleDeFichierDImport() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-DownloadCsvModel-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;
    }


    @And("^je clique sur l'icône Exporter des utilisateurs$")
    public void jeCliqueSurLIconeExporterDesUtilisateurs() throws Throwable {

        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-exportusers-button-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;
    }

    @And("^le popup Export en cours s'affiche$")
    public void lePopupExportEnCoursSAffiche() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//span[contains(text(),'Export en cours')]")).isDisplayed();
        base.Driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        return;
    }


    @Then("^le message Succes de l'export s'affiche$")
    public void leMessageSuccesDeLExportSAffiche() throws Throwable {
       base.Driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//span[contains(text(),'Succes de l'export')]")).isDisplayed();
        //base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;
    }
}
