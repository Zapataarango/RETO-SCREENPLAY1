package co.adidas.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Read {

    public static String excel(String termino) {
        ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
        try {
            leerExcel = Excel.readExcel("PARAMETROS RETO SCREENPLAY.xlsx", "Terminos busqueda");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return leerExcel.get(0).get(termino);
    }
}
