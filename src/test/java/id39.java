import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.testng.Assert.assertTrue;

public class id39 {
    String headerRow;

    @BeforeClass
    public void navigate() {
        Navigation.transition("Кредитный калькулятор");
    }

    @Test
    public void step01() {
        Buttons.common("Вернуть значения по умолчанию");
    }

    @Test
    public void step02(){
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        headerRow=new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма лимита"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }

    @Test
    public void step03(){
        Buttons.common("Расчет");
        DropDownList.common("Продукт","Аккредитивы и целевое фин-е");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        headerRow=new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма лимита"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }

    @Test
    public void step04() {
        Buttons.common("Расчет");
        DropDownList.common("Асинхронность по валюте", "Да");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        headerRow = new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма лимита"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }

    @Test
    public void step05() {
        Buttons.common("Расчет");
        DropDownList.common("Тип продукта (для мин. ставки)", "Аккредитив");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        headerRow = new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }

    @Test
    public void step06() {
        Buttons.common("Расчет");
        DropDownList.common("Тип аккредитива", "Покрытый");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        while($(By.className("dijitDialogPaneContent")).isDisplayed())
            Selenide.sleep(10);
        headerRow = new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма лимита"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }

    @Test
    public void step07() {
        Buttons.common("Расчет");
        DropDownList.common("Асинхронность по валюте", "Нет");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        headerRow = new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма лимита"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }

    @Test
    public void step08() {
        Buttons.common("Расчет");
        DropDownList.common("Срочность покрытия", "Не соответствует кредиту");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        headerRow = new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма лимита"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }

    @Test
    public void step09() {
        Buttons.common("Расчет");
        DropDownList.common("Рассчитываемая ставка", "Базовая");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        headerRow = new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма лимита"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }

    @Test
    public void step10() {
        Buttons.common("Расчет");
        DropDownList.common("Тип аккредитива", "Непокрытый");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        headerRow = new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }

    @Test
    public void step11() {
        Buttons.common("Расчет");
        DropDownList.common("Тип аккредитива", "Покрытый");
        DropDownList.common("Срочность покрытия", "Соответствует кредиту");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        while($(By.className("dijitDialogPaneContent")).isDisplayed())
            Selenide.sleep(10);
        headerRow = new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма лимита"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }

    @Test
    public void step12() {
        Buttons.common("Расчет");
        DropDownList.common("Асинхронность по валюте", "Да");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        headerRow = new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма лимита"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }

    @Test
    public void step13() {
        Buttons.common("Расчет");
        DropDownList.common("Срочность покрытия", "Не соответствует кредиту");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        headerRow = new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма лимита"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }

    @Test
    public void step14() {
        Buttons.common("Расчет");
        DropDownList.common("Тип продукта (для мин. ставки)", "Кредит с применением векселей");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        headerRow = new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма лимита"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }

    @Test
    public void step15() {
        Buttons.common("Расчет");
        DropDownList.common("Асинхронность по валюте", "Нет");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        headerRow = new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма лимита"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }

    @Test
    public void step16() {
        Buttons.common("Расчет");
        DropDownList.common("Срочность векселей", "Не соответствует кредиту");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        headerRow = new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма лимита"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }

    @Test
    public void step17() {
        Buttons.common("Расчет");
        DropDownList.common("Продукт", "Гарантия");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        headerRow = new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }

    @Test
    public void step18() {
        Buttons.common("Расчет");
        DropDownList.common("Продукт", "Облигация");
        Buttons.common("Табличные данные");
        Buttons.common("Пересоздать таблицу");
        headerRow = new String($$(By.className("dojoxGridRowTable")).get(0).getText());
        assertTrue(headerRow.contains("Дата операции"));
        assertTrue(headerRow.contains("Сумма ожидаемого/ реализовавшегося остатка задолженности"));
    }
}
