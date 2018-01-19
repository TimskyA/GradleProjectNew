import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.apache.poi.ss.formula.functions.Na;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class id1880 {//дописан

    @BeforeClass
    public void navigate() {
        Navigation.transition("Расчеты");
    }

    @Test
    public void step03(){Buttons.common("Очистить форму");}

    @Test
    public void step04(){
        Set.field("Идентификатор", "CC_0000137868_impt");
        for(;;) {
            if (!Check.attributeText("Идентификатор", "CC_0000137868_impt")) {
                Buttons.common("Очистить форму");
                Set.field("Идентификатор", "CC_0000137868_impt");
            }
            else break;
        }
        Buttons.common("Поиск");
        $(By.linkText("CC_0000137868_impt")).click();
    }

    @Test
    public void step05(){
        String[] commonInfo=$(By.id("BODY_ns_0x002fwps0x00252fcalculationViewPortlet0x002fCalculationView0x002f7_KDNDMJ008G0JD0INFFB74U3M50__CC_COMMON")).getText().split("\n");
        assertEquals(commonInfo[9],"Гарантия");
        assertEquals(commonInfo[15],"Да");
        String commisionPayments=$(By.id("BODY_ns_0x002fwps0x00252fcalculationViewPortlet0x002fCalculationView0x002f7_KDNDMJ008G0JD0INFFB74U3M50__CC_COMMISSIONS")).getText();
        assertTrue(commisionPayments.contains("Залоговая стоимость имущ. обесп., тыс. ед. валюты"));
        assertTrue(commisionPayments.contains("Ежемесячный мин. объём выручки, тыс. ед. валюты"));
        assertTrue(commisionPayments.contains("За неполный объем имущественного обеспечения"));
    }

    @Test
    public void step06(){
        DropDownList.common("Действия","Создать новый расчёт на основе данного");
    }

    @Test
    public void step07(){
        while($("[id*=CC_COLL_SEC_REFVALUE-label").isDisplayed()) Selenide.sleep(50);
        assertFalse($("[id*=CC_COLL_SEC_REFVALUE-label").isDisplayed());
        assertFalse($("[id*=CC_MONTH_MIN_GAIN-label").isDisplayed());
        assertTrue($("[id*=CC_COLL_SEC_REF_FEE-label").isDisplayed());
    }

    @Test
    public void step08(){
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        Buttons.common("Пересчитать");
        assertTrue(Check.attributeText("Сообщения системы (успех)","Расчет успешно завершен."));
        Buttons.common("ОК (Сообщения системы)");
    }

    @Test
    public void step09(){
        Buttons.common("Сохранить");
        Buttons.common("Сохранить с расчетом");
        assertTrue(Check.attributeText("Сообщения системы (успех)", "Данные расчета"));
        assertTrue(Regex.getMatches(Get.text("Сообщения системы (успех)")));//Проверка имени расчёта регулярным выражением(зависит от выводимого сообщения об успешном сохранении)
        assertTrue(Check.attributeText("Сообщения системы (успех)", " были успешно сохранены."));
        Buttons.common("ОК (Сообщения системы)");
    }

    @Test
    public void step10(){
        Navigation.transition("Расчеты");
//        Buttons.common("Очистить форму");
//        Set.field("Идентификатор",Regex.nameLastCalculation);
//        for(;;) {
//            if (!Check.attributeText("Идентификатор", Regex.nameLastCalculation)) {
//                Buttons.common("Очистить форму");
//                Set.field("Идентификатор", Regex.nameLastCalculation);
//            }
//            else break;
//        }
//        Buttons.common("Поиск");
        $(By.linkText(Regex.nameLastCalculation)).click();
    }

    @Test
    public static void step11(){
        String commisionPayments=$(By.id("BODY_ns_0x002fwps0x00252fcalculationViewPortlet0x002fCalculationView0x002f7_KDNDMJ008G0JD0INFFB74U3M50__CC_COMMISSIONS")).getText();
        assertFalse(commisionPayments.contains("Залоговая стоимость имущ. обесп., тыс. ед. валюты"));
        assertFalse(commisionPayments.contains("Ежемесячный мин. объём выручки, тыс. ед. валюты"));
        assertFalse(commisionPayments.contains("За неполный объем имущественного обеспечения"));
    }

    @Test
    public static void step12() {
        Navigation.transition("Расчеты");
        Buttons.common("Очистить форму");
        Set.field("Идентификатор", "CC_0000137869_impt");
        for(;;) {
            if (!Check.attributeText("Идентификатор", "CC_0000137869_impt")) {
                Buttons.common("Очистить форму");
                Set.field("Идентификатор", "CC_0000137869_impt");
            }
            else break;
        }
        Buttons.common("Поиск");
        $(By.linkText("CC_0000137869_impt")).click();
        String[] commonInfo = $(By.id("BODY_ns_0x002fwps0x00252fcalculationViewPortlet0x002fCalculationView0x002f7_KDNDMJ008G0JD0INFFB74U3M50__CC_COMMON")).getText().split("\n");
        assertEquals(commonInfo[9], "Аккредитивы и целевое фин-е");
        assertEquals(commonInfo[11], "Аккредитив");
        assertEquals(commonInfo[13], "Непокрытый");
        assertEquals(commonInfo[17], "Да");
        String commisionPayments = $(By.id("BODY_ns_0x002fwps0x00252fcalculationViewPortlet0x002fCalculationView0x002f7_KDNDMJ008G0JD0INFFB74U3M50__CC_COMMISSIONS")).getText();
        assertTrue(commisionPayments.contains("Залоговая стоимость имущ. обесп., тыс. ед. валюты"));
        assertTrue(commisionPayments.contains("Ежемесячный мин. объём выручки, тыс. ед. валюты"));
        assertTrue(commisionPayments.contains("За невыполнение треб-й к объему обеспеч.,% от аккредитива"));
    }

    @Test
    public static void step13(){
        DropDownList.common("Действия","Создать новый расчёт на основе данного");
    }

    @Test
    public static void step14(){
        //while(!$("[id*=CC_COLL_SEC_REFVALUE-label").isDisplayed()) Selenide.sleep(50);
        assertTrue($("[id*=CC_COLL_SEC_REFVALUE-label").shouldHave(Condition.attribute("style")).is(Condition.exist));
        assertTrue($("[id*=CC_MONTH_MIN_GAIN-label").shouldHave(Condition.attribute("style")).is(Condition.exist));
        assertTrue($("[id*=CC_COLL_SEC_REF_FEE-label").shouldHave(Condition.attribute("style")).is(Condition.exist));
        $(By.id("ns_0x002fwps0x00252fcalculator0x002fCreditCalculator0x002f7_L00CBB1A089O70ILSHIKO810T3_-CC_CREDIT_ORDER_DATE_wrapped")).click();
        Set.day("25");
        $(By.id("ns_0x002fwps0x00252fcalculator0x002fCreditCalculator0x002f7_L00CBB1A089O70ILSHIKO810T3_-CC_DRAWDOWN_STDATE_wrapped")).click();
        Set.day("25");
        $(By.id("ns_0x002fwps0x00252fcalculator0x002fCreditCalculator0x002f7_L00CBB1A089O70ILSHIKO810T3_-CC_FINAL_REPAY_DATE_wrapped")).click();
        Set.day("25");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
    }

    @Test
    public static void step15(){
        Buttons.common("Пересчитать");
        assertTrue(Check.attributeText("Сообщения системы (успех)","Расчет успешно завершен."));
        Buttons.common("ОК (Сообщения системы)");
    }

    @Test
    public static void step16(){
        Buttons.common("Сохранить");
        Buttons.common("Сохранить с расчетом");
        assertTrue(Check.attributeText("Сообщения системы (успех)", "Данные расчета"));
        assertTrue(Regex.getMatches(Get.text("Сообщения системы (успех)")));//Проверка имени расчёта регулярным выражением(зависит от выводимого сообщения об успешном сохранении)
        assertTrue(Check.attributeText("Сообщения системы (успех)", " были успешно сохранены."));
        Buttons.common("ОК (Сообщения системы)");
    }

    @Test
    public static void step17(){
        Navigation.transition("Расчеты");
//        Buttons.common("Очистить форму");
//        Set.field("Идентификатор",Regex.nameLastCalculation);
//        for(;;) {
//            if (!Check.attributeText("Идентификатор", Regex.nameLastCalculation)) {
//                Buttons.common("Очистить форму");
//                Set.field("Идентификатор", Regex.nameLastCalculation);
//            }
//            else break;
//        }
//        Buttons.common("Поиск");
        $(By.linkText(Regex.nameLastCalculation)).click();
    }

    @Test
    public void step18(){
        String commisionPayments=Get.text("Комиссионные платежи (карточка расчета)");
        assertFalse(commisionPayments.contains("Залоговая стоимость имущ. обесп., тыс. ед. валюты"));
        assertFalse(commisionPayments.contains("Ежемесячный минимальный объем выручки, тыс. ед. валюты"));
        assertTrue(commisionPayments.contains("За невыполнение треб-й к объему обеспеч.,% от аккредитива"));
        Navigation.transition("Рыночные ставки / Курсы");
    }
}
