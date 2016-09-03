package com.selenium.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {


@FindBy(id="username")
WebElement Uname;

@FindBy(id="password")
WebElement paswd;
 
@FindBy(id="btnreset")
WebElement  reset;
 
@FindBy(id="btnsubmit")
WebElement login;


public void Adminlgn(String Un,String Pswd)
{
	reset.click();
	Uname.sendKeys(Un);
	paswd.sendKeys(Pswd);
	login.click();


}
}
