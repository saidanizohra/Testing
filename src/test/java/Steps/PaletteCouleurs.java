package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

public class PaletteCouleurs extends BaseUtil {
    private BaseUtil base;

    public PaletteCouleurs(BaseUtil base ){
        this.base = base;
    }
    @And("^Cliquer sur la zone latérale Palette de couleur de la rubrique Apprance$")
    public void cliquerSurLaZoneLatéralePaletteDeCouleurDeLaRubriqueApprance() throws Throwable {

        Thread.sleep(8000);
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.xpath("//a[contains(text(),'Palette de couleurs')]")).click();
        Thread.sleep(8000);
}

    @And("^j'ai modifié le couleur de sous menu$")
    public void jAiModifiéLeCouleurDeSousMenu() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("color4")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//*[@id=\"Share\"]/div[7]/div[2]/div/div[2]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

       /* Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(900, 0);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);*/

    }

    @And("^j'ai modifié le couleur du texte$")
    public void jAiModifiéLeCouleurDuTexte() throws Throwable {

        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("color3")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//*[@id=\"Share\"]/div[7]/div[2]/div/div[2]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


    }

    @And("^je clique Appliquer$")
    public void jeCliqueAppliquer() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//button[contains(text(),'Appliquer')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.switchTo().defaultContent();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }

    @Then("^je vérifie si le couleur de sous menu change$")
    public void jeVérifieSiLeCouleurDeSousMenuChange() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        //String SousMenuColor= base.Driver.findElement(By.xpath("//a[contains(text(),'Outils d'administration')]")).getCssValue("color");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        //System.out.println("%s" +SousMenuColor);
        /* if (SousMenuColor.equals("#faecee")){
            System.out.println("succès");
        }
        else {
            System.out.println("bug");
        }*/
    }

    @And("^je vérifie si le couleur du texte change$")
    public void jeVérifieSiLeCouleurDuTexteChange() throws Throwable {

    }

    @And("^je clique sur le bouton Réinialiser le thème par défaut$")
    public void jeCliqueSurLeBoutonRéinialiserLeThèmeParDéfaut() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//button[contains(text(),'Réinitialiser le thème par défaut')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

    @Then("^le couleur de sous menu se réinialise le thème par défaut$")
    public void leCouleurDeSousMenuSeRéinialiseLeThèmeParDéfaut() throws Throwable {

    }

    @And("^le couleur du texte se réinialise le thème par défaut$")
    public void leCouleurDuTexteSeRéinialiseLeThèmeParDéfaut() throws Throwable {

    }
}
