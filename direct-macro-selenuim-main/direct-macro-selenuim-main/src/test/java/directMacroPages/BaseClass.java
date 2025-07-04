package directMacroPages;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.TakesScreenshot;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class BaseClass {
	
	//import io.github.bonigarcia.wdm.WebDriverManager;
		public WebDriver driver;
		public WebDriverWait wait;
		public JavascriptExecutor js;
		public ExtentReports extent;
		public ExtentTest test;
		public ExtentHtmlReporter htmlReporter;
		
		public BaseClass() {
			//WebDriverManager.chromedriver().setup();
			
//			System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--headless");
	        options.addArguments("--disable-notifications");
	        //arrugmentt call for allowing web pplication chrome update
	        options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			js = (JavascriptExecutor)driver;
			
		}
		
		public void setExtend() {
			
			htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\test-output\\Report.html");
			htmlReporter.config().setDocumentTitle("Automation Report");
			htmlReporter.config().setReportName("Functional Report");
			htmlReporter.config().setTheme(Theme.STANDARD);
			
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			
			extent.setSystemInfo("Hostname","LocalHost");
			extent.setSystemInfo("OS","Windows10");
			extent.setSystemInfo("Tester Name","Ali Hammad");
			extent.setSystemInfo("Browser","chrome");
			
			
		}
		
		 public void closeExtentReports() {
		    
			 if (extent != null) {
				 extent.flush();
			 }
		    }
		 
		 public String getScreenShot(WebDriver driver, String screenShotName) throws IOException {
			
			 String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			 TakesScreenshot ts = (TakesScreenshot) driver;
			 File source = ts.getScreenshotAs(OutputType.FILE);
			 
			 String destination = System.getProperty("user.dir") + "/Screenshots/" + screenShotName + dateName + ".png";
			 File finalDestination = new File(destination);
			 FileUtils.copyFile(source,finalDestination);
			 return destination;
			 
		 }
		 
		 public void testcaseName(String testName) {
			 test = extent.createTest(testName);
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
		
		public void forClick(String locator) {
			WebElement element = this.findElement(locator); 
			try {
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator))).click();
			}
			catch(TimeoutException e) {
				js.executeScript("arguments[0].click();", element);
			}
		}
		
		public String getText(String locator) 
		{
			String text = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).getText();
			return text;
			
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

		
		 // Function to select an option from a dropdown by visible text
	    public void selectDropdownByVisibleText(String locator, String visibleText) {
	        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	        Select dropdown = new Select(dropdownElement);
	        dropdown.selectByVisibleText(visibleText);
	    }

	    // Function to select an option from a dropdown by value
	    public void selectDropdownByValue(String locator, String value) {
	        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	        Select dropdown = new Select(dropdownElement);
	        dropdown.selectByValue(value);
	    }

	    // Function to select an option from a dropdown by index
	    public void selectDropdownByIndex(String locator, int index) {
	        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	        Select dropdown = new Select(dropdownElement);
	        dropdown.selectByIndex(index);
	    }
		
		
		
		
//		public boolean attributeContains(String attribute, String value)
	//	
//		{
//			boolean beforeClick =wait.until(ExpectedConditions.attributeContains(null, attribute, value)
//			return beforeClick;
//		}
		
		

}
