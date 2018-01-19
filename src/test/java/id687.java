import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.*;

public class id687 {//дописан

    @Test
    public void step03() {
        Navigation.transition("Календари");
//        $(By.linkText("RUS")).click(); //при запуске отдельно от сьюта снять комментарий со строки
        for(int i=0;i<27;i++)
            $(By.id("dayViewList"+i+".holiday1")).shouldBe(Condition.disabled);//если хотя бы 1 элемент редактируем свалится с селенидовским исключением
        $(By.name("buttonEditOn")).shouldBe(Condition.visible);
        $(By.name("buttonEditOn")).shouldBe(Condition.enabled);
        $(By.name("buttonList")).shouldBe(Condition.visible);
        $(By.name("buttonList")).shouldBe(Condition.enabled);
    }

    @Test
    public void step04() {
        DropDownList.alternative("Месяц", "Май");
        DropDownList.alternative("Год", "2013");
        Buttons.common("Режим редактирования");
        assertEquals($(By.id("dayViewList0.holiday1")).getValue(), "true");
        assertEquals($(By.id("dayViewList1.holiday1")).getValue(), "true");
        assertEquals($(By.id("dayViewList2.holiday1")).getValue(), "true");
        assertEquals($(By.id("dayViewList3.holiday1")).getValue(), "true");
        assertEquals($(By.id("dayViewList4.holiday1")).getValue(), "true");
    }

    @Test
    public void step05() {
        DropDownList.alternative("Месяц", "Январь");
        DropDownList.alternative("Год", "2010");
        assertEquals($(By.id("dayViewList1.holiday1")).getValue(), "true");
        assertEquals($(By.id("dayViewList2.holiday1")).getValue(), "true");
        assertEquals($(By.id("dayViewList8.holiday1")).getValue(), "true");
        assertEquals($(By.id("dayViewList9.holiday1")).getValue(), "true");
        assertEquals($(By.id("dayViewList15.holiday1")).getValue(), "true");
        assertEquals($(By.id("dayViewList16.holiday1")).getValue(), "true");
        assertEquals($(By.id("dayViewList22.holiday1")).getValue(), "true");
        assertEquals($(By.id("dayViewList23.holiday1")).getValue(), "true");
        assertEquals($(By.id("dayViewList29.holiday1")).getValue(), "true");
        assertEquals($(By.id("dayViewList30.holiday1")).getValue(), "true");
    }

    @Test
    public void step06() {
        DropDownList.alternative("Месяц","Февраль");
        DropDownList.alternative("Год","2012");
        assertFalse($(By.id("dayViewList30.holiday1")).is(Condition.exist));
        assertFalse($(By.id("dayViewList29.holiday1")).is(Condition.exist));
        assertTrue($(By.id("dayViewList28.holiday1")).is(Condition.exist));
    }

    @Test
    public void step07() {
        DropDownList.alternative("Месяц","Февраль");
        DropDownList.alternative("Год","2013");
        assertFalse($(By.id("dayViewList29.holiday1")).is(Condition.exist));
        assertFalse($(By.id("dayViewList28.holiday1")).is(Condition.exist));
        assertTrue($(By.id("dayViewList27.holiday1")).is(Condition.exist));
    }
}

