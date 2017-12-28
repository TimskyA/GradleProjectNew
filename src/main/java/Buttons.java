import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Buttons {//нажатие на кнопку
    public static void common(String button) {
        switch (button) {
            //Рыночные ставки/Курсы
            case "Редактировать":                                                                                       $("[id*=dijit_form_Button_1_label]").click();break;
            //Кредитный калькулятор
            case "Пересчитать":                                                                                         $("[id*=recalcBtn_label]").click();break;
            case "Вернуть значения по умолчанию":                                                                       $("[id*=resetBtn_label]").click();break;
            case "Сохранить":                                                                                           $("[id*=saveBtn_label").click();break;
            case "Сохранить и показать отчет":                                                                          $("[id*=saveWithReportBtn_label").click();break;
            case "Расчет":                                                                                              $("[id*=ns_0x002fwps0x00252fcalculator0x002fCreditCalculator0x002f7_L00CBB1A089O70ILSHIKO810T3_-1-tab").click();break;
            case "Табличные данные":                                                                                    $("[id*=ns_0x002fwps0x00252fcalculator0x002fCreditCalculator0x002f7_L00CBB1A089O70ILSHIKO810T3_-2-tab").click();break;
            //Кредитный калькулятор-расчет
            case "Дата окончания моратория":                                                                            $("[id*=_-CC_SCE_EARLY_MOR_DAT_wrapped]").click();break;
            case "Дата начала периода доступности средств":                                                             $("[id*=_DRAWDOWN_STDATE_wrapped]").click();break;
            case "Сохранить с расчетом":                                                                                $("[id*=dijit_form_Button_19_label]").click();break;
            case "Подсказка для \"Наличие внутренней платы за предыдущее изменение условий по сделке\"":                $("[id*=CC_PREVCNG_IPAY_FLAG-infoButton]").click();break;
            case "Подсказка для \"Внутренняя плата за предыдущее изменение условий по сделке, %\"":                     $("[id*=CC_PREVCNG_IPAY_IN-infoButton]").click();break;
            case "Подсказка для \"Асинхронность по графику\"":                                                          $("[id*=CC_DIFF_GRAPH-infoButton]").click();break;
            case "Подсказка для \"Ставка инобанка компенсируется заёмщиком\"":                                          $("[id*=CC_RATE_COMP-infoButton]").click();break;
            case "Подсказка для \"Платы инобанка компенсируются заёмщиком\"":                                           $("[id*=CC_FEE_COMP-infoButton]").click();break;
            case "Подсказка для \"Рассчитываемая ставка\"":                                                             $("[id*=CC_CALC_PER-infoButton]").click();break;
            //Кредитный калькулятор-табличные данные
            case "Проверить таблицу":                                                                                   $("[id*=checkTableButton").click();break;
            case "Пересоздать таблицу":                                                                                 $("[id*=recreateTableButton").click();break;
            case "Удалить строки":                                                                                      $("[id=dijit_form_Button_2_label]").click();break;
            case "Да (Диалоговое окно)":                                                                                $("[id=dijit_form_Button_8_label]").click();break;
            case "Нет (Диалоговое окно)":                                                                                $("[id=dijit_form_Button_9_label]").click();break;

            //Расчёты
            case "Очистить форму":                                                                                      $("[id*=dijit_form_Button_1_label]").click();break;
            case "Поиск":                                                                                               $("[id*=dijit_form_Button_0_label]").click();break;

            //Управление-календари(Rus)
            case "Режим редактирования":                                                                                $(By.name("buttonEditOn")).click();break;
            //Управление-журнал
            case "Послать запрос":                                                                                      $("[id*=dijit_form_Button_0]").click();break;

            //Общие
            case "ОК (Сообщения системы)":                                                                              $("[id*=dijit_form_Button_0]").shouldBe(Condition.visible).click();break;
            case "Инкрементировать месяц в календаре":                                                                  $("[class*=dojoxCalendarIncrease]").click();break;
            case "Декрементировать месяц в календаре":                                                                  $("[class*=dojoxCalendarDecrease]").click();break;
            default:                                                                                                    System.out.println("Такой кнопки нет");
        }
    }
}