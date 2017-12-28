import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class SearchResult {
    public static boolean checkResultExist(){//проверка существования результатов поиска на вкладке Расчеты
        try {return(!$$(By.className("ns_0x002fwps0x00252fSBRFFCUserPortlets0x002fCalculationsCardListPortlet0x002f7_L00CBB1A089O70ILSHIKO81072_mainTable")).findBy(Condition.exactText("Не найдено ни одной записи.")).isDisplayed());}//проверка наличия строки "Не найдено ни одной записи."
        catch(NoSuchElementException e){return true;}//возвращает true если строка "Не найдено ни одной записи." не отображается
    }
}
