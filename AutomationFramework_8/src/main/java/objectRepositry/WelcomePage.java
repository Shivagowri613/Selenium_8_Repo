package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
@FindBy(linkText = "Register")
private WebElement Register;

@FindBy(linkText = "Log in")
private WebElement Loginlink;

public WelcomePage(WebDriver driver) 
{
PageFactory.initElements(driver, this);	
}

public WebElement getRegister() {
	return Register;
}

public void setRegister(WebElement register) {
	Register = register;
}

public WebElement getLoginlink() {
	return Loginlink;
}

public void setLoginlink(WebElement loginlink) {
	Loginlink = loginlink;
}

}
