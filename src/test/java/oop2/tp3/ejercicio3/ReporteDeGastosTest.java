package oop2.tp3.ejercicio3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReporteDeGastosTest {

    @Test
    void imprimirGastosDesayuno() {
        var g1 = new GastoDesayuno(1000);
        var reporte = new ReporteDeGastos();
        LocalDate fechaReporte = LocalDate.of(2024,04,18);

        String expected = reporte.imprimir(List.of(g1), fechaReporte);

        // Normalizar separadores de línea. Tuve que hacer esto para que no me tirara error en el test
        expected = expected.replaceAll("\r\n", "\n");

        assertEquals("Expenses 2024-04-18\n" +
                "Desayuno\t1000\t \n" +
                "Gastos de comida: 1000\n" +
                "Total de gastos: 1000\n" , expected);
    }


    @Test
    void imprimirGastosCena() {
        var g1 = new GastoCena(6000);
        var reporte = new ReporteDeGastos();
        LocalDate fechaReporte = LocalDate.of(2024,04,18);

        String expected = reporte.imprimir(List.of(g1), fechaReporte);

        // Normalizar separadores de línea. Tuve que hacer esto para que no me tirara error en el test
        expected = expected.replaceAll("\r\n", "\n");

        assertEquals("Expenses 2024-04-18\n" +
                "Cena\t6000\tX\n" +
                "Gastos de comida: 6000\n" +
                "Total de gastos: 6000\n" , expected);
    }


    @Test
    void imprimirGastosAlquilerAuto() {
        var g1 = new GastoAlquilerAuto(2000);
        var reporte = new ReporteDeGastos();
        LocalDate fechaReporte = LocalDate.of(2024,04,18);

        String expected = reporte.imprimir(List.of(g1), fechaReporte);

        // Normalizar separadores de línea. Tuve que hacer esto para que no me tirara error en el test
        expected = expected.replaceAll("\r\n", "\n");


        assertEquals("Expenses 2024-04-18\n" +
                "Alquiler de Auto\t2000\t \n" +
                "Gastos de comida: 0\n" +
                "Total de gastos: 2000\n" , expected);
    }


    @Test
    void imprimirGastosMultiples() {
        var g1 = new GastoDesayuno(1000);

        var g2 = new GastoCena(5000);

        var g3 = new GastoAlquilerAuto(2000);

        var reporte = new ReporteDeGastos();
        LocalDate fechaReporte = LocalDate.of(2024,04,18);



        String expected = reporte.imprimir(List.of(g1, g2, g3), fechaReporte);

        // Normalizar separadores de línea. Tuve que hacer esto para que no me tirara error en el test
        expected = expected.replaceAll("\r\n", "\n");


        assertEquals("Expenses 2024-04-18\n" +
                "Desayuno\t1000\t \n" +
                "Cena\t5000\t \n" +
                "Alquiler de Auto\t2000\t \n" +
                "Gastos de comida: 6000\n" +
                "Total de gastos: 8000\n", expected);

    }

}