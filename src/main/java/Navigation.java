import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Navigation {
    public static void transition(String sectionName) {
        WebDriver driver = getWebDriver();
        Actions action= new Actions(driver);
        switch (sectionName) {
            //подвкладки
            case "Кредитный калькулятор":           action.moveToElement($(By.linkText("Калькуляторы")));action.perform();$(By.linkText("Кредитный калькулятор")).click();    break;
            case "Интерполятор ставок":             action.moveToElement($(By.linkText("Калькуляторы")));action.perform();$(By.linkText("Интерполятор ставок")).click();      break;
            case "Верификация внешних ставок":      action.moveToElement($(By.linkText("Загрузка и верификация")));action.perform();$(By.linkText("Верификация внешних ставок")).click();break;
            case "Верификация внутренних ставок":   action.moveToElement($(By.linkText("Загрузка и верификация")));action.perform();$(By.linkText("Верификация внутренних ставок")).click();break;
            case "Загрузка ставок":                 action.moveToElement($(By.linkText("Загрузка и верификация")));action.perform();$(By.linkText("Загрузка")).click();       break;
            //вкладки
            case "Расчеты":                         $(By.linkText("Расчеты")).click();                                                                                        break;
            case "Рыночные ставки / Курсы":         $(By.linkText("Рыночные ставки / Курсы")).click();                                                                        break;
            case "Материалы":                       $(By.linkText("Материалы")).click();                                                                                      break;
            case "Внутренние ставки":               $(By.linkText("Внутренние ставки")).click();                                                                              break;
            case "Помощь":                          $(By.linkText("Помощь")).click();                                                                                         break;
            //переходы (почему то не работают)
            case "Переход к правым вкладкам":       $(By.id("sbtMenuRightArrow")).click();                                                                                    break;
            case "Переход к левым вкладкам":        $(By.id("sbtMenuLeftArrow")).click();                                                                                     break;
            default:                                System.out.println("Такого раздела нет");
        }
    }
}
