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

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Homepage/btn_menu-toggle'))

WebUI.click(findTestObject('Homepage/btn_Login'))

WebUI.setText(findTestObject('LoginPage/txtField_username'), 'Ulfa Azizah')

WebUI.setText(findTestObject('LoginPage/txtField_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('LoginPage/btn_Login'))

WebUI.verifyElementPresent(findTestObject('Reservation/txt_Login-failed'), 0)

WebUI.setText(findTestObject('LoginPage/txtField_username'), 'John Doe')

WebUI.setText(findTestObject('LoginPage/txtField_password'), 'P@ssw0rd')

WebUI.click(findTestObject('LoginPage/btn_Login'))

WebUI.verifyElementPresent(findTestObject('Reservation/txt_Login-failed'), 0)

WebUI.waitForElementPresent(findTestObject('LoginPage/txtField_username'), 5)

WebUI.verifyElementPresent(findTestObject('LoginPage/txtField_username'), 0)

WebUI.setText(findTestObject('LoginPage/txtField_username'), 'John Doe')

WebUI.setText(findTestObject('LoginPage/txtField_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('LoginPage/btn_Login'))

WebUI.verifyElementPresent(findTestObject('Reservation/txt_Login-success'), 0)

WebUI.click(findTestObject('AppointmentPage/select_facility2'))

WebUI.click(findTestObject('AppointmentPage/input_PendaftaranKembali'))

WebUI.click(findTestObject('AppointmentPage/input_Medicare'))

WebUI.click(findTestObject('AppointmentPage/input_Medicaid'))

WebUI.click(findTestObject('AppointmentPage/input_None_programs'))

WebUI.click(findTestObject('AppointmentPage/input_Medicare'))

WebUI.setText(findTestObject('AppointmentPage/txtField_Comment'), 'Pendaftaran kesehatan')

WebUI.click(findTestObject('AppointmentPage/brn_BookAppointment'))

WebUI.click(findTestObject('AppointmentPage/select_facility1'))

WebUI.click(findTestObject('AppointmentPage/input_PendaftaranKembali'))

WebUI.click(findTestObject('AppointmentPage/input_Medicare'))

WebUI.click(findTestObject('AppointmentPage/input_Medicaid'))

WebUI.click(findTestObject('AppointmentPage/input_None_programs'))

WebUI.click(findTestObject('AppointmentPage/input_Medicare'))

WebUI.click(findTestObject('AppointmentPage/span_Calender'))

WebUI.click(findTestObject('AppointmentPage/td_TanggalAppointment'))

WebUI.setText(findTestObject('AppointmentPage/txtField_Comment'), 'Pendaftaran kesehatan')

WebUI.click(findTestObject('AppointmentPage/brn_BookAppointment'))

WebUI.verifyElementPresent(findTestObject('Reservation/txt_Booking-success'), 0)

WebUI.click(findTestObject('Homepage/btn_menu-toggle'))

WebUI.click(findTestObject('Homepage/btn_History'))

WebUI.verifyElementPresent(findTestObject('Reservation/txt_History'), 0)

WebUI.click(findTestObject('Homepage/btn_menu-toggle'))

WebUI.click(findTestObject('Homepage/btn_Logout'))

WebUI.verifyElementPresent(findTestObject('Reservation/txt_HalamanDpn'), 0)

