import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class LiveForceTenantTest {

	BaseClass base = new BaseClass();
	LFTenantPage home = new LFTenantPage();

	@BeforeTest
	public void startChrome() 
	{
		base.gotoUrl(home.LFurl);
		base.WindowMaximize();
		base.sendKeys(home.LFEmailFieldLocator, home.LFEmailValue);
		base.sendKeys(home.LFPasswordFIeldLocator, home.LFPasswordValue);
		base.forClick(home.LFLoginButtonLocator);

	}

	@Test
	public void VerifyLFAdminTitle() 
	{
		base.gotoUrl(home.LFAdminurl);
		base.verifyText(home.LFtitle, base.getTitle());
	}

	@Test
	public void VerifyWidgetsPage() 
	{

		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);				
		base.forClick(home.LFWidgetsButton);
		base.waitUntilUrl(home.LFWidgetsPageURL);
		base.verifyText(home.LFWidgetsPageURL, base.getUrl());
		String AfterTextShown = base.getText(home.LFWidgetsTextLocator);
		base.verifyText(AfterTextShown, AfterTextShown);
		base.forClick(home.LFWidgetCopyCodeButtonLocator);
		base.waitUntilDisplayed(home.LFWidgetCopiedLocator);
		String AfterCodeCopied = base.getText(home.LFWidgetCopiedLocator);
		base.verifyText(AfterCodeCopied, AfterCodeCopied);
		base.sendKeys(home.LFWidgetScriptEmailFieldLocator, home.LFWidgetScriptEmailFieldValue);
		base.forClick(home.LFWidgetScriptEmailSendButtonLocator);
		base.waitUntilDisplayed(home.LFWidgetScriptEmailSentToastLocator);
		String AfterToastTextShown = base.getText(home.LFWidgetScriptEmailSentToastLocator);
		base.verifyText(AfterToastTextShown, AfterToastTextShown);
	}

	@Test
	public void VerifyInfoicePage() 
	{
		base.forClick(home.LFInvoiceButtonLocator);
		base.verifyText(home.LFInvoiceURL, base.getUrl());		
	}

	@Test
	public void VerifyCallHistoryPage() 
	{
		base.forClick(home.LFCallHistoryButtonLocator);
		base.verifyText(home.LFCallHistoryURL, base.getUrl());
		String AfterTextShown = base.getText(home.LFCallHistoryPageText);
		base.verifyText(AfterTextShown, AfterTextShown);

	}

	@Test
	public void VerifyStaffPage() 
	{
		base.forClick(home.LFStaffsButtonLocator);
		base.verifyText(home.LFStaffsURL, base.getUrl());
		String AfterTextShown = base.getText(home.LFStaffsPageTextLocator);
		base.verifyText(AfterTextShown, AfterTextShown);	
	}

	@Test
	public void VerifyActiveLeadsPage() 
	{
		base.forClick(home.LFLeadButton);
		base.forClick(home.LFActiveLeadsButton);
		base.verifyText(home.LFActiveLeadsPageURL, base.getUrl());		
	}

	@Test
	public void VerifyClosedLeadsPage() 
	{
		base.forClick(home.LFLeadButton);
		base.forClick(home.LFClosedLeadsButton);
		base.verifyText(home.LFClosedLeadsPageURL, base.getUrl());
	}

	@Test
	public void VerifyDisputedLeadsPage() 
	{
		base.forClick(home.LFLeadButton);
		base.forClick(home.LFDisputedLeadsButton);
		base.verifyText(home.LFDisputedLeadsPageURL, base.getUrl());
	}	

	@Test
	public void VerifyLeadFormPage() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFLeadFormButton);
		base.verifyText(home.LFLeadFormPageURL, base.getUrl());		
		String AfterTextShown = base.getText(home.LFLeadFormTextLocator);
		base.verifyText(AfterTextShown, AfterTextShown);
	}

	@Test
	public void VerifyScriptflowPage() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFScriptflowButton);
		base.verifyText(home.LFScriptflowPageURL, base.getUrl());
		String AfterTextShown = base.getText(home.LFScriptflowTextLocator);
		base.verifyText(AfterTextShown, AfterTextShown);
	}

	@Test
	public void VerifyTicktsPage() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFSetupticketsButton);
		base.waitUntilDisplayed(home.LFTicketsPageURL);
		base.verifyText(home.LFTicketsPageURL, base.getUrl());
		String AfterTextShown = base.getText(home.LFTicketsTextLocator);
		base.verifyText(AfterTextShown, AfterTextShown);
	}

	@Test
	public void VerifyLeadFormDataVisible() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFLeadFormButton);
		boolean LeadFormDataVisible= base.waitUntilDisplayed(home.LFLeadFormPanelBodyLocator);
		base.verifyTrue(LeadFormDataVisible);
	}

	@Test
	public void VerifyTicketsPagesRedirection() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFSetupticketsButton);
		base.verifyText(home.LFTicketsPageURL, base.getUrl());
		String AfterTextShown = base.getText(home.LFTicketsTextLocator);
		base.verifyText(AfterTextShown, AfterTextShown);
	}	

	@Test
	public void VerifyTicketsPageOptions() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFSetupticketsButton);
		base.forClick(home.LFNewTicketButton);
		base.sendKeys(home.LFSubjectFieldLocator, home.LFSubjectFieldValue);
		base.sendKeys(home.LFTicketBodyLocator, home.LFTicketBodyValue);
		base.forClick(home.LFCreateTicketButtonLocator);
		base.waitUntilDisplayed(home.LFBackTicketPageLocator);
		base.forClick(home.LFBackTicketPageLocator);
		base.waitUntilDisplayed(home.LFTicketsSubjectOption);
		String AfterSubjetsTextShown = base.getText(home.LFTicketsSubjectOption);
		base.verifyText(AfterSubjetsTextShown, AfterSubjetsTextShown);
		base.waitUntilDisplayed(home.LFStatusSubjectOption);
		String AfterStatusTextShown = base.getText(home.LFStatusSubjectOption);
		base.verifyText(AfterStatusTextShown, AfterStatusTextShown);
		base.waitUntilDisplayed(home.LFLastReplySubjectOption);
		String AfterAfterStatusShownTextShown = base.getText(home.LFLastReplySubjectOption);
		base.verifyText(AfterAfterStatusShownTextShown, AfterAfterStatusShownTextShown);
		base.waitUntilDisplayed(home.LFCreatedSubjectOption);
		String AfterCreatedTextShown = base.getText(home.LFCreatedSubjectOption);
		base.verifyText(AfterCreatedTextShown, AfterCreatedTextShown);
		base.waitUntilDisplayed(home.LFTestingIsInProcess5DeleteLocator);
		base.forClick(home.LFTestingIsInProcess5DeleteLocator);
		base.confirmationAlert();
	}

	@Test
	public void VerifyNewTicketPage() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFSetupticketsButton);
		base.forClick(home.LFNewTicketButton);
		base.verifyText(home.LFAddTicketPageURL, base.getUrl());
		String AfterTextShown = base.getText(home.LFAddTicketTextLocator);
		base.verifyText(AfterTextShown, AfterTextShown);
	}

	@Test
	public void VerifyCreateTicket() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFSetupticketsButton);
		base.waitUntilDisplayed(home.LFNewTicketButton);
		base.forClick(home.LFNewTicketButton);
		base.sendKeys(home.LFSubjectFieldLocator, home.LFSubjectFieldValue);
		base.sendKeys(home.LFTicketBodyLocator, home.LFTicketBodyValue);
		String BeforeCreateTicketTextShown = base.getText(home.LFBeforeCreateTicketSectionLocator);
		base.verifyText(BeforeCreateTicketTextShown, BeforeCreateTicketTextShown);
		base.forClick(home.LFCreateTicketButtonLocator);
		base.waitUntilDisplayed(home.LFCreatTicketToastAlertLocator);
		String AfterToastTextShown = base.getText(home.LFCreatTicketToastAlertLocator);
		base.verifyText(AfterToastTextShown, AfterToastTextShown);
		base.waitUntilDisplayed(home.LFAfterCreateTicketSectionLocator);
		String AfterCreateTicketTextShown = base.getText(home.LFAfterCreateTicketSectionLocator);
		base.verifyText(AfterCreateTicketTextShown, AfterCreateTicketTextShown);
		base.forClick(home.LFDeleteTicketButtonLocator);
		base.confirmationAlert();	
	}

	@Test
	public void VerifyTicketStatusPage() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFSetupticketsButton);
		base.waitUntilDisplayed(home.LFNewTicketButton);
		base.forClick(home.LFNewTicketButton);
		//Ticket Information
		base.sendKeys(home.LFSubjectFieldLocator, home.LFSubjectFieldValue);
		base.sendKeys(home.LFTicketBodyLocator, home.LFTicketBodyValue);
		base.forClick(home.LFCreateTicketButtonLocator);
		base.waitUntilDisplayed(home.LFSubjectTextLocator);
		String AfterSubjestTextShown = base.getText(home.LFSubjectTextLocator);
		base.verifyText(AfterSubjestTextShown, AfterSubjestTextShown);
		base.waitUntilDisplayed(home.LFSubjectTextLocator);
		String AfterTicketBodyTextShown = base.getText(home.LFSubjectTextLocator);
		base.verifyText(AfterTicketBodyTextShown, AfterTicketBodyTextShown);
		base.forClick(home.LFDeleteTicketButtonLocator);
		base.confirmationAlert();
	}

	@Test
	public void VerifyTicketOpenStatus() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFSetupticketsButton);
		base.waitUntilDisplayed(home.LFNewTicketButton);
		base.forClick(home.LFNewTicketButton);
		//Ticket Information
		base.sendKeys(home.LFSubjectFieldLocator, home.LFSubjectFieldValue);
		base.sendKeys(home.LFTicketBodyLocator, home.LFTicketBodyValue);
		base.forClick(home.LFCreateTicketButtonLocator);
		base.waitUntilDisplayed(home.LFOpenStatusLocator);
		String AfterOpenStatusShown = base.getText(home.LFOpenStatusLocator);
		base.verifyText(AfterOpenStatusShown, AfterOpenStatusShown);
		base.forClick(home.LFDeleteTicketButtonLocator);
		base.confirmationAlert();
	}

	@Test
	public void VerifyTicketInProgressStatus() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFSetupticketsButton);
		base.waitUntilDisplayed(home.LFNewTicketButton);
		base.forClick(home.LFNewTicketButton);
		//Ticket Information
		base.sendKeys(home.LFSubjectFieldLocator, home.LFSubjectFieldValue);
		base.sendKeys(home.LFTicketBodyLocator, home.LFTicketBodyValue);
		base.forClick(home.LFCreateTicketButtonLocator);
		base.waitUntilDisplayed(home.LFOpenStatusLocator);
		base.forClick(home.LFOpenStatusLocator);
		base.waitUntilDisplayed(home.LFDropDownInProgressLocator);
		base.forClick(home.LFDropDownInProgressLocator);
		base.waitUntilDisplayed(home.LFInProgressStatusLocator);
		String AfterInProgressStatusShown = base.getText(home.LFInProgressStatusLocator);
		base.verifyText(AfterInProgressStatusShown, AfterInProgressStatusShown);
		base.forClick(home.LFDeleteTicketButtonLocator);
		base.confirmationAlert();
	}

	@Test
	public void VerifyTicketOnHoldStatus() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFSetupticketsButton);
		base.waitUntilDisplayed(home.LFNewTicketButton);
		base.forClick(home.LFNewTicketButton);
		//Ticket Information
		base.sendKeys(home.LFSubjectFieldLocator, home.LFSubjectFieldValue);
		base.sendKeys(home.LFTicketBodyLocator, home.LFTicketBodyValue);
		base.forClick(home.LFCreateTicketButtonLocator);
		base.waitUntilDisplayed(home.LFOpenStatusLocator);
		base.forClick(home.LFOpenStatusLocator);
		base.waitUntilDisplayed(home.LFDropDownOnHoldLocator);
		base.forClick(home.LFDropDownOnHoldLocator);
		base.waitUntilDisplayed(home.LFOnHoldStatusLocator);
		String AfterOnHoldStatusShown = base.getText(home.LFOnHoldStatusLocator);
		base.verifyText(AfterOnHoldStatusShown, AfterOnHoldStatusShown);
		base.forClick(home.LFDeleteTicketButtonLocator);
		base.confirmationAlert();
	}

	@Test
	public void VerifyTicketAnsweredStatus() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFSetupticketsButton);
		base.waitUntilDisplayed(home.LFNewTicketButton);
		base.forClick(home.LFNewTicketButton);
		//Ticket Information
		base.sendKeys(home.LFSubjectFieldLocator, home.LFSubjectFieldValue);
		base.sendKeys(home.LFTicketBodyLocator, home.LFTicketBodyValue);
		base.forClick(home.LFCreateTicketButtonLocator);
		base.waitUntilDisplayed(home.LFOpenStatusLocator);
		base.forClick(home.LFOpenStatusLocator);
		base.waitUntilDisplayed(home.LFDropDownAnsweredLocator);
		base.forClick(home.LFDropDownAnsweredLocator);
		base.waitUntilDisplayed(home.LFAnsweredStatusLocator);
		String AfterAnsweredStatusShown = base.getText(home.LFAnsweredStatusLocator);
		base.verifyText(AfterAnsweredStatusShown, AfterAnsweredStatusShown);
		base.forClick(home.LFDeleteTicketButtonLocator);
		base.confirmationAlert();
	}

	@Test
	public void VerifyTicketClosedStatus() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFSetupticketsButton);
		base.waitUntilDisplayed(home.LFNewTicketButton);
		base.forClick(home.LFNewTicketButton);
		//Ticket Information
		base.sendKeys(home.LFSubjectFieldLocator, home.LFSubjectFieldValue);
		base.sendKeys(home.LFTicketBodyLocator, home.LFTicketBodyValue);
		base.forClick(home.LFCreateTicketButtonLocator);
		base.waitUntilDisplayed(home.LFOpenStatusLocator);
		base.forClick(home.LFOpenStatusLocator);
		base.waitUntilDisplayed(home.LFDropDownClosedLocator);
		base.forClick(home.LFDropDownClosedLocator);
		base.waitUntilDisplayed(home.LFClosedStatusLocator);
		String AfterClosedStatusShown = base.getText(home.LFClosedStatusLocator);
		base.verifyText(AfterClosedStatusShown, AfterClosedStatusShown);
		base.forClick(home.LFDeleteTicketButtonLocator);
		base.confirmationAlert();
	}

	@Test
	public void VerifyGeneratedTicketResponse() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFSetupticketsButton);
		base.forClick(home.LFNewTicketButton);
		//Ticket Information
		base.sendKeys(home.LFSubjectFieldLocator, home.LFSubjectFieldValue);
		base.sendKeys(home.LFTicketBodyLocator, home.LFTicketBodyValue);
		base.forClick(home.LFCreateTicketButtonLocator);
		//Generate Ticket Response 
		base.waitUntilDisplayed(home.LFWriteResponseFiledLocator);
		base.sendKeys(home.LFWriteResponseFiledLocator, home.LFWriteResponseFiledValue);
		base.forClick(home.LFWriteResponseSendButtonLocator);
		//Response Section Visible
		base.waitUntilDisplayed(home.LFResposesSectionLocator);
		String AfterResposesSectionShown = base.getText(home.LFResposesSectionLocator);
		base.verifyText(AfterResposesSectionShown, AfterResposesSectionShown);
		base.forClick(home.LFDeleteTicketButtonLocator);
		base.confirmationAlert();
	}

	@Test
	public void VerifyDeleteTicket() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFSetupticketsButton);
		base.waitUntilDisplayed(home.LFNewTicketButton);
		base.forClick(home.LFNewTicketButton);
		//Ticket Information
		base.sendKeys(home.LFSubjectFieldLocator, home.LFSubjectFieldValue);
		base.sendKeys(home.LFTicketBodyLocator, home.LFTicketBodyValue);
		base.forClick(home.LFCreateTicketButtonLocator);
		base.waitUntilDisplayed(home.LFBackTicketPageLocator);
		base.forClick(home.LFBackTicketPageLocator);
		//Successfully Deleted Toast Visible
		base.waitUntilDisplayed(home.LFCreatTicketToastAlertLocator);
		base.forClick(home.LFTestingIsInProcess5DeleteLocator);
		base.confirmationAlert();
		base.waitUntilDisplayed(home.LFDeleteTicketToastLocator);
		String AfterDeletedToastShown = base.getText(home.LFDeleteTicketToastLocator);
		base.verifyText(AfterDeletedToastShown, AfterDeletedToastShown);
	}

	@Test
	public void VerifyTicketDeletedonStatusTicketPage() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFSetupticketsButton);
		base.waitUntilDisplayed(home.LFNewTicketButton);
		base.forClick(home.LFNewTicketButton);
		//Ticket Information
		base.sendKeys(home.LFSubjectFieldLocator, home.LFSubjectFieldValue);
		base.sendKeys(home.LFTicketBodyLocator, home.LFTicketBodyValue);
		base.forClick(home.LFCreateTicketButtonLocator);
		//Successfully Deleted Toast Visible
		base.waitUntilDisplayed(home.LFDeleteTicketButtonLocator);
		base.forClick(home.LFDeleteTicketButtonLocator);
		base.confirmationAlert();
		base.waitUntilDisplayed(home.LFTicketDeletedToastlocator);
		String AfterTicketDeletedToastShown = base.getText(home.LFTicketDeletedToastlocator);
		base.verifyText(AfterTicketDeletedToastShown, AfterTicketDeletedToastShown);
	}

	@Test
	public void VerifyWidgetPageCopyCodeButton()
	{ 
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFWidgetsButton);
		base.forClick(home.LFWidgetCopyCodeButtonLocator);
		base.waitUntilDisplayed(home.LFWidgetCopiedLocator);
		String AfterCodeCopied = base.getText(home.LFWidgetCopiedLocator);
		base.verifyText(AfterCodeCopied, AfterCodeCopied);
	}

	@Test
	public void VerifyAllTicketStatusOnMainTicketPage() 
	{
		base.forClick(home.LFSetupOptionButton);
		base.waitUntilDisplayed(home.LFSetuoDropDownLocator);
		base.forClick(home.LFLeadFormButton);
		base.forClick(home.LFRequestforChangesLocator);
		base.forClick(home.LFNewTicketButton);
		//Ticket Information
		base.sendKeys(home.LFSubjectFieldLocator, home.LFSubjectFieldValue);
		base.sendKeys(home.LFTicketBodyLocator, home.LFTicketBodyValue);
		base.forClick(home.LFCreateTicketButtonLocator);
		String AfterOpenStatusShown = base.getText(home.LFOpenStatusLocator);
		base.verifyText(AfterOpenStatusShown, AfterOpenStatusShown);
		//Back To Main Ticket Page 
		base.forClick(home.LFBackTicketPageLocator);
		base.waitUntilDisplayed(home.LFTestingSubjectNamelocator);
		String AfterTestingSubjectNameShown = base.getText(home.LFTestingSubjectNamelocator);
		base.verifyText(AfterTestingSubjectNameShown, AfterTestingSubjectNameShown);
		base.waitUntilDisplayed(home.LFTPOpenStatusLocator);
		String AfterTPOpenStatusShown = base.getText(home.LFTPOpenStatusLocator);
		base.verifyText(AfterTPOpenStatusShown, AfterTPOpenStatusShown);
		base.waitUntilDisplayed(home.LFDeleteTicketTextLocator);
		base.forClick(home.LFDeleteTicketTextLocator);
		base.confirmationAlert();
	}


	@AfterTest
	public void CloseChrome() 

	{
		base.CloseBrowser();

	}

}
