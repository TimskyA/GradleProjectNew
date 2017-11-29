import static com.codeborne.selenide.Selenide.$;

public class Buttons {
    //кнопки
    //кнопки на кредитном калькуляторе
    public static void commonButton(String button) {
        switch (button) {
            case "Вернуть значения по умолчанию":             $("[id*=_-resetBtn_label]").click();                break;
            case "Пересчитать":                               $("[id*=_-recalcBtn_label]").click();               break;
            case "ОК (Сообщения системы)":                    $("[id*=dijit_form_Button_0]").click();             break;
            case "Дата окончания моратория":                  $("[id*=_-CC_SCE_EARLY_MOR_DAT_wrapped]").click();  break;
            case "Инкрементировать месяц в календаре":        $("[class*=dojoxCalendarIncrease]").click();        break;
            case "Декрементировать месяц в календаре":        $("[class*=dojoxCalendarDecrease]").click();        break;
            case "Прокрутить вкладки вправо":                 $("[id*=sbtMenuRightArrow]").click();               break;
            case "Прокрутить вкладки влево":                  $("[id*=sbtMenuLeftArrow]").click();                break;
            case "Дата начала периода доступности средств":   $("[id*=_DRAWDOWN_STDATE_wrapped]").click();        break;
            default:                                          System.out.println("Такой кнопки нет");
        }
    }
}
