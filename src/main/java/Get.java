import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

//геттеры
public class Get {
    //возврат текста строкой
    public static String text(String field) {
        switch (field) {
            //кредитный калькулятор-расчёт
            case "Мораторий на досрочное погашение":                                return($("[id*=_-CC_SCE_EARLY_MOR_wrapped]").getText());
            case "Ввод пользовательского сценария":                                 return($("id*=_-CC_SCE_NEED_E4_wrapped]").getText());
            case "Сегмент":                                                         return($("[id*=_-CC_SCE_SEGMENT_wrapped]").getText());
            case "Отрасль":                                                         return($("[id*=_-CC_SCE_INDUSTRY_wrapped]").getText());
            case "Попадает под часть 2.7 методики фондирования":                    return($("[id*=_-CC_SCE_PART27_wrapped]").getText());
            //Карточка расчёта
            case "Комиссионные платежи (карточка расчета)":                         return($("[id=BODY_ns_0x002fwps0x00252fcalculationViewPortlet0x002fCalculationView0x002f7_KDNDMJ008G0JD0INFFB74U3M50__CC_COMMISSIONS]").getText());
            //Рыночные ставки/курсы
            //case "Значения показателей рыночных финансовых инструментов на дату":   return($("[id=rateDate-ns_0x002fwps0x00252fratesPortlets0x002fExternalRatesView0x002f7_L00CBB1A089O70ILSHIKO810T1_]").getCssValue("value"));
            case "Значения показателей рыночных финансовых инструментов на дату":   return($("[id=rateDate-ns_0x002fwps0x00252fratesPortlets0x002fExternalRatesView0x002f7_L00CBB1A089O70ILSHIKO810T1_]").getValue());
            //Сообщения системы
            case "Сообщения системы (ошибка)":                                      return($("[id*=_-errorText]").shouldBe(Condition.visible).getText());
            case "Сообщения системы (успех)":                                       return($("[id*=_-successText]").shouldBe(Condition.visible).getText());
            default:                                                                return("Такого поля/атрибута нет");
        }
    }
}
