package genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenerUtility extends BaseClass implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result)
	{
		test = extentreport.createTest(result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		String methodName = result.getName();
		TakesScreenshot ts =(TakesScreenshot) Sdriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File ("./ScreenShot/" + methodName +jLib.getSystemTime() +".png");
		
		test.log(Status.FAIL, methodName + "is Failed");
		test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64));
		try
		{
		FileHandler.copy(temp, dest);
		
	}catch(IOException e) {
		e.printStackTrace();
	}

}
}
