import com.codeborne.selenide.Selenide;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class id1774 {//частично дописан (перед запуском этого теста убедитесь что в папке "загрузки" нет архива CCReport.zip иначе код будет работать с ним)
    @BeforeSuite
    public void setUpBrowser() throws IOException {
        Browser browser = new Browser();
        browser.setProperties();
        browser.loginToClaster();
    }

    @BeforeClass
    public void navigate() {
        Navigation.transition("Кредитный калькулятор");
    }

    @Test
    public void step03() {
        Buttons.common("Вернуть значения по умолчанию");
    }
    @Test
    public void step04() {
        Buttons.common("Сохранить и показать отчет");
        while (!Selenide.$("[id*=_-successText]").isDisplayed()) Selenide.sleep(100);
        assertTrue(Check.attributeText("Сообщения системы (успех)", "Данные расчета"));
        assertTrue(Regex.getMatches(Get.text("Сообщения системы (успех)")));//Проверка имени расчёта регулярным выражением(зависит от выводимого на стенде сообщения об успешном сохранении)
        assertTrue(Check.attributeText("Сообщения системы (успех)", "были успешно сохранены"));
    }
    @Test
    public void step05() throws InterruptedException {
        while(!new File("\\Users\\"+System.getProperty("user.name")+"\\Downloads\\CCReport.zip").exists()) Thread.sleep(300);
        assertTrue(Unzip.file("\\Users\\"+System.getProperty("user.name")+"\\Downloads\\CCReport.zip"));//.file вернёт false если не найдет в архиве всех файлов
    }
    @Test
    public void step06_07_08_09() throws IOException, InterruptedException {//пришлось объединить все шаги с 6го по 9й в один, что б не объявлять экземпляры классов XSSFWorkbook и PdfReader как поле
        XSSFWorkbook xslxReport = new XSSFWorkbook(new FileInputStream("\\Users\\"+System.getProperty("user.name")+"\\Downloads\\CCReport\\"+Regex.nameLastCalculation+"_Export.xlsx"));
        assertEquals(xslxReport.getSheetName(0),"Расчет_форма");
        assertEquals(xslxReport.getSheetName(1),"Расчет_таблица");
        assertEquals(xslxReport.getSheetName(2),"Табличные данные");
        assertEquals(xslxReport.getSheetName(3),"Отчетные данные_Лист1");
        assertEquals(xslxReport.getSheetName(4),"Отчетные данные_Лист2");
        //7й шаг
        XSSFSheet raschetForma=xslxReport.getSheetAt(3);
        //8й шаг
        PdfReader pdfReader = new PdfReader(new FileInputStream("\\Users\\"+System.getProperty("user.name")+"\\Downloads\\CCReport\\CCReport1.pdf"));
        //9й шаг
        TextExtractionStrategy strategy = new SimpleTextExtractionStrategy();
        String[] parsedText = PdfTextExtractor.getTextFromPage(pdfReader, 1, strategy).split("\n");
        //в комментариях значения по умолчанию
        assertEquals(raschetForma.getRow(1).getCell(2).getStringCellValue(),parsedText[2]);//ОАО "Заёмщик №1"
        assertEquals(raschetForma.getRow(2).getCell(2).getStringCellValue(),parsedText[3].substring(0,parsedText[3].indexOf(" Операция")));//Кредит  (100 000 тыс. рублей). Новый договор на срок 1,0 года Операция кредитования
        assertEquals(raschetForma.getRow(3).getCell(2).getStringCellValue(),parsedText[6]);//14,00% годовых в рублях (15,03% с учетом комиссий)
        assertEquals(raschetForma.getRow(4).getCell(2).getStringCellValue(),parsedText[7]);//За резервирование 1,00% от лимита
        assertEquals(raschetForma.getRow(8).getCell(2).getStringCellValue(),parsedText[29]);//10,33%  (Без учёта ЧЗК: 7,13%, что не превышает ставку с учётом комиссий)
        assertEquals(raschetForma.getRow(9).getCell(2).getStringCellValue(),parsedText[21]);//15,03%
        assertEquals(raschetForma.getRow(10).getCell(2).getStringCellValue(),parsedText[22]);//"-6,13%");
        assertEquals(raschetForma.getRow(11).getCell(2).getStringCellValue(),parsedText[23]);//"0,00%");
        assertEquals(raschetForma.getRow(12).getCell(2).getStringCellValue(),parsedText[26]);//"8,90%");
        assertEquals(raschetForma.getRow(13).getCell(2).getStringCellValue(),parsedText[24]);//"-1,00%");
        assertEquals(raschetForma.getRow(14).getCell(2).getStringCellValue(),parsedText[27]);//"7,90%");
        assertEquals(raschetForma.getRow(15).getCell(2).getStringCellValue(),parsedText[25]);//"-3,20%");
        assertEquals(raschetForma.getRow(16).getCell(2).getStringCellValue(),parsedText[28].substring(4));//"4,70%");
        assertEquals(raschetForma.getRow(17).getCell(2).getStringCellValue(),parsedText[10]);//"Сделка удовлетворяет рекомендациям КУАП");

        xslxReport.close();
        pdfReader.close();
        assertTrue(new File("\\Users\\"+System.getProperty("user.name")+"\\Downloads\\CCReport.zip").delete());
        assertTrue(new File("\\Users\\"+System.getProperty("user.name")+"\\Downloads\\CCReport").delete());
    }
}
