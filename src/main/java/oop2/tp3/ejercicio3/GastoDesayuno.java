package oop2.tp3.ejercicio3;

public class GastoDesayuno extends Gasto {

    public static final String DESAYUNO = "Desayuno";

    public GastoDesayuno(int monto) {
        super(monto);
    }

    @Override
    public String darTipoGasto() {

        return DESAYUNO;
    }

    protected boolean esExcesoDeComida(){
        return this.monto() > 1000;
    }

    @Override
    protected int obtenerMontoComida() {
        return this.monto();
    }


}
