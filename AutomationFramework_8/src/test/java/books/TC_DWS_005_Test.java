package books;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ListenerUtility;
import objectRepositry.Homepage;

@Listeners(ListenerUtility.class)
public class TC_DWS_005_Test extends BaseClass
{
@Test
public void clickOnBooks() throws EncryptedDocumentException, IOException

{
  //ExtentTest test = extentreport.createTest("ClickOnBooks");
   hp = new Homepage(driver);
   hp.getBookslink().click();
   Assert.assertEquals(driver.getTitle(),eLib.getStringDataFromExcel("Book", 1, 0),"Book is not Displayed");
   test.log(Status.PASS, "Book is not Displayed");
  
	
}
}
