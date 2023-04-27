package com.Ruth.clases;

import com.Ruth.enums.Estados;

import java.util.Objects;

public class Barco {

    protected String patente;

    protected Estados estado = Estados.enPuerto;
    protected String marca;

    protected float hrPescando = 0;
    protected String modelo;

    protected float capacidadCombustible;
    protected int capacidadCarga; ///KG de Pescado max

    ///region Constructor

    public Barco(String patente, String marca, String modelo, float capacidadCombustible, int capacidadCarga) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadCombustible = capacidadCombustible;
        this.capacidadCarga = capacidadCarga;
    }

    ///endregion

    ///region GYS
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(float capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    ///endregion

    @Override
    public String toString() {
        return "Patente: " + patente +
                " Estado: " + estado +
                " Hr Pescando:  " + hrPescando;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Barco barco = (Barco) o;
        return patente.equals(barco.patente);
    }

    public void pescar (){
        Consola.escribir("" + this.toString() + " se encuentra pescando 🐟🐟🐟" );
    }

    public void aPescar (float cantHr){
        estado = Estados.pesacando;
        this.pescar();
        this.hrPescando += cantHr;
    }

    public void deRegreso (){
        estado = Estados.deRegreso;
    }
}
