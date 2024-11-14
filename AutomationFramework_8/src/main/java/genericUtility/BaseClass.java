package genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.trello.qsp.utilities.ExcelUtility;

import objectRepositry.Homepage;
import objectRepositry.Loginpage;
import objectRepositry.WelcomePage;

public class BaseClass {
	public static ExtentReports extentreport;
	public static ExtentTest test;
	public WebDriver driver;
	public static WebDriver Sdriver;
	
    JavaUtility jLib=new JavaUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	public FileUtility fLib = new FileUtility();
	public ExcelUtility  eLib = new ExcelUtility();
	
	public WelcomePage wp;
	public Loginpage lp;
	public Homepage hp;
	
@BeforeSuite
public void configreport()
{
	ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Report/ExtentReport_"+jLib.getSystemTime() + ".html");
	ExtentReports extentreport = new ExtentReports();
	extentreport.attachReporter(spark);
	
}

@Parameters("Browser")
@BeforeClass
public void lunchBrowser(@Optional("Chrome")String browsername) throws IOException
{
if(browsername.equalsIgnoreCase("Chrome"))
{
	driver=new ChromeDriver();
}else if(browsername.equalsIgnoreCase("edge"))
{
	driver = new EdgeDriver();
}
else if (browsername.equalsIgnoreCase("firefox"))
{
	driver = new FirefoxDriver();
}
Sdriver = driver;
wLib.MaximizeWindow(driver);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get(fLib.getDataFromProperty("url"));
}

@BeforeMethod
public void login() throws IOException
{
	wp= new WelcomePage(driver);
	wp.getLoginlink().click();
	lp = new Loginpage(driver);
	lp.getEmailTextfield().sendKeys(fLib.getDataFromProperty("username"));
	lp.getPasswordtextField().sendKeys(fLib.getDataFromProperty("password"));
	lp.getLoginbutton().click();
}
@AfterMethod
public void Logout()
{
	hp = new Homepage(driver);
	hp.getLogoutLink().click();
}
@AfterClass
public void CloseBrowser()
{
	driver.quit();
}

@AfterSuite
public void reportbackup1()
{
	extentreport.flush();
}
}


