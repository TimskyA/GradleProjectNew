import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class Navigation {
    //топ меню
    public static void transition(String sectionName) {
        switch (sectionName) {
            case "Кредитный калькулятор":    $(By.linkText("Калькуляторы")).click();    break;
            default:                         System.out.println("Такого раздела нет");
        }
    }
}
