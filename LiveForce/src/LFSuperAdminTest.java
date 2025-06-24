import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.LFSuperAdminPage;

public class LFSuperAdminTest {

	BaseClass base = new BaseClass();
	LFSuperAdminPage home = new LFSuperAdminPage();

	public void updatePurchaseKey() {
		if(base.elementFound(home.LFSuperAdminDeactivateLocator) == true);
		else if(base.elementFound(home.LFSuperAdminActiveLocator) == true) {
			base.forClick(home.LFSuperAdminActiveLocator);
			base.sendKeys(home.LFSuperAdminPurchasekeyLocator, home.LFSuperAdminPurchasekeyValue);
			base.forClick(home.LFSuperAdminPurchasekeySaveButtonLocator);
			base.waitUntilUrl(home.LFSuperAdminModulesPage);
		}
	}
	
	@Test
	public void verifyPurchaseKey() 
	{
		base.gotoUrl(home.LFSuperAdminURL);
		base.WindowMaximize();
		base.sendKeys(home.LFEmailFieldLocator, home.LFSuperAdminEmailValue);
		base.sendKeys(home.LFPasswordFIeldLocator, home.LFSuperAdminPasswordValue);
		base.forClick(home.LFLoginButtonLocator);
		base.forClick(home.LFSuperAdminSetupButtonLocator);
		base.forClick(home.LFSuperAdminSetupModulesButtonLocator);
		updatePurchaseKey();
		String AfterTextShown = base.getText(home.LFSuperAdminDeactivateLocator);
		base.verifyText(AfterTextShown, AfterTextShown);
	}

	@AfterTest
	public void CloseChrome() 

	{
		base.CloseBrowser();
	}

}
