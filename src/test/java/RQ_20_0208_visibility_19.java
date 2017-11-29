 import org.testng.annotations.BeforeClass;
 import org.testng.annotations.Test;
 import java.io.IOException;

 import static org.testng.Assert.assertEquals;
 import static org.testng.Assert.assertFalse;
 import static org.testng.Assert.assertTrue;

 //testID 3678
public class RQ_20_0208_visibility_19 {

    @BeforeClass
    public void setUpBrowser() throws IOException {
        Browser browser = new Browser();
        browser.setProperties();
        browser.loginToClaster();
        Navigation.transition("Кредитный калькулятор");
    }

    @Test
    public void step03() {
        Buttons.commonButton("Вернуть значения по умолчанию");
        DropDownList.commonDropDownList("Запустить расчёт сценариев", "Да");
        assertTrue(Check.attributeText("Мораторий на досрочное погашение","Нет"));
        assertTrue(Check.attributeText("Ввод пользовательского сценария","Нет"));
        assertTrue(Check.attributeText("Сегмент","CIB"));
        assertTrue(Check.attributeText("Отрасль","Сельское хозяйство"));
        assertTrue(Check.attributeText("Попадает под часть 2.7 методики фондирования","Да"));
    }

    @Test
    public void step04() {
        DropDownList.commonDropDownList("Продукт", "Облигация");
        assertFalse(Check.attributeVisible("Запустить расчёт сценариев"));
        assertFalse(Check.attributeVisible("Мораторий на досрочное погашение"));
        assertFalse(Check.attributeVisible("Ввод пользовательского сценария"));
        assertFalse(Check.attributeVisible("Сегмент"));
        assertFalse(Check.attributeVisible("Отрасль"));
        assertFalse(Check.attributeVisible("Попадает под часть 2.7 методики фондирования"));
    }

    @Test
    public void step05() {
        DropDownList.commonDropDownList("Продукт", "Кредит");
        DropDownList.commonDropDownList("Тип продукта (для мин. ставки)", "Овердрафт");
        assertFalse(Check.attributeVisible("Запустить расчёт сценариев"));
        assertFalse(Check.attributeVisible("Мораторий на досрочное погашение"));
        assertFalse(Check.attributeVisible("Ввод пользовательского сценария"));
        assertFalse(Check.attributeVisible("Сегмент"));
        assertFalse(Check.attributeVisible("Отрасль"));
        assertFalse(Check.attributeVisible("Попадает под часть 2.7 методики фондирования"));
    }

    @Test
    public void step06() {
        Buttons.commonButton("Вернуть значения по умолчанию");
        DropDownList.commonDropDownList("Запустить расчёт сценариев", "Да");
        assertTrue(Check.attributeText("Мораторий на досрочное погашение","Нет"));
        assertTrue(Check.attributeText("Ввод пользовательского сценария","Нет"));
        assertTrue(Check.attributeText("Сегмент","CIB"));
        assertTrue(Check.attributeText("Отрасль","Сельское хозяйство"));
        assertTrue(Check.attributeText("Попадает под часть 2.7 методики фондирования","Да"));
    }

    @Test
    public void step07() {
        DropDownList.commonDropDownList("Запустить расчёт сценариев", "да");
        DropDownList.commonDropDownList("Мораторий на досрочное погашение", "да");
        assertTrue(Check.attributeVisible("Дата окончания моратория"));
    }

    @Test
    public void step08() {
        Buttons.commonButton("Дата окончания моратория");
        for (int i = 0; i < 16; i++)//что б превысить окончательный срок погашения
            Buttons.commonButton("Инкрементировать месяц в календаре");
        Set.value("Число месяца в календаре", "28");
        Buttons.commonButton("Пересчитать");
        //while (!Selenide.$("[id*=_-errorText]").isDisplayed()) Selenide.sleep(100);//снимать комментарии со слипов при высокой нагруженности стенда
        assertTrue(Check.attributeText("Сообщения системы (Критическая ошибка)","Критическая ошибка:\nОкончательное погашение кредита происходит раньше окончания моратория на досрочное погашение. Проверьте соответствующие даты"));
        Buttons.commonButton("ОК (Сообщения системы)");
    }

    @Test
    public void step09() {
        Buttons.commonButton("Вернуть значения по умолчанию");
        DropDownList.commonDropDownList("Запустить расчёт сценариев", "Да");
        assertTrue(Check.attributeText("Мораторий на досрочное погашение","Нет"));
        assertTrue(Check.attributeText("Ввод пользовательского сценария","Нет"));
        assertTrue(Check.attributeText("Сегмент","CIB"));
        assertTrue(Check.attributeText("Отрасль","Сельское хозяйство"));
        assertTrue(Check.attributeText("Попадает под часть 2.7 методики фондирования","Да"));
    }

    @Test
    public void step10() {
        DropDownList.commonDropDownList("Валюта кредита", "USD");
        assertFalse(Check.attributeVisible("Запустить расчёт сценариев"));
        assertFalse(Check.attributeVisible("Мораторий на досрочное погашение"));
        assertFalse(Check.attributeVisible("Ввод пользовательского сценария"));
        assertFalse(Check.attributeVisible("Сегмент"));
        assertFalse(Check.attributeVisible("Отрасль"));
        assertFalse(Check.attributeVisible("Попадает под часть 2.7 методики фондирования"));
    }

    @Test
    public void step11() {
        Buttons.commonButton("Вернуть значения по умолчанию");
        DropDownList.commonDropDownList("Запустить расчёт сценариев", "Да");
        assertTrue(Check.attributeText("Мораторий на досрочное погашение","Нет"));
        assertTrue(Check.attributeText("Ввод пользовательского сценария","Нет"));
        assertTrue(Check.attributeText("Сегмент","CIB"));
        assertTrue(Check.attributeText("Отрасль","Сельское хозяйство"));
        assertTrue(Check.attributeText("Попадает под часть 2.7 методики фондирования","Да"));
    }

    @Test
    public void step12() {
        DropDownList.commonDropDownList("Тип процентной ставки", "Плавающая");
        assertFalse(Check.attributeVisible("Запустить расчёт сценариев"));
        assertFalse(Check.attributeVisible("Мораторий на досрочное погашение"));
        assertFalse(Check.attributeVisible("Ввод пользовательского сценария"));
        assertFalse(Check.attributeVisible("Сегмент"));
        assertFalse(Check.attributeVisible("Отрасль"));
        assertFalse(Check.attributeVisible("Попадает под часть 2.7 методики фондирования"));
    }

    @Test
    public void step13() {
        Buttons.commonButton("Вернуть значения по умолчанию");
        DropDownList.commonDropDownList("Запустить расчёт сценариев", "Да");
        assertTrue(Check.attributeText("Мораторий на досрочное погашение","Нет"));
        assertTrue(Check.attributeText("Ввод пользовательского сценария","Нет"));
        assertTrue(Check.attributeText("Сегмент","CIB"));
        assertTrue(Check.attributeText("Отрасль","Сельское хозяйство"));
        assertTrue(Check.attributeText("Попадает под часть 2.7 методики фондирования","Да"));
    }

    @Test
    public void step14() {
        DropDownList.commonDropDownList("Режим кредитования", "ВКЛ");
        assertFalse(Check.attributeVisible("Запустить расчёт сценариев"));
        assertFalse(Check.attributeVisible("Мораторий на досрочное погашение"));
        assertFalse(Check.attributeVisible("Ввод пользовательского сценария"));
        assertFalse(Check.attributeVisible("Сегмент"));
        assertFalse(Check.attributeVisible("Отрасль"));
        assertFalse(Check.attributeVisible("Попадает под часть 2.7 методики фондирования"));
    }

    @Test
    public void step15() {
        DropDownList.commonDropDownList("Режим кредитования","НКЛ");
        assertTrue(Check.attributeVisible("Запустить расчёт сценариев"));
        assertTrue(Check.attributeVisible("Мораторий на досрочное погашение"));
        assertTrue(Check.attributeVisible("Ввод пользовательского сценария"));
        assertTrue(Check.attributeVisible("Сегмент"));
        assertTrue(Check.attributeVisible("Отрасль"));
        assertTrue(Check.attributeVisible("Попадает под часть 2.7 методики фондирования"));
    }
}