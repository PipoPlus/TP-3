package oop2.tp3.ejercicio1;

public class LibroNuevoLanzamiento extends Libro{
    public LibroNuevoLanzamiento(String nombre) {
        super(nombre);
    }

    @Override
    public int calcularPuntosDeAlquiler(int diasAlquilados) {
        if (diasAlquilados > 1){
            return 1;
        }
        return 0;
    }

    @Override
    public double calcularMonto(int diasAlquilados) {
        return diasAlquilados * 3; //Consultar por nombres para numeros magicos
    }
}
