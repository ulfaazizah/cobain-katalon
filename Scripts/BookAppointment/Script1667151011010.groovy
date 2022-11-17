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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

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

WebUI.takeScreenshot()

