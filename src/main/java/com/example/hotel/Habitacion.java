package com.example.hotel;

public class Habitacion {
    private String codigo;
    private String pieza;
    private String condicion;


    public Habitacion(String codigo, String pieza, String condicion){
        this.codigo = codigo;
        this.pieza = pieza;
        this.condicion = condicion;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getPieza(){
        return pieza;
    }

    public String getCondicion(){
        return condicion;
    }
}
