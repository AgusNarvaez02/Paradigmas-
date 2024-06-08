package com.ejercicio2;

import java.util.List;

public class Pareja implements IDeporte {

    private Deportista deportista1;
    private Deportista deportista2;

    public Pareja() {
        this.deportista1 = null;
        this.deportista2 = null;
    }

    @Override
    public boolean conformar(List<Deportista> integrantes) {
        if (integrantes == null || integrantes.size() < CANTIDAD_MINIMA) {
            return false; 
        }else {
            this.deportista1 = integrantes.get(0);
            this.deportista2 = integrantes.get(1);
            return true;
        }
    }

    @Override
    public void numerarDeportista() {
        deportista1.SetNumerarJugador(1);
        System.out.println(deportista1);
        deportista2.SetNumerarJugador(2);
        System.out.println(deportista2);
    }

    @Override
    public void mostrar() {
        System.out.println("Deportista One: " + deportista1);
        System.out.println("Deportista two: " + deportista2);
    }

}
