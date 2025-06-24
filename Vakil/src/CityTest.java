import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.CityPage;
import pages.HomePage;
import pages.SettingPage;

public class CityTest {

	BaseClass base = new BaseClass();
	HomePage home = new HomePage();
	SettingPage setting = new SettingPage();
	CityPage city = new CityPage();
			
	@BeforeTest
	public void startChrome() 
	{
		base.gotoUrl(home.url);		
		base.forClick(home.LawyerDropDownLocator);
		base.forClick(home.CitiesBrowseAllLocator);
		base.waitUntilUrl(home.CitiesAllPageUrl);
				
	}
	
	@Test
	public void verifyAllCityLawyersFilterOption()
	{
		base.pageRefresh();	
		base.forClick(city.FilterCityLocator);
		base.forClick(city.FilterAllCityLocator);
		boolean TextVisible= base.waitUntilDisplayed(city.FilterAllCityTextLocator);
		base.verifyTrue(TextVisible);
		base.forClick(city.FilterAllCityCloseLocator);		
		base.waitUntilUrl(home.CitiesAllPageUrl);
		
	}
	
	@Test
	public void verifyAllCityAvialable()
	{
		base.pageRefresh();				
		boolean KarachiSectionVisible= base.waitUntilDisplayed(city.KarachiLocator);
		base.verifyTrue(KarachiSectionVisible);
		boolean HyderabadSectionVisible= base.waitUntilDisplayed(city.HyderabadLocator);
		base.verifyTrue(HyderabadSectionVisible);
		boolean LarkanaSectionVisible= base.waitUntilDisplayed(city.LarkanaLocator);
		base.verifyTrue(LarkanaSectionVisible);
		boolean SukkurSectionVisible= base.waitUntilDisplayed(city.SukkurLocator);
		base.verifyTrue(SukkurSectionVisible);
		boolean MirpurkhasSectionVisible= base.waitUntilDisplayed(city.MirpurkhasLocator);
		base.verifyTrue(MirpurkhasSectionVisible);
		base.waitUntilUrl(home.CitiesAllPageUrl);
		
	}
	
	@Test
	public void verifyAllSpecialitesLawyersFilterOption()
	{
		base.pageRefresh();	
		base.forClick(city.FilterSpecialitesLocator);
		base.waitUntilDisplayed(city.FilterAllSpecialitesLocator);
		base.forClick(city.FilterAllSpecialitesLocator);
		boolean TextVisible= base.waitUntilDisplayed(city.FilterAllSpecialitesTextLocator);
		base.verifyTrue(TextVisible);
		base.forClick(city.FilterAllSpecialitesCloseLocator);
//		base.waitUntilUrl(home.CitiesAllPageUrl);
		
	}
	
	@Test
	public void verifyAllSpecialitesAvialable()
	{
		base.pageRefresh();		
		base.forClick(city.FilterSpecialitesLocator);
		boolean LibelansDefamationSectionVisible= base.waitUntilDisplayed(city.LibelansDefamationLocator);
		base.verifyTrue(LibelansDefamationSectionVisible);
		boolean CriminalSectionVisible= base.waitUntilDisplayed(city.CriminalLocator);
		base.verifyTrue(CriminalSectionVisible);
		boolean BusinessandCorporateSectionVisible= base.waitUntilDisplayed(city.BusinessandCorporateLocator);
		base.verifyTrue(BusinessandCorporateSectionVisible);
		boolean TaxSectionVisible= base.waitUntilDisplayed(city.TaxLocator);
		base.verifyTrue(TaxSectionVisible);
		boolean DisputeLawSectionVisible= base.waitUntilDisplayed(city.DisputeLawLocator);
		base.verifyTrue(DisputeLawSectionVisible);
		boolean FamilyDisputeSectionVisible= base.waitUntilDisplayed(city.FamilyDisputeLocator);
		base.verifyTrue(FamilyDisputeSectionVisible);
		boolean FamilyDivorceSectionVisible= base.waitUntilDisplayed(city.FamilyDivorceLocator);
		base.verifyTrue(FamilyDivorceSectionVisible);		
		base.waitUntilUrl(home.CitiesAllPageUrl);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterTest
	public void CloseChrome() 
	
	{
		base.CloseBrowser();
		
	}
	
	
	
}
