package pages;

public class LFSuperAdminPage {
	
	public final String LFSuperAdminURL = "https://theliveforce.app/admin";
	public final String LFSuperAdminEmailValue = "networks@cubixlabs.com";
	public final String LFSuperAdminPasswordValue = "cIQYLO0G@)@#2023";
	public final String LFSuperAdminSetupButtonLocator = "//a[@class='open-customizer']//span[contains(text(), 'Setup')]";
	public final String LFSuperAdminSetupModulesButtonLocator = "//a[@href='https://theliveforce.app/admin/modules']//span[contains(text(), 'Modules')]";
	public final String LFSuperAdminDeactivateLocator  = "//a[contains(@href,'admin/modules/deactivate/saas') and text()='Deactivate']";
	public final String LFSuperAdminActiveLocator = "//a[contains(@href,'admin/modules/activate/saas') and text()='Activate']";
	public final String LFSuperAdminPurchasekeyLocator = "//input[@id='purchase_key' and @name='purchase_key']";
	public final String LFSuperAdminPurchasekeyValue = "f22210da-8f28-4af3-98de-4c5f83eeb584";
	public final String LFSuperAdminPurchasekeySaveButtonLocator = "//button[@id='submit' and contains(@class, 'btn-info') and text()='Save']";
	public final String LFSuperAdminModulesPage = "https://theliveforce.app/admin/modules";
	public final String LFEmailFieldLocator = "//input[@id='email']";
	public final String LFPasswordFIeldLocator = "//input[@id='password']";
	public final String LFLoginButtonLocator = "//button[@id='checkValidLogin']";
		
}