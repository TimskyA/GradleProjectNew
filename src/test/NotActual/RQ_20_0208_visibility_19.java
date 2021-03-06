import org.testng.annotations.*;

 import java.io.IOException;

 import static org.testng.Assert.assertFalse;
 import static org.testng.Assert.assertTrue;

 //testID 3678
public class RQ_20_0208_visibility_19 { //дописан, но не актуален

    @BeforeClass
    public void navigate() {
        Navigation.transition("Кредитный калькулятор");
    }

    @Test
    public void step03() {
        Buttons.common("Вернуть значения по умолчанию");
        DropDownList.common("Запустить расчёт сценариев", "Да");
        assertTrue(Check.attributeText("Мораторий на досрочное погашение","Нет"));
        assertTrue(Check.attributeText("Ввод пользовательского сценария","Нет"));
        assertTrue(Check.attributeText("Сегмент","CIB"));
        assertTrue(Check.attributeText("Отрасль","Сельское хозяйство"));
        assertTrue(Check.attributeText("Попадает под часть 2.7 методики фондирования","Да"));
    }

    @Test
    public void step04() {
        DropDownList.common("Продукт", "Облигация");
        assertFalse(Check.attributeVisible("Запустить расчёт сценариев"));
        assertFalse(Check.attributeVisible("Мораторий на досрочное погашение"));
        assertFalse(Check.attributeVisible("Ввод пользовательского сценария"));
        assertFalse(Check.attributeVisible("Сегмент"));
        assertFalse(Check.attributeVisible("Отрасль"));
        assertFalse(Check.attributeVisible("Попадает под часть 2.7 методики фондирования"));
    }

    @Test
    public void step05() {
        DropDownList.common("Продукт", "Кредит");
        DropDownList.common("Тип продукта (для мин. ставки)", "Овердрафт");
        assertFalse(Check.attributeVisible("Запустить расчёт сценариев"));
        assertFalse(Check.attributeVisible("Мораторий на досрочное погашение"));
        assertFalse(Check.attributeVisible("Ввод пользовательского сценария"));
        assertFalse(Check.attributeVisible("Сегмент"));
        assertFalse(Check.attributeVisible("Отрасль"));
        assertFalse(Check.attributeVisible("Попадает под часть 2.7 методики фондирования"));
    }

    @Test
    public void step06() {
        Buttons.common("Вернуть значения по умолчанию");
        DropDownList.common("Запустить расчёт сценариев", "Да");
        assertTrue(Check.attributeText("Мораторий на досрочное погашение","Нет"));
        assertTrue(Check.attributeText("Ввод пользовательского сценария","Нет"));
        assertTrue(Check.attributeText("Сегмент","CIB"));
        assertTrue(Check.attributeText("Отрасль","Сельское хозяйство"));
        assertTrue(Check.attributeText("Попадает под часть 2.7 методики фондирования","Да"));
    }

    @Test
    public void step07() {
        DropDownList.common("Запустить расчёт сценариев", "да");
        DropDownList.common("Мораторий на досрочное погашение", "да");
        assertTrue(Check.attributeVisible("Дата окончания моратория"));
    }

    @Test
    public void step08() {
        Buttons.common("Дата окончания моратория");
        for (int i = 0; i < 16; i++)//что б превысить окончательный срок погашения
            Buttons.common("Инкрементировать месяц в календаре");
        Set.day("28");
        Buttons.common("Пересчитать");
        //while (!Selenide.$("[id*=_-errorText]").isDisplayed()) Selenide.sleep(100);//снимать комментарии со слипов при высокой нагруженности стенда
        assertTrue(Check.attributeText("Сообщения системы (ошибка)","Критическая ошибка:\nОкончательное погашение кредита происходит раньше окончания моратория на досрочное погашение. Проверьте соответствующие даты"));
        Buttons.common("ОК (Сообщения системы)");
    }

    @Test
    public void step09() {
        Buttons.common("Вернуть значения по умолчанию");
        DropDownList.common("Запустить расчёт сценариев", "Да");
        assertTrue(Check.attributeText("Мораторий на досрочное погашение","Нет"));
        assertTrue(Check.attributeText("Ввод пользовательского сценария","Нет"));
        assertTrue(Check.attributeText("Сегмент","CIB"));
        assertTrue(Check.attributeText("Отрасль","Сельское хозяйство"));
        assertTrue(Check.attributeText("Попадает под часть 2.7 методики фондирования","Да"));
    }

    @Test
    public void step10() {
        DropDownList.common("Валюта кредита", "USD");
        assertFalse(Check.attributeVisible("Запустить расчёт сценариев"));
        assertFalse(Check.attributeVisible("Мораторий на досрочное погашение"));
        assertFalse(Check.attributeVisible("Ввод пользовательского сценария"));
        assertFalse(Check.attributeVisible("Сегмент"));
        assertFalse(Check.attributeVisible("Отрасль"));
        assertFalse(Check.attributeVisible("Попадает под часть 2.7 методики фондирования"));
    }

    @Test
    public void step11() {
        Buttons.common("Вернуть значения по умолчанию");
        DropDownList.common("Запустить расчёт сценариев", "Да");
        assertTrue(Check.attributeText("Мораторий на досрочное погашение","Нет"));
        assertTrue(Check.attributeText("Ввод пользовательского сценария","Нет"));
        assertTrue(Check.attributeText("Сегмент","CIB"));
        assertTrue(Check.attributeText("Отрасль","Сельское хозяйство"));
        assertTrue(Check.attributeText("Попадает под часть 2.7 методики фондирования","Да"));
    }

    @Test
    public void step12() {
        DropDownList.common("Тип процентной ставки", "Плавающая");
        assertFalse(Check.attributeVisible("Запустить расчёт сценариев"));
        assertFalse(Check.attributeVisible("Мораторий на досрочное погашение"));
        assertFalse(Check.attributeVisible("Ввод пользовательского сценария"));
        assertFalse(Check.attributeVisible("Сегмент"));
        assertFalse(Check.attributeVisible("Отрасль"));
        assertFalse(Check.attributeVisible("Попадает под часть 2.7 методики фондирования"));
    }

    @Test
    public void step13() {
        Buttons.common("Вернуть значения по умолчанию");
        DropDownList.common("Запустить расчёт сценариев", "Да");
        assertTrue(Check.attributeText("Мораторий на досрочное погашение","Нет"));
        assertTrue(Check.attributeText("Ввод пользовательского сценария","Нет"));
        assertTrue(Check.attributeText("Сегмент","CIB"));
        assertTrue(Check.attributeText("Отрасль","Сельское хозяйство"));
        assertTrue(Check.attributeText("Попадает под часть 2.7 методики фондирования","Да"));
    }

    @Test
    public void step14() {
        DropDownList.common("Режим кредитования", "ВКЛ");
        assertFalse(Check.attributeVisible("Запустить расчёт сценариев"));
        assertFalse(Check.attributeVisible("Мораторий на досрочное погашение"));
        assertFalse(Check.attributeVisible("Ввод пользовательского сценария"));
        assertFalse(Check.attributeVisible("Сегмент"));
        assertFalse(Check.attributeVisible("Отрасль"));
        assertFalse(Check.attributeVisible("Попадает под часть 2.7 методики фондирования"));
    }

    @Test
    public void step15() {
        DropDownList.common("Режим кредитования","НКЛ");
        assertTrue(Check.attributeVisible("Запустить расчёт сценариев"));
        assertTrue(Check.attributeVisible("Мораторий на досрочное погашение"));
        assertTrue(Check.attributeVisible("Ввод пользовательского сценария"));
        assertTrue(Check.attributeVisible("Сегмент"));
        assertTrue(Check.attributeVisible("Отрасль"));
        assertTrue(Check.attributeVisible("Попадает под часть 2.7 методики фондирования"));
    }
}
