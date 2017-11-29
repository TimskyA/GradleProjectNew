import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DropDownList {
    //выпадающие списки (нажатие и выбор)
    //выпадающие списки на кредитном калькуляторе
    public static void commonDropDownList(String list,String value){
        switch (list){
            case "Запустить расчёт сценариев":              $("[id*=_SCE_START_wrapped]").click();              break;
            case "Продукт":                                 $("[id*=_PRODUCT_TYPE_wrapped]").click();           break;
            case "Тип продукта (для мин. ставки)":          $("[id*=_CREDIT_TYPE_wrapped]").click();            break;
            case "Мораторий на досрочное погашение":        $("[id*=_SCE_EARLY_MOR_wrapped]").click();          break;
            case "Валюта кредита":                          $("[id*=_CURRENCY_wrapped]").click();               break;
            case "Тип процентной ставки":                   $("[id*=_RATE_TYPE_wrapped]").click();              break;
            case "Режим кредитования":                      $("[id*=_CREDIT_SCHEDULE_wrapped]").click();        break;
            default:                                        System.out.println("Такого списка нет");
        }
        $$("[id*=dijit_MenuItem_]").findBy(Condition.exactText(value)).click();
    }
}
