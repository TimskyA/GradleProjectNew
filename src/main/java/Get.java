import static com.codeborne.selenide.Selenide.$;

public class Get {
    //геттеры кредитного калькулятора
    public static String text(String field) {
        String text = null;
        switch (field) {
            case "Мораторий на досрочное погашение":                return($("[id*=_-CC_SCE_EARLY_MOR_wrapped]").getText());
            case "Ввод пользовательского сценария":                 return($("id*=_-CC_SCE_NEED_E4_wrapped]").getText());
            case "Сегмент":                                         return($("[id*=_-CC_SCE_SEGMENT_wrapped]").getText());
            case "Отрасль":                                         return($("[id*=_-CC_SCE_INDUSTRY_wrapped]").getText());
            case "Попадает под часть 2.7 методики фондирования":    return($("[id*=_-CC_SCE_PART27_wrapped]").getText());
            case "Сообщения системы (Критическая ошибка)":          return($("[id*=_-errorText]").getText());
            default:                                                return("Такого поля/атрибута нет");
        }
    }
}
