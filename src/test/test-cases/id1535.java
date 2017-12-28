import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class id1535 {//дописан
    @BeforeSuite
    public void setUpBrowser() throws IOException {
        Browser browser = new Browser();
        browser.setProperties();
        browser.loginToClaster();
    }

    @BeforeClass
    public void navigate() {
        Navigation.transition("Кредитный калькулятор");
    }

    @Test
    public void step03() {
        DropDownList.common("Продукт", "Аккредитивы и целевое фин-е");
        DropDownList.common("Тип продукта (для мин. ставки)", "Кредит с целевым финанс-ем");
        DropDownList.common("Асинхронность по валюте", "Да");
        assertTrue(Check.attributeVisible("Валюта привлечения/покрытия"));
    }

    @Test
    public void step04() {
        DropDownList.common("Валюта кредита", "EUR");
        DropDownList.common("Валюта привлечения/покрытия", "RUB");
    }

    @Test
    public void step05() {
        Buttons.common("Сохранить");
        Buttons.common("Сохранить с расчетом");
        assertTrue(Check.attributeText("Сообщения системы (успех)", "Данные расчета"));
        assertTrue(Regex.getMatches(Get.text("Сообщения системы (успех)")));//Проверка имени расчёта регулярным выражением(зависит от выводимого на стенде сообщения об успешном сохранении)
        assertTrue(Check.attributeText("Сообщения системы (успех)", " были успешно сохранены."));
        Buttons.common("ОК (Сообщения системы)");
    }

    @Test
    public void step06(){
        Navigation.transition("Расчеты");
        $(By.linkText(Regex.nameLastCalculation)).click();
        assertFalse(Check.attributeVisible("Стрелка вниз"));
    }

    @Test
    public void step07(){
        Navigation.transition("Кредитный калькулятор");
        DropDownList.common("Продукт", "Аккредитивы и целевое фин-е");
        DropDownList.common("Тип продукта (для мин. ставки)", "Аккредитив");
        DropDownList.common("Тип аккредитива","Покрытый");
        DropDownList.common("Асинхронность по валюте", "Да");
        assertTrue(Check.attributeVisible("Валюта привлечения/покрытия"));
        DropDownList.common("Валюта кредита", "EUR");
        DropDownList.common("Валюта привлечения/покрытия", "RUB");
        Buttons.common("Сохранить");
        Buttons.common("Сохранить с расчетом");
        assertTrue(Check.attributeText("Сообщения системы (успех)", "Данные расчета"));
        assertTrue(Regex.getMatches(Get.text("Сообщения системы (успех)")));//Проверка имени расчёта регулярным выражением(зависит от выводимого на стенде сообщения об успешном сохранении)
        assertTrue(Check.attributeText("Сообщения системы (успех)", " были успешно сохранены."));
        Buttons.common("ОК (Сообщения системы)");
        Navigation.transition("Расчеты");
        $(By.linkText(Regex.nameLastCalculation)).click();
        assertFalse(Check.attributeVisible("Стрелка вниз"));
    }

    @Test
    public void step08(){
        Navigation.transition("Кредитный калькулятор");
        DropDownList.common("Продукт", "Аккредитивы и целевое фин-е");
        DropDownList.common("Тип продукта (для мин. ставки)", "Кредит с применением векселей");
        DropDownList.common("Асинхронность по валюте", "Да");
        assertTrue(Check.attributeVisible("Валюта векселя"));
        DropDownList.common("Валюта кредита", "EUR");
        DropDownList.common("Валюта векселя", "RUB");
        Buttons.common("Сохранить");
        Buttons.common("Сохранить с расчетом");
        assertTrue(Check.attributeText("Сообщения системы (успех)", "Данные расчета"));
        assertTrue(Regex.getMatches(Get.text("Сообщения системы (успех)")));//Проверка имени расчёта регулярным выражением(зависит от выводимого на стенде сообщения об успешном сохранении)
        assertTrue(Check.attributeText("Сообщения системы (успех)", " были успешно сохранены."));
        Buttons.common("ОК (Сообщения системы)");
        Navigation.transition("Расчеты");
        $(By.linkText(Regex.nameLastCalculation)).click();
        assertFalse(Check.attributeVisible("Стрелка вниз"));
    }
}
