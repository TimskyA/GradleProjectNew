import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.testng.Assert.assertTrue;

public class id955 {//дописан
    @BeforeSuite
    public void setUpBrowser() throws IOException {
        Browser browser = new Browser();
        browser.setProperties();
        browser.loginToClaster();
    }

    @BeforeClass
    public void navigate() {
        Navigation.transition("Расчеты");
    }

    @Test
    public void step02() {
        Buttons.common("Очистить форму");
        Set.field("Идентификатор","CC_0000124869");
        Buttons.common("Поиск");
    }

    @Test
    public void step03(){
        $(By.linkText("CC_0000124869")).click();
        DropDownList.common("Действия","Создать новый расчёт на основе данного");
        assertTrue($$(By.className("aplana-focused")).findBy(Condition.exactText("Расчет")).isEnabled());
    }

    @Test
    public void step04(){
        Buttons.common("Табличные данные");
        Buttons.common("Проверить таблицу");
        assertTrue(Check.attributeText("Сообщения системы (ошибка)","Таблица заполнена некорректно:\nДата первой строки данной таблицы не соответствует дате начала доступности" +
                                                                                 " средств. Пересоздайте таблицу или измените дату в её первой строке."));
        Buttons.common("ОК (Сообщения системы)");
        Buttons.common("Пересоздать таблицу");
        Buttons.common("Проверить таблицу");
        Check.attributeText("Сообщения системы (информация)","Таблица не содержит противоречивой информации, однако обратите внимание:\nСтоимость кредитного риска (СКР) не задана." +
                                                                          " По вопросам, связанным с порядком расчета СКР (Стоимости кредитного риска) просьба обращаться на горячую линию УИиМ ДР" +
                                                                          " (Методология - Модели УКР ДР): model_UKR_DR@mail.ca.sbrf.ru\nВ экстренных случаях просьба обращаться к Сергею Шешкусу " +
                                                                          "(тел: 8(495) 957-59-32, вн: 19-179, Sheshkus-SV@mail.ca.sbrf.ru), - сотруднику, ответственному за методологическую " +
                                                                          "поддержку горячей линии model_UKR_DR@mail.ca.sbrf.ru");
        Buttons.common("ОК (Сообщения системы)");
    }

    @Test
    public void step05(){
        Navigation.transition("Расчеты");
        Buttons.common("Очистить форму");
        Set.field("Идентификатор","CC_0000125654");
        Buttons.common("Поиск");
        $(By.linkText("CC_0000125654")).click();
        DropDownList.common("Действия","Создать новый расчёт на основе данного");
        assertTrue($$(By.className("aplana-focused")).findBy(Condition.exactText("Расчет")).isEnabled());
        Buttons.common("Табличные данные");
        Buttons.common("Проверить таблицу");
        assertTrue(Check.attributeText("Сообщения системы (ошибка)","Таблица заполнена некорректно:\nДата первой строки данной таблицы не соответствует дате начала доступности" +
                                                                                 " средств. Пересоздайте таблицу или измените дату в её первой строке."));
        Buttons.common("ОК (Сообщения системы)");
        Buttons.common("Пересоздать таблицу");
        Buttons.common("Проверить таблицу");
        Check.attributeText("Сообщения системы (информация)","Таблица не содержит противоречивой информации, однако обратите внимание:\nСтоимость кредитного риска (СКР) не задана." +
                                                                          " По вопросам, связанным с порядком расчета СКР (Стоимости кредитного риска) просьба обращаться на горячую линию УИиМ ДР" +
                                                                          " (Методология - Модели УКР ДР): model_UKR_DR@mail.ca.sbrf.ru\nВ экстренных случаях просьба обращаться к Сергею Шешкусу " +
                                                                          "(тел: 8(495) 957-59-32, вн: 19-179, Sheshkus-SV@mail.ca.sbrf.ru), - сотруднику, ответственному за методологическую " +
                                                                          "поддержку горячей линии model_UKR_DR@mail.ca.sbrf.ru");
    }
}
