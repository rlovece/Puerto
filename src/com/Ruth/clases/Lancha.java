package com.Ruth.clases;

import com.Ruth.interzaces.APescar;

public class Lancha extends Barco implements APescar {

    private final float capacidadRecoleccion = 20f;

    ///region Constructor
    public Lancha(String patente, String marca, String modelo, float capacidadCombustible,
                  int capacidadCarga) {
        super(patente, marca, modelo, capacidadCombustible, capacidadCarga);
    }
    ///endregion

    public float loPescado () {
        if (capacidadRecoleccion * this.hrPescando < capacidadCarga){
            return capacidadRecoleccion * this.hrPescando;
        } else {
            return capacidadCarga;
        }
    }

}
