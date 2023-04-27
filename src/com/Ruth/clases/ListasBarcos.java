package com.Ruth.clases;

import java.util.ArrayList;

public class ListasBarcos <T> {

    private ArrayList<T> lista = new ArrayList<T>();

    ///region Constructor
    public ListasBarcos() {}
    ///endregion

    ///region GYS
    public ArrayList<T> getLista() {
        return lista;
    }
    public void setLista(ArrayList<T> lista) {
        this.lista = lista;
    }
    ///

    public void agregar (T nuevo){
        lista.add(nuevo);
    }

    @Override
    public String toString() {
        return "" + lista;
    }
}
