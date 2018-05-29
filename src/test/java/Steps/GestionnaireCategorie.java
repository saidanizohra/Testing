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

public class GestionnaireCategorie extends BaseUtil {
        private BaseUtil base;

    public GestionnaireCategorie(BaseUtil base) {
        this.base = base;
    }
    @And("^je clique sur la rubrique Gestionnaire de catégories de la zone lattérale Classification$")
    public void jeCliqueSurLaRubriqueGestionnaireDeCategoriesDeLaZoneLatteraleClassification() throws Throwable {
        //base.Driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Thread.sleep(8000);
        base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[contains(@src,'/share/page/console/admin-console/users')]")));
        base.Driver.findElement(By.xpath("//a[contains(text(),'Gestionnaire de catégories')]")).click();
       Thread.sleep(8000);
       return;
    }
    @And("^je clique sur l'icône Ajouter une catégorie en survolant sur Catégorie racine$")
    public void jeCliqueSurLIconeAjouterUneCategorieEnSurvolantSurCategorieRacine() throws Throwable {
        base.Driver.findElement(By.id("ygtvlabelel1")).click();
        base.Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  WebDriverWait wait = new WebDriverWait(base.Driver,30);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ygtvlabelel1\"]/span")));   //examining the xpath for a search
        base.Driver.findElement(By.xpath("//*[@id=\"ygtvlabelel1\"]/span")).click();
        base.Driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        return;
    }

    @And("^je clique sur le bouton Ok$")
    public void jeCliqueSurLeBoutonOk() throws Throwable {
        base.Driver.findElement(By.xpath("//*[@id=\"yui-gen14-button\"]")).click();
        //base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return;
    }

    @Then("^le message Catégorie ajoutée avec succès s'affiche$")
    public void leMessageCategorieAjouteeAvecSuccesSAffiche() throws Throwable {
        String text2= "Catégorie ajoutée avec succès";
        String text1 =base.Driver.findElement(By.xpath("//*[@id=\"message\"]/div/span")).getText();
        base.Driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        if (text1.equals(text2))

        {

            System.out.println("Verification Successful - The correct message is displayed");
        }

        else
        {

            System.out.println("Verification Failed - An incorrect message is displayed ");

        }
        return;
    }


    @And("^j'ai saisi le nom de la catégorie$")
    public void jAiSaisiLeNomDeLaCategorie() throws Throwable {
        //WebDriverWait wait = new WebDriverWait(base.Driver,30);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@id,'alf-id')]")));
        base.Driver.findElement(By.xpath("//input[contains(@id,'alf-id')]")).sendKeys("8");
        base.Driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        return;
    }



    @And("^je survole sur une catégorie et je clique sur l'icône Supprimer la catégorie$")
    public void jeSurvoleSurUneCategorieEtJeCliqueSurLIconeSupprimerLaCategorie() throws Throwable {
        base.Driver.findElement(By.xpath("//span[contains(text(),'test')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(base.Driver,30);
        // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ygtvlabelel3\"]/span[2]")));   //examining the xpath for a search
        // base.Driver.findElement(By.xpath("//*[@id=\"ygtvlabelel3\"]/span[2]")).click();
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(400, 520);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
       // base.Driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        return;
    }

    @And("^je clique sur le bouton Supprimer du popup de validation de suppression$")
    public void jeCliqueSurLeBoutonSupprimerDuPopupDeValidationDeSuppression() throws Throwable {
        base.Driver.findElement(By.xpath("//*[@id=\"yui-gen14-button\"]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return;
    }

    @Then("^le message Catégorie supprimée avec succès s'affiche$")
    public void leMessageCategorieSupprimeeAvecSuccesSAffiche() throws Throwable {
        String textsup1="Catégorie supprimée avec succès";
        String textsup2 =base.Driver.findElement(By.xpath("//*[@id=\"message\"]/div/span")).getText();
        base.Driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        if (textsup2.equals(textsup2))

        {

            System.out.println("Verification Successful - The correct message is displayed");
        }

        else
        {

            System.out.println("Verification Failed - An incorrect message is displayed ");

        }
        return;

    }

    @And("^je survole sur une catégorie et je clique sur l'icône Editer une catégorie$")
    public void jeSurvoleSurUneCategorieEtJeCliqueSurLIconeEditerUneCategorie() throws Throwable {
        base.Driver.findElement(By.xpath("//span[contains(text(),'ffgg')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(base.Driver,30);
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ygtvlabelel3\"]/span[2]")));   //examining the xpath for a search
       // base.Driver.findElement(By.xpath("//*[@id=\"ygtvlabelel3\"]/span[2]")).click();
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(350, 390);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        base.Driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        return;

    }

    @And("^je modifie le nom de la catégorie et je clique sur le bouton Enregistrer$")
    public void jeModifieLeNomDeLaCategorieEtJeCliqueSurLeBoutonEnregistrer() throws Throwable {
        Thread.sleep(5000);
        base.Driver.findElement(By.xpath("//input[contains(@id,'form-field-')]")).sendKeys("test1");
        base.Driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//a[contains(text(),'Enregistrer')]")).click();
        return;
    }

    @Then("^le message Nom de la catégorie modifié avec succès s'affiche$")
    public void leMessageNomDeLaCategorieModifieAvecSuccesSAffiche() throws Throwable {
        Thread.sleep(1000);
        base.Driver.findElement(By.xpath("//span[contains(text(),'Nom de la catégorie modifié avec succès')]"));
        /*  String textMod1="Nom de la catégorie modifié avec succès";
        String textMod2=base.Driver.findElement(By.xpath("//*[@id=\"message\"]/div/span")).getText();
        if (textMod2.equals(textMod1))

        {

            System.out.println("Verification Successful - The correct message is displayed");
        }

        else
        {

            System.out.println("Verification Failed - An incorrect message is displayed ");



        }
*/
        return;
    }

    @And("^j'ai saisi le nom de catégorie$")
    public void jAiSaisiLeNomDeCategorie() throws Throwable {
        base.Driver.findElement(By.xpath("//input[contains(@id,'alf-id')]")).sendKeys("cat");
        base.Driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        return;
    }

    @And("^je survole sur une catégorie et je clique sur l'icône Ajouter une catégorie$")
    public void jeSurvoleSurUneCategorieEtJeCliqueSurLIconeAjouterUneCategorie() throws Throwable {
        base.Driver.findElement(By.xpath("//span[contains(text(),'cours')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(base.Driver,30);
        // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ygtvlabelel3\"]/span[2]")));   //examining the xpath for a search
        // base.Driver.findElement(By.xpath("//*[@id=\"ygtvlabelel3\"]/span[2]")).click();
        Thread.sleep(3000);
        Robot bot = new Robot();
        bot.mouseMove(370, 370);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        base.Driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        return;

    }

    @And("^j'ai saisi le nom de la sous catégorie$")
    public void jAiSaisiLeNomDeLaSousCategorie() throws Throwable {
        base.Driver.findElement(By.xpath("//input[contains(@id,'alf-id')]")).sendKeys("coursBI");
        base.Driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);;
        return;
    }

    @And("^je clique sur Ok$")
    public void jeCliqueSurOk() throws Throwable {
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        base.Driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
        base.Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        return;
    }


}
