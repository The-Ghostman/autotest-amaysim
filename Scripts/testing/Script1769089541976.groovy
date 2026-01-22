import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

// Get browser name safely
String executionBrowser = DriverFactory.getExecutedBrowser().toString()
println("--- Verified Browser: " + executionBrowser + " ---")

// Flexible Resizing
if (executionBrowser.contains('headless')) {
    println("--- Detected Headless: Forcing Viewport ---")
    WebUI.setViewPortSize(1920, 1080)
} else {
    println("--- Detected GUI: Maximizing ---")
    WebUI.maximizeWindow()
}

WebUI.navigateToUrl('https://www.amaysim.com.au/')