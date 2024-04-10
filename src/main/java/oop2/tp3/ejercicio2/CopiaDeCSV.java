package oop2.tp3.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CopiaDeCSV {

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



}
