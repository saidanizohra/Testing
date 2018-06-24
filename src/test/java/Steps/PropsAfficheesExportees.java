package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

public class PropsAfficheesExportees extends BaseUtil {
    private BaseUtil base;

    public PropsAfficheesExportees(BaseUtil base) {
        this.base = base;
    }
    @And("^je clique sur la rubrique Propriétés affichées et exportées  de la zone lattérale Résultats de recherche$")
    public void jeCliqueSurLaRubriqueProprietesAfficheesEtExporteesDeLaZoneLatteraleResultatsDeRecherche() throws Throwable {
        Thread.sleep(8000);
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.xpath("//a[contains(text(),'Propriétés affichées et exportées')]")).click();
        Thread.sleep(8000);
        return;
    }

    @And("^j'ai effectué un recherche sur un document du type choisi$")
    public void jAiEffectueUnRechercheSurUnDocumentDuTypeChoisi() throws Throwable {
        base.Driver.switchTo().defaultContent();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("global_x002e_header_x0023_default-searchText")).sendKeys("test.csv");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("global_x002e_header_x0023_default-searchText")).sendKeys(Keys.ENTER);
        base.Driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        return;
    }



    @And("^j'ai fait un drag and drop pour choisir les propriétés sélectionnées$")
    public void jAiFaitUnDragAndDropPourChoisirLesProprietesSelectionnees() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement elt1 = base.Driver.findElement(By.id("li2_1"));
        WebElement eltTo = base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-edit-field-dd-ul1"));
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement elt2 = base.Driver.findElement(By.id("li2_2"));
        dragAndDropElement(elt1,eltTo);
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        dragAndDropElement(elt2,eltTo);
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("page_x002e_ctool_x002e_admin-console_x0023_default-edit-field-ok-button")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        return;

    }

    @Then("^les propriétés sélectionnées s'affichent$")
    public void lesProprietesSelectionneesSAffichent() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//a[contains(text(),'Nom')]")).isDisplayed();
        base.Driver.findElement(By.xpath("//a[contains(text(),'Titre')]")).isDisplayed();
        return;
    }

    @And("^je clique sur l'icône Modifier en survolant sur un type$")
    public void jeCliqueSurLIconeModifierEnSurvolantSurUnType() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//b[text()='Devis']")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(1270, 520);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);
        return;
        //dragAndDropElement(gfhj,gfdfhdf);
    }

    public static void dragAndDropElement(WebElement dragFrom, WebElement dragTo) throws Exception {

        Robot robot = new Robot();
        robot.setAutoDelay(500);
        // Get size of elements
        org.openqa.selenium.Dimension fromSize = dragFrom.getSize();
        org.openqa.selenium.Dimension toSize = dragTo.getSize();
        org.openqa.selenium.Point toLocation = dragTo.getLocation();
        Point fromLocation = dragFrom.getLocation();
        //Make Mouse coordinate centre of element
        toLocation.x += toSize.width/2;
        toLocation.y += 200 ;
        fromLocation.x += fromSize.width / 2;
        fromLocation.y += 200;

        //Move mouse to drag from location
        robot.mouseMove(fromLocation.x, fromLocation.y);
        //Click and drag
        robot.mousePress(InputEvent.BUTTON1_MASK);

        //Drag events require more than one movement to register
        //Just appearing at destination doesn't work so move halfway first
        robot.mouseMove(((toLocation.x - fromLocation.x) / 2) + fromLocation.x , ((toLocation.y - fromLocation.y) / 2) + fromLocation.y);

        //Move to final position
        robot.mouseMove(toLocation.x, toLocation.y);
        //Drop
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    @Then("^le message Champs mis à jour avec succès s'affiche$")
    public void leMessageChampsMisAJourAvecSuccesSAffiche() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//span[text()= 'Champs mis à jour avec succès.']")).isDisplayed();
        base.Driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        return;
    }

    @And("^je clique sur l'icône Modifier en survolant sur un type contenu$")
    public void jeCliqueSurLIconeModifierEnSurvolantSurUnTypeContenu() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//b[text()='Contenu']")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(1270, 300);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);
        return;
    }

    @And("^j'ai effectué un recherche sur un document du type contenu$")
    public void jAiEffectueUnRechercheSurUnDocumentDuTypeContenu() throws Throwable {
        base.Driver.switchTo().defaultContent();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("global_x002e_header_x0023_default-searchText")).sendKeys("lien.txt");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("global_x002e_header_x0023_default-searchText")).sendKeys(Keys.ENTER);
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;
    }

    @And("^je clique sur l'icône Modifier en survolant sur un type dossier$")
    public void jeCliqueSurLIconeModifierEnSurvolantSurUnTypeDossier() throws Throwable {
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(1310, 500);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//b[text()='Dossier']")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Thread.sleep(3000);
        Robot bot1 = new Robot();
        bot1.mouseMove(1270, 600);
        bot1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(5000);
        return;
    }

    @And("^j'ai effectué un recherche sur un document du type dossier$")
    public void jAiEffectueUnRechercheSurUnDocumentDuTypeDossier() throws Throwable {
        base.Driver.switchTo().defaultContent();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("global_x002e_header_x0023_default-searchText")).sendKeys("filtest");
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.id("global_x002e_header_x0023_default-searchText")).sendKeys(Keys.ENTER);
        base.Driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        return;
}
}
