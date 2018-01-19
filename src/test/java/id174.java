import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class id174 {//дописан

    @BeforeClass
    public void navigate() {
        Navigation.transition("Расчеты");
    }

    @Test
    public void step04() {
        Buttons.common("Очистить форму");
    }

    @Test
    public void step05() {
        Set.field("Идентификатор","абсабсабсабсабсабсабсабс");
        Buttons.common("Поиск");
        assertFalse(SearchResult.checkResultExist());
        Buttons.common("Очистить форму");
    }

    @Test
    public void step06(){
        Set.field("Идентификатор","СС_0000025412_000_OLD");
        Buttons.common("Поиск");
        assertFalse(SearchResult.checkResultExist());
        Buttons.common("Очистить форму");
    }

    @Test
    public void step07(){
        Set.field("Идентификатор","123456789 101112131415 1617181920");
        Buttons.common("Поиск");
        assertFalse(SearchResult.checkResultExist());
        Buttons.common("Очистить форму");
    }

    @Test
    public void step08(){
        Set.field("Идентификатор","CC_0000175222");//взял идентификатор с НК так как идентификатор из тест кейса не актуален
        Buttons.common("Поиск");
        assertTrue(SearchResult.checkResultExist());
    }
}

