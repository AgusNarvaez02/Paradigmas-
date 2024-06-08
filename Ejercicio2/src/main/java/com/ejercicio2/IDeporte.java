package com.ejercicio2;

import java.util.List;

public interface IDeporte {
    public Integer CANTIDAD_MINIMA = 2;
    
    public boolean conformar(List<Deportista> integrantes);
    public void numerarDeportista();
    //public Object get(int index);
    public void mostrar();

    
}
