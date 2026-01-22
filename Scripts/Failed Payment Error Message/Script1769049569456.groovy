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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Open web browser and navigate to target URL
WebUI.openBrowser('')

// URL can be manually changed below. I would like to make this 
WebUI.navigateToUrl(GlobalVariable.G_SiteURL)

// Select 7 Days SIM Plan
WebUI.click(findTestObject('BTN_SIM_plans'))

WebUI.click(findTestObject('BTN_7Days_SIM_plans'))

WebUI.click(findTestObject('RDO_BTN_New_Number'))

WebUI.click(findTestObject('RDO_BTN_Physical_SIM'))

// Checking out the selected 7 Days SIM Plan
WebUI.click(findTestObject('BTN_checkout'))

// Filling out all required information
WebUI.click(findTestObject('DRP_DWN_Title'))

WebUI.click(findTestObject('DRP_DWN_Select_Title'))

WebUI.setText(findTestObject('INP_Firstname'), GlobalVariable.G_Firstname)

WebUI.setText(findTestObject('INP_Lastname'), GlobalVariable.G_Lastname)

WebUI.setText(findTestObject('INP_Birthdate'), GlobalVariable.G_Birthdate)

WebUI.setText(findTestObject('INP_EmailAdd'), GlobalVariable.G_EmailAdd)

WebUI.setMaskedText(findTestObject('INP_Password'), GlobalVariable.G_Password)

WebUI.setText(findTestObject('INP_ContactNum'), GlobalVariable.G_ContactNum)

WebUI.setText(findTestObject('INP_Address'), GlobalVariable.G_Address)

WebUI.click(findTestObject('INP_Select_Address'))

// Selecting Card for Payment
WebUI.scrollToElement(findTestObject('LBL_PaymentMethod'), 0)

WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)

WebUI.switchToFrame(findTestObject('I_FRM_Stripe'), 10)

WebUI.waitForPageLoad(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BTN_CardPayment'))

// Entering Invalid/Declined Card
WebUI.setText(findTestObject('INP_CardNumber'), '4242 4242 4242 4242')

WebUI.setText(findTestObject('INP_CardExpiry'), '01/27')

WebUI.setText(findTestObject('INP_CardCVC'), '123')

WebUI.switchToDefaultContent()

// Accepting Terms and Conditions
WebUI.click(findTestObject('CHK_BOX_TermsAndConditions'))

// Clicking Pay Now button
WebUI.click(findTestObject('BTN_Pay_Now'))

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

// Checking Payment Failed Error Message Header
WebUI.verifyElementPresent(findTestObject('LBL_PaymentFailed'), 0)

