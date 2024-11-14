package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
@FindBy(id ="Email")
private WebElement emailTextfield;

@FindBy(id = "Password")
private WebElement PasswordtextField;

@FindBy(xpath = "//input[@value='Log in']")
private WebElement loginbutton;

public Loginpage(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

public WebElement getEmailTextfield() {
	return emailTextfield;
}

public void setEmailTextfield(WebElement emailTextfield) {
	this.emailTextfield = emailTextfield;
}

public WebElement getPasswordtextField() {
	return PasswordtextField;
}

public void setPasswordtextField(WebElement passwordtextField) {
	PasswordtextField = passwordtextField;
}

public WebElement getLoginbutton() {
	return loginbutton;
}


public void setLoginbutton(WebElement loginbutton) {
	this.loginbutton = loginbutton;
}
	
}

