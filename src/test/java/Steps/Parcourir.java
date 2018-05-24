package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

public class Parcourir extends BaseUtil {
    private BaseUtil base;

    public Parcourir(BaseUtil base) {
        this.base = base;
    }
    @And("^je clique sur le bouton parcourir$")
    public void jeCliqueSurLeBoutonParcourir() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-browse-button-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);



    }

    @And("^je clique sur l'iône Nouveau groupe$")
    public void jeCliqueSurLIôneNouveauGroupe() throws Throwable {
        Thread.sleep(1000);
        //base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//span[contains(@title,'Nouveau groupe')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }

    @And("^je clique sur le bouton Nouveau sous groupe$")
    public void jeCliqueSurLeBoutonNouveauSousGroupe() throws Throwable {
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(853, 305);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


    }





    @And("^je clique sur un groupe$")
    public void jeCliqueSurUnGroupe() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//span[contains(text(),'GroupeB (id2)')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }




    @Then("^le message Succès de la création du nouveau groupe s'affiche$")
    public void leMessageSuccèsDeLaCréationDuNouveauGroupeSAffiche() throws Throwable {
        Thread.sleep(1000);
        base.Driver.findElement(By.xpath("//span[contains(text(),'Succès de la création du nouveau groupe.')]")).isDisplayed();
        Thread.sleep(2000);
    }

    @And("^les champs <Identifiant>, <Nom affiché> et <chef hiérarchique> sont remplis$")
    public void lesChampsIdentifiantNomAffichéEtChefHiérarchiqueSontRemplis() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-shortname")).sendKeys("id444");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-displayname")).sendKeys("grp44");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-select-manager-button-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-manager-finder-search-text")).sendKeys("wiem");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-manager-finder-search-button-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//h3[contains(text(),'wiem kouki ')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(930, 420);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(3000);
    }

    @And("^je clique bouton Créer un groupe$")
    public void jeCliqueBoutonCréerUnGroupe() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-creategroup-ok-button-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }


    @And("^je clique sur un sous groupe$")
    public void jeCliqueSurUnSousGroupe() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//span[contains(text(),'GroupeB (id2)')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//span[contains(text(),'groupebb (id21)')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    @And("^je clique sur Nouveau sous groupe$")
    public void jeCliqueSurNouveauSousGroupe() throws Throwable {
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(1200, 305);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    }

    @And("^je clique sur 'icône Ajouter un utilisateur$")
    public void jeCliqueSurIcôneAjouterUnUtilisateur() throws Throwable {
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(880, 305);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    @And("^j'ai choisi un utilisateur$")
    public void jAiChoisiUnUtilisateur() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-search-peoplefinder-search-text")).sendKeys("zohra");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-search-peoplefinder-search-button-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//span[contains(text(),'(zohra)')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(930, 350);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //Thread.sleep(1000);

    }


    @Then("^le message Succès de l'ajout de l'utilisateur$")
    public void leMessageSuccèsDeLAjoutDeLUtilisateur() throws Throwable {


    }

    @And("^je survole sur un utiliseur$")
    public void jeSurvoleSurUnUtiliseur() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//span[contains(text(),'(zohra)')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    @And("^je clique sur l'icône Enlever l'utilisateur$")
    public void jeCliqueSurLIcôneEnleverLUtilisateur() throws Throwable {
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(880, 380);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    @And("^je confirme la suppression$")
    public void jeConfirmeLaSuppression() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//button[contains(text(),'Oui')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


    }

    @Then("^le message Succès de la suppression de l'utilisateur$")
    public void leMessageSuccèsDeLaSuppressionDeLUtilisateur() throws Throwable {
         //à voir
    }

    @And("^je clique sur un groupe and je clique sur l'icône Exporter le groupe$")
    public void jeCliqueSurUnGroupeAndJeCliqueSurLIcôneExporterLeGroupe() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//span[contains(text(),'GroupeB (id2)')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(550, 350);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


    }

    @Then("^le message Export terminé avec succès$")
    public void leMessageExportTerminéAvecSuccès() throws Throwable {
        Thread.sleep(1000);
        base.Driver.findElement(By.xpath("//span[contains(text(),'Export terminé avec succés')]")).isDisplayed();
       Thread.sleep(2000);

    }
}
