package NewCode;


package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.Home_Page;

import pageObjects.LogIn_Page;

import utility.ExcelUtils;

// Now this method does not need any arguments

public class ExcelData {

public static void Execute(WebDriver driver) throws Exception{

//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

String sUserName = ExcelUtils.getCellData(1, 1);

String sPassword = ExcelUtils.getCellData(1, 2);

Home_Page.lnk_MyAccount(driver).click();

LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);

LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);

LogIn_Page.btn_LogIn(driver).click();

LogIn_Page.btn_LogIn(driver).click();
LogIn_Page.btn_LogIn(driver).click();

}

}



