import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.refresh;

//проверки
public class Check {
    //проверка видимости атрибута с возвратом true/false
    public static boolean attributeVisible(String attribute) {
        switch (attribute){
            //Рыночные ставки/Курсы
            case "Редактировать":                                                                           return($(By.id("dijit_form_Button_1_label")).isDisplayed());
            //кредитный калькулятор-расчёт
            case "Запустить расчёт сценариев":                                                              return($("[id*=SCE_START_wrapped]").isDisplayed());
            case "Мораторий на досрочное погашение":                                                        return($("[id*=SCE_EARLY_MOR_wrapped]").isDisplayed());
            case "Ввод пользовательского сценария":                                                         return($("[id*=SCE_NEED_E4_wrapped]").isDisplayed());
            case "Сегмент":                                                                                 return($("[id*=SCE_SEGMENT_wrapped]").isDisplayed());
            case "Отрасль":                                                                                 return($("[id*=SCE_INDUSTRY_wrapped]").isDisplayed());
            case "Попадает под часть 2.7 методики фондирования":                                            return($("[id*=SCE_PART27_wrapped]").isDisplayed());
            case "Продукт":                                                                                 return($("[id*=PRODUCT_TYPE_wrapped]").isDisplayed());
            case "Тип продукта (для мин. ставки)":                                                          return($("[id*=CREDIT_TYPE_wrapped]").isDisplayed());
            case "Дата окончания моратория":                                                                return($("[id*=SCE_EARLY_MOR_DAT_wrapped]").isDisplayed());
            case "Валюта привлечения/покрытия":                                                             return($("[id*=CC_CCY_LIAB_wrapped]").isDisplayed());
            case "Валюта векселя":                                                                          return($("[id*=CC_CCY_VEKS_wrapped]").isDisplayed());
            case "Наличие внутренней платы за предыдущее изменение условий по сделке":                      return($("[id*=PREVCNG_IPAY_FLAG_wrapped]").isDisplayed());
            case "Проверка атрибута Внутренняя плата за предыдущее изменение условий по сделке, %":         return($("[id*=CC_PREVCNG_IPAY_IN_wrapped]").isDisplayed());
            //Карточка расчёта
            case "Стрелка вниз":                                                                            return($(By.className("arrow")).isDisplayed());
            default: System.out.println("Такого поля/атрибута нет");                                        return false;
        }
    }

    //проверка текста атрибута с возвратом true/false
    public static boolean attributeText(String attribute, String text) {
        switch (attribute){
            //кредитный калькулятор-расчёт
            case "Запустить расчёт сценариев":                                                              return($("[id*=SCE_START_wrapped]").getText().equals(text));
            case "Мораторий на досрочное погашение":                                                        return($("[id*=SCE_EARLY_MOR_wrapped]").getText().equals(text));
            case "Ввод пользовательского сценария":                                                         return($("[id*=SCE_NEED_E4_wrapped]").getText().equals(text));
            case "Сегмент":                                                                                 return($("[id*=SCE_SEGMENT_wrapped]").getText().equals(text));
            case "Отрасль":                                                                                 return($("[id*=SCE_INDUSTRY_wrapped]").getText().equals(text));
            case "Попадает под часть 2.7 методики фондирования":                                            return($("[id*=SCE_PART27_wrapped]").getText().equals(text));
            case "Подсказка для \"Наличие внутренней платы за предыдущее изменение условий по сделке\"":    return($("[id*=dijit_TooltipDialog_32]").getText().contains(text));
            case "Подсказка для \"Внутренняя плата за предыдущее изменение условий по сделке, %\"":         return($("[id*=dijit_TooltipDialog_33]").getText().contains(text));
            case "Подсказка для \"Асинхронность по графику\"":                                              return($("[id*=dijit_TooltipDialog_21]").getText().contains(text));
            case "Подсказка для \"Ставка инобанка компенсируется заёмщиком\"":                              return($("[id*=dijit_TooltipDialog_97]").getText().contains(text));
            case "Подсказка для \"Платы инобанка компенсируются заёмщиком\"":                               return($("[id*=dijit_TooltipDialog_118]").getText().contains(text));
            case "Подсказка для \"Рассчитываемая ставка\"":                                                 return($("[id*=dijit_TooltipDialog_24]").getText().contains(text));
            //кредитный калькулятор-табличные данные
            case "Диалоговое окно":                                                                         return($("[id=dijit_Dialog_1]").getText().contains(text));
            //Сообщения системы
            case "Сообщения системы (ошибка)":                                                              return($("[id*=errorText]").shouldBe(Condition.visible).getText().contains(text));
            case "Сообщения системы (информация)":                                                          return($("[id*=infoText]").shouldBe(Condition.visible).getText().contains(text));
            case "Сообщения системы (успех)":                                                               return($("[id*=successText]").shouldBe(Condition.visible).getText().contains(text));
            default: System.out.println("Такого атрибута нет");                                             return false;
        }
    }
}

