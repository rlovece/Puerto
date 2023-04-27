package com.Ruth.clases;

import com.Ruth.interzaces.APescar;

public class Corbeta extends Barco implements APescar {

    private int cantJaulas; ///Podrán llenar 4 jaulas por hr
    private final int capacidadPorJaula = 10;

    ///region Constructor

    public Corbeta(String patente, String marca, String modelo,
                   float capacidadCombustible, int cantJaulas) {
        super(patente, marca, modelo, capacidadCombustible, 0);
        this.cantJaulas = cantJaulas;
        this.capacidadCarga = cantJaulas*capacidadPorJaula;
    }

    ///endregion

    ///region GYS

    public int getCantJaulas() {
        return cantJaulas;
    }

    public void setCantJaulas(int cantJaulas) {
        this.cantJaulas = cantJaulas;
    }

    public float getCapacidadPorJaula() {
        return capacidadPorJaula;
    }

    ///endregion

    public float loPescado () {
        if (4*this.hrPescando < cantJaulas) {
            return capacidadPorJaula * 4 * this.hrPescando;
        } else {
            return capacidadPorJaula * cantJaulas; ///Aunque siga en el mar no tiene más Jaulas
        }

    }
}
