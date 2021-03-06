package pages;

import org.junit.Assert;

import helper.Constante;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constante.BASEURL + "/vacation")
public class InboxPage extends PageObject {

    @FindBy(name="_evovacation_WAR_EvoVacationportlet_rowIds")
    private WebElementFacade checklist;
    
    @FindBy(css="input[id='_evovacation_WAR_EvoVacationportlet_multipleApproveButton']")
    private WebElementFacade approve;
    
    @FindBy(css="input[id='_evovacation_WAR_EvoVacationportlet_multipleRejectButton']")
    private WebElementFacade reject;
    
    @FindBy(css="div.portlet-msg-success")
    private WebElementFacade message;
    

 
    
    public void clickChecklist() {
    	checklist.click();
    }
    public void approve() {
    	approve.click();
    }
    public void reject() {
    	reject.click();
    }
    public void verifyMessage() {
        Assert.assertTrue("Wrong !!!!", message.getText().contentEquals("Your request completed successfully."));
  }
    
    
}