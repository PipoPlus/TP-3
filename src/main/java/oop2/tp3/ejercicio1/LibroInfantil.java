package oop2.tp3.ejercicio1;

public class LibroInfantil extends Libro {

    public LibroInfantil(String nombre) {
        super(nombre);
    }

    @Override
    public int calcularPuntosDeAlquiler(int diasAlquilados) {
        return 0;
    }

    @Override
    public double calcularMonto(int diasAlquilados) {
        return (diasAlquilados - 3) * 1.5;
    }//Consultar por nombres para numeros magicos
}
