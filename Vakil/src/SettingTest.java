import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
 
public class SettingTest {

	BaseClass base = new BaseClass();
	HomePage home = new HomePage();
	SettingPage setting = new SettingPage();
	
	@BeforeTest
	public void startChrome() 
	{
		base.gotoUrl(home.url);
		base.forClick(home.SignInButtonLocator);
		base.attributeContains(home.BeforeClickStyleLocator, home.StyleValue, home.DisplayBlockValue);
		base.sendKeys(home.EmailFieldLocator, home.CorrectEmailValue);
		base.sendKeys(home.PasswordFieldLocator, home.CorrectPasswordValue);      
        base.forClick(home.PopUpLoginButtonLocator);
        base.waitUntilDisplayed(home.UserAnasLocator);      
        base.forClick(home.AnasAhmedKhanLocator);
        base.forClick(home.SettingPageLocator);
        base.waitUntilUrl(setting.SettingPageURL);
	}

	@Test
	public void verifyPageHeading()
	{
		
		base.verifyText(setting.SettingTextValue, base.getText(setting.SettingTextLocator));
		
	}
	
	@Test
	public void verifyChatIconVisible()

	{
		boolean IconVisible= base.waitUntilDisplayed(setting.LeadChatIconLocator);
		base.verifyTrue(IconVisible);
		base.forClick(setting.LeadChatIconLocator);
		base.verifyCurrentUrl(setting.InboxPageURL, base.getUrl());
		base.navigateback();
		base.waitUntilUrl(setting.SettingPageURL);
	}

	@Test
	public void verifyBlockLickSection()

	{
		boolean BlockLickSectionVisible= base.waitUntilDisplayed(setting.BlockListLocator);
		base.verifyTrue(BlockLickSectionVisible);
        base.forClick(setting.BlockListLocator);

        
//      base.waitUntilDisplayed(setting.InnerBlockListLocator);
//      base.verifyText(setting.BlockListValue, base.getText(setting.InnerBlockListLocator));
//      boolean SearchUserFieldVisible= base.waitUntilDisplayed(setting.SearchUserFieldLocator);
//		base.verifyTrue(SearchUserFieldVisible);
//		base.sendKeys(setting.SearchUserFieldLocator, setting.SearchUserValue);
        base.forClick(setting.AccountInformationLocator);
        base.waitUntilUrl(setting.SettingPageURL);
        
        	
	}
	
	
	@Test
	public void verifyUserInformation()

	{
		boolean PersonalInfoLocatorVisible= base.waitUntilDisplayed(setting.PersonalInfoLocator);
	    base.verifyTrue(PersonalInfoLocatorVisible);
	    boolean UserLogoVisible= base.waitUntilDisplayed(setting.UserLogoLocator);	    
	    base.verifyTrue(UserLogoVisible);
	    base.waitUntilUrl(setting.SettingPageURL);
	    
	  }
	
	
	@Test
	public void verifyFullNameFieldValidation()

	{
		base.clear(setting.NameFieldLocator);
        base.sendKeys(setting.NameFieldLocator, setting.NameFieldValue); 
		base.forClick(setting.SaveButtonLocator);
		base.verifyText(setting.FullNameErrorValue, base.getText(setting.FullNameErrorLocator));
		base.waitUntilUrl(setting.SettingPageURL);

	}
	
	
	@Test
	public void verifyPhoneNumberFieldValidation()

	{
		base.clear(setting.PhoneNumberFieldLocator);
        base.sendKeys(setting.PhoneNumberFieldLocator, setting.PhoneNumberValueEmpty); 
		base.forClick(setting.SaveButtonLocator);
		base.verifyText(setting.PhoneFieldErrorValue, base.getText(setting.PhoneFieldErrorlocator));
		base.waitUntilUrl(setting.SettingPageURL);
	
	}
	
	@Test
	public void verifyCityFieldValidation()

	{
		base.clear(setting.PhoneNumberFieldLocator);
        base.forClick(setting.SelectCityLocator);
        base.forClick(setting.DropDownSelectCityLocator);
		base.forClick(setting.SaveButtonLocator);
		base.verifyText(setting.CityFieldErrorValue, base.getText(setting.CityFieldErrorLocator));
		base.waitUntilUrl(setting.SettingPageURL);
	
	}
	
	
	
	@AfterTest
	public void CloseChrome() 
	
	{
		base.CloseBrowser();
		
	}











}