package oop2.tp3.ejercicio2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static oop2.tp3.ejercicio2.CopiaDeCSV.copiaDocumento;

public class Recaudacion {

    public static final String COMPANY_NAME = "company_name";
    public static final String CITY = "city";
    public static final String STATE = "state";
    public static final String ROUND = "round";
    String direccion;
    private List<String[]> csvData;

    public Recaudacion(String direccion){
        this.direccion = direccion;
    }


    public List<Map<String, String>> where(Map<String, String> options) throws IOException {


        csvData = copiaDocumento(this.direccion);

        if (options.containsKey(COMPANY_NAME)) {

            csvData = filter((fila) -> fila[1].equals(options.get(COMPANY_NAME)));

        }

        if (options.containsKey(CITY)) {

            csvData = filter((fila) -> fila[4].equals(options.get(CITY)));

        }

        if (options.containsKey(STATE)) {

            csvData = filter((fila) -> fila[5].equals(options.get(STATE)));

        }

        if (options.containsKey(ROUND)) {
            csvData = filter((fila) -> fila[9].equals(options.get(ROUND)));
        }

        return transformToListOfHashMap();
    }

    private List<Map<String, String>> transformToListOfHashMap() {
        List<Map<String, String>> output = new ArrayList<Map<String, String>>();

        for (String[] csvDatum : csvData) {
            Map<String, String> mapped = new HashMap<String, String>();
            mapped.put("permalink", csvDatum[0]);
            mapped.put(COMPANY_NAME, csvDatum[1]);
            mapped.put("number_employees", csvDatum[2]);
            mapped.put("category", csvDatum[3]);
            mapped.put(CITY, csvDatum[4]);
            mapped.put(STATE, csvDatum[5]);
            mapped.put("funded_date", csvDatum[6]);
            mapped.put("raised_amount", csvDatum[7]);
            mapped.put("raised_currency", csvDatum[8]);
            mapped.put(ROUND, csvDatum[9]);
            output.add(mapped);
        }
        return output;
    }


    private List<String[]> filter(Predicate<String[]> predicate) {
        List<String[]> results = new ArrayList<String[]>();

        for (String[] fila : csvData) {
            if (predicate.test(fila)) {
                results.add(fila);
            }
        }

        return results;
    }
}
