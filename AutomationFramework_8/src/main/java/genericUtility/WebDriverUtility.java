package genericUtility;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * @author shivagowri
 * @param driver
 */
public class WebDriverUtility {
	private static final CharSequence Url = null;

	/**
	 * This method is used to Maximize the window
	 * 
	 * @param driver
	 */
	public void MaximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This method perform mouse over action on web element
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		;
	}

	/**
	 * This method perform right click on web page
	 * 
	 * @param driver
	 */
	public void rightClick(WebDriver driver) {
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}

	/**
	 * This method is used to Switch to frame by index
	 * 
	 * @param driver
	 * @param index
	 */

	public void switchtoFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * This method is used to Switch to Frame by name/id
	 * 
	 * @param driver
	 * @param nameorId
	 */
	public void SwithToFrame(WebDriver driver, String nameorId) {
		driver.switchTo().frame(nameorId);
	}
/**
 * This method is used to switch the element
 * @param driver
 * @param Element
 */
	public void SwithToFrame(WebDriver driver, WebElement Element) {
		driver.switchTo().frame(Element);
	}
	/**
	 * This method is used to Javascript Executer
	 * @param driver
	 * @param element
	 */

	public void jsclick(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", element);
	}
/**
 * This method is used to Window Scroolby
 * @param driver
 * @param x
 * @param y
 */
	public void jsScroll(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollby(" + x + "," + y + ")");
	}
/**
 * This method is used switch to alert 
 * @param driver
 * @return
 */
	public Alert SwithToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
/**
 * this method is used ti acceot the window
 * @param driver
 */
	public void SwitchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
/**
 * this method is used to Dismiss
 * @param driver
 */
	public void SwitchToAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public void SwitchToAlertAndSendKeyts(WebDriver driver, String data) {
		driver.switchTo().alert().sendKeys(data);
	}

	public void SelectDropdownValue(WebElement Element, String Value) {
		Select sel = new Select(Element);
		sel.selectByValue(Value);
	}

	public void SelectDropdownindex(WebElement Element, int index) {
		Select sel = new Select(Element);
		sel.selectByIndex(index);
	}

	public void SelectDropdowntext(WebElement Element, String text) {
		Select sel = new Select(Element);
		sel.selectByVisibleText(text);
	}

	/**
	 * This method is used to switch to driver control to window based on url
	 * 
	 * @param driver
	 * @param url
	 */
	public void SwitchTowindow(WebDriver driver) {
		// Step1: Capture Window Ids
		Set<String> allwinowids = driver.getWindowHandles();
		// Step2: travel through All the windows
		for (String id : allwinowids) {
			driver.switchTo().window(id);
			String ActUrl = driver.getCurrentUrl();
			if (ActUrl.contains(Url)) {
				break;
			}
			

		}
	}
}
