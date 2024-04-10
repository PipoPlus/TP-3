package oop2.tp3.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void calcularDeudaYPuntosObtenidos() {
        Libro elTunel = new Libro("El Túnel", Libro.REGULARES);
        Libro antesDelFin = new Libro("Antes del Fin", Libro.REGULARES);

        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);

        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

        Cliente yo = new Cliente("Javier");

        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);

        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();

        assertEquals(10.0,resultado[0]);
        assertEquals(2,resultado[1]);
    }


}