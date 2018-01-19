import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class id861 {//дописан
    private int before;

    @BeforeClass
    public void navigate() {
        Navigation.transition("Расчеты");
    }

    @Test
    public void step02() {
        Buttons.common("Очистить форму");
        Set.field("Идентификатор","CC_0000027216");
        Buttons.common("Поиск");
    }

    @Test
    public void step03() {
        $(By.linkText("CC_0000027216")).click();
    }

    @Test
    public void step04() {
        DropDownList.common("Действия", "Создать новый расчёт на основе данного");
        Buttons.common("Табличные данные");
    }

    @Test
    public void step05() {
        before = $$(By.className("dojoxGridRowTable")).size();
        $$(By.className("dojoxGridRowTable")).get(3).click();
        Buttons.common("Удалить строки");
        assertTrue(Check.attributeText("Диалоговое окно", "Вы действительно хотите удалить выбранные строки?"));
    }

    @Test
    public void step06() {
        Buttons.common("Нет (Диалоговое окно)");
        assertEquals($$(By.className("dojoxGridRowTable")).size(), before);
    }

    @Test
    public void step07() {
        $$(By.className("dojoxGridRowTable")).get(4).click();
        Buttons.common("Удалить строки");
        assertTrue(Check.attributeText("Диалоговое окно", "Вы действительно хотите удалить выбранные строки?"));
    }

    @Test
    public void step08() {
        Buttons.common("Да (Диалоговое окно)");
        assertEquals($$(By.className("dojoxGridRowTable")).size() + 1, before);
    }

    @Test
    public void step09() {
        $$(By.className("dojoxGridRowTable")).get(1).click();
        System.out.println($(By.id("dijit_form_Button_2")).getText());
        assertTrue($(By.id("dijit_form_Button_2")).shouldHave(Condition.attribute("disabled")).exists());
    }

    @Test
    public void step10() {
        $$(By.className("dojoxGridRowTable")).get($$(By.className("dojoxGridRowTable")).size()-1).click();
        assertTrue($(By.id("dijit_form_Button_2")).shouldHave(Condition.attribute("disabled")).exists());
        assertTrue($(By.id("dijit_form_Button_2")).is(Condition.attribute("disabled")));
    }
}
