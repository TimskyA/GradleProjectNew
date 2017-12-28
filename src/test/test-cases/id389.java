import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class id389 {
    @BeforeSuite
    public void setUpBrowser() throws IOException {
        Browser browser = new Browser();
        browser.setProperties();
        browser.loginToClaster();
    }

    @Test
    public void step02() {
//        Navigation.transition("Кредитный калькулятор");
//        Navigation.transition("Интерполятор ставок");
//        Navigation.transition("Расчеты");
//        Navigation.transition("Материалы");
//        Navigation.transition("Внутренние ставки");
//        Navigation.transition("Верификация внешних ставок");
//        Navigation.transition("Верификация внутренних ставок");
//        Navigation.transition("Загрузка");
//        Navigation.transition("Помощь");
        $(By.linkText("Калькуляторы")).hover();
        while(!$(By.linkText("Кредитный калькулятор")).isDisplayed()) Selenide.sleep(100);
        assertTrue($(By.linkText("Интерполятор ставок")).isDisplayed());
        assertTrue($(By.linkText("Расчеты")).isDisplayed());
        assertTrue($(By.linkText("Материалы")).isDisplayed());
        assertTrue($(By.linkText("Внутренние ставки")).isDisplayed());
        $(By.linkText("Загрузка и верификация")).hover();
        while(!$(By.linkText("Верификация внешних ставок")).isDisplayed()) Selenide.sleep(100);
        assertTrue($(By.linkText("Верификация внутренних ставок")).isDisplayed());
        assertTrue($(By.linkText("Загрузка")).isDisplayed());
        assertTrue($(By.linkText("Помощь")).isDisplayed());
        $(By.linkText("Управление")).hover();
        while(!$(By.linkText("Расписания")).isDisplayed()) Selenide.sleep(100);
        assertTrue($(By.linkText("Статистика")).isDisplayed());
        assertTrue($(By.linkText("Календари")).isDisplayed());
        assertTrue($(By.linkText("Параметры внешних ставок")).isDisplayed());
        assertTrue($(By.linkText("Журнал")).isDisplayed());
        assertTrue($(By.linkText("Валюты")).isDisplayed());
        Navigation.transition("Стрелка вправо");
        $(By.linkText("Администрирование")).hover();
        while(!$(By.linkText("Экспорт расчётов")).isDisplayed()) Selenide.sleep(100);
        assertTrue($(By.linkText("Импорт расчётов")).isDisplayed());
        Navigation.transition("Стрелка влево");
//        assertEquals(Get.text("Значения показателей рыночных финансовых инструментов на дату"),(String)new SimpleDateFormat("dd.MM.yyyy").format(new Date()));
        assertTrue(Check.attributeVisible("Редактировать"));
        Buttons.common("Редактировать");
    }
}
