import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class Set {
    //Для выбора дня в календаре
    public static void day(String day) {
        $$("[class*=dijitCalendarDateLabel]").findBy(Condition.exactText(day)).click();
        }

    public static void field(String nameField,String value) {
        switch (nameField) {
            //Кредитный калькулятор-расчёт
            //Кредитный калькулятор-табличные данные
            //Расчёты
            case "Идентификатор":                   for(char c:value.toCharArray()) $("[name*=paymentNumber]").sendKeys(String.valueOf(c));break;
            //Управление-журнал
            case "Тип операции":                    for(char c:value.toCharArray()) $(By.id("dijit_form_FilteringSelect_0")).sendKeys(String.valueOf(c));break;
            case "Дата начала":                     for(char c:value.toCharArray()) $(By.id("dijit_form_DateTextBox_0")).sendKeys(String.valueOf(c));break;
            case "Дата окончания":                  for(char c:value.toCharArray()) $(By.id("dijit_form_DateTextBox_1")).sendKeys(String.valueOf(c));break;
            default:                                System.out.println("Такого поля/атрибута нет");
        }
    }
}
