package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;


 
public class BaseClass {
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	public BaseClass() {
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js = (JavascriptExecutor)driver;
	}
	public void gotoUrl(String url) {
		driver.get(url);
	}
	
	public void pageRefresh() {
		driver.navigate().refresh();
	}
	public void navigateback() {
		driver.navigate().back();
	}
	public void navigateforward() {
		driver.navigate().forward();
	}
	
	public void CloseBrowser() {
		driver.close();
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String getUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
		
	public WebElement findElement(String locator) {
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		return element;
	}
	
	
	public String getText(String locator) 
	{
		String text = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).getText();
		return text;
		
	}
	
	public void forClick(String locator) {
		WebElement element = this.findElement(locator); 
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator))).click();
		}
		catch(TimeoutException e) {
			js.executeScript("arguments[0].click();", element);
		}
	}
	
	public void sendKeys(String locator, String value) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).sendKeys(value);
	}
	
	public void attributeContains(String locator, String attribute, String value) 
	{
		WebElement element = this.findElement(locator);
	    wait.until(ExpectedConditions.attributeContains(element, attribute, value));
	}

	
	public void verifySize(String locator, int expected) 
	{
		int size = 0;
		try {
		size = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator))).size();
		}
		catch(TimeoutException e) {
			size = 0;
		}
		Assert.assertEquals(expected, size);
	}
	
	
	public String getCssValue(String attribute, String locator)
   {
		WebElement element = this.findElement(locator);
		String value = element.getCssValue(attribute);
		return value;
	}
	public void byLinkText(String locator) {
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText(locator))).click();
	}
	
	
	
	public void verifyText(String expected, String actual){
		Assert.assertEquals(expected, actual);
	}
	
	public void verifyCurrentUrl(String expected, String actual){
		Assert.assertEquals(expected, actual);
	}
	
	public void verifyTrue(Boolean actual){
		Assert.assertTrue(actual);
	}
	public void verifyFalse(Boolean actual){
		Assert.assertFalse(actual);
	}
	
	public void waitUntilUrl(String url) {
		wait.until(ExpectedConditions.urlToBe(url));
	}
	 
	public void waitUrlContains(String value) {
		wait.until(ExpectedConditions.urlContains(value));
	}
	
	public boolean waitUntilDisplayed(String locator) {
		boolean element;
		try {
		element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).isDisplayed();
		}
		catch(TimeoutException e) {
		element = false;
		}
		return element;
	}
	
	public void clear(String locator)
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator))).clear();
	}
	
//	public boolean attributeContains(String attribute, String value)
//	
//	{
//		boolean beforeClick =wait.until(ExpectedConditions.attributeContains(null, attribute, value)
//		return beforeClick;
//	}
	
	
}
