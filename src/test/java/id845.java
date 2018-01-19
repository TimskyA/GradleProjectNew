import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.WebElementsCollection;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class id845 {//дописан (перед запуском этого теста убедитесь что в папке "загрузки" нет data.csv файла)

    @BeforeClass
    public void navigate() {
        Navigation.transition("Журнал");
    }

    @Test
    public void step03() throws IOException {
        Set.field("Тип операции", "\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
        Set.field("Тип операции", "Загрузка внешних ставок из Excel");
        Buttons.common("Послать запрос");
    }

    @Test
    public void step04_05() throws IOException {
        String standRows = "", csvRows = "", standRowsWithoutMillis = "", csvRowsWithoutHeader;

        //извлечение строк со стенда
        do {
            standRows += $("tr").toString().substring($("tr").toString().indexOf("testOperator"), $("tr").toString().indexOf("Всего записей"));
            $(By.className("right_a")).click();
        } while ($(By.className("right_a")).is(Condition.exist));
        standRows += $("tr").toString().substring($("tr").toString().indexOf("testOperator"), $("tr").toString().indexOf("Всего записей"));//Костыль
        for(String s:standRows.split("\n"))
            standRowsWithoutMillis += s.substring(0, 45) + s.substring(49)+"\n";//удаление миллисекунд из каждой строки
        standRowsWithoutMillis=standRowsWithoutMillis.replace(";"," ");

        //извлечение строк с csv-шки
        $(By.id("btnXls_label")).click();
        while (!(new File(File.separator + "Users" + File.separator + System.getProperty("user.name") + File.separator + "Downloads" + File.separator + "data.csv").exists()))
            Selenide.sleep(100);
        File csvFile = new File(File.separator + "Users" + File.separator + System.getProperty("user.name") + File.separator + "Downloads" + File.separator + "data.csv");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile), "windows-1251"))) {
            String line;
            while ((line = br.readLine()) != null)
                csvRows += line.replace("\"", "").replace(";", " ")+"\n";
            csvRowsWithoutHeader=(csvRows.substring(csvRows.indexOf("\n")+1));//что б пропустить первую строку с заголовками стоблцов
        }

        //сравнение строк csv-шки и стенда
        assertTrue(csvFile.delete());
        assertEquals(csvRowsWithoutHeader,standRowsWithoutMillis);
    }

    @Test
    public void step06() throws IOException {
        Set.field("Тип операции","\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
        Set.field("Тип операции", "Создание карточки");
        Set.field("Дата начала","01.09.2017");
        Set.field("Дата окончания","25.09.2017");
        Buttons.common("Послать запрос");
    }

    @Test
    public void step07_08_09_10() throws IOException {
        String standRows = "", csvRows = "", standRowsWithoutMillis = "", csvRowsWithoutHeader;

        //извлечение строк со стенда
        do {
            standRows += $("tr").toString().substring($("tr").toString().indexOf("testOperator"), $("tr").toString().indexOf("Всего записей"));
            $(By.className("right_a")).click();
        } while ($(By.className("right_a")).is(Condition.exist));
        standRows += $("tr").toString().substring($("tr").toString().indexOf("testOperator"), $("tr").toString().indexOf("Всего записей"));//Костыль
        for(String s:standRows.split("\n"))
            standRowsWithoutMillis += s.substring(0, 45) + s.substring(49)+"\n";//удаление миллисекунд из каждой строки
        standRowsWithoutMillis=standRowsWithoutMillis.replace(";"," ");

        //извлечение строк с csv-шки
        $(By.id("btnXls_label")).click();
        while (!(new File(File.separator + "Users" + File.separator + System.getProperty("user.name") + File.separator + "Downloads" + File.separator + "data.csv").exists()))
            Selenide.sleep(100);
        File csvFile = new File(File.separator + "Users" + File.separator + System.getProperty("user.name") + File.separator + "Downloads" + File.separator + "data.csv");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile), "windows-1251"))) {
            String line;
            while ((line = br.readLine()) != null)
                csvRows += line.replace("\"", "").replace(";", " ")+"\n";
            csvRowsWithoutHeader=(csvRows.substring(csvRows.indexOf("\n")+1));//что б пропустить первую строку с заголовками стоблцов
        }

        //сравнение строк csv-шки и стенда
        assertTrue(csvFile.delete());
        assertEquals(csvRowsWithoutHeader,standRowsWithoutMillis);
    }

}