package pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LinkPage {
    BaseUtil base;
    public LinkPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT, using = "Voir tout")
    public WebElement LinkVoirtout;
    @FindBy(how = How.ID, using = "page_x002e_ctool_x002e_admin-console_x0023_default-newuser-button-button")
   public WebElement IcnAjouterUser;

    public void ClicklnkVoirtout() {
        LinkVoirtout.click();
    }
   public void ClickIcnAjouterUser() {
       base.Driver.switchTo().frame(base.Driver.findElement(By.xpath("//iframe[@src='/share/page/console/admin-console/users?alf_ticket=TICKET_9edc1c78560d732bcb56b467f19fc1933ab39686']")));
      IcnAjouterUser.click();
    }



}
