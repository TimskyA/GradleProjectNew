import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

//выпадающие списки
public class DropDownList {
    //общие выпадающие списки (нажатие на список и выбор значения)
    public static void common(String list, String value){
        switch (list){
            //кредитный калькулятор-расчёт
            case "Запустить расчёт сценариев":                                                      $("[id*=SCE_START_wrapped]").click();break;
            case "Продукт":                                                                         $("[id*=PRODUCT_TYPE_wrapped]").click();break;
            case "Тип продукта (для мин. ставки)":                                                  $("[id*=CREDIT_TYPE_wrapped]").click();break;
            case "Мораторий на досрочное погашение":                                                $("[id*=SCE_EARLY_MOR_wrapped]").click();break;
            case "Валюта кредита":                                                                  $("[id*=CURRENCY_wrapped]").click();break;
            case "Тип процентной ставки":                                                           $("[id*=RATE_TYPE_wrapped]").click();break;
            case "Режим кредитования":                                                              $("[id*=CREDIT_SCHEDULE_wrapped]").click();break;
            case "Необходим ввод доп. параметров":                                                  $("[id*=SHOW_FLAG_wrapped]").click();break;
            case "Асинхронность по валюте":                                                         $("[id*=CC_DIFF_CCY_wrapped]").click();break;
            case "Валюта привлечения/покрытия":                                                     $("[id*=CC_CCY_LIAB_wrapped]").click();break;
            case "Валюта векселя":                                                                  $("[id*=CC_CCY_VEKS_wrapped]").click();break;
            case "Тип аккредитива":                                                                 $("[id*=CC_LC_TYPE_wrapped]").click();break;
            case "Привлечение от иностранного банка":                                               $("[id*=CC_EXBANK_wrapped]").click();break;
            case "Срочность покрытия":                                                              $("[id*=CC_DIFF_POKR_TERM_wrapped]").click();break;
            case "Рассчитываемая ставка":                                                           $("[id*=CC_CALC_PER_wrapped]").click();break;
            case "Срочность векселей":                                                              $("[id*=CC_DIFF_VEKS_TERM_wrapped]").click();break;
            case "Наличие внутренней платы за предыдущее изменение условий по сделке":              $("[id*=CC_PREVCNG_IPAY_FLAG_wrapped]").click();break;
            //Карточка расчёта
            case "Действия":                                                                        $(By.id("dijit_form_DropDownButton_0_label")).click();break;
            //Карточка материала
            case "Действия (карточка материала)":                                                   $(By.id("dijit_form_DropDownButton_1_label")).click();break;
            default:                                                                                System.out.println("Такого списка нет");

        }
        $$("[id*=dijit_MenuItem_]").findBy(Condition.exactText(value)).click();//непосредственно выбор значения из списка
    }

    //выпадающие списки журнал-календарь
    public static void alternative(String list, String value) {
        SelenideElement listElement = null;
        switch (list){
            //Материалы
            case "Статус":      listElement=$("[name=selectedStatusId]");break;
            //Календари
            case "Месяц":       listElement=$("[id*=currentMonth]");break;
            case "Год":         listElement=$("[id*=currentYear]");break;

        }
        listElement.$$(By.tagName("option")).findBy(Condition.exactText(value)).click();
    }
}
