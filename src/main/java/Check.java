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
            //Рыночные ставки / Курсы
            case "Редактировать":                                                                           return($(By.id("dijit_form_Button_0")).isDisplayed());
            case "Сохранить":                                                                               return($(By.id("dijit_form_Button_1")).isDisplayed());
            case "Отменить":                                                                                return($(By.id("dijit_form_Button_2")).isDisplayed());

            //Кредитный калькулятор-расчёт
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

            //Интерполятор ставок
            case "Вернуть значения по умолчанию":                                                           return($("[id*=resetBtn_label]").isDisplayed());

            //Расчёты
            case "Поиск":                                                                                   return($(By.id("dijit_form_Button_0")).isDisplayed());
            case "Очистить форму":                                                                          return($(By.id("dijit_form_Button_1")).isDisplayed());
            case "Стрелка вниз (расчеты)":                                                                  return($(By.className("arrow")).isDisplayed());
            case "Все поля":                                                                                return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_allFields")).isDisplayed());
            case "Дата расчета с":                                                                          return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_from_date")).isDisplayed());
            case "Тип ФК":                                                                                  return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_templateId")).isDisplayed());
            case "Идентификатор":                                                                           return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_paymentNumber")).isDisplayed());
            case "Дата расчета по":                                                                         return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_to_date")).isDisplayed());
            case "Наименование расчета":                                                                    return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_calcName")).isDisplayed());
            case "Автор":                                                                                   return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_author")).isDisplayed());
            case "Роль автора":                                                                             return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_authorRoleCode")).isDisplayed());
            case "Тип расчёта":                                                                             return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_accessType")).isDisplayed());
            case "Кто подарил":                                                                             return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_calcPresenter")).isDisplayed());
            case "Кому подарил":                                                                            return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_calcReceiver")).isDisplayed());
            case "Тип операции по кредиту":                                                                 return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_selectedCreditOperationId")).isDisplayed());
            case "Наименование заёмщика":                                                                   return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_receiverName")).isDisplayed());
            case "ИНН заёмщика":                                                                            return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_receiverINN")).isDisplayed());
            case "Произвольный числовой атрибут":                                                           return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_numericAttrIds")).isDisplayed());
            case "Ограничение[1]":                                                                          return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_numericAttrLimit")).isDisplayed());
            case "Значение[1]":                                                                             return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_numericAttrValue")).isDisplayed());
            case "Включая расчеты, где выбранный атрибут скрыт[1]":                                         return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_searchHiddenNumericAttr")).isDisplayed());
            case "Произвольный списковый атрибут":                                                          return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_listAttrIds")).isDisplayed());
            case "Ограничение[2]":                                                                          return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_listAttrLimit")).isDisplayed());
            case "Значение[2]":                                                                             return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_listAttrValues")).isDisplayed());
            case "Включая расчеты, где выбранный атрибут скрыт[2]":                                         return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_searchHiddenListAttr")).isDisplayed());
            case "Произвольный атрибут формата даты":                                                       return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_dateAttrIds")).isDisplayed());
            case "Ограничение[3]":                                                                          return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_dateAttrLimit")).isDisplayed());
            case "Дата с":                                                                                  return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_dateAttrFromValue")).isDisplayed());
            case "Дата по":                                                                                 return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_dateAttrToValue")).isDisplayed());
            case "Включая расчеты, где выбранный атрибут скрыт[3]":                                         return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_searchHiddenDateAttr")).isDisplayed());

            //Карточка расчёта
            case "Стрелка вниз (карточка расчета)":                                                         return($(By.className("arrow")).isDisplayed());

            //Внутренние ставки
            case "Очистить фильтр":                                                                         return($(By.id("dijit_form_Button_0")).isDisplayed());
            case "Отфильтровать":                                                                           return($(By.id("dijit_form_Button_1")).isDisplayed());
            case "Начать":                                                                                  return($(By.cssSelector("[widgetid=IREdit_BeginBtn]")).isDisplayed());

            //Загрузка и верификация-Верификация внутренних ставок
            case "Начать (верификация внутренних ставок)":                                                  return($(By.cssSelector("[widgetid=IRVerify_BeginBtn]")).isDisplayed());
            case "Верифицировать всё":                                                                      return($(By.cssSelector("[id=IRVerify_VerifyAllBtn_label]")).isDisplayed());

            //Загрузка и верификация-Верификация внешних ставок
            case "Начать (верификация внешних ставок)":                                                     return($(By.cssSelector("[widgetid=ver_BeginBtn]")).isDisplayed());

            //Загрузка и верификация-Загрузка
            case "Начать (загрузка)":                                                                       return($("[id*=loadButton]").isDisplayed());
            case "Создать шаблон":                                                                          return($("[id*=downloadXlsButton]").isDisplayed());
            case "Загрузить из Excel":                                                                      return($("[id*=uploadXlsBtn]").isDisplayed());

            //Управление-Расписания
            case "Создать":                                                                                 return($("[name=submit]").isDisplayed());
            case "Сохранить (расписание)":                                                                  return($("[id=dijit_form_Button_0]").isDisplayed());
            default: System.out.println("Такого поля/атрибута нет");                                        return false;
        }
    }

    public static boolean attributeEnable(String attribute) {
        switch (attribute){
            //Рыночные ставки / Курсы
            case "Редактировать":                                                                           return($(By.id("dijit_form_Button_0")).isEnabled());
            case "Сохранить":                                                                               return($(By.id("dijit_form_Button_1")).isEnabled());
            case "Отменить":                                                                                return($(By.id("dijit_form_Button_2")).isEnabled());

            //кредитный калькулятор-расчёт
            case "Запустить расчёт сценариев":                                                              return($("[id*=SCE_START_wrapped]").isEnabled());
            case "Мораторий на досрочное погашение":                                                        return($("[id*=SCE_EARLY_MOR_wrapped]").isEnabled());
            case "Ввод пользовательского сценария":                                                         return($("[id*=SCE_NEED_E4_wrapped]").isEnabled());
            case "Сегмент":                                                                                 return($("[id*=SCE_SEGMENT_wrapped]").isEnabled());
            case "Отрасль":                                                                                 return($("[id*=SCE_INDUSTRY_wrapped]").isEnabled());
            case "Попадает под часть 2.7 методики фондирования":                                            return($("[id*=SCE_PART27_wrapped]").isEnabled());
            case "Продукт":                                                                                 return($("[id*=PRODUCT_TYPE_wrapped]").isEnabled());
            case "Тип продукта (для мин. ставки)":                                                          return($("[id*=CREDIT_TYPE_wrapped]").isEnabled());
            case "Дата окончания моратория":                                                                return($("[id*=SCE_EARLY_MOR_DAT_wrapped]").isEnabled());
            case "Валюта привлечения/покрытия":                                                             return($("[id*=CC_CCY_LIAB_wrapped]").isEnabled());
            case "Валюта векселя":                                                                          return($("[id*=CC_CCY_VEKS_wrapped]").isEnabled());
            case "Наличие внутренней платы за предыдущее изменение условий по сделке":                      return($("[id*=PREVCNG_IPAY_FLAG_wrapped]").isEnabled());
            case "Проверка атрибута Внутренняя плата за предыдущее изменение условий по сделке, %":         return($("[id*=CC_PREVCNG_IPAY_IN_wrapped]").isEnabled());

            //Интерполятор ставок
            case "Вернуть значения по умолчанию":                                                           return($("[id*=resetBtn_label]").isEnabled());

            //Расчёты
            case "Поиск":                                                                                   return($(By.id("dijit_form_Button_0")).isEnabled());
            case "Очистить форму":                                                                          return($(By.id("dijit_form_Button_1")).isEnabled());
            case "Стрелка вниз (расчеты)":                                                                  return($(By.className("arrow")).isEnabled());
            case "Все поля":                                                                                return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_allFields")).isEnabled());
            case "Дата расчета с":                                                                          return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_from_date")).isEnabled());
            case "Тип ФК":                                                                                  return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_templateId")).isEnabled());
            case "Идентификатор":                                                                           return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_paymentNumber")).isEnabled());
            case "Дата расчета по":                                                                         return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_to_date")).isEnabled());
            case "Наименование расчета":                                                                    return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_calcName")).isEnabled());
            case "Автор":                                                                                   return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_author")).isEnabled());
            case "Роль автора":                                                                             return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_authorRoleCode")).isEnabled());
            case "Тип расчёта":                                                                             return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_accessType")).isEnabled());
            case "Кто подарил":                                                                             return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_calcPresenter")).isEnabled());
            case "Кому подарил":                                                                            return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_calcReceiver")).isEnabled());
            case "Тип операции по кредиту":                                                                 return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_selectedCreditOperationId")).isEnabled());
            case "Наименование заёмщика":                                                                   return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_receiverName")).isEnabled());
            case "ИНН заёмщика":                                                                            return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_receiverINN")).isEnabled());
            case "Произвольный числовой атрибут":                                                           return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_numericAttrIds")).isEnabled());
            case "Ограничение[1]":                                                                          return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_numericAttrLimit")).isEnabled());
            case "Значение[1]":                                                                             return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_numericAttrValue")).isEnabled());
            case "Включая расчеты, где выбранный атрибут скрыт[1]":                                         return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_searchHiddenNumericAttr")).isEnabled());
            case "Произвольный списковый атрибут":                                                          return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_listAttrIds")).isEnabled());
            case "Ограничение[2]":                                                                          return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_listAttrLimit")).isEnabled());
            case "Значение[2]":                                                                             return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_listAttrValues")).isEnabled());
            case "Включая расчеты, где выбранный атрибут скрыт[2]":                                         return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_searchHiddenListAttr")).isEnabled());
            case "Произвольный атрибут формата даты":                                                       return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_dateAttrIds")).isEnabled());
            case "Ограничение[3]":                                                                          return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_dateAttrLimit")).isEnabled());
            case "Дата с":                                                                                  return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_dateAttrFromValue")).isEnabled());
            case "Дата по":                                                                                 return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_dateAttrToValue")).isEnabled());
            case "Включая расчеты, где выбранный атрибут скрыт[3]":                                         return($(By.id("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fSearchPaymentsPortlet0x002f7_L00CBB1A089O70ILSHIKO81073_searchHiddenDateAttr")).isEnabled());

            //Карточка расчёта
            case "Стрелка вниз (карточка расчета)":                                                         return($(By.className("arrow")).isEnabled());

            //Внутренние ставки
            case "Очистить фильтр":                                                                         return($(By.id("dijit_form_Button_0")).isEnabled());
            case "Отфильтровать":                                                                           return($(By.id("dijit_form_Button_1")).isEnabled());
            case "Начать":                                                                                  return($(By.cssSelector("[widgetid=IREdit_BeginBtn]")).isEnabled());

            //Загрузка и верификация-Верификация внутренних ставок
            case "Начать (верификация внутренних ставок)":                                                  return($(By.cssSelector("[widgetid=IRVerify_BeginBtn]")).isEnabled());
            case "Верифицировать всё":                                                                      return($(By.cssSelector("[id=IRVerify_VerifyAllBtn_label]")).isEnabled());

            //Загрузка и верификация-Верификация внешних ставок
            case "Начать (верификация внешних ставок)":                                                     return($(By.cssSelector("[widgetid=ver_BeginBtn]")).isEnabled());

            //Загрузка и верификация-Загрузка
            case "Начать (загрузка)":                                                                       return($("[id*=loadButton]").isEnabled());
            case "Создать шаблон":                                                                          return($("[id*=downloadXlsButton]").isEnabled());
            case "Загрузить из Excel":                                                                      return($("[id*=uploadXlsBtn]").isEnabled());

            //Управление-Расписания
            case "Создать":                                                                                 return($("[name=submit]").isEnabled());
            case "Сохранить (расписание)":                                                                  return($("[id=dijit_form_Button_0]").isEnabled());
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

            //Расчеты
            case "Идентификатор":                                                                           return($(By.name("paymentNumber")).getValue().contains(text));

            //Сообщения системы
            case "Сообщения системы (ошибка)":                                                              return($("[id*=errorText]").shouldBe(Condition.visible).getText().contains(text));
            case "Сообщения системы (информация)":                                                          return($("[id*=infoText]").shouldBe(Condition.visible).getText().contains(text));
            case "Сообщения системы (успех)":                                                               return($("[id*=successText]").shouldBe(Condition.visible).getText().contains(text));
            default: System.out.println("Такого атрибута нет");                                             return false;
        }
    }
}

