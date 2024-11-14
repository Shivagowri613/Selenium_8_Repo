package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

public class Homepage {

@FindBy(linkText = "Log out")
private WebElement logoutLink;

@FindBy(linkText = "Books")
private WebElement bookslink;

public WebElement getBookslink() {
	return bookslink;
}


public void setBookslink(WebElement bookslink) {
	this.bookslink = bookslink;
}


public WebElement getVerifytitile() {
	return verifytitile;
}


public void setVerifytitile(WebElement verifytitile) {
	this.verifytitile = verifytitile;
}


@FindBy(linkText = "Demo Web Shop. Books")
private WebElement verifytitile;



public Homepage(WebDriver driver)
{
PageFactory.initElements(driver, this);
}


public WebElement getLogoutLink() {
	return logoutLink;
}


public void setLogoutLink(WebElement logoutLink) {
	this.logoutLink = logoutLink;
}

}