package pages;

import org.openqa.selenium.devtools.idealized.Javascript;

public class CWTenantPage {

	public final String CWURL = "https://computingworlds.com/";
//	public final String LogoIconLocator = "//div[@class='user-topbar col']/span/i[contains(@class,'mbi-user')]";
	public final String LogoIconLocator = "//div[@class='user-topbar col']";
	public final String LoginButtonLocators = "//a[contains(text(), 'Log In') and @class='action primary']";
	public final String LoginEmailFieldLocator = "//input[@id='email']";
	public final String LoginEmailFieldValue = "shahzaib.idrees@cubixlabs.com";
	public final String LoginPasswordFieldLocators = "//input[@id='pass']";
	public final String LoginPasswordFieldValue = "DKsfMMWwDHw@AX4";
	public final String LoginPageButtonLocator = "//div[@class='actions-toolbar']//button[@class='action login primary' and @id='send2']/span[text()='Log In']";
	public final String HiShahzaibTextLocator = "//div[@class='user-topbar col']//div[@class='name' and text()='Shahzaib']";
	public final String CPUsTextLocator = "//a/span[text()='CPUs']";
	public final String AddToCardBtnLocator = "//form[@data-product-sku='59Y7829']//button[@title='Add to Cart']";
//	public final String AddToCardBtnLocator = "//button[@class='action tocart primary']";
//	public final String CheckoutBtnLocator = "//button[@id='top-cart-btn-checkout' and @class='action primary checkout' and text()='Checkout']";
	public final String CheckoutBtnLocator = "//button[@id='top-cart-btn-checkout']";
//	public final String CheckoutBtnLocator = "//button[text()='Checkout']";
//	public final String GetTile = "Checkout";
	public final String CardNumberTextLocator = "//label[@class='p-FieldLabel Label Label--empty' and text()='Card number']";
//	public final String CardNumberFieldLocator = "//input[@autocomplete='cc-number']";
	public final String CardNumberFieldLocator = "//input[@id='Field-numberInput']";
//	public final String CardNumberFieldLocator = "//span[text()='Secure, 1-click checkout with Link']/ancestor::button/following::input[@placeholder='1234 1234 1234 1234']";
	public final String CardNumberFieldValue = "4242 4242 4242 4242";
	public final String ExpiryDateFieldLocator = "//input[@autocomplete='cc-exp']";
	public final String ExpiryDateFieldValue = "12/34";
	public final String CVCFieldLocator = "//div[@class='p-CardCvcInput']//input";
	public final String CVCFieldValue = "123";
	public final String PlaceOrderBtnLocator = "//div[contains(@class, 'checkout-payment-method submit')]//button[@class='action primary checkout amasty' and @title='Place Order']";
	public final String LogoIconTwoLocator = "//div[@class='user-topbar col']/i[@class='mbi mbi-user']";
	public final String MyAccountTextLocator = "//li[@class='account']/a/span[text()='My Account']";
	public final String SearchLocator = "//div[@class='field search']//input[@id='search' and @placeholder=\"I'm looking for...\"]";
	public final String SearchValue = "59Y7829";
	public final String SearchIconLocator = "//div[@class='actions']/button[@type='submit' and @title='Search']";
	public final String ProductIDLocator = "//div[@class='col-12 col-sm-3']/div[@class='product-show']/button[@class='btn-quickview mb-tooltip']";
	public final String CheckoutURL = "https://computingworlds.com/checkout/";
	public final String ToastErrorMessage = "//div[@class='message message-error error']";
	public final String AddToCardURL = "https://computingworlds.com/catalogsearch/result/?q=59Y7829";
	public final String PayWithLinkLocator = "//iframe[@title='Secure payment button frame']";
	public final String CardDetailsiframeLocator = "//iframe[@title='Secure payment input frame' and @role='presentation']";
    
}
