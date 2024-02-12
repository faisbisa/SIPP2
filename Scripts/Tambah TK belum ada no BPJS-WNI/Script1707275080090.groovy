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

WebUI.enhancedClick(findTestObject('Tambah TK belum ada BPJS/HitungIuran/pilihPerusahaanke2'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/button_Ok'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/span_Mutasi Data'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/button_Tambah Periode Pelaporan'))

WebUI.delay(15)

WebUI.enhancedClick(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/button_OK'))

WebUI.delay(15)

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/buttonEdit'))

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/klikOkPemberitahuan'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/button_Ya'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/button_'))

WebUI.enhancedClick(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/tambahTK'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/input_swal2-radio'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/button_Pilih'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/button_Belum'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/button_Pilih'))

WebUI.setText(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/input_i_nik'), 
    '1111111111222238')

WebUI.setText(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/input_i_nama_lengkap'), 
    'ALI BIN')

WebUI.setText(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/input_i_tgl_lahir'), 
    '')

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/input_i_tgl_lahir'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/td_14'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/th_January 2009'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/span_Sep'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/div_Form Tenaga Kerja                      _39a986'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/input_i_tgl_lahir'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/th_'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/th__1'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/td_1'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/button_Daftar'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/button_Setuju'))

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/OK_nik'))

WebUI.setText(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/input_tempat_lahir'), 
    'JAKARTA TIMUR')

WebUI.setText(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/input_ibu_kandung'), 
    'AISHAH')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/select_-Pilih-                             _d74a24'), 
    'LAKI-LAKI', true)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/select_-Pilih-                             _cb70da'), 
    'B', true)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/select_-Pilih-                             _d2e932'), 
    'KAWIN', true)

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/klikLokasiPekerjaan'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/pencarianPerusahaan'), 'Aceh Jaya')

WebUI.enhancedClick(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/acehJaya'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/select_-Pilih-                             _82f089'), 
    'PKWT', true)

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/input_tgl_awal_kontrak'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/td_3'))

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/inputTanggalAkhirKotak'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/next1'))

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/next1'))

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/next1'))

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/next1'))

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/td_3'))

WebUI.setText(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/noPegawai'), '0909992323', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/input_upah'), 
    '11000000')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/input_alamat'), 
    'KELAPA GADINg')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/input_kode_pos'), 
    '12312')

WebUI.enhancedClick(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/selectKab'))

WebUI.delay(6)

WebUI.setText(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/searchKab'), 'Aceh Jaya')

WebUI.enhancedClick(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/acehJaya'))

WebUI.setText(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/input_no_telp'), 
    '08789222222222222222')

WebUI.setText(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/input_no_handphone'), 
    '083222222222')

WebUI.setText(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/input_no_telp'), 
    '08789222222')

WebUI.setText(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/npwp'), '1222222231111111')

WebUI.setText(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/email'), 'test@yopmail.com')

WebUI.scrollToPosition(0, 900)

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/buttonLanjut'))

WebUI.scrollToPosition(0, 950)

WebUI.click(findTestObject('Object Repository/Tambah TK belum ada BPJS/Page_SIPP - Sistem Informasi Pelaporan Peserta/button_Simpan'))

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/buttonOkPemberitahuanSuksesDaftar'))

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/buttonOkPemberitahuanSuksesDaftar'))

WebUI.click(findTestObject('Tambah TK belum ada BPJS/Page_BPJS Ketenagakerjaan/next1'))

