import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertTrue;

public class id1793 {//дописан по html отчёту

    @BeforeClass
    public void navigate() {
        Navigation.transition("Кредитный калькулятор");
    }

    @Test
    public void step03(){
        DropDownList.common("Продукт","Кредит");
        DropDownList.common("Необходим ввод доп. параметров","Да");
    }

    @Test
    public void step04(){assertTrue(Check.attributeVisible("Наличие внутренней платы за предыдущее изменение условий по сделке"));}
    @Test

    public void step05(){Buttons.common("Подсказка для \"Наличие внутренней платы за предыдущее изменение условий по сделке\"");}

    @Test
    public void step06(){
        assertTrue(Check.attributeText("Подсказка для \"Наличие внутренней платы за предыдущее изменение условий по сделке\"",
                "Наличие внутренней платы за предыдущее изменение условий по сделке,\n" +
                        "начисляемой непрерывно (не единоразово) на размер фактической ссудной задолженности.\n" +
                        "См. подробнее презентацию \"Методика фондирования кредитов юридических лиц №2111 (часть 2)\"\n" +
                        "(ВКС 31.03.2014), размещенную на Обучающем портале по Системе трансфертного ценообразования"));

    }

    @Test
    public void step07(){DropDownList.common("Наличие внутренней платы за предыдущее изменение условий по сделке","Да");}

    @Test
    public void step08(){assertTrue(Check.attributeVisible("Проверка атрибута Внутренняя плата за предыдущее изменение условий по сделке, %"));}

    @Test
    public void step09(){Buttons.common("Подсказка для \"Внутренняя плата за предыдущее изменение условий по сделке, %\"");}

    @Test
    public void step10(){
        assertTrue(Check.attributeText("Подсказка для \"Внутренняя плата за предыдущее изменение условий по сделке, %\"","Внутренняя плата за предыдущее изменение условий по сделке, начисляемая непрерывно, в процентах годовых:"));
        assertTrue(Check.attributeText("Подсказка для \"Внутренняя плата за предыдущее изменение условий по сделке, %\"","- положительное значение означает внутреннюю плату в пользу кредитующего подразделения"));
        assertTrue(Check.attributeText("Подсказка для \"Внутренняя плата за предыдущее изменение условий по сделке, %\"","- отрицательное значение означает внутреннюю плату в пользу Внутреннего банка"));
    }
}
