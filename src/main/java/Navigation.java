import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Navigation {
    public static void transition(String sectionName) {
        switch (sectionName) {
            //подвкладки
            case "Кредитный калькулятор":           $(By.linkText("Калькуляторы")).hover();$(By.linkText("Кредитный калькулятор")).click();                                   break;
            case "Интерполятор ставок":             $(By.linkText("Калькуляторы")).hover();$(By.linkText("Интерполятор ставок")).click();                                     break;
            case "Верификация внешних ставок":      $(By.linkText("Загрузка и верификация")).hover();$(By.linkText("Верификация внешних ставок")).click();                    break;
            case "Верификация внутренних ставок":   $(By.linkText("Загрузка и верификация")).hover();$(By.linkText("Верификация внутренних ставок")).click();                 break;
            case "Загрузка ставок":                 $(By.linkText("Загрузка и верификация")).hover();$(By.linkText("Загрузка")).click();                                      break;
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
