import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.apache.poi.ss.formula.functions.Na;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.navigator;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class id389 {

    @Test
    public void step02() {
        $(By.linkText("Калькуляторы")).hover();
        while (!$(By.linkText("Кредитный калькулятор")).isDisplayed()) Selenide.sleep(10);
        assertTrue($(By.linkText("Интерполятор ставок")).isDisplayed());
        assertTrue($(By.linkText("Расчеты")).isDisplayed());
        assertTrue($(By.linkText("Материалы")).isDisplayed());
        assertTrue($(By.linkText("Внутренние ставки")).isDisplayed());
        $(By.linkText("Загрузка и верификация")).hover();
        while (!$(By.linkText("Верификация внешних ставок")).isDisplayed()) Selenide.sleep(10);
        assertTrue($(By.linkText("Верификация внутренних ставок")).isDisplayed());
        assertTrue($(By.linkText("Загрузка")).isDisplayed());
        assertTrue($(By.linkText("Помощь")).isDisplayed());
        $(By.linkText("Управление")).hover();
        while (!$(By.linkText("Расписания")).isDisplayed()) Selenide.sleep(10);
        assertTrue($(By.linkText("Статистика")).isDisplayed());
        assertTrue($(By.linkText("Календари")).isDisplayed());
        assertTrue($(By.linkText("Параметры внешних ставок")).isDisplayed());
        assertTrue($(By.linkText("Журнал")).isDisplayed());
        assertTrue($(By.linkText("Валюты")).isDisplayed());
        Navigation.transition("Стрелка вправо");
        $(By.linkText("Администрирование")).hover();
        while (!$(By.linkText("Экспорт расчётов")).isDisplayed()) Selenide.sleep(10);
        assertTrue($(By.linkText("Импорт расчётов")).isDisplayed());
        Navigation.transition("Стрелка влево");
        Navigation.transition("Рыночные ставки / Курсы");
        assertEquals(Get.text("Значения показателей рыночных финансовых инструментов на дату"),new SimpleDateFormat("dd.MM.yyyy").format(new Date()));
        assertTrue(Check.attributeVisible("Редактировать"));
        assertTrue(Check.attributeEnable("Редактировать"));
    }

    @Test
    public void step03() {
        String before=$(By.id("ns_0x002fwps0x00252fratesPortlets0x002fExternalRatesView0x002f7_L00CBB1A089O70ILSHIKO810T1_-2293-0-bid")).getAttribute("aria-valuenow");
        $("[id=rateDate-ns_0x002fwps0x00252fratesPortlets0x002fExternalRatesView0x002f7_L00CBB1A089O70ILSHIKO810T1_]").setValue("01.02.2030").sendKeys(Keys.ENTER);
        while($(By.className("dijitDialogPaneContent")).isDisplayed())
            Selenide.sleep(50);
        String after=$(By.id("ns_0x002fwps0x00252fratesPortlets0x002fExternalRatesView0x002f7_L00CBB1A089O70ILSHIKO810T1_-2293-0-bid")).getAttribute("aria-valuenow");
        assertFalse(before.equals(after));
        Buttons.common("Редактировать");
        assertTrue(Check.attributeVisible("Сохранить"));
        assertTrue(Check.attributeEnable("Сохранить"));
        assertTrue(Check.attributeVisible("Отменить"));
        assertTrue(Check.attributeEnable("Отменить"));
    }

    @Test
    public void step04(){
        Navigation.transition("Расчеты");
        String portletsNames="";
        for(SelenideElement e:$$(By.className("a11yRegionLabel")))
            portletsNames+=e.getText();
        assertTrue(portletsNames.contains("Последние расчеты"));
        assertTrue(portletsNames.contains("Поиск расчетов"));
        assertTrue(portletsNames.contains("Список расчетов"));
        assertTrue(Check.attributeVisible("Поиск"));
        assertTrue(Check.attributeEnable("Поиск"));
        assertTrue(Check.attributeVisible("Очистить форму"));
        assertTrue(Check.attributeEnable("Очистить форму"));
        while(Check.attributeVisible("Стрелка вниз (расчеты)"))
            Buttons.common("Стрелка вниз (расчеты)");
        assertTrue(Check.attributeVisible("Все поля"));
        assertTrue(Check.attributeVisible("Дата расчета с"));
        assertTrue(Check.attributeVisible("Тип ФК"));
        assertTrue(Check.attributeVisible("Идентификатор"));
        assertTrue(Check.attributeVisible("Дата расчета по"));
        assertTrue(Check.attributeVisible("Наименование расчета"));
        assertTrue(Check.attributeVisible("Автор"));
        assertTrue(Check.attributeVisible("Роль автора"));
        assertTrue(Check.attributeVisible("Тип расчёта"));
        assertTrue(Check.attributeVisible("Кто подарил"));
        assertTrue(Check.attributeVisible("Кому подарил"));
        assertTrue(Check.attributeVisible("Тип операции по кредиту"));
        assertTrue(Check.attributeVisible("Наименование заёмщика"));
        assertTrue(Check.attributeVisible("ИНН заёмщика"));
        assertTrue(Check.attributeVisible("Произвольный числовой атрибут"));
        assertTrue(Check.attributeVisible("Ограничение[1]"));
        assertTrue(Check.attributeVisible("Значение[1]"));
        assertTrue(Check.attributeVisible("Включая расчеты, где выбранный атрибут скрыт[1]"));
        assertTrue(Check.attributeVisible("Произвольный списковый атрибут"));
        assertTrue(Check.attributeVisible("Ограничение[2]"));
        assertTrue(Check.attributeVisible("Значение[2]"));
        assertTrue(Check.attributeVisible("Включая расчеты, где выбранный атрибут скрыт[2]"));
        assertTrue(Check.attributeVisible("Произвольный атрибут формата даты"));
        assertTrue(Check.attributeVisible("Ограничение[3]"));
        assertTrue(Check.attributeVisible("Дата с"));
        assertTrue(Check.attributeVisible("Дата по"));
        assertTrue(Check.attributeVisible("Включая расчеты, где выбранный атрибут скрыт[3]"));
    }

    @Test
    public void step05(){
        Buttons.common("Поиск");
//        Buttons.common("Экспортировать список карточек в Excel"); //для ie
    }

    @Test
    public void step06(){
        $(By.linkText("Калькуляторы")).hover();
        while (!$(By.linkText("Кредитный калькулятор")).isDisplayed()) Selenide.sleep(10);
        assertTrue($(By.linkText("Интерполятор ставок")).isDisplayed());
        Navigation.transition("Кредитный калькулятор");
        Buttons.common("Вернуть значения по умолчанию");
    }

    @Test
    public void step07(){
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
    }

    @Test
    public void step08(){
//        Buttons.common("Создать шаблон"); //для ie
    }

    @Test
    public void step09(){
        Buttons.common("Проверить таблицу");
        Buttons.common("ОК (Сообщения системы)");
    }

    @Test
    public void step10(){
        Buttons.common("Расчет");
        Buttons.common("Пересчитать");
        Buttons.common("ОК (Сообщения системы)");
    }

    @Test
    public void step11(){
        Buttons.common("Сохранить и показать отчет");
        assertTrue(Check.attributeText("Сообщения системы (успех)", "Данные расчета"));
        assertTrue(Regex.getMatches(Get.text("Сообщения системы (успех)")));//Проверка имени расчёта регулярным выражением(зависит от выводимого на стенде сообщения об успешном сохранении)
        assertTrue(Check.attributeText("Сообщения системы (успех)", " были успешно сохранены."));
        Buttons.common("ОК (Сообщения системы)");
    }

    @Test
    public void step12(){
        Navigation.transition("Расчеты");
    }

    @Test
    public void step13(){
        $(By.linkText(Regex.nameLastCalculation)).click();
        $("[id=dijit_form_DropDownButton_0_label]").click();
        String possibleActions="";
        for(SelenideElement e:$$("[id*=dijit_MenuItem_]"))
            possibleActions+=e.getText();
        assertTrue(possibleActions.contains("Отчет"));
        assertTrue(possibleActions.contains("Создать новый расчёт на основе данного"));
        assertTrue(possibleActions.contains("Назначить права на просмотр расчёта"));
    }

    @Test
    public void step14(){
        Navigation.transition("Интерполятор ставок");
    }

    @Test
    public void step15(){
        assertTrue(Check.attributeVisible("Вернуть значения по умолчанию"));
        assertTrue(Check.attributeEnable("Вернуть значения по умолчанию"));
    }

    @Test
    public void step16(){
        Navigation.transition("Материалы");
    }

    @Test
    public void step17(){
        Set.field("Название","Материал для проверок");
        DropDownList.alternative("Статус","Отменен");
        Buttons.common("Поиск");
        $(By.linkText("FC_0000000783")).click();
    }

    @Test
    public void step18(){
        DropDownList.common("Действия (карточка материала)","Создать материал на основе данного");
    }

    @Test
    public void step19(){
        Navigation.transition("Внутренние ставки");
        assertTrue(Check.attributeVisible("Очистить фильтр"));
        assertTrue(Check.attributeEnable("Очистить фильтр"));
        assertTrue(Check.attributeVisible("Отфильтровать"));
        assertTrue(Check.attributeEnable("Отфильтровать"));
        assertTrue(Check.attributeVisible("Начать"));
        assertTrue(Check.attributeEnable("Начать"));
    }

    @Test
    public void step20(){
        $(By.linkText("Загрузка и верификация")).hover();
        while (!$(By.linkText("Верификация внешних ставок")).isDisplayed()) Selenide.sleep(10);
        assertTrue($(By.linkText("Верификация внутренних ставок")).isDisplayed());
        assertTrue($(By.linkText("Загрузка")).isDisplayed());
        Navigation.transition("Верификация внешних ставок");
        assertTrue(Check.attributeVisible("Очистить фильтр"));
        assertTrue(Check.attributeEnable("Очистить фильтр"));
        assertTrue(Check.attributeVisible("Отфильтровать"));
        assertTrue(Check.attributeEnable("Отфильтровать"));
        assertTrue(Check.attributeVisible("Начать (верификация внешних ставок)"));
        assertTrue(Check.attributeEnable("Начать (верификация внешних ставок)"));
    }

    @Test
    public void step21(){
        Navigation.transition("Верификация внутренних ставок");
        assertTrue(Check.attributeVisible("Очистить фильтр"));
        assertTrue(Check.attributeEnable("Очистить фильтр"));
        assertTrue(Check.attributeVisible("Отфильтровать"));
        assertTrue(Check.attributeEnable("Отфильтровать"));
        assertTrue(Check.attributeVisible("Верифицировать всё"));
        assertTrue(Check.attributeEnable("Верифицировать всё"));
        assertTrue(Check.attributeVisible("Начать (верификация внутренних ставок)"));
        assertTrue(Check.attributeEnable("Начать (верификация внутренних ставок)"));
    }

    @Test
    public void step22() {
        Navigation.transition("Загрузка");
        String portletsNames="";
        for(SelenideElement e:$$(By.className("lm-dynamic-title")))
            portletsNames+=e.getText();
        assertTrue(portletsNames.contains("Загрузка внешних ставок"));
        assertTrue(portletsNames.contains("Загрузка внутренних ставок"));
        assertTrue(Check.attributeVisible("Начать (загрузка)"));
        assertTrue(Check.attributeEnable("Начать (загрузка)"));
        assertTrue(Check.attributeVisible("Создать шаблон"));
        assertTrue(Check.attributeEnable("Создать шаблон"));
        assertTrue(Check.attributeVisible("Загрузить из Excel"));
        assertTrue(Check.attributeEnable("Загрузить из Excel"));
    }

    @Test
    public void step23() {
        $(By.linkText("Управление")).hover();
        while (!$(By.linkText("Расписания")).isDisplayed()) Selenide.sleep(10);
        assertTrue($(By.linkText("Календари")).isDisplayed());
        assertTrue($(By.linkText("Журнал")).isDisplayed());
        assertTrue($(By.linkText("Статистика")).isDisplayed());
        assertTrue($(By.linkText("Параметры внешних ставок")).isDisplayed());
        assertTrue($(By.linkText("Валюты")).isDisplayed());
        Navigation.transition("Расписания");
        String portletsNames="";
        for(SelenideElement e:$$(By.className("a11yRegionLabel")))
            portletsNames+=e.getText();
        assertTrue(portletsNames.contains("СБРФ - Управление задачами"));
        assertTrue(portletsNames.contains("Редактирование расписания автозагрузки внешних ставок"));
        assertTrue(Check.attributeVisible("Создать"));
        assertTrue(Check.attributeEnable("Создать"));
        assertTrue(Check.attributeVisible("Сохранить (расписание)"));
        assertTrue(Check.attributeEnable("Сохранить (расписание)"));
    }

    @Test
    public void step24() {
        Navigation.transition("Журнал");
        Set.field("Тип операции","\b\b\b\b\b\b\b\b\b\b\b\b\b\b");//стирание 14 символов, установленных по умолчанию
        Set.field("Тип операции","Изменение карточки");
        Buttons.common("Послать запрос");
    }

    @Test
    public void step25() {
        Navigation.transition("Календари");
        $(By.linkText("RUS")).click();
    }

    @Test
    public void step26() {
        Navigation.transition("Стрелка вправо");
        $(By.linkText("Администрирование")).hover();
        while (!$(By.linkText("Экспорт расчётов")).isDisplayed()) Selenide.sleep(10);
        assertTrue($(By.linkText("Импорт расчётов")).isDisplayed());
        Navigation.transition("Экспорт расчётов");
        Navigation.transition("Стрелка вправо");
        Navigation.transition("Импорт расчётов");
    }

    @Test
    public void step27() {
        Navigation.transition("Помощь");
        assertTrue(new File("\\Users\\" + System.getProperty("user.name") + "\\Downloads\\CCReport.zip").delete());
    }
}
