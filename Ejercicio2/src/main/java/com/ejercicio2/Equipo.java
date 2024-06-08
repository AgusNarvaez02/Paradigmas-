package com.ejercicio2;

import java.util.List;

public class Equipo implements IDeporte {

    private String Nombre;
    private List<Deportista> jugadores;

    public Equipo(List<Deportista> jugadores, String nombre) {
        this.jugadores = jugadores;
        this.Nombre = nombre;
    }

    public String toString() {
        return "Equipo: " + this.Nombre + " Jugadores: " + this.jugadores.toString();
    }

    public List<Deportista> getDeportistas() {
        return jugadores;
    }

    public String getNombreEquipo() {
        return this.Nombre;
    }

    public void SetNombreEquipo(String nom) {
        this.Nombre = nom;
    }

    @Override
    public boolean conformar(List<Deportista> integrantes) {

        if (integrantes == null || integrantes.size() < 5) {
            this.jugadores = integrantes;
            return true;
        } else {
            return false;
        }
    }

    public void jugadorNumero() {
        int c = 1;
        for (Deportista d : this.jugadores) {
            d.SetNumerarJugador(c);
            c++;
        }
    }

    @Override
    public void numerarDeportista() {
        System.out.println(this.Nombre);
        int c = 1;
        for (Deportista d : this.jugadores) {
            d.SetNumerarJugador(c);
            System.err.println(d);
            c++;
        }
    }

    @Override
    public void mostrar() {
        System.out.println(this.Nombre);
        for (Deportista d : this.jugadores) {
            System.out.println(" Nombre: " + d.getNombre() + " DNI: " + d.getDni());
        }
    }

}
