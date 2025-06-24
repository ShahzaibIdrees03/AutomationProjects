package pages;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import io.github.bonigarcia.wdm.WebDriverManager;


 
public class BaseClass {
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	public BaseClass() {
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
 		//options.addArguments("--window-size=1325x744");
        options.addArguments("--disable-notifications");
        //arrugmentt call for allowing weapplication chrome update
        options.addArguments("--remote-allow-origins=*");
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
	
	public void WindowMaximize() {
		driver.manage().window().setSize(new Dimension(1440,900));
		//driver.manage().window().maximize();
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
	
	public boolean elementFound(String locator)
    {
		WebElement element;
		boolean result = true;
		try {
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		}
		catch(TimeoutException e) {
			result = false;
		}
		return result;
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
	
	public void  waitelementToBeClickable(String value) {
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(value)));
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
	
	public void confirmationAlert ()
	{	
	Alert confirmationAlert = driver.switchTo().alert();
	confirmationAlert.accept();
	}
	
	public class LocatorSearchWithPagination {

	    public static WebElement findElementWithPagination(WebDriver driver, By locator) {
	        WebElement element = null;

	        // Maximum number of pages to search (adjust as needed)
	        int maxPages = 10;
	        int currentPage = 1;

	        while (currentPage <= maxPages) {
	            try {
	                // Attempt to find the element on the current page
	                element = driver.findElement(locator);

	                // If the element is found, break out of the loop
	                if (element.isDisplayed()) {
	                    break;
	                }
	            } catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.StaleElementReferenceException e) {
	                // Element not found on the current page, or the reference is stale
	                System.out.println("Element not found on page " + currentPage + ". Continuing to the next page.");
	            }

	            // Click the next page button (adjust the locator based on your pagination structure)
	            WebElement nextPageButton = driver.findElement(By.xpath("//a[@class='next-page']")); // Change the XPath accordingly
	            nextPageButton.click();

	            // Wait for a moment to let the new page load
	            try {
	                Thread.sleep(1000); // Adjust the sleep duration as needed
	            } catch (InterruptedException ignored) {
	            }

	            // Move to the next page
	            currentPage++;
	        }

	        return element;
	    }
	}
	}



