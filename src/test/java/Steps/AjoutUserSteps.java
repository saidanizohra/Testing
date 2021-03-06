package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;
import pages.LinkPage;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;


public class AjoutUserSteps extends BaseUtil {
    private BaseUtil base;

    public AjoutUserSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("^je connecte tant qu'un admin$")
    public void jeConnecteTantQuUnAdmin() throws Throwable {
        System.out.println("connexion réussie");
        return;
    }

    @And("^je clique sur le lien voir tout$")
    public void jeCliqueSurLeLienVoirTout() throws Throwable {
        LinkPage page = new LinkPage(base.Driver);
        page.ClicklnkVoirtout();
        return;
    }

    @And("^je clique sur l'icôneajouter utilisateur$")
    public void jeCliqueSurLIconeajouterUtilisateur() throws Throwable {
        Thread.sleep(5000);
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-newuser-button-button")).click();
        Thread.sleep(2000);
        base.Driver.switchTo().defaultContent();
        return;
    }


    @And("^j'ai rempli les champs <Prénom>, <E-mail>, <Nom d'utilisateur>, <Mot de passe> et <Confirmer le nouveau mot de passe>$")
    public void jAiRempliLesChampsPrenomEMailNomDUtilisateurMotDePasseEtConfirmerLeNouveauMotDePasse() throws Throwable {
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname")).sendKeys("BenSta");
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-email")).sendKeys("Benstamhd@gmail.com");
        Thread.sleep(2000);
        Thread.sleep(2000);
        Robot bot = new Robot();
        bot.mouseMove(1310, 550);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-username")).sendKeys("mhd");
        Thread.sleep(3000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-password")).sendKeys("123");
        Thread.sleep(2000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-verifypassword")).sendKeys("123");
        return;
    }

    @And("^je clique sur le bouton Créer un utilisateur$")
    public void jeCliqueSurLeBoutonCreerUnUtilisateur() throws Throwable {
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-createuser-ok-button-button")).click();
        Thread.sleep(3000);
        return;
    }

    @Then("^le message Succès de la création d'un nouvel utilisateur s'affiche$")
    public void leMessageSuccesDeLaCreationDUnNouvelUtilisateurSAffiche() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        String text = base.Driver.findElement(By.xpath("//span[contains(text(),'Succès de la création du nouvel utilisateur.')]")).getText();
        Thread.sleep(8000);
        if (text.equals("Succès de la création du nouvel utilisateur.")) {

            System.out.println("succès");
        } else {
            System.out.println("Bug");
        }
        return;
    }

    @And("^j'ai saisi le champ Prénom contenant des caractères spécifiques$")
    public void jAiSaisiLeChampPrenomContenantDesCaracteresSpecifiques() throws Throwable {
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname")).sendKeys("zohra?");
        return;
    }

    @Then("^la zone de texte devient rouge$")
    public void laZoneDeTexteDevientRouge() throws Throwable {
        String inputColor = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname")).getCssValue("background-color");
        if (inputColor.equals("#faecee")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");

        }
        return;
    }

    @And("^le message <le champ contient une erreur s'affiche>$")
    public void leMessageLeChampContientUneErreurSAffiche() throws Throwable {
        WebElement element = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname"));
        String title = element.getAttribute("title");
        if (title.equals("Le champ contient une erreur.")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");
        }
        return;
    }

    @And("^j'ai rempli le champ <nom>$")
    public void jAiRempliLeChampNom() throws Throwable {
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-lastname")).sendKeys("Saidani");
        Thread.sleep(2000);
        Thread.sleep(2000);
        Robot bot = new Robot();
        bot.mouseMove(1310, 550);
        return;
    }

    @Then("^la zone de texte de prénom devient rouge$")
    public void laZoneDeTexteDePrenomDevientRouge() throws Throwable {
        String inputColor = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname")).getCssValue("background-color");
        if (inputColor.equals("#faecee")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");

        }
        return;

    }

    @And("^le message <Une valeur doit être indiquée> s'affiche$")
    public void leMessageUneValeurDoitEtreIndiqueeSAffiche() throws Throwable {
        WebElement element = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname"));
        String title = element.getAttribute("title");
        if (title.equals("Une valeur doit être indiquée.")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");
        }
        return;
    }

    @And("^j'ai rempli les champs  <E-mail>, <Nom d'utilisateur>, <Mot de passe> et <Confirmer le nouveau mot de passe>$")
    public void jAiRempliLesChampsEMailNomDUtilisateurMotDePasseEtConfirmerLeNouveauMotDePasse() throws Throwable {

        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-lastname")).sendKeys("Saidani");
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-email")).sendKeys("SaiIsraa@gmail.com");
        Thread.sleep(2000);
        Thread.sleep(2000);
        Robot bot = new Robot();
        bot.mouseMove(1310, 550);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-username")).sendKeys("Israa");
        Thread.sleep(3000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-password")).sendKeys("123");
        Thread.sleep(2000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-verifypassword")).sendKeys("123");
        return;
    }

    @And("^J'ai rempli <prénom>, <nom>, <E-mail>, <Nom d'utilisateur>, <Mot de passe> et <Confirmer le nouveau mot de passe>$")
    public void jAiRempliPrenomNomEMailNomDUtilisateurMotDePasseEtConfirmerLeNouveauMotDePasse() throws Throwable {
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname")).sendKeys("Saidani");
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-lastname")).sendKeys(" Israa");
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-email")).sendKeys("SaiIsraa/gmail.com");
        Thread.sleep(2000);
        Thread.sleep(2000);
        Robot bot = new Robot();
        bot.mouseMove(1310, 550);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-username")).sendKeys("Israa");
        Thread.sleep(3000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-password")).sendKeys("123");
        Thread.sleep(2000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-verifypassword")).sendKeys("123");
        return;
    }

    @Then("^la zone de texte du champ <Email> devient rouge$")
    public void laZoneDeTexteDuChampEmailDevientRouge() throws Throwable {
        String inputColor = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-email")).getCssValue("background-color");
        if (inputColor.equals("#faecee")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");

        }
        return;
    }

    @And("^le message <le champ contient une erreur s'affiche> dans la zone de texte Email$")
    public void leMessageLeChampContientUneErreurSAfficheDansLaZoneDeTexteEmail() throws Throwable {
        WebElement element = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-email"));
        String title = element.getAttribute("title");
        if (title.equals("La valeur n'est pas une adresse e-mail valide.")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");
        }
        return;

    }

    @And("^J'ai rempli <prénom>, <E-mail>, <Nom d'utilisateur>, <Mot de passe> et <Confirmer le nouveau mot de passe>$")
    public void jAiRempliPrenomEMailNomDUtilisateurMotDePasseEtConfirmerLeNouveauMotDePasse() throws Throwable {
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname")).sendKeys("Saidani");
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-lastname")).sendKeys(" Israa");
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-email")).sendKeys("SaiIsraa@gmail.com");
        Thread.sleep(2000);
        Thread.sleep(2000);
        Robot bot = new Robot();
        bot.mouseMove(1310, 550);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-username")).sendKeys("Israa?");
        Thread.sleep(3000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-password")).sendKeys("123");
        Thread.sleep(2000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-verifypassword")).sendKeys("123");
        return;
    }


    @Then("^la zone de texte du champ <Nom d'utilisateur > devient rouge$")
    public void laZoneDeTexteDuChampNomDUtilisateurDevientRouge() throws Throwable {
        String inputColor = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-username")).getCssValue("background-color");
        if (inputColor.equals("#faecee")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");

        }
        return;
    }

    @And("^le message <La valeur contient des caractères illégaux pour un nom> s'affiche$")
    public void leMessageLaValeurContientDesCaracteresIllegauxPourUnNomSAffiche() throws Throwable {
        WebElement element = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-username"));
        String title = element.getAttribute("title");
        if (title.equals("La valeur contient des caractères illégaux pour un nom.")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");
        }
        return;
    }




    @And("^le message <La valeur inclut un nombre de caractères incorrect> s'affiche$")
    public void leMessageLaValeurInclutUnNombreDeCaracteresIncorrectSAffiche() throws Throwable {
        WebElement element = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-username"));
        String title = element.getAttribute("title");
        if (title.equals("La valeur inclut un nombre de caractères incorrect.")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");
        }
        return;
}

    @And("^J'ai rempli <prénom>, <E-mail>, <Nom d'utilisateur>, <Mot de passe> et <Confirmer le nouveau mot de passe> du formulaire$")
    public void jAiRempliPrenomEMailNomDUtilisateurMotDePasseEtConfirmerLeNouveauMotDePasseDuFormulaire() throws Throwable {
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname")).sendKeys("Saidani");
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-lastname")).sendKeys(" Israa");
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-email")).sendKeys("SaiIsraa@gmail.com");
        Thread.sleep(2000);
        Thread.sleep(2000);
        Robot bot = new Robot();
        bot.mouseMove(1310, 550);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-username")).sendKeys("I");
        Thread.sleep(3000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-password")).sendKeys("123");
        Thread.sleep(2000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-verifypassword")).sendKeys("123");
        return;
    }

    @And("^j'ai saisi les champs <Prénom>, <E-mail>, <Nom d'utilisateur>, <Mot de passe> et <Confirmer le nouveau mot de passe>$")
    public void jAiSaisiLesChampsPrenomEMailNomDUtilisateurMotDePasseEtConfirmerLeNouveauMotDePasse() throws Throwable {
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname")).sendKeys("Saidani");
       // base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-lastname")).sendKeys(" Israa");
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-email")).sendKeys("SaiIsraa@gmail.com");
        Thread.sleep(2000);
        Thread.sleep(2000);
        Robot bot = new Robot();
        bot.mouseMove(1310, 550);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-username")).sendKeys("Iyadh");
        Thread.sleep(3000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-password")).sendKeys("12");
        Thread.sleep(2000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-verifypassword")).sendKeys("12");
        return;
    }

    @Then("^la zone de texte mot de passe devient rouge$")
    public void laZoneDeTexteMotDePasseDevientRouge() throws Throwable {
        String inputColor = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-password")).getCssValue("background-color");
        if (inputColor.equals("#faecee")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");

        }

        return;
    }

    @And("^le messgae La valeur inclut un nombre de caractères incorrect s'affiche$")
    public void leMessgaeLaValeurInclutUnNombreDeCaracteresIncorrectSAffiche() throws Throwable {
        WebElement element = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-password"));
        String title = element.getAttribute("title");
        if (title.equals("La valeur inclut un nombre de caractères incorrect.")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");
        }
        return;
    }

    @And("^J'ai rempli le formulaire <prénom>, <nom>, <E-mail>, <Nom d'utilisateur>, <Mot de passe> et <Confirmer le nouveau mot de passe>$")
    public void jAiRempliLeFormulairePrenomNomEMailNomDUtilisateurMotDePasseEtConfirmerLeNouveauMotDePasse() throws Throwable {
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname")).sendKeys("12");
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-lastname")).sendKeys("12");
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-email")).sendKeys("SaiIsraa@gmail.com");
        Thread.sleep(2000);
        Thread.sleep(2000);
        Robot bot = new Robot();
        bot.mouseMove(1310, 550);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-username")).sendKeys("isaaar");
        Thread.sleep(3000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-password")).sendKeys("123");
        Thread.sleep(2000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-verifypassword")).sendKeys("123");
        return;
    }


    @Then("^la zone de texte du champ prénom et nom deviennent rouges$")
    public void laZoneDeTexteDuChampPrenomEtNomDeviennentRouges() throws Throwable {
        String inputColor = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname")).getCssValue("background-color");
        if (inputColor.equals("#faecee")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");

        }
        String inputColor1 = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-lastname")).getCssValue("background-color");
        if (inputColor1.equals("#faecee")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");

        }
        return;
    }

    @And("^le message <le champ contient une erreur> s'affiche dans la de texte prénom et nom$")
    public void leMessageLeChampContientUneErreurSAfficheDansLaDeTextePrenomEtNom() throws Throwable {
        WebElement element = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname"));
        String title = element.getAttribute("title");
        if (title.equals("Le champ contient une erreur.")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");
        }
        WebElement element1 = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-lastname"));
        String title1 = element.getAttribute("title");
        if (title1.equals("Le champ contient une erreur.")) {
            System.out.println("succès");
        } else {
            System.out.println("bug");
        }
        return;

    }

    @And("^j'ai rempli formulaire$")
    public void jAiRempliFormulaire() throws Throwable {
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname")).sendKeys("rifi");
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-lastname")).sendKeys("ines");
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-email")).sendKeys("rifiines@gmail.com");
        Thread.sleep(2000);
        Thread.sleep(2000);
        Robot bot = new Robot();
        bot.mouseMove(1310, 550);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-username")).sendKeys("ines");
        Thread.sleep(3000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-password")).sendKeys("123");
        Thread.sleep(2000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-verifypassword")).sendKeys("123");
        Thread.sleep(2000);
        Thread.sleep(2000);
        Robot bot2 = new Robot();
        bot2.mouseMove(1310, 580);
        bot2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-groupfinder-search-text")).sendKeys("Test");
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-groupfinder-group-search-button-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//td[contains(@headers,'yui-dt25-th-description')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(11,TimeUnit.SECONDS);
        Thread.sleep(2000);
        Robot bot3= new Robot();
        bot3.mouseMove(600, 340);
        bot3.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot3.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(3000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-quota")).sendKeys("2");
        base.Driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

        return;

    }

    @Then("^le message Un compte avec le même e-mail existe déjà s'affiche$")
    public void leMessageUnCompteAvecLeMemeEMailExisteDejaSAffiche() throws Throwable {
        base.Driver.findElement(By.xpath("//div[contains(text(),'Un compte avec le même e-mail existe déjà.')]")).isDisplayed();
        return;
   }


    @And("^j'ai rempli le formulaire par <Prénom>, <E-mail>, <Nom d'utilisateur>, <Mot de passe> et <Confirmer le nouveau mot de passe>$")
    public void jAiRempliLeFormulaireParPrenomEMailNomDUtilisateurMotDePasseEtConfirmerLeNouveauMotDePasse() throws Throwable {
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-firstname")).sendKeys("Saidaniii");
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-email")).sendKeys("SaiIsraa@gmail.com");
        Thread.sleep(2000);
        Thread.sleep(2000);
        Robot bot = new Robot();
        bot.mouseMove(1310, 550);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-username")).sendKeys("Isra1");
        Thread.sleep(3000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-password")).sendKeys("123");
        Thread.sleep(2000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-create-verifypassword")).sendKeys("123");
        return;
    }
}
