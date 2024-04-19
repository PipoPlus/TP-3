package oop2.tp3.ejercicio1;

public abstract class Libro {

    public static final int REGULARES = 0;
    public static final int NUEVO_LANZAMIENTO = 1;
    private String nombre;


    public Libro(String nombre) {
        this.nombre = nombre;
    }

    public abstract int calcularPuntosDeAlquiler(int diasAlquilados);

    public abstract double calcularMonto(int diasAlquilados);



    public String nombre() {
        return nombre;
    }
}