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

public class ImportStep extends BaseUtil {
    private BaseUtil base;

    public ImportStep(BaseUtil base) {
        this.base = base;
    }
    @And("^je clique sur la rubrique Import de la zone latérale Outils$")
    public void jeCliqueSurLaRubriqueImportDeLaZoneLateraleOutils() throws Throwable {
        Thread.sleep(5000);
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.xpath("//a[contains(@title,'Import')]")).click();
       // base.Driver.findElement(By.xpath("//*[@id=\"toolLink\"]/li[2]/span/a")).click();
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Thread.sleep(4000);
        return;

    }

    @And("^j'ai choisi espace de destination cours par exemple$")
    public void jAiChoisiEspaceDeDestinationCoursParExemple() throws Throwable {
        Thread.sleep(3000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-selectDestination-button-button")).click();
        Thread.sleep(4000);
        Robot bot = new Robot();
        bot.mouseMove(500, 500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        base.Driver.findElement(By.xpath("//span[contains(text(),'cours')]")).click();
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-selectDestination-ok-button")).click();
        return;
    }

    @And("^je clique sur le bouton Importer dans l'entrepôt$")
    public void jeCliqueSurLeBoutonImporterDansLEntrepot() throws Throwable {
      //base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-import-button-button")).click();
     // Thread.sleep(3000);
        base.Driver.findElement(By.xpath("//*[@id=\"page_x002e_ctool_x002e_admin-console_x0023_default-upload-button-button\"]")).click();
        return;
    }

    @And("^je clique sur le lien Sélectionner les fichiers à ajouter$")
    public void jeCliqueSurLeLienSelectionnerLesFichiersAAjouter() throws Throwable {
       // Thread.sleep(3000);
        base.Driver.findElement(By.className("dnd-file-selection-button")).click();
        return;
    }

    @And("^j'ai choisi un fichier du type acp$")
    public void jAiChoisiUnFichierDuTypeAcp() throws Throwable {

        Thread.sleep(3000);
        Robot bot2= new Robot();
        //bot2.mouseMove(200, 200);
        bot2.mouseMove(200, 365);
        //bot2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        //bot2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);

        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(200, 220);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);


        Thread.sleep(5000);
        Robot bot1 = new Robot();
        bot1.mouseMove(1200, 700);
        bot1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(6000);
        return;
    }

    @And("^je clique sur le bouton Importer$")
    public void jeCliqueSurLeBoutonImporter() throws Throwable {
      //  WebDriverWait wait = new WebDriverWait(base.Driver,12);
      // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'Importer')]")));   //examining the xpath for a search
        //base.Driver.findElement(By.xpath("//button[contains(text(),'Importer')]")).click();
       // base.Driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(700, 700);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);

        return;


    }

    @And("^je consulte le dossier cours$")
    public void jeConsulteLeDossierCours() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//span[contains(text(),'cours')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return;
    }


    @Then("^je dois trouver dans ce dossier un fichier du type acp$")
    public void jeDoisTrouverDansCeDossierUnFichierDuTypeAcp() throws Throwable {
        String teext = "bg.acp";
        String Text = base.Driver.findElement(By.linkText("bg.acp")).getText();
        if (teext.equals(Text))

        {

            System.out.println("Verification Successful - The correct file as acp is displayed");
        }

              else
        {

            System.out.println("Verification Failed - An incorrect file as acp is displayed ");
    }
        return;
}

    @And("^j'ai choisi un fichier du type zip$")
    public void jAiChoisiUnFichierDuTypeZip() throws Throwable {
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(200, 260);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);

        Thread.sleep(5000);
        Robot bot1 = new Robot();
        bot1.mouseMove(1200, 700);
        bot1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(6000);
        return;
    }

    @Then("^je dois trouver dans ce dossier un fichier du type zip$")
    public void jeDoisTrouverDansCeDossierUnFichierDuTypeZip() throws Throwable {

            String teext = "cours.zip";
            String Text = base.Driver.findElement(By.linkText("cours.zip")).getText();
            if (teext.equals(Text))

            {

                System.out.println("Verification Successful - The correct file as zip is displayed");
            }

            else

            {

                System.out.println("Verification Failed - An incorrect file as zip is displayed ");



            }


    }

}
