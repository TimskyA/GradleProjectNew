import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class id6 {//дописан
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
    public void step01(){DropDownList.common("Продукт","Аккредитивы и целевое фин-е");}

    @Test
    public void step02(){DropDownList.common("Тип продукта (для мин. ставки)","Аккредитив");}

    @Test
    public void step03(){DropDownList.common("Тип аккредитива","Покрытый");}

    @Test
    public void step04(){DropDownList.common("Привлечение от иностранного банка","Есть");}

    @Test
    public void step05(){
        Buttons.common("Подсказка для \"Асинхронность по графику\"");
        assertTrue(Check.attributeText("Подсказка для \"Асинхронность по графику\"","Отсутствие асинхронности по графику означает совпадение даты формирования покрытия"));
        assertTrue(Check.attributeText("Подсказка для \"Асинхронность по графику\"","с датой начала периода доступности средств"));
    }

    @Test
    public void step06(){
        Buttons.common("Подсказка для \"Ставка инобанка компенсируется заёмщиком\"");
        assertTrue(Check.attributeText("Подсказка для \"Ставка инобанка компенсируется заёмщиком\"","В данной версии Калькулятора производится расчёт только для беззатратного целевого финансирования."));
        assertTrue(Check.attributeText("Подсказка для \"Ставка инобанка компенсируется заёмщиком\"","Для расчёта при затратном финансировании (сделки в рамках ТС «Единая ставка») см. соответствующую Инструкцию на вкладке «Помощь»."));
    }

    @Test
    public void step07(){
        Buttons.common("Подсказка для \"Платы инобанка компенсируются заёмщиком\"");
        assertTrue(Check.attributeText("Подсказка для \"Платы инобанка компенсируются заёмщиком\"","В комиссионных платежах, введённых в данном блоке выше, указываются только те кредитные платы,"));
        assertTrue(Check.attributeText("Подсказка для \"Платы инобанка компенсируются заёмщиком\"","которые уплачиваются исключительно в пользу Сбербанка(см. соответствующую Инструкцию на вкладке «Помощь»)"));
    }

    @Test
    public void step08(){DropDownList.common("Привлечение от иностранного банка","Нет");}

    @Test
    public void step09(){DropDownList.common("Срочность покрытия","Не соответствует кредиту");}

    @Test
    public void step10(){
        Buttons.common("Подсказка для \"Рассчитываемая ставка\"");
        assertTrue(Check.attributeText("Подсказка для \"Рассчитываемая ставка\"","Специальная ставка соответствует расчёту доходности до раскрытия аккредитива"));
    }

    @Test
    public void step11(){DropDownList.common("Рассчитываемая ставка","Базовая");}

    @Test
    public void step12(){
        Buttons.common("Подсказка для \"Рассчитываемая ставка\"");
        assertTrue(Check.attributeText("Подсказка для \"Рассчитываемая ставка\"","Базовая ставка соответствует расчёту доходности после раскрытия аккредитива"));
    }

    @Test
    public void step13(){DropDownList.common("Тип продукта (для мин. ставки)","Кредит с применением векселей");}

    @Test
    public void step14(){
        DropDownList.common("Срочность векселей","Не соответствует кредиту");
        DropDownList.common("Рассчитываемая ставка","Специальная");
    }

    @Test
    public void step15(){
        Buttons.common("Подсказка для \"Рассчитываемая ставка\"");
        assertTrue(Check.attributeText("Подсказка для \"Рассчитываемая ставка\"","Специальная ставка соответствует расчёту доходности при наличии"));
        assertTrue(Check.attributeText("Подсказка для \"Рассчитываемая ставка\"","приобретённого беспроцентного векселя Сбербанка, см. 285-р"));
    }

    @Test
    public void step16(){DropDownList.common("Рассчитываемая ставка","Базовая");}

    @Test
    public void step17(){
        Buttons.common("Подсказка для \"Рассчитываемая ставка\"");
        assertTrue(Check.attributeText("Подсказка для \"Рассчитываемая ставка\"","Базовая ставка соответствует расчёту доходности при отсутствии"));
        assertTrue(Check.attributeText("Подсказка для \"Рассчитываемая ставка\"","приобретённого беспроцентного векселя Сбербанка, см. 285-р"));
    }
}
