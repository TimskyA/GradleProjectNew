import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

//Забираем расчеты из цсвшки, отдаем как мапу
class FReader {
    private BufferedReader bReader;
    private int fSize;

    FReader (String file) throws FileNotFoundException {
        bReader = new BufferedReader(new FileReader(file));
        fSize = 0;
    }

    int getfSize(){ return this.fSize; }
    LinkedHashMap<String, String> readCalcsFromFile() throws IOException {
        LinkedHashMap<String, String> mappedCalcs = new LinkedHashMap<>();
        String s;
        while((s = bReader.readLine())!=null) {
            String[] kv = s.split(";");
            if (kv.length == 1) mappedCalcs.put(kv[0], "");
            else mappedCalcs.put(kv[0], kv[1]);
        }
        fSize = mappedCalcs.size();
        return mappedCalcs;
    }
}
