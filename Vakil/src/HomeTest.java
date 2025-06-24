

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
 
public class HomeTest {

	BaseClass base = new BaseClass();
	HomePage home = new HomePage();
	
	@BeforeTest
	public void startChrome() 
	{
		base.gotoUrl(home.url);
	}
		
	@Test
	public void VerifyPageTitle() 
	{  
		base.verifyText(home.title, base.getTitle());
		base.verifyText(home.url, base.getUrl());
	}
	
	@Test
	public void VerifyFindAnyLawyerText() 
	
	{     
		String AfterTextShown = base.getText(home.lawyerTextlocator);
		base.verifyText(AfterTextShown, AfterTextShown);
	}
	
	
	@Test
	public void Verifylogo()
	{   
		boolean LogoLink= base.waitUntilDisplayed(home.logoLocator);
		base.verifyTrue(LogoLink);		  
	}
	
	@Test
	public void VerifySearchButton() 
	
	{
		base.pageRefresh();	
		base.sendKeys(home.CityFieldLocator, home.CityFieldValue);
		base.sendKeys(home.AreaOfLawsFieldLocator, home.AreaOfLawsFieldValue);
		base.sendKeys(home.FindLawyerByNameLocator, home.FindLawyerByNameValue);
		base.forClick(home.SearchButtonLocator);
		base.verifyText(home.FindLawyersPageURL, base.getUrl());	       
		base.verifyText(home.FindLawyersTextValue, base.getText(home.FindLawyersTextLocator));				
		base.forClick(home.HomeButtonLocator);
		base.waitUntilUrl(home.url);	
	}
	
	
	@Test
	public void VerifySpecificLawyerText() 
	
	{          
		
		base.verifyText(home.SpecificLawyerValue, base.getText(home.SpecificLawyerLocator));
		base.waitUntilUrl(home.url);
		 
	}
	

	
	@Test
	public void VerifyFirstlinkText() 
	
	{
		base.pageRefresh();	
		base.verifyText(home.LibelAndDefamationValue, base.getText(home.LibelAndDefamationLocator));
		base.byLinkText(home.LibelAndDefamationValue);
		base.waitUrlContains(home.lawyersValue); 
		base.verifyCurrentUrl(home.LibelAndDefamationUrl, base.getUrl());	
		base.verifyText(home.LibelAndDefamationValue, base.getText(home.FilteredByLADLocator)); 
		base.forClick(home.HomeButtonLocator);
		base.waitUntilUrl(home.url);			  			  
			   
	}
	 
	
	@Test
	public void VerifySecondLinkText() 
	
	{
		base.pageRefresh();	
		base.verifyText(home.CriminalValue, base.getText(home.CriminalLocator));
		base.byLinkText(home.CriminalValue);
		base.waitUrlContains(home.lawyersValue); 
		base.verifyCurrentUrl(home.CriminalUrl, base.getUrl());	
		base.verifyText(home.CriminalValue, base.getText(home.FilteredByCriminalLocator)); 
		base.forClick(home.HomeButtonLocator);
		base.waitUntilUrl(home.url);
		
	}
	
	@Test
	public void VerifyThirdLinkText() 
	
	{
		base.pageRefresh();	
		base.verifyText(home.BusinessandCorporateValue, base.getText(home.BusinessandCorporateLocator));
		base.byLinkText(home.BusinessandCorporateValue);
		base.waitUrlContains(home.lawyersValue); 
		base.verifyCurrentUrl(home.BusinessandCorporateUrl, base.getUrl());	
		base.verifyText(home.BusinessandCorporateValue, base.getText(home.FilteredByBusinessandCorporateLocator)); 
		base.forClick(home.HomeButtonLocator);
		base.waitUntilUrl(home.url);
		
	}
	
	@Test
	public void VerifyFourthLinkText() 
	
	{
		base.pageRefresh();	
		base.verifyText(home.TaxValue, base.getText(home.TaxLocator));
		base.byLinkText(home.TaxValue);
		base.waitUrlContains(home.lawyersValue); 
		base.verifyCurrentUrl(home.TaxUrl, base.getUrl());	
		base.verifyText(home.TaxValue, base.getText(home.FilteredByTaxLocator)); 
		base.forClick(home.HomeButtonLocator);
		base.waitUntilUrl(home.url);
		
	}
	
	@Test
	public void VerifyFivthLinkText() 
	
	{
		base.pageRefresh();	
		base.verifyText(home.DisputeLawValue, base.getText(home.DisputeLawLocator));
		base.byLinkText(home.DisputeLawValue);
		base.waitUrlContains(home.lawyersValue); 
		base.verifyCurrentUrl(home.DisputeLawUrl, base.getUrl());	
		base.verifyText(home.DisputeLawValue, base.getText(home.FilteredByDisputeLawLocator)); 
		base.forClick(home.HomeButtonLocator);
		base.waitUntilUrl(home.url);
		
	}
	
	@Test
	public void VerifyPageSection() 
	
	{
		boolean PageSectionVisible= base.waitUntilDisplayed(home.CreateaLawyerProfileSectionLocator);
		base.verifyTrue(PageSectionVisible);
		base.verifyText(home.CreateaLawyerProfileValue, base.getText(home.CreateaLawyerProfileTextLocator)); 
		boolean ButtonVisible= base.waitUntilDisplayed(home.GetListedLocator);
		base.verifyTrue(ButtonVisible);
		base.waitUntilUrl(home.url);
		
	}
	
	@Test 
	public void VerifyTestimonialSection() 
	{
		
		boolean PageSectionVisible= base.waitUntilDisplayed(home.TestimonialSectionLocator);
		base.verifyTrue(PageSectionVisible);
		
//		  boolean AfterLogoVisible= driver.findElement(By.xpath("//img[@src='https://sandbox4.cubix.co/staging/vakeel/public/site_assets/img/testimonial3@2x.png']")).isDisplayed();
//		   Assert.assertTrue(AfterLogoVisible);
		 
	}
	
	
	@Test
	public void VerifySearchPresent()
	
	{          
		base.verifyText(home.SearchforaLawyerValue, base.getText(home.SearchforaLawyerTextLocator)); 
		base.waitUntilUrl(home.url);
	}
	
	@Test
	public void VerifyLawyerDropDown() 
	
	{	
		
		base.pageRefresh();	
		base.forClick(home.LawyerDropDownLocator);
		base.attributeContains(home.LawyerDropDownSecondLocator, "class","d-block");
		base.verifyText(home.FindLawyersbyspecialityValue, base.getText(home.FindLawyersbyspecialityTextLocator));
		base.verifyText(home.FindLawyersbyCitiesValue, base.getText(home.FindLawyersbyCitiesTextLocator));
		base.forClick(home.LawyerDropDownLocator);
		base.waitUntilUrl(home.url); 
		   
			
	}
	
	
	@Test
	public void VerifySpecialityBrowserAll() 
	
	{
		base.pageRefresh();	
		base.forClick(home.LawyerDropDownLocator);
		base.verifyText(home.BrowseAllValue, base.getText(home.SpecialityBrowseAllLocator));
		base.forClick(home.SpecialityBrowseAllLocator);
		base.waitUrlContains(home.lawyersValue); 
		base.verifyCurrentUrl(home.SpecialityAllPageUrl, base.getUrl());  
		base.verifyText(home.AllSpecialitesValue, base.getText(home.FilteredByAllSpecialitesLocator));   
		base.forClick(home.HomeButtonLocator);
		base.waitUntilUrl(home.url);    
		       			  			      
	}
	
	@Test
	public void VerifyCitiesBrowserAll() 
	
	{
		base.pageRefresh();	
		base.forClick(home.LawyerDropDownLocator);
		base.verifyText(home.BrowseAllValue, base.getText(home.CitiesBrowseAllLocator));
		base.forClick(home.CitiesBrowseAllLocator);
     	base.waitUrlContains(home.lawyersValue); 
		base.verifyCurrentUrl(home.CitiesAllPageUrl, base.getUrl());  
		base.verifyText(home.AllCitiesValue, base.getText(home.FilteredByAllCitiesLocator));   
		base.forClick(home.HomeButtonLocator);
		base.waitUntilUrl(home.url);
		
	}
	
	@Test
	public void VerifyLogoWhileClickLawyer() 
	
	{
		base.pageRefresh();	
		boolean AfterWhiteLogochange= base.waitUntilDisplayed(home.WhiteLogoLocator);
		base.verifyTrue(AfterWhiteLogochange);
		base.forClick(home.LawyerDropDownLocator);
		boolean AfterDarkLogochange= base.waitUntilDisplayed(home.DarkLogoLocator);
		base.verifyTrue(AfterDarkLogochange);
		base.forClick(home.LawyerDropDownLocator);
		base.waitUntilUrl(home.url); 
		   
	}
	
	@Test
	public void VerifyLeopordsLogo() 
	
	{   
		base.pageRefresh();	
		boolean AfterLeopordsLogo= base.waitUntilDisplayed(home.LeopordsLogoLocator);
		base.verifyTrue(AfterLeopordsLogo);
		base.forClick(home.LeopordsLogoLocator);
		base.waitUrlContains(home.UrlContainViewLawyer);
		base.verifyCurrentUrl(home.LawyerUZAPageUrl, base.getUrl());
		base.verifyText(home.LawyerUZAValue, base.getText(home.LawyerUZALocator));   
		boolean AfterLeopordsSecondLogo= base.waitUntilDisplayed(home.LeopordsSecondLogoLocator);  
		base.verifyTrue(AfterLeopordsSecondLogo);
		base.forClick(home.HomeButtonLocator);
		base.waitUntilUrl(home.url);
		  		      			  			    
	}
	
	@Test
	public void SindhBarLogo()
	
	{
		boolean AfterSindhBarLogo= base.waitUntilDisplayed(home.SindhBarLogoLocator);
		base.verifyTrue(AfterSindhBarLogo);
		base.waitUntilUrl(home.url);
		
	}
	
	@Test
	public void LawyerProfileSection()
	
	{
		base.pageRefresh();	
		boolean AfterProfileSectionAppear= base.waitUntilDisplayed(home.LawyerProfileSectionLocator);
		base.verifyTrue(AfterProfileSectionAppear);
		base.verifyText(home.CreateaLawyerProfileValue, base.getText(home.CreateaLawyerProfileLocator));
		base.verifyText(home.GetYourExpertiseValue, base.getText(home.GetYourExpertiseLocator)); 
		//When None
		base.verifyText(home.NoneAttribute, base.getCssValue(home.DisplayValue, home.BeforeClickStyleLocator));
		base.forClick(home.GetListedLocator);	
		//When Block	
		base.attributeContains(home.BeforeClickStyleLocator, home.StyleValue, home.DisplayBlockValue);
		base.verifyText(home.BlockValue,base.getCssValue(home.DisplayValue, home.BeforeClickStyleLocator));	
	    base.forClick(home.PopUpCloseButtonLocator);			    
		base.waitUntilUrl(home.url); 
		     
		
	}
	
	@Test
	public void VerifyisTextPresent() 
	
	{      
		base.verifyText(home.BoostYourCaseTextValue, base.getText(home.BoostYourCaseTextLocator));  
		base.waitUntilUrl(home.url);
		 
	}

	@Test
	public void VerifySigninButton() 
	
	{
		base.pageRefresh();	
		base.verifyText(home.NoneAttribute, base.getCssValue(home.DisplayValue, home.BeforeClickStyleLocator));
		base.forClick(home.SignInButtonLocator);
		base.attributeContains(home.BeforeClickStyleLocator, home.StyleValue, home.DisplayBlockValue);
		base.verifyText(home.BlockValue,base.getCssValue(home.DisplayValue, home.BeforeClickStyleLocator));
		base.forClick(home.PopUpCloseButtonLocator);		   
	}
	
	@Test
	public void VerifyInviteFriendsPopup() 
	{
		base.pageRefresh();	
		base.forClick(home.InviteButtonLocator);
		base.verifyText(home.BlockValue,base.getCssValue(home.DisplayValue, home.BeforeClickStyleLocator));
		boolean InvitePopUpAppear= base.waitUntilDisplayed(home.InvitePopUpSectionLocator);
		base.verifyTrue(InvitePopUpAppear);
		base.verifyText(home.InviteButtonValue, base.getText(home.InviteButtonTextLocator));  
		boolean AfterWhatsappImageVisibile= base.waitUntilDisplayed(home.InvitePopUpWhatsappImageLocator);
		base.verifyTrue(AfterWhatsappImageVisibile);	   
		base.forClick(home.InvitePopUpCloseButtonLocator);		   
		base.waitUntilUrl(home.url);
			 
	}
	
	@Test
	public void VerifySigninFieldValidation() 
	
	{  
		
	base.pageRefresh();		
	base.forClick(home.SignInButtonLocator);
	base.attributeContains(home.BeforeClickStyleLocator, home.StyleValue, home.DisplayBlockValue);
	 //BeforeTextShown
	base.verifyText(home.ErrorLoginTextValue, base.getText(home.ErrorLoginTextLocator));
	base.sendKeys(home.EmailFieldLocator, home.WrongEmailValue);
	base.sendKeys(home.PasswordFieldLocator, home.CorrectPasswordValue);
     //Click on login button
    base.forClick(home.PopUpLoginButtonLocator); 
    base.attributeContains(home.BeforeClickStyleLocator, home.StyleValue, home.DisplayBlockValue);
     //AfterTextShown
    base.verifyText(home.NoUserWithErrorValue, base.getText(home.ErrorLoginTextLocator));    
	base.forClick(home.PopUpCloseButtonLocator);
    base.waitUntilUrl(home.url);
		
	}
	
	@Test
	public void VerifySigninFieldValidation2() 
	
	{ 
		
	base.pageRefresh();
	base.forClick(home.SignInButtonLocator);
	base.attributeContains(home.BeforeClickStyleLocator, home.StyleValue, home.DisplayBlockValue);
	base.verifyFalse(base.waitUntilDisplayed(home.EmailErrorTextLocator));
		
//	int ErrorNotApper= driver.findElements(By.xpath("//div[@id='email_error']")).size();
//	Assert.assertEquals(0,ErrorNotApper);
	
	base.sendKeys(home.EmailFieldLocator, home.SecondWrongEmailValue);
	base.sendKeys(home.PasswordFieldLocator, home.CorrectPasswordValue); 
  
    //Click on login button
    base.forClick(home.PopUpLoginButtonLocator);
    //AfterTextShown
    base.verifyText(home.ErrorValidEmailValue, base.getText(home.EmailErrorTextLocator)); 
    
	base.verifyTrue(base.waitUntilDisplayed(home.EmailErrorTextLocator));
	base.forClick(home.PopUpCloseButtonLocator);    
	base.waitUntilUrl(home.url);
	
	}
	
	@Test
	public void VerifySigninFieldValidation3() 
	
	{ 
		
	base.pageRefresh();
	
	base.forClick(home.SignInButtonLocator);
	base.attributeContains(home.BeforeClickStyleLocator, home.StyleValue, home.DisplayBlockValue);
	base.verifyText(home.ErrorLoginTextValue, base.getText(home.ErrorLoginTextLocator));
	base.sendKeys(home.EmailFieldLocator, home.CorrectEmailValue);
	base.sendKeys(home.PasswordFieldLocator, home.WrongPasswordValue);
     //Click on login button
    base.forClick(home.PopUpLoginButtonLocator);
   
     //AfterTextShown
    base.attributeContains(home.BeforeClickStyleLocator, home.StyleValue, home.DisplayBlockValue);
    base.verifyText(home.EmailorPasswordErrorValue, base.getText(home.ErrorLoginTextLocator));
    base.forClick(home.PopUpCloseButtonLocator);	
	
	}
	
	@Test
	public void VerifySigninFieldValidation4() 
	
	{ 
		
		base.pageRefresh();
		base.forClick(home.SignInButtonLocator);
		base.attributeContains(home.BeforeClickStyleLocator, home.StyleValue, home.DisplayBlockValue);
		base.verifyFalse(base.waitUntilDisplayed(home.EmailErrorTextLocator));
		base.verifyFalse(base.waitUntilDisplayed(home.PasswordErrorTextLocator));
		
//		int ErrorNotApper= driver.findElements(By.xpath("//div[@id='email_error']")).size();
//		Assert.assertEquals(0,ErrorNotApper);
//		int ErrorNotApper2= driver.findElements(By.xpath("//div[@id='password_error']")).size();
//		Assert.assertEquals(0,ErrorNotApper2);
//		
		 //Click on login button
	    base.forClick(home.PopUpLoginButtonLocator);
	     //AfterBothTextShown
	    base.verifyText(home.ErrorEmailFieldRequiredValue, base.getText(home.EmailErrorTextLocator));
	    base.verifyText(home.PasswordFielDRequiredValue, base.getText(home.PasswordErrorTextLocator));
	    base.forClick(home.PopUpCloseButtonLocator);		
		
	}
	

	@Test
	public void VerifySigninFunction()  
	
	{   
		base.pageRefresh();
		
		base.forClick(home.SignInButtonLocator);
		base.attributeContains(home.BeforeClickStyleLocator, home.StyleValue, home.DisplayBlockValue);
		base.sendKeys(home.EmailFieldLocator, home.CorrectEmailValue);
		base.sendKeys(home.PasswordFieldLocator, home.CorrectPasswordValue);      
        base.forClick(home.PopUpLoginButtonLocator);        
        base.findElement(home.UserAnasLocator);
        base.verifyText(home.UserAnasValue, base.getText(home.PrintButtonTextLocator));
         //  System.out.println(AfterTextShown);       
        base.forClick(home.AnasAhmedKhanLocator);  
        base.forClick(home.LogoutButtonLocator); 
        boolean SignInFormApper= base.waitUntilDisplayed(home.SignInFormLocator);
        base.verifyTrue(SignInFormApper);
                             
	}        	
//		@Test
//		public void back() {
//			base.navigateback();
//		}
	
	@AfterTest
	public void CloseChrome() 
	
	{
		base.CloseBrowser();
		
	}
		
	}

	


