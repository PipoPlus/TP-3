package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;


abstract class Gasto {

    private int monto;


    public Gasto(int monto){
        this.monto = monto;
    }

    public abstract String darTipoGasto();

    public int monto(){return this.monto;}


    protected int obtenerMontoComida(){return 0;}

    protected boolean esExcesoDeComida(){return false;}


}


public class ReporteDeGastos {
    public String imprimir(List<Gasto> gastos, LocalDate fechaReporte) {

        int total = 0;
        int gastosDeComida = 0;

        String registro = "";

        registro = "Expenses " + fechaReporte + System.lineSeparator();

        for (Gasto gasto : gastos) {

            gastosDeComida += gasto.obtenerMontoComida();


            String nombreGasto = gasto.darTipoGasto();

            registro += nombreGasto + "\t"
                    + gasto.monto() + "\t"
                    + esExceso(gasto)
                    + System.lineSeparator();

            total += gasto.monto();
        }

        registro += "Gastos de comida: " + gastosDeComida + System.lineSeparator();
        registro += "Total de gastos: " + total + System.lineSeparator();


        return registro;
    }

    private static String esExceso(Gasto gasto) {
        return gasto.esExcesoDeComida() ? "X" : " ";
    }


}
