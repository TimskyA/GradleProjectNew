import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
    public static void main(String[] a){
        System.out.println((String)new SimpleDateFormat("dd.MM.yyyy").format(new Date()));
    }
}
