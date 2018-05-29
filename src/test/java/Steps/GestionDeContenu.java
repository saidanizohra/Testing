package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

public class GestionDeContenu extends BaseUtil {
    private BaseUtil base;

    public GestionDeContenu (BaseUtil base ){
        this.base = base;
    }
    @And("^Cliquer sur la zone latérale Eléménts supprimés de la rubrique Gestion de contenu$")
    public void cliquerSurLaZoneLateraleElementsSupprimesDeLaRubriqueGestionDeContenu() throws Throwable {
        Thread.sleep(8000);
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.xpath("//a[contains(text(),'Éléments supprimés')]")).click();
        Thread.sleep(8000);
        return;
    }



    @And("^je survole le cursueur de la souris sur l'élément test.pdf et cliquer sur l'icône restaurer$")
    public void jeSurvoleLeCursueurDeLaSourisSurLElementTestPdfEtCliquerSurLIconeRestaurer() throws Throwable {
        base.Driver.findElement(By.xpath("//div[text()='test.pdf']")).click();
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(1260, 350);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        base.Driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        return;
    }


    @And("^le message Récupération réussie test.pdf s'affiche$")
    public void leMessageRecuperationReussieTestPdfSAffiche() throws Throwable {
        Thread.sleep(1000);
        base.Driver.findElement(By.xpath("//span[contains(text(),'Récupération réussie test.pdf')]"));
        //base.Driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        //base.Driver.findElement(By.xpath("//span[contains(text()='Récupération réussie test.pdf'])")).isDisplayed();
        return;
    }

    @Then("^le document test.pdf est récupéré$")
    public void leDocumentTestPdfEstRecupere() throws Throwable {
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(1350, 500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        base.Driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

        base.Driver.findElement(By.xpath("//a[contains(text(),'test.pdf')]")).isDisplayed();

        return;

    }

    @And("^je survole le cursueur de la souris sur un élément et cliquer sur l'icône restaurer and je clique sur l'icône Supprimer$")
    public void jeSurvoleLeCursueurDeLaSourisSurUnElementEtCliquerSurLIconeRestaurerAndJeCliqueSurLIconeSupprimer() throws Throwable {
        base.Driver.findElement(By.xpath("//div[text()='1525080292452_logo-averroes-quickshare.png_tmp']")).click();
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(1210, 320);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        base.Driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        return;
    }

    @Then("^le message Suppression réussie s'affiche$")
    public void leMessageSuppressionReussieSAffiche() throws Throwable {
        Thread.sleep(1000);
        base.Driver.findElement(By.xpath("//span[contains(text(),'Suppression réussie')]"));
        return;
    }
}
