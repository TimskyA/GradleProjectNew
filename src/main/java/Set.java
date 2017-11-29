import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Set {
    //сеттеры кредитного калькулятора
    public static void value(String field,String value) {
        switch (field) {
            case "Число месяца в календаре":    $$("[class*=dijitCalendarDateLabel]").findBy(Condition.exactText(value)).click();   break;
            default:                            System.out.println("Такого поля нет");
        }
    }
}
