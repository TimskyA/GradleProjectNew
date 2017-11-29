import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Check {
    //проверки
    //проверка видимости атрибута с возвратом true/false на кредитном калькуляторе
    public static boolean attributeVisible(String attribute) {
        switch (attribute){
            case "Запустить расчёт сценариев":                      return($("[id*=_-CC_SCE_START_wrapped]").isDisplayed());
            case "Мораторий на досрочное погашение":                return($("[id*=_-CC_SCE_EARLY_MOR_wrapped]").isDisplayed());
            case "Ввод пользовательского сценария":                 return($("[id*=_-CC_SCE_NEED_E4_wrapped]").isDisplayed());
            case "Сегмент":                                         return($("[id*=_-CC_SCE_SEGMENT_wrapped]").isDisplayed());
            case "Отрасль":                                         return($("[id*=_-CC_SCE_INDUSTRY_wrapped]").isDisplayed());
            case "Попадает под часть 2.7 методики фондирования":    return($("[id*=_-CC_SCE_PART27_wrapped]").isDisplayed());
            case "Продукт":                                         return($("[id*=_-CC_PRODUCT_TYPE_wrapped]").isDisplayed());
            case "Тип продукта (для мин. ставки)":                  return($("[id*=_-CC_CREDIT_TYPE_wrapped]").isDisplayed());
            case "Дата окончания моратория":                        return($("[id*=_-CC_SCE_EARLY_MOR_DAT_wrapped]").isDisplayed());
            default:                                                System.out.println("Такого атрибута нет");    return false;
        }
    }

    //проверка текста атрибута с возвратом true/false на кредитном калькуляторе
    public static boolean attributeText(String attribute, String text) {
        switch (attribute){
            case "Запустить расчёт сценариев":                      return($("[id*=_-CC_SCE_START_wrapped]").getText().equals(text));
            case "Мораторий на досрочное погашение":                return($("[id*=_-CC_SCE_EARLY_MOR_wrapped]").getText().equals(text));
            case "Ввод пользовательского сценария":                 return($("[id*=_-CC_SCE_NEED_E4_wrapped]").getText().equals(text));
            case "Сегмент":                                         return($("[id*=_-CC_SCE_SEGMENT_wrapped]").getText().equals(text));
            case "Отрасль":                                         return($("[id*=_-CC_SCE_INDUSTRY_wrapped]").getText().equals(text));
            case "Попадает под часть 2.7 методики фондирования":    return($("[id*=_-CC_SCE_PART27_wrapped]").getText().equals(text));
            case "Сообщения системы (Критическая ошибка)":          return($("[id*=errorText]").shouldBe(Condition.visible).getText().equals(text));
            default:                                                System.out.println("Такого атрибута нет");    return false;
        }
    }
}

