package oop2.tp3.ejercicio3;

public class GastoCena extends Gasto {

    public static final String CENA = "Cena";

    public GastoCena(int monto) {
        super(monto);
    }

    @Override
    public String darTipoGasto() {
        return CENA;
    }

    protected boolean esExcesoDeComida(){
        return this.monto() > 5000;
    }

    @Override
    protected int obtenerMontoComida() {
        return this.monto();
    }

}
