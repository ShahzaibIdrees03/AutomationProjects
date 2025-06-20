import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.CWTenantPage;


public class CWLoginPageTest {

	BaseClass base = new BaseClass();
    CWTenantPage home = new CWTenantPage();
    JavascriptExecutor js = (JavascriptExecutor) base.driver;
    
	@BeforeTest
	public void startChrome() throws Exception {
		
		base.gotoUrl(home.CWURL);
		base.WindowMaximize();
		base.forClick(home.LogoIconLocator);
    	base.waitUntilDisplayed(home.LoginButtonLocators);
    	base.forClick(home.LoginButtonLocators);
    	base.waitUntilDisplayed(home.LoginEmailFieldLocator);
    	base.sendKeys(home.LoginEmailFieldLocator, home.LoginEmailFieldValue);
    	base.waitUntilDisplayed(home.LoginPasswordFieldLocators);
    	base.sendKeys(home.LoginPasswordFieldLocators, home.LoginPasswordFieldValue);
    	base.waitUntilDisplayed(home.LoginPageButtonLocator);
    	base.forClick(home.LoginPageButtonLocator);
    	base.waitUntilUrl(home.CWURL);
    	

    	
    	
	}
   
    @Test (priority = 1)
	public void verifyLogin() throws Exception 
	{
    	
    	//screenCapture();
//    	Reporter.log("Screenshot Capture is done");
//    	Reporter.log("TestCase is Fail because of below reason");
//    	Reporter.log("TestCase is pass");
    	
    	base.forClick(home.LogoIconTwoLocator);
    	base.waitUntilDisplayed(home.MyAccountTextLocator);
    	base.getText(home.MyAccountTextLocator);
    	
    	
    }
    
    @Test (priority = 2)
   	public void verifyAddToCart() throws InterruptedException 
   	
   	{
    	base.waitUntilDisplayed(home.SearchLocator);
    	base.sendKeys(home.SearchLocator, home.SearchValue);
    	base.pressEnter(home.SearchLocator);

    	js.executeScript("window.scrollBy(0,200)"," ");
    	base.waitUntilDisplayed(home.AddToCardBtnLocator);
    	base.forClick(home.AddToCardBtnLocator);
    	base.waitUntilDisplayed(home.CheckoutBtnLocator);
    	base.forClick(home.CheckoutBtnLocator);
    	base.waitUntilDisplayed(home.CardDetailsiframeLocator);
    	js.executeScript("window.scrollBy(0,500)"," ");
    	
        base.iframeElement(home.CardDetailsiframeLocator);
    	base.waitUntilDisplayed(home.CardNumberFieldLocator);
    	base.forClick(home.CardNumberFieldLocator);
    	base.sendKeys(home.CardNumberFieldLocator, home.CardNumberFieldValue);
    	base.pressEnter(home.CardNumberFieldLocator);
    	
    	base.waitUntilDisplayed(home.ExpiryDateFieldLocator);
    	base.sendKeys(home.ExpiryDateFieldLocator, home.ExpiryDateFieldValue);
    	base.pressEnter(home.ExpiryDateFieldLocator);
    	
    	base.waitUntilDisplayed(home.CVCFieldLocator);
    	base.sendKeys(home.CVCFieldLocator, home.CVCFieldValue);
     	base.pressEnter(home.CVCFieldLocator);
        base.defaultContent();
    	
   	}
    
    @Test (priority = 3)
   	public void verifyToastMessage()
   	{
    	base.waitUntilDisplayed(home.ToastErrorMessage);
    	base.getText(home.ToastErrorMessage);
    	   
   	}

	@AfterTest
	public void CloseChrome()

	{
		base.CloseBrowser();
	}
	
}
