import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
WebUI.openBrowser("https://flipkart.com")
WebUI.maximizeWindow()
WebUI.setText(findTestObject('Object Repository/flipkart/Login_Username'), "9701455013")
WebUI.setText(findTestObject('Object Repository/flipkart/Login_Pwd'), "tam143eem")
WebUI.click(findTestObject('Object Repository/flipkart/Login_Button'))
String error=WebUI.getText(findTestObject('Object Repository/flipkart/Login_Error'))

System.out.println(error)
if(error == "Your username or password is incorrect")
	{
		WebUI.setText(findTestObject('Object Repository/flipkart/Login_Pwd'), "tam143EEM")
		WebUI.click(findTestObject('Object Repository/flipkart/Login_Button'))
	}
	else
	{
		WebUI.closeBrowser()
		System.out.println("Browser got closed successfully")
	}
