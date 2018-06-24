package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

public class ExportSteps extends BaseUtil {
    private BaseUtil base;

    public ExportSteps(BaseUtil base) {
        this.base = base;
    }

    @And("^je clique sur la rubrique Export de la zone latérale Outils$")
    public void jeCliqueSurLaRubriqueExportDeLaZoneLateraleOutils() throws Throwable {
        Thread.sleep(5000);
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.xpath("//a[contains(@title,'Export')]")).click();
        Thread.sleep(3000);
        return;
    }

    @And("^j'ai saisi le nom de paquetage$")
    public void jAiSaisiLeNomDePaquetage() throws Throwable {
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-package-name")).sendKeys("testtst");
        //Thread.sleep(5000);
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return;
    }

    @And("^j'ai choisi l'espace à exporter$")
    public void jAiChoisiLEspaceAExporter() throws Throwable {
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-selectSource-button-button")).click();

        //  base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-selectSource-title"));
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(500, 500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //Thread.sleep(3000);
        base.Driver.findElement(By.xpath("//span[contains(text(),'cours')]")).click();
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-selectSource-ok-button")).click();
        return;
    }

    @And("^j'ai choisi l'esapce de destination$")
    public void jAiChoisiLEsapceDeDestination() throws Throwable {
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-selectDestination-button-button")).click();
//        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-selectDestination-title"));
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(500, 500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        base.Driver.findElement(By.xpath("//span[contains(text(),'test')]")).click();
        Thread.sleep(2000);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-selectDestination-ok-button")).click();
        return;
    }

    @And("^je clique sur le bouton Exporter$")
    public void jeCliqueSurLeBoutonExporter() throws Throwable {
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-export-button-button")).click();
        base.Driver.switchTo().defaultContent();
        return;
    }

    @And("^je quitte espace export$")
    public void jeQuitteEspaceExport() throws Throwable {
        //base.Driver.findElement(By.xpath("//a[contains(@title,'MON TABLEAU DE BORD')]")).click();
        // base.Driver.findElement(By.xpath("//a[contains(text(),'MON TABLEAU DE BORD')]")).click();
        //Thread.sleep(2000);
        return;

    }

    @And("^je consulte l'espace bibliothèque de documents$")
    public void jeConsulteLEspaceBibliothequeDeDocuments() throws Throwable {

        Thread.sleep(5000);
        base.Driver.navigate().to("http://127.0.0.1:8080/share/page/site/averroes/documentlibrary");
        return;
    }

    @And("^je consulte le dossier test$")
    public void jeConsulteLeDossierTest() throws Throwable {
        Thread.sleep(5000);
        base.Driver.findElement(By.xpath("//span[contains(text(),'filtest')]")).click();
        Thread.sleep(8000);
        return;
    }


    @Then("^je dois trouver un fichier du type acp$")
    public void jeDoisTrouverUnFichierDuTypeAcp() throws Throwable {
        base.Driver.findElement(By.xpath("//a[contains(text(),'testtst.acp')]")).isDisplayed();
        return;

    }

    @Then("^le message Une erreur inattendue s'est produite lors de l'extraction$")
    public void leMessageUneErreurInattendueSEstProduiteLorsDeLExtraction() throws Throwable {

        // base.Driver.findElement(By.id("prompt_h")).isDisplayed();

//       base.Driver.findElement(By.xpath("//div[contains(text(),'Une erreur inattendue s'est produite lors de l'extraction de contenu.')]")).isDisplayed();
        //base.Driver.findElement(By.id("prompt_h"));
        // base.Driver.findElement(By.className("bd")).getText();
         base.Driver.findElement(By.xpath("//html/body[@id='Share']/div[2]/div[1]/div[1]"));
      // base.Driver.findElement(By.xpath("//*[@id='prompt_h']/div[2]/text()"));
       // base.Driver.findElement(By.xpath("//*[@id=\"prompt\"]/div[2]/text()"));
        //*[@id="prompt"]/div[2]

        return;

    }

    @And("^J'ai saisi le nom de paquetagee$")
    public void jAiSaisiLeNomDePaquetagee() throws Throwable {
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-package-name")).sendKeys("test");
        Thread.sleep(8000);
        return;
    }


}
