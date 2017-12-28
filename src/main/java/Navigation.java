import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

//Навигация по АС ФК
public class Navigation {
    //Навигация по переданной строки с именем вкладки/подвкладки
    public static void transition(String sectionName) {
        switch (sectionName) {
            //подвкладки
            case "Кредитный калькулятор":               $(By.linkText("Калькуляторы")).hover();$(By.linkText("Кредитный калькулятор")).click();break;
            case "Интерполятор ставок":                 $(By.linkText("Калькуляторы")).hover();$(By.linkText("Интерполятор ставок")).click();break;
            case "Верификация внешних ставок":          $(By.linkText("Загрузка и верификация")).hover();$(By.linkText("Верификация внешних ставок")).click();break;
            case "Верификация внутренних ставок":       $(By.linkText("Загрузка и верификация")).hover();$(By.linkText("Верификация внутренних ставок")).click();break;
            case "Загрузка ставок":                     $(By.linkText("Загрузка и верификация")).hover();$(By.linkText("Загрузка")).click();break;
            case "Календари":                           $(By.linkText("Управление")).hover();$(By.linkText("Календари")).click();break;
            case "Журнал":                              $(By.linkText("Управление")).hover();$(By.linkText("Журнал")).click();break;
            //вкладки
            case "Расчеты":                             try {$(By.linkText("Расчеты")).click();}   catch(NoSuchElementException e){$$(By.className("sbtMainMenuItem")).findBy(Condition.exactText("Расчеты")).click();}break;
            case "Рыночные ставки / Курсы":             $(By.linkText("Рыночные ставки / Курсы")).click();break;
            case "Материалы":                           $(By.linkText("Материалы")).click();break;
            case "Внутренние ставки":                   $(By.linkText("Внутренние ставки")).click();break;
            case "Помощь":                              $(By.linkText("Помощь")).click();break;
            //переходы
            case "Стрелка вправо":                  $(By.id("sbtMenuRightArrow")).click();break;
            case "Стрелка влево":                   $(By.id("sbtMenuLeftArrow")).click();break;
            default:                                System.out.println("Такого раздела нет");
        }
    }
}
