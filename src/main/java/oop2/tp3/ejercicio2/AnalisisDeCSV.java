package oop2.tp3.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AnalisisDeCSV  {

public static List<String[]> copiaDocumento(String direccion) throws IOException {
    List<String[]> csvData = new ArrayList<String[]>();
    CSVReader reader = new CSVReader(new FileReader(direccion));
    String[] row = null;

    while((row =reader.readNext())!=null)

    {
        csvData.add(row);
    }

    reader.close();

    csvData.remove(0);

    return csvData;
}


    public void analisisDeDatos(List<String[]> csvDatan, String clave,AnalisisDeDatos c) {

            List<String[]> results = new ArrayList<String[]>();

            for (String[] csvDatum : csvDatan) {
                if (c.analisisDeDatos()) {
                    results.add(csvDatum);
                }
            }
            csvDatan = results;

    }

    public

}
