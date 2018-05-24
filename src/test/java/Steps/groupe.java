package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.InputEvent;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class groupe extends BaseUtil {

    private BaseUtil base;

    public groupe (BaseUtil base) {
        this.base = base;
    }
    @And("^je clique sur la rubrique Groupe de la zone latérale groupe et utilisateurs$")
    public void jeCliqueSurLaRubriqueGroupeDeLaZoneLatéraleGroupeEtUtilisateurs() throws Throwable {
        Thread.sleep(5000);
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.xpath("//a[contains(@title,'Gestion des groupes')]")).click();
        Thread.sleep(2000);

    }

    @And("^je clique sur l'icône ajouter un groupe$")
    public void jeCliqueSurLIcôneAjouterUnGroupe() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-newgroup-button-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    @And("^j'ai rempli la formulaire avec <Identifiant> et <Nom affiché>$")
    public void jAiRempliLaFormulaireAvecIdentifiantEtNomAffiché() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-shortname")).sendKeys("GR1");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-displayname")).sendKeys("GR");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


    }

    @Then("^la zone de texte du champ Nom affiché devient rouge$")
    public void laZoneDeTexteDuChampNomAffichéDevientRouge() throws Throwable {
        String inputColor = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-displayname")).getCssValue("background-color");
        if (inputColor.equals("#faecee")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");




        }}


    @And("^un message d'erreur le champ contient une erreur s'affichera en survolant sur la zone de texte du champ nom affiché$")
    public void unMessageDErreurLeChampContientUneErreurSAfficheraEnSurvolantSurLaZoneDeTexteDuChampNomAffiché() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-displayname"));
        String title = element.getAttribute("title");
        if (title.equals("Le champ contient une erreur.")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");
        }


    }

    @And("^j'ai saisi <Identifiant> et <Nom affiché>$")
    public void jAiSaisiIdentifiantEtNomAffiché() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-shortname")).sendKeys("44");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-displayname")).sendKeys("GR1");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


    }

    @Then("^la zone de texte du champ identifiant devient rouge$")
    public void laZoneDeTexteDuChampIdentifiantDevientRouge() throws Throwable {
        String inputColor = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-shortname")).getCssValue("background-color");
        if (inputColor.equals("#faecee")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");




        }

    }

    @And("^un message d'erreur le champ contient une erreur s'affichera en survolant sur la zone de texte du champ identifiant$")
    public void unMessageDErreurLeChampContientUneErreurSAfficheraEnSurvolantSurLaZoneDeTexteDuChampIdentifiant() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-shortname"));
        String title = element.getAttribute("title");
        if (title.equals("Le champ contient une erreur.")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");
        }
    }

    @And("^j'ai saisi les champs <Identifiant> et <Nom affiché>$")
    public void jAiSaisiLesChampsIdentifiantEtNomAffiché() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-shortname")).sendKeys("44");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-displayname")).sendKeys("GR");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }

    @Then("^la zone de texte du champ identifiant et Nom deviennent rouge$")
    public void laZoneDeTexteDuChampIdentifiantEtNomDeviennentRouge() throws Throwable {
        String inputColor = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-shortname")).getCssValue("background-color");
        if (inputColor.equals("#faecee")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");

        }
        String inputColor1 = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-displayname")).getCssValue("background-color");
        if (inputColor1.equals("#faecee")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");

        }
    }

    @And("^un message d'erreur le champ contient une erreur s'affichera en survolant sur la zone de texte du champ identifiant et nom$")
    public void unMessageDErreurLeChampContientUneErreurSAfficheraEnSurvolantSurLaZoneDeTexteDuChampIdentifiantEtNom() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-shortname"));
        String title = element.getAttribute("title");
        if (title.equals("Le champ contient une erreur.")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");
        }
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element2 = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-shortname"));
        String title2 = element.getAttribute("title");
        if (title.equals("Le champ contient une erreur.")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");
        } base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement element1 = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-displayname"));
        String title1 = element.getAttribute("title");
        if (title.equals("Le champ contient une erreur.")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");
        }
    }

    @And("^j'ai rempli<Identifiant> et <Nom affiché>$")
    public void jAiRempliIdentifiantEtNomAffiché() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-shortname")).sendKeys("gr1");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-displayname")).sendKeys("GRP");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }


    @And("^je clique sur le bouton Créer un groupe$")
    public void jeCliqueSurLeBoutonCréerUnGroupe() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-creategroup-ok-button-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }

    @And("^un message d'erreur le groupe existe déja s'affichera$")
    public void unMessageDErreurLeGroupeExisteDéjaSAffichera() throws Throwable {
        Thread.sleep(1000);
        String msg= base.Driver.findElement(By.xpath("//div[contains(text(),'Le groupe')]")).getText();
        Thread.sleep(2000);
        if (msg.equals("Le groupe 'gr1' existe déjà."))
        {
            System.out.println("succes");

        }
        else
        {
            System.out.println("bug");
        }

    }

    @And("^j'ai rempli les champs <Identifiant> et <Nom affiché>$")
    public void jAiRempliLesChampsIdentifiantEtNomAffiché() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-shortname")).sendKeys("gr5");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-displayname")).sendKeys("grp5");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    @Then("^le message Succès de la création du nouveau groupe$")
    public void leMessageSuccèsDeLaCréationDuNouveauGroupe() throws Throwable {
        Thread.sleep(1000);
        base.Driver.findElement(By.xpath("//span[contains(text(),'Succès de la création du nouveau groupe.')]")).isDisplayed();
        Thread.sleep(2000);

    }

    @And("^j'ai rempli le formulaire <Identifiant>, <Nom affiché>, <chef Hiérarchique> et <rôle>$")
    public void jAiRempliLeFormulaireIdentifiantNomAffichéChefHiérarchiqueEtRôle() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-shortname")).sendKeys("gr7");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-displayname")).sendKeys("grp7");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-role-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//a[text()='Visiteur']")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-update-select-manager-button-button")).click();
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


    }


    @And("^je survole sur un groupe et je clique sur l'icône Modifier$")
    public void jeSurvoleSurUnGroupeEtJeCliqueSurLIcôneModifier() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//div[contains(text(),'gr1')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(1140, 350);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


    }

    @And("^j'ai mofifié <Identifiant>, <Rôle> et <chef hiérarchique>$")
    public void jAiMofifiéIdentifiantRôleEtChefHiérarchique() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-update-displayname")).clear();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-update-displayname")).sendKeys("grpp7");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
      //  base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-update-role-button")).click();
        //base.Driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        //Thread.sleep(5000);

       // WebDriverWait wait = new WebDriverWait(base.Driver,30);
       ///wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Coordinateur')]")));   /*examining the xpath for a search

       // base.Driver.findElement(By.xpath("//a[contains(text(),'Coordinateur')]")).click();
       // base.Driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-update-select-manager-button-button")).click();
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

    }

    @Then("^le message Succès de la mise à jour s'affiche$")
    public void leMessageSuccèsDeLaMiseÀJourSAffiche() throws Throwable {
        Thread.sleep(1000);
        base.Driver.findElement(By.xpath("//span[contains(text(),'Succès lors de la mise à jour')]")).isDisplayed();
        Thread.sleep(2000);

    }

    @And("^j'ai saisi \"([^\"]*)\" dans la zone de texte$")
    public void jAiSaisiDansLaZoneDeTexte(String arg0) throws Throwable {
        String arg1="*";
        Thread.sleep(8000);
        //base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-search-text")).sendKeys(arg1);
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }


    @And("^je clique sur le bouton Enregistrer Les modifications$")
    public void jeCliqueSurLeBoutonEnregistrerLesModifications() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-updategroup-save-button-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    @And("^je clique sur l'icône Importer la liste de groupe$")
    public void jeCliqueSurLIcôneImporterLaListeDeGroupe() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-importGroup-button-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    @And("^je clique sur Sélect.fichiers du popup$")
    public void jeCliqueSurSélectFichiersDuPopup() throws Throwable {

        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("fileID")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    @And("^j'ai choisi un fichier du type json$")
    public void jAiChoisiUnFichierDuTypeJson() throws Throwable {
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(200, 200);
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
        bot3.mouseMove(200, 160);
        bot3.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);

        Thread.sleep(3000);
        Robot bot2= new Robot();
        bot2.mouseMove(500, 450);
        bot2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);



    }




    @And("^je clique sur Confirmer$")
    public void jeCliqueSurConfirmer() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//button[contains(text(),'Confirmer')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    @Then("^Succès de l'import du groupe$")
    public void succèsDeLImportDuGroupe() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//span[contains(text(),'Succès de l'import du groupe')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }

    @And("^je clique sur l'icône Exporter les groupes$")
    public void jeCliqueSurLIcôneExporterLesGroupes() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
      //  base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-exportGroup-button-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }
}
