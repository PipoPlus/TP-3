package oop2.tp3.ejercicio3;

public class GastoAlquilerAuto extends Gasto {

    public static final String ALQUILER_DE_AUTO = "Alquiler de Auto";

    public GastoAlquilerAuto(int monto) {
        super(monto);
    }

    @Override
    public String darTipoGasto() {return ALQUILER_DE_AUTO;}

}
