import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static Pattern CC_pattern=Pattern.compile("CC_\\d*(_impt)?(_old)?(_impt)?");
    private static Matcher CC_matcher;
    public static String nameLastCalculation;

    public static boolean getMatches(String stroka){
        nameLastCalculation=stroka.substring(stroka.indexOf("C"),stroka.indexOf("б")-1);
        CC_matcher=CC_pattern.matcher(nameLastCalculation);
        return CC_matcher.matches();
    }
}
