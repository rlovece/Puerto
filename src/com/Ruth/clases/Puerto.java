package com.Ruth.clases;

import com.Ruth.enums.Estados;

import java.util.Random;

public class Puerto {

    private String nombre;

    private ListasBarcos<Lancha> listaLanchas = new ListasBarcos<Lancha>();

    private ListasBarcos<Corbeta> listaCorbetas = new ListasBarcos<Corbeta>();

    ///region Constructor
    public Puerto(String nombre) {
        this.nombre = nombre;
    }
    ///endregion

    ///region GYS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListasBarcos<Lancha> getListaLanchas() {
        return listaLanchas;
    }

    public void setListaLanchas(ListasBarcos<Lancha> listaLanchas) {
        this.listaLanchas = listaLanchas;
    }

    public ListasBarcos<Corbeta> getListaCorbetas() {
        return listaCorbetas;
    }

    public void setListaCorbetas(ListasBarcos<Corbeta> listaCorbetas) {
        this.listaCorbetas = listaCorbetas;
    }

    ///endregion

    public void agregarBarco (Barco nuevo) {

            if (nuevo.getClass() == Lancha.class){
                listaLanchas.agregar((Lancha) nuevo);
            } else if (nuevo.getClass() == Corbeta.class){
                listaCorbetas.agregar((Corbeta) nuevo);
            } else {
                Consola.escribir("Tipo de Barco NO VÁLIDO");
            }
    }

    public boolean verificar (Barco barco){ /// si lo encuetra devuelve false

        for (Corbeta corbeta: listaCorbetas.getLista()
             ) {
            if (!corbeta.equals(barco)) {
                return false;
            }
        }
        for (Lancha lancha: listaLanchas.getLista()
        ) {
            if (!lancha.equals(barco)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "\n Puerto " + nombre +
                "\n Lanchas: " + listaLanchas +
                "\n Corbetas: " + listaCorbetas;
    }

    public float totalPescadoLanchas (){
        float total =0;
        for (Lancha lancha: listaLanchas.getLista()
             ) {
            if (lancha.estado == Estados.deRegreso){
                total += lancha.loPescado();
                lancha.estado = Estados.enPuerto;
                lancha.hrPescando=0;
            }
        }
        return total;
    }

    public float totalPescadoCorbetas (){
        float total =0;
        for (Corbeta corbeta: listaCorbetas.getLista()
        ) {
            if (corbeta.estado == Estados.deRegreso){
                total += corbeta.loPescado();
                corbeta.estado = Estados.enPuerto;
                corbeta.hrPescando=0;
            }
        }
        return total;
    }

    ///todos a pescar cant aleatoria de hs, máx 6
    public void todosAPescar (){
        Random ramdon = new Random();
        for (Corbeta corbeta: getListaCorbetas().getLista()
             ) {
            corbeta.aPescar(1+ramdon.nextInt(6));
        }
        for (Lancha lancha: getListaLanchas().getLista()
        ) {
            lancha.aPescar(1+ramdon.nextInt(6));
        }
    }

    public void todosDeRegreso (){
        for (Corbeta corbeta: getListaCorbetas().getLista()
        ) {
            corbeta.deRegreso();
        }
        for (Lancha lancha: getListaLanchas().getLista()
        ) {
            lancha.deRegreso();
        }
    }
}
