package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

public class Logo extends BaseUtil {
    private BaseUtil base;

    public Logo(BaseUtil base ){
        this.base = base;
    }
    @And("^Cliquer sur la zone latérale Logo de la rubrique Apprance$")
    public void cliquerSurLaZoneLateraleLogoDeLaRubriqueApprance() throws Throwable {
        Thread.sleep(8000);
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.xpath("//a[contains(text(),'Logo')]")).click();
        Thread.sleep(8000);
        return;
    }

    @And("^je clique sur le bouton Nouveau document$")
    public void jeCliqueSurLeBoutonNouveauDocument() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//button[contains(text(),'Nouveau document')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        return;
    }

    @And("^j'ai choisi un fichier de type différent d'image$")
    public void jAiChoisiUnFichierDeTypeDifferentDImage() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//input[contains(@class,'dnd-file-selection-button')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(420, 420);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);


        Thread.sleep(5000);
        Robot bot1 = new Robot();
        bot1.mouseMove(614, 610);
        bot1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(8000);
        return;
    }


    @Then("^le message Échec : error occured during upload of new content  s'affiche dans le popup$")
    public void leMessageEchecErrorOccuredDuringUploadOfNewContentSAfficheDansLePopup() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//span[contains(text(),'652 Ko (Échec : error occured during upload of new content.)')]")).isDisplayed();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("template_x002e_dnd-upload_x002e_console_x0023_default-cancelOk-button-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;
    }

    @And("^j'ai choisi un fichier de type image$")
    public void jAiChoisiUnFichierDeTypeImage() throws Throwable {

        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//input[contains(@class,'dnd-file-selection-button')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(600, 320);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);
        Thread.sleep(3000);
        Robot bot1 = new Robot();
        bot1.mouseMove(300, 320);
        bot1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);

        Thread.sleep(3000);
        Robot bot2 = new Robot();
        bot2.mouseMove(500, 450);
        bot2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(8000);
        return;
    }

    @And("^je clique sur le bouton Appliquer$")
    public void jeCliqueSurLeBoutonAppliquer() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//button[contains(text(),'Appliquer')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        base.Driver.switchTo().defaultContent();
        base.Driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        return;

    }

    @And("^je déconnecte$")
    public void jeDeconnecte() throws Throwable {

        base.Driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        //base.Driver.navigate().to("http://127.0.0.1:8080/share/page/");
        base.Driver.findElement(By.id("global_x002e_header_x0023_default-accountLink")).click();
        base.Driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//a[contains(text(),'Déconnexion')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        return;
    }

    @Then("^page de login s'affiche avec le nouveau logo$")
    public void pageDeLoginSAfficheAvecLeNouveauLogo() throws Throwable {
        base.Driver.findElement(By.xpath("//div[contains(@style,'background: url(\"/alfresco/s/api/getLogo\") no-repeat transparent;')]")).isDisplayed();
        return;
    }
}
