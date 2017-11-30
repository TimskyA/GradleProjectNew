import org.openqa.selenium.By;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

//Для работы с браузером, щелкаем по ссылкам, нажимаем кнопки
public class Browser {
    private String standUrl;
    private String login;
    private String password;
    private String postfix;

    public void setProperties() throws IOException {
        File here = new File(".");
        String h = (here.getAbsolutePath().substring(0, here.getAbsolutePath().length()-1));
        BufferedReader brr = new BufferedReader(new FileReader(new File("config.txt")));
        LinkedHashMap<String, String> configParams = new LinkedHashMap<>();
        String s;
        while ((s = brr.readLine()) != null) {
            String[] kv = s.split(" : ");
            if (!kv[0].contains("!")) configParams.put(kv[0], kv[1]);
        }

        System.out.println("Config:");
        for (Map.Entry<String, String> st : configParams.entrySet()) {
            System.out.println(st.getKey() + "|" + st.getValue());
        }

        standUrl = configParams.get("stand");
        login = configParams.get("login");
        password = configParams.get("password");
        postfix = configParams.get("_etal postfix");

        System.out.println("\nrunning from " + h);

        if (configParams.get("browser").equals("IE")) {
            System.setProperty("webdriver.ie.driver", h + "IEDriverServer.exe");
            System.setProperty("selenide.browser", "IE");
        } else {
            System.setProperty("webdriver.chrome.driver", h + "chromedriver.exe");
            System.setProperty("selenide.browser", "Chrome");
        }
    }

    public void loginToClaster(){
        open("http://172.19.214.37/wps/myportal/app/fin");
        $(By.id("userID")).setValue(login);
        $(By.id("password")).setValue(password).pressEnter();
        //$("[id*=sbtSberLogo]").click();// для кластерного
    }
}
