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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.scrollToPosition(0, 150)

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/div_nomailtoolsqa.com                      _2224a2'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_My Account'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/span_My Account'))

WebUI.scrollToPosition(0, 550)

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/label_Username or email address'))

WebUI.setText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__username'), 'risnardn')

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__password'), 'AOVZyx2Byv/NgISPoRKuYw==')

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/button_Log in'))

WebUI.scrollToPosition(0, 250)

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/p_Hello risnardn (not risnardn Log out)'))

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_Search'))

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/input_Type and Press Enter to Search_s'), 
    'DRESS')

WebUI.sendKeys(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.scrollToPosition(0, 350)

WebUI.click(findTestObject('Object Repository/Page_Search Results for DRESS  ToolsQA Demo Site/a_white milkmaid hook and eye bodycon midi dress'))

WebUI.scrollToPosition(0, 700)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_white milkmaid hook and eye bodycon mi_dddcd5/select_Choose an optionWhite'), 
    'white', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_white milkmaid hook and eye bodycon mi_dddcd5/select_Choose an optionMediumSmallX-Large'), 
    'medium', false)

WebUI.click(findTestObject('Object Repository/Page_white milkmaid hook and eye bodycon mi_dddcd5/button_Add to cart'))

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_Search'))

WebUI.setText(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/input_Type and Press Enter to Search_s'), 
    'SHIRT')

WebUI.sendKeys(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.scrollToPosition(0, 350)

WebUI.click(findTestObject('Object Repository/Page_Search Results for SHIRT  ToolsQA Demo Site/a_pink drop shoulder oversized t shirt'))

WebUI.scrollToPosition(0, 700)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_pink drop shoulder oversized t shirt  _e751c6/select_Choose an optionPink'), 
    'pink', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_pink drop shoulder oversized t shirt  _e751c6/select_Choose an option363738'), 
    '36', false)

WebUI.click(findTestObject('Object Repository/Page_pink drop shoulder oversized t shirt  _e751c6/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_pink drop shoulder oversized t shirt  _e751c6/span_Cart(1)15.00'))

WebUI.scrollToPosition(0, 700)

WebUI.click(findTestObject('Object Repository/Page_Cart  ToolsQA Demo Site/a_Proceed to checkout'))

WebUI.navigateToUrl('https://shop.demoqa.com/checkout/')

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/button_Place order'))

WebUI.scrollToPosition(0, 250)

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/p_Thank you. Your order has been received'))

