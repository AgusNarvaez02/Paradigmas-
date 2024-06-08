package com.ejercicio2;
public class Deportista {
    private String nombre;
    private String dni;
    private Integer numeroJugador;

    public Deportista(String nombre, String dni) {
        this.dni = dni;
        this.nombre = nombre;
        this.numeroJugador = null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Integer getNumeroJugador() {
        return numeroJugador;
    }
    public void SetNumerarJugador(int num){
        this.numeroJugador = num;
    }
    public String toString(){
        return "Nombre: "+this.nombre+" DNI: "+this.dni+ " Numero de Jugador: "+this.numeroJugador;
    }
}
