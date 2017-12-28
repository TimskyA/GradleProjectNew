import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;

public class id1880 {
    @BeforeSuite
    public void setUpBrowser() throws IOException {
        Browser browser = new Browser();
        browser.setProperties();
        browser.loginToClaster();
    }

    @BeforeClass
    public void navigate() {
        Navigation.transition("Расчеты");
    }

    @Test
    public void step03(){Buttons.common("Очистить форму");}

    @Test
    public void step04(){
        Set.field("Идентификатор","CC_0000137868");
        Buttons.common("Поиск");
        $(By.linkText("CC_0000137868")).click();
    }

    @Test
    public void step05(){

    }
}
