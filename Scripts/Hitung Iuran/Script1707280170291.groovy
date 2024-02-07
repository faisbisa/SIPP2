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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Dimension as Dimension

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-sipp.bpjstk.id/')

DriverFactory.getWebDriver().manage().window().size = new Dimension(1820, 900)

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/InputUsername'))

WebUI.setText(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/InputUsername'), 'TRIPANCA.PERKASA@YAHOO.COM')

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/input_password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/input_password'), 
    'K6g1OcIp1bBSDL5tJEFZZg==')

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/button_Login'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/span_Select perusahaan'))

WebUI.setText(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/pencarianPerusahaan'), 'Adi')

WebUI.click(findTestObject('Tambah TK belum ada BPJS/HitungIuran/pilihPerusahaanke2'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/button_Ok'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/span_Mutasi Data'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/button_Tambah Periode Pelaporan'))

WebUI.enhancedClick(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/button_OK'))

WebUI.enhancedClick(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/buttonEdit'))

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/klikOkPemberitahuan'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/button_Ya'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/button_'))

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Tambah TK belum ada BPJS/HitungIuran/statusKeps'))

WebUI.doubleClick(findTestObject('Tambah TK belum ada BPJS/HitungIuran/pesertaAktif'))

WebUI.click(findTestObject('Tambah TK belum ada BPJS/HitungIuran/buttonAction'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Tambah TK belum ada BPJS/HitungIuran/buttonEdit'))

WebUI.setText(findTestObject('Tambah TK belum ada BPJS/HitungIuran/inputUpah'), '10980000')

WebUI.click(findTestObject('Tambah TK belum ada BPJS/HitungIuran/buttonSimpan'))

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/buttonOkPemberitahuanSuksesDaftar'))

WebUI.scrollToPosition(0, 550)

WebUI.click(findTestObject('Tambah TK belum ada BPJS/HitungIuran/buttonHitungIuran'))

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/buttonOkPemberitahuanSuksesDaftar'))

WebUI.delay(15)

WebUI.click(findTestObject('Tambah TK belum ada BPJS/HitungIuran/buttonHitungIuran'))

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/buttonOkPemberitahuanSuksesDaftar'))

WebUI.click(findTestObject('Tambah TK belum ada BPJS/HitungIuran/buttonFinalisasi'))

